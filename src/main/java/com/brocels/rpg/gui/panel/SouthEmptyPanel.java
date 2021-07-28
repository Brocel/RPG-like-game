package com.brocels.rpg.gui.panel;

import javax.swing.JPanel;
import java.awt.*;

import org.springframework.stereotype.Component;

@Component
public class SouthEmptyPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SouthEmptyPanel() {
		this.setPreferredSize(new Dimension(500, 100));
		this.setBackground(Color.BLACK);
		this.setLayout(new GridLayout(2,1));
	}

}
