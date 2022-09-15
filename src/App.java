import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        
        String name = JOptionPane.showInputDialog("Please enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your ages:"));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");


    }
}
