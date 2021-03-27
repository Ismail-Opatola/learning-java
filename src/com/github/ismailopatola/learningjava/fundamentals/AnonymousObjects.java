package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnonymousObjects {

	public static void main(String[] args) {
		/**
		 * Nameless objects also known as anonymous object
		 * -----------------------------------------------
		 * 
		 */
		
		JFrame frame = new JFrame();
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
//		ImageIcon ACE = new ImageIcon("src\\cards\\1.png.png");
//		JLabel ACLabel = new JLabel(AC);
//		deck.add(ACLabel);
		
		for(int i = 1; i <= 52; i++) {
			deck.add( new JLabel(new ImageIcon("src\\cards\\" + i + ".png")));
			frame.add(deck.get(i-1));
		}

//		frame.add(deck.get(0));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);


	}

}
