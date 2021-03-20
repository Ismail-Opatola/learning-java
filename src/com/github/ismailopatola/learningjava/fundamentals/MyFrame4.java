package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btn;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
	public MyFrame4() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		xIcon = new ImageIcon("angry.png");
		checkIcon = new ImageIcon("funny.png");
		
		btn = new JButton();
		btn.setText("submit");
		btn.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
		checkBox.setIcon(xIcon); // change default checkbox icon - use custom icon
		checkBox.setSelectedIcon(checkIcon); // switch icon on checked
		
		this.add(checkBox);
		this.add(btn);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * if event is btn
		 * 
		 */
		if(e.getSource() == btn) {
			System.out.println(checkBox.isSelected());
		}
		
	}
}
