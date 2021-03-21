package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame9 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btn;
	JLabel label;
	
	public MyFrame9() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		btn = new JButton("Pick a Color");
		btn.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setOpaque(true); // to display the bg color
		label.setText("This is some text");
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));
									
		this.add(label);
		this.add(btn);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			
//			JColorChooser colorChooser = new JColorChooser();
			
//			Color color = colorChooser.showDialog(null, "Color Picker", Color.black);
			Color color = JColorChooser.showDialog(null, "Color Picker", Color.black);
			
//			label.setForeground(color);
			label.setBackground(color);
		}
		
	}
}
