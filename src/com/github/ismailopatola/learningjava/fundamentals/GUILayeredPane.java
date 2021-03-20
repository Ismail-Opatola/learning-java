package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class GUILayeredPane {

	public static void main(String[] args) {
		/**
		 * JLayeredPane
		 * ------------
		 * Swing container that provides a
		 * third dimension for positioning components
		 * ex. depth, Z-index
		 * 
		 * A Visual of all the layers/stack within a JLayerPane
		 * 
		 * |--------------------|
		 * | Default			|
		 * |	|----------------------|
		 * |	|	Palette			   |
		 * |	|		|-----------------------|
		 * |	|		|	Modal			    |
		 * |	|		|		|-----------------------|
		 * |	|		|		|	PopUp				|
		 * |	|		|		|		|-----------------------|
		 * |----|		|		|		|	Drag				|
		 * 		|		|		|		|						|
		 * 		|-------|		|		|						|
		 * 				|		|		|						|
		 * 				|-------|		|						|
		 * 						|		|						|
		 * 						|		|						|
		 * 						|-------|						|
		 * 								|						|
		 * 								|-----------------------|		
		 * 
		 * 2 ways to specify depth use 
		 * + JLayeredPane.DEFAULT_LAYER|MODAL_LAYER|POPUP_LAYER|* 
		 * + Integer.valueOf(int)
		 */
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150,150,200,200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);
//		layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
//		layeredPane.add(label2, JLayeredPane.MODAL_LAYER);
//		layeredPane.add(label3, JLayeredPane.POPUP_LAYER);
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(2));
		layeredPane.add(label3, Integer.valueOf(1));
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		frame.setLayout(null);
		
		frame.setVisible(true);
	}

}
