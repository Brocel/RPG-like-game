package com.brocels.rpg.gui.frames;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.annotation.PostConstruct;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import org.springframework.stereotype.Component;

@Component
public class PlayerFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Contain every imported panels that will be added to the player frame
	 */
	private JPanel playerPanel;
	
	public PlayerFrame() {}
	
	@PostConstruct
	public void createPlayerGUI() {
		this.setBounds(350, 800, 1100, 200);
		this.setResizable(false);
		
		// Hide the titlebar for player JFrame
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		this.playerPanel = new JPanel();
		this.playerPanel.setBackground(Color.LIGHT_GRAY);
		
		this.add(playerPanel);
		this.setVisible(true);
		
	}
	
}
