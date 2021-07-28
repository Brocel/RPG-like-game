package com.brocels.rpg.gui.frames;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.annotation.PostConstruct;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.brocels.rpg.gui.panel.SouthEmptyPanel;

@Component
public class RpgFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private SouthEmptyPanel southEmptyPanel;
	
	/**
	 * Contain every imported panels that will be added to the main frame
	 */
	private JPanel mainPanel;

	public RpgFrame() {}
	
	@PostConstruct
	public void createMainGUI() {
		this.setBounds(100, 70, 1100, 500);
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e ) {
				System.exit(0);
			}
		});
		
		this.mainPanel = new JPanel();
		this.mainPanel.setLayout(new BorderLayout());
		
		this.mainPanel.add(southEmptyPanel, BorderLayout.SOUTH);
		
		this.add(mainPanel);
		this.setVisible(true);
	}
	
}
