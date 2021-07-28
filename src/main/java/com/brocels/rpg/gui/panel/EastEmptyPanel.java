package com.brocels.rpg.gui.panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import org.springframework.stereotype.Component;

@Component
public class EastEmptyPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EastEmptyPanel() {
		this.setPreferredSize(new Dimension(200, 800));
		this.setBackground(Color.DARK_GRAY);
	}

}
