package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame15 extends JFrame{
	
	private static final long serialVersionUID = 1L;
	JButton button1 = new JButton("Button #1");
	JButton button2 = new JButton("Button #2");
	JButton button3 = new JButton("Button #3");


	public MyFrame15() {
		button1.setBounds(100, 100, 100, 100);
		button2.setBounds(200, 100, 100, 100);
		button3.setBounds(300, 100, 100, 100);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You pressed btn 1");
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You pressed btn 2");
			}
		});
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You pressed btn 3");
			}
		});
		
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
	}
}
