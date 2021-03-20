package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame3 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton btn;
	JTextField textField;
	
	public MyFrame3() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		btn = new JButton("Submit");
		btn.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 35));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("username");
		// textField.setEditable(false); // disable textfeild
		
		this.add(btn);
		this.add(textField);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * if event is btn click, 
		 * get text from textfield
		 */
		
		if(e.getSource() == btn) {
			System.out.println("Welcome " + textField.getText());
			btn.setEnabled(false); // disable btn
			textField.setEditable(false); // disable textfeild
		}
		
	}
}
