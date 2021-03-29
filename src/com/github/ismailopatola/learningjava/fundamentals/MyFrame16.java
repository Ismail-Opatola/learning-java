package com.github.ismailopatola.learningjava.fundamentals;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame16 extends JFrame{

	private static final long serialVersionUID = 1L;
	JButton btn = new JButton("MY BUTTON 1");
	JButton btn2 = new JButton("MY BUTTON 2");
	
	public MyFrame16() {
		btn.setBounds(100, 100, 200, 100);
		btn2.setBounds(100, 200, 200, 100);
		
		btn.addActionListener((e) -> System.out.println("You clicked 1st button")); // lambda
		btn2.addActionListener((e) -> System.out.println("You clicked 2nd button")); // lambda
		
		this.add(btn);
		this.add(btn2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		this.setVisible(true);
	}
}
