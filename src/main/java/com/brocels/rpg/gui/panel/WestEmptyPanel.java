package com.brocels.rpg.gui.panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import org.springframework.stereotype.Component;

@Component
public class WestEmptyPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WestEmptyPanel() {
		this.setPreferredSize(new Dimension(200, 800));
		this.setBackground(Color.GREEN);
	}
}
