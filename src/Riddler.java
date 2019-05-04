import javax.swing.JOptionPane;

public class Riddler {
	public static void main(String[] args) {
		int score = 0;
		String Penny = JOptionPane.showInputDialog("What has a head, a tail, and has no legs");
		if(Penny.equals("Penny")) {
			score++;
			JOptionPane.showMessageDialog(null, score);
	}
		
		else {
			JOptionPane.showMessageDialog(null, "WRONG! The correct answer is penny.");
		}
		
		String Days = JOptionPane.showInputDialog("My life can be measured in hours, I serve by being devoured. Thin, I am quick. Fat, I am slow. Wind is my foe. What am I?");
		if(Days.equals("Candle")) {
			score++;
			JOptionPane.showMessageDialog(null, score);
	}
		
		else {
			JOptionPane.showMessageDialog(null, "WRONG! The correct answer is candle.");
		}
		
		String Direction = JOptionPane.showInputDialog("Re-arrange the letters, O O U S W T D N E J R, to spell just one word. What is it?");
		if(Direction.equals("JUST ONE WORD")) {
			score++;
			JOptionPane.showMessageDialog(null, score);
	}
		
		else {
			JOptionPane.showMessageDialog(null, "WRONG! The correct answer is JUST ONE WORD.");
		}
		
	}
}
