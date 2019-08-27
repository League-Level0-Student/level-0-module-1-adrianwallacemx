package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String danny = " he's an exalent coder";
		String Adrian = "he's good at video games";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String input = JOptionPane.showInputDialog("enter a name");
		// 3. In a pop-up, tell the user what is remarkable about that person.
		if (input.equals("Danny")) {
			JOptionPane.showMessageDialog(null, danny);

		}
		if (input.equals("Adrian")) {
			JOptionPane.showMessageDialog(null, "he's good at video games");
		}
	}
}
