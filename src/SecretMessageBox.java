import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String Password = JOptionPane.showInputDialog("Type in a password.");
		String Message = JOptionPane.showInputDialog("Type a secret message.");
		String Guess = JOptionPane.showInputDialog("Guess the password to see the secret message.");
		if (Guess.equals(Password)) {
			JOptionPane.showMessageDialog(null, Message);
		}
			else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!");
			}
		}
	}

