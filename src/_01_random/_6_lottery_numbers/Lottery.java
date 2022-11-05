package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {

		Random randomMaker = new Random();

		String lottery = "";

		for (int i = 0; i <= 4; i += 1) {
			int randomNumber = randomMaker.nextInt(100);
			lottery += randomNumber;
		}
			JOptionPane.showMessageDialog(null, lottery);
			
	}
}
