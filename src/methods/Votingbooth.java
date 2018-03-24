package methods;

import javax.swing.JOptionPane;

public class Votingbooth {
	public static void main(String[] args) {
		String Answer = JOptionPane.showInputDialog(null, "How old are you?");
		int age = Integer.parseInt(Answer);
		if (age >= 18) {
			JOptionPane.showMessageDialog(null, "Proceed to the voting booth");
		} else {
			JOptionPane.showMessageDialog(null, "You're too young to vote, and no one cares about what you think.");
		}
	}
}
