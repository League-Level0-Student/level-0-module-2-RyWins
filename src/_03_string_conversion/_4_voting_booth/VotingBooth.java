package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		
		
		
		String ageToVote = JOptionPane.showInputDialog("How many years old are you");
		
		int ageAsInt = Integer.parseInt(ageToVote);
		
		if(ageAsInt > 18) {
			JOptionPane.showInputDialog("Who should the next president be");
		}
		else
			JOptionPane.showMessageDialog(null, "Noboday cares what you think!");
		
	}
}
