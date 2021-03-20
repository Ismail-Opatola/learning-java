package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame6 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JComboBox<Object> comboBox;

	public MyFrame6() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"dog", "cat", "bird", "fish"};
		
		comboBox = new JComboBox<Object>(animals);
		comboBox.addActionListener(this);
		
		// comboBox.setEditable(true); // text editable
		// System.out.println(comboBox.getItemCount()); // 3
		// comboBox.addItem("lion"); // add item to the bottom of the list
		// comboBox.insertItemAt("pig", 0); // insert at index
		// comboBox.setSelectedIndex(0); // set default selected by index		
		// comboBox.removeItem("cat"); // remove item
		// comboBox.removeItemAt("cat"); // remove item by index
		// comboBox.removeAll(); // remove all/clear all
		// comboBox.removeActionListener(this); // remove event listener
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
			System.out.println(comboBox.getSelectedIndex());
		}
		
	}
}
