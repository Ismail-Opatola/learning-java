package com.github.ismailopatola.learningjava.fundamentals;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUIJOptionPane {

	public static void main(String[] args) {
		/**
		 *  JOptionPane
		 *  -----------
		 *  Pop up a standard dialog box that prompts users for a value
		 *  or informs them of something.
		 */
		
		String message = "This is some useless info";
		String title = "title";
		int selected = 2; // *blush* or cancel
		
//		JOptionPane.showMessageDialog(null, message, title, messageType);
//		JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);

		// System.out.println(JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION));
		// Yes => 0, NO => 1, CANCEL => 2
		// int answer = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION);
		
		// String name = JOptionPane.showInputDialog("What's your name?: ");
		// System.out.println("Hello " + name);
		
		String[] responses = {"awwesome!", "thanks!", "*blush*"};
		ImageIcon icon = new ImageIcon("thumbs_up.png");
		
		JOptionPane
		.showOptionDialog(
			null, 
			message, 
			title, 
			JOptionPane.YES_NO_CANCEL_OPTION, 
			JOptionPane.INFORMATION_MESSAGE, 
			icon,
			responses,
			selected
		);
		
		
	}

}
