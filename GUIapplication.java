import javax.swing.JOptionPane;

public class GUIapplication {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("WHAT IS YOUR NAME?");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age =Integer.parseInt(JOptionPane.showInputDialog("HOW OLD ARE YOU?"));
        JOptionPane.showMessageDialog(null, "you are "+ age+ " year old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("WHAT'S YOUR HEIGHT? "));
        JOptionPane.showMessageDialog(null, "OMG!! "+ height+" you have nice height ");
    }
}
