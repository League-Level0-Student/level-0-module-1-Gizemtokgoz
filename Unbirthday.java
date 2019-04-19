import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String Today = JOptionPane.showInputDialog("Please type in your birthday below in numbers please. EXAMPLE (#/#).");
	if (Today.equals("4/18")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy UNbirthday");
	}
}
}
