package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7454117228774354058L;
	
	JButton button;
	JLabel label;
	Boolean isVisible = false; 
	
	public MyFrame2() {
		
		ImageIcon icon = new ImageIcon("thumbs_up.png");
		ImageIcon icon2 = new ImageIcon("thumbs_up.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(200, 250, 150, 150);
		label.setVisible(false);
		
		this.button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.setText("Trigger");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD, 20));
		button.setIconTextGap(-1);
		button.setForeground(Color.green);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		button.addActionListener(e -> {
			isVisible = !isVisible;
			System.out.println("poof!");
			label.setVisible(isVisible);
		});
		// button.setEnabled(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
}

/**
 * 
 * 2nd method of adding event listener
 *
 */
/*
public class MyFrame2 extends JFrame implements ActionListener{

	private static final long serialVersionUID = -7454117228774354058L;
	
	JButton button;
	
	public MyFrame2() {
		
		this.button = new JButton();
		button.setText("Click Me");
		button.setBounds(200, 100, 100, 50);
		button.addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Poof!");
			button.setEnabled(false);
		}
		
	}
}
*/