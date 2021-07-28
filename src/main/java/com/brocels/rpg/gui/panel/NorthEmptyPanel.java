package com.brocels.rpg.gui.panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import org.springframework.stereotype.Component;

@Component
public class NorthEmptyPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NorthEmptyPanel() {
		this.setPreferredSize(new Dimension(500, 50));
		this.setBackground(Color.LIGHT_GRAY);
	}
}
