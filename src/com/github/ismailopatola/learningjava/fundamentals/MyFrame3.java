package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame3 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton btn;
	JTextField textField;
	JTextField textField2;
	
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
		
		textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(250, 40));
		textField2.setFont(new Font("Consolas", Font.PLAIN, 35));
		textField2.setForeground(new Color(0x00FF00));
		textField2.setBackground(Color.black);
		textField2.setCaretColor(Color.white);
		textField2.setText("password");
		// textField.setEditable(false); // disable textfeild
		
		this.add(btn);
		this.add(textField);
		this.add(textField2);
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
			btn.setEnabled(false); // disable btn
			textField.setEditable(false); // disable textfeild
			textField2.setEditable(false); // disable textfeild
			
			try {
			
				File file = new File("username.txt");
			
				if(file.exists()) {
					file.delete();
				} 
				
				// create file
				file.createNewFile();
				
				FileWriter writer = new FileWriter("username.txt");
					
				// save content to file
				writer.write("Username: " + textField.getText());
				writer.append("\nPassword: " + textField2.getText());
					
				writer.close();
					
			} catch (Exception err) {
				err.printStackTrace();
			} finally {
				// close first frame/window
				this.dispose();
				// open a new window, display username
				new NewWindow2(textField.getText());
			}
		}

	}
		
}

