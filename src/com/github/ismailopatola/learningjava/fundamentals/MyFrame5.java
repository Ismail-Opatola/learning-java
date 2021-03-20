package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame5 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JRadioButton angryBtn;
	JRadioButton funnyBtn;
	JRadioButton loveBtn;
	JRadioButton sadBtn;
	ButtonGroup group;
	
	ImageIcon angryIcon;
	ImageIcon funnyIcon;
	ImageIcon loveIcon;
	ImageIcon sadIcon;
	
	public MyFrame5() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		angryIcon = new ImageIcon("angry.png");
		funnyIcon = new ImageIcon("funny.png");
		loveIcon = new ImageIcon("love.png");
		sadIcon = new ImageIcon("sad.png");
		
		angryBtn = new JRadioButton("angry");
		funnyBtn = new JRadioButton("funny");
		loveBtn = new JRadioButton("love");
		sadBtn = new JRadioButton("sad");

		angryBtn.addActionListener(this);
		funnyBtn.addActionListener(this);
		loveBtn.addActionListener(this);
		sadBtn.addActionListener(this);
		
		angryBtn.setIcon(angryIcon);
		funnyBtn.setIcon(funnyIcon);
		loveBtn.setIcon(loveIcon);
		sadBtn.setIcon(sadIcon);

		group = new ButtonGroup();
		group.add(angryBtn);
		group.add(funnyBtn);
		group.add(loveBtn);
		group.add(sadBtn);
		
		this.add(angryBtn);
		this.add(funnyBtn);
		this.add(loveBtn);
		this.add(sadBtn);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * if event is btn
		 * 
		 */
		
		Object eventObject = e.getSource();
		
		if(eventObject == angryBtn) {
			System.out.println("You're angry!");
		} else if(eventObject == funnyBtn) {
			System.out.println("What's funny?");
		} else if (eventObject == loveBtn) {
			System.out.println("You're in love?");			
		} else if (eventObject == sadBtn) {
			System.out.println("Don't worry, be happy!");
		} else {
			System.out.println("Can't tell your mood!");
		}
		
	}

}
