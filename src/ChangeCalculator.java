/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. 
 * Then make me a sandwich.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// 1. Ask the user how many nickels they have
String a = JOptionPane.showInputDialog("How many nickels do you have?");
int b = Integer.parseInt(a);
		// 2. Convert their answer to an int using Integer.parseInt()
		// 3. Ask the user how many dimes they have, and convert their answer
String c = JOptionPane.showInputDialog("How many dimes do you have?");
int d = Integer.parseInt(c);
		// 4. Ask the user how many quarters they have, and convert their answer

String e = JOptionPane.showInputDialog("How many quarters do you have?");
int f = Integer.parseInt(e);
		// 5. Calculate how much money the user has and save it in a double variable 
int q = (b*5) + (d*10) + (f*25);
JOptionPane.showMessageDialog(null, q + " cents");
		// 6. Tell the user how much money they have

	}
}

