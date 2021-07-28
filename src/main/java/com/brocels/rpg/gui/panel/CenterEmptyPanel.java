package com.brocels.rpg.gui.panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import org.springframework.stereotype.Component;

@Component
public class CenterEmptyPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CenterEmptyPanel() {
		this.setPreferredSize(new Dimension(1100, 650));
		this.setBackground(Color.LIGHT_GRAY);
	}

}
