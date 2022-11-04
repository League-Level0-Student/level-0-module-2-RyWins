//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		

		// 1. Use each value of randomNumber to give the user a random compliment.
		
		// 2. Repeat all the code above 10 times
		for ( int i = 0; i <= 10 ; i += 1) {
			int randomNumber = randomMaker.nextInt(6);
			System.out.println(randomNumber);
			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "I like your eyes");
			}
			else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "I like your shoes");
				}
			else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "You are amazing");
				}
			else if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "You are pretty");
				}
			else if (randomNumber == 5) {
				JOptionPane.showMessageDialog(null, "You are very smart");
				}
			else {
				JOptionPane.showMessageDialog(null, "Your are a fast runner");
			}
		}
		// 3. Find someone to test out your program. They will like it :)
	}
}
