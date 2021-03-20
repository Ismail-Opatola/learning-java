package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {

	JFrame frame = new JFrame();
	JButton btn = new JButton("New Window");
	
	LaunchPage() {
		btn.setBounds(100, 160, 200, 40);
		btn.setFocusable(false);
		btn.addActionListener(this);
		
		frame.add(btn);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * launch a new window
		 */
		if(e.getSource() == btn) {
//			btn.disable();
//			frame.disable();		
			frame.dispose(); // (optional) close the old window to aviod duplicates of Newindow i.e as a result of multiple clicks on btn
			
			NewWindow myNewWindow = new NewWindow();
		}
	}
}
