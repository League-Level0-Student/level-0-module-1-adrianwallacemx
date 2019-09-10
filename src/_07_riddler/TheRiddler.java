package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String adrian = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (adrian.equals("a stamp")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "worng it's a stamp");
		}
		JOptionPane.showMessageDialog(null, score);
		// 6. Add some more riddles
		adrian = JOptionPane.showInputDialog("What kind of tree can you carry in your hand?");
		if (adrian.contentEquals("a palm")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "wrong it's a palm");
		} // 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}
