package com.brocels.rpg.gui.frames;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.annotation.PostConstruct;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.brocels.rpg.gui.panel.PlayerControlsPanel;

/**
 * Player controls Frame
 */
@Component
public class PlayerFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Player's controls panel that will be added to the player frame
	 */
	@Autowired
	private PlayerControlsPanel playerPanel;
	
	public PlayerFrame() {}
	
	@PostConstruct
	public void createPlayerGUI() {
		this.setBounds(350, 830, 1100, 200);
		this.setResizable(false);
		
		// Hide the titlebar for player JFrame
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		//playerPanel = new PlayerControlsPanel();
		this.add(playerPanel);
		this.setVisible(true);
		
	}
	
}
