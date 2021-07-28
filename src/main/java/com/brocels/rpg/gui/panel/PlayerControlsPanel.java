package com.brocels.rpg.gui.panel;

import javax.annotation.PostConstruct;
import javax.swing.JPanel;

import org.springframework.stereotype.Component;

/**
* Player Controls Panel
* - Action Buttons
* - Message Text Area
* - Etc.
*/
@Component
public class PlayerControlsPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PlayerControlsPanel() {}

	@PostConstruct
	public void createPlayerControlsGUI() {
		
	}
}
