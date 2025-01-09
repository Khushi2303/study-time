import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

class Contact {
    String firstName, lastName, email, phoneNumber, jobTitle;

    // Constructor to initialize contact details
    Contact(String firstName, String lastName, String email, String phoneNumber, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
    }

    // A human-readable string representation of the contact
    @Override
    public String toString() {
        return firstName + " " + lastName + " | " + phoneNumber + " | " + jobTitle + " | " + email;
    }
}

public class PhoneDirectory extends JFrame {
    private List<Contact> contacts;
    private JTextArea contactDisplayArea;
    private JTextField firstNameField, lastNameField, emailField, phoneNumberField, jobTitleField, searchField;

    public PhoneDirectory() {
        // Initialize contacts list to store contact information
        contacts = new ArrayList<>();

        // Set up the main window
        setTitle("Phone Directory");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create input fields for adding and updating contacts
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2));

        firstNameField = new JTextField();
        lastNameField = new JTextField();
        emailField = new JTextField();
        phoneNumberField = new JTextField();
        jobTitleField = new JTextField();
        searchField = new JTextField();

        // Labels and input fields for contact details
        inputPanel.add(new JLabel("First Name:"));
        inputPanel.add(firstNameField);
        inputPanel.add(new JLabel("Last Name:"));
        inputPanel.add(lastNameField);
        inputPanel.add(new JLabel("Email:"));
        inputPanel.add(emailField);
        inputPanel.add(new JLabel("Phone Number:"));
        inputPanel.add(phoneNumberField);
        inputPanel.add(new JLabel("Job Title:"));
        inputPanel.add(jobTitleField);
        inputPanel.add(new JLabel("Search by Name or Phone:"));
        inputPanel.add(searchField);

        // Create action buttons
        JButton addButton = new JButton("Add Contact");
        JButton deleteButton = new JButton("Delete Contact");
        JButton showButton = new JButton("Show All Contacts");
        JButton searchButton = new JButton("Search Contact");
        JButton updateButton = new JButton("Update Contact");

        // Add button actions
        addButton.addActionListener(e -> addContact());
        deleteButton.addActionListener(e -> deleteContact());
        showButton.addActionListener(e -> showAllContacts());
        searchButton.addActionListener(e -> searchContact());
        updateButton.addActionListener(e -> updateContact());

        // Panel for buttons with layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(showButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(updateButton);

        // Text area for displaying contacts
        contactDisplayArea = new JTextArea();
        contactDisplayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(contactDisplayArea);

        // Add components to the main window
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
    }

    // Method to add a new contact to the directory
    private void addContact() {
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String email = emailField.getText().trim();
        String phoneNumber = phoneNumberField.getText().trim();
        String jobTitle = jobTitleField.getText().trim();

        // Ensure all fields are filled
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || jobTitle.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the contact details!", "Missing Information", JOptionPane.WARNING_MESSAGE);
        } else {
            contacts.add(new Contact(firstName, lastName, email, phoneNumber, jobTitle));
            clearFields();
            JOptionPane.showMessageDialog(this, "Contact added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Method to delete a contact by phone number
    private void deleteContact() {
        String phoneNumber = searchField.getText().trim();

        // Find the contact with the given phone number and remove it
        boolean contactFound = false;
        for (Contact contact : contacts) {
            if (contact.phoneNumber.equals(phoneNumber)) {
                contacts.remove(contact);
                JOptionPane.showMessageDialog(this, "Contact deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                contactFound = true;
                break;
            }
        }

        if (!contactFound) {
            JOptionPane.showMessageDialog(this, "No contact found with that phone number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        clearFields();
    }

    // Method to display all contacts in the directory
    private void showAllContacts() {
        contactDisplayArea.setText("");  // Clear existing display
        if (contacts.isEmpty()) {
            contactDisplayArea.append("No contacts to display.");
        } else {
            for (Contact contact : contacts) {
                contactDisplayArea.append(contact + "\n");
            }
        }
    }

    // Method to search for a contact by name or phone number
    private void searchContact() {
        String searchTerm = searchField.getText().trim();
        contactDisplayArea.setText("");  // Clear previous search results

        boolean contactFound = false;
        for (Contact contact : contacts) {
            if (contact.firstName.contains(searchTerm) || contact.lastName.contains(searchTerm) || contact.phoneNumber.contains(searchTerm)) {
                contactDisplayArea.append(contact + "\n");
                contactFound = true;
            }
        }

        if (!contactFound) {
            JOptionPane.showMessageDialog(this, "No contact found with the search term: " + searchTerm, "Search Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Method to update contact information by phone number
    private void updateContact() {
        String phoneNumber = searchField.getText().trim();
        boolean contactFound = false;

        for (Contact contact : contacts) {
            if (contact.phoneNumber.equals(phoneNumber)) {
                contactFound = true;

                // Prompt user for updated contact details
                String newFirstName = JOptionPane.showInputDialog("Enter new First Name:", contact.firstName);
                String newLastName = JOptionPane.showInputDialog("Enter new Last Name:", contact.lastName);
                String newEmail = JOptionPane.showInputDialog("Enter new Email:", contact.email);
                String newJobTitle = JOptionPane.showInputDialog("Enter new Job Title:", contact.jobTitle);

                // Update contact details
                contact.firstName = newFirstName;
                contact.lastName = newLastName;
                contact.email = newEmail;
                contact.jobTitle = newJobTitle;

                JOptionPane.showMessageDialog(this, "Contact updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
                break;
            }
        }

        if (!contactFound) {
            JOptionPane.showMessageDialog(this, "No contact found with that phone number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to clear all input fields
    private void clearFields() {
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
        phoneNumberField.setText("");
        jobTitleField.setText("");
        searchField.setText("");
    }

    public static void main(String[] args) {
        // Set up and display the Phone Directory GUI
        SwingUtilities.invokeLater(() -> {
            PhoneDirectory frame = new PhoneDirectory();
            frame.setVisible(true);
        });
    }
}
