package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar progressBar = new JProgressBar();
//	JProgressBar progressBar = new JProgressBar(0,100);
	
	public ProgressBarDemo() {
		progressBar.setValue(0);
		progressBar.setBounds(0, 0, 420, 20); // position, size
		progressBar.setStringPainted(true); // adds 0% to bar
		progressBar.setFont(new Font("MV Boli", Font.BOLD, 15));
		progressBar.setForeground(Color.green);
		progressBar.setBackground(Color.lightGray);

		frame.add(progressBar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}

	private void fill() {
		int counter = 0;
		
		while (counter <= 100) {
			
			progressBar.setValue(counter);	
			
			try {
				Thread.sleep(50); // setTimeout
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			counter += 1;
		}
		
		progressBar.setString("Download complete!");
		
	}

}
