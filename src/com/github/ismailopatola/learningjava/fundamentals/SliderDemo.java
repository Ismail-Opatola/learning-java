package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo() {

		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(-100, 100, 0);
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN,15));
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText("0C = " + slider.getValue());
		label.setFont(new Font("MV Boli", Font.PLAIN,25));
		
		slider.addChangeListener(this); // onChange listener
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}

	/**
	 *  onChange handler
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("0C = " + slider.getValue());
	}
}
