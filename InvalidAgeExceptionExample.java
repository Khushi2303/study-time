import java.util.Scanner;

public class InvalidAgeExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Valid age.");
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}