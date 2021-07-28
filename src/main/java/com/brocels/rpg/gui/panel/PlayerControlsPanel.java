package com.brocels.rpg.gui.panel;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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
	
	private JPanel messagePane;
	private JLabel messageLabel;
	private JTextArea message;
	private JButton submitMessage;
	private JPanel choicePane;
	private JLabel choiceLabel;
	private JComboBox<String> choiceBox;
	private JButton submitChoice;
	private JPanel dicePane;
	private JLabel diceLabel;
	private JButton rollDice;
	
	public PlayerControlsPanel() {}

	@PostConstruct
	public void createPlayerControlsGUI() {
		// Background
		this.setBackground(Color.LIGHT_GRAY);
		// Layout
		this.setLayout(new GridLayout(1,3));
		// Elements
		// Message
		messagePane = new JPanel();
		messagePane.setLayout(new GridLayout(1,3));
		messageLabel = new JLabel("Message");
		message = new JTextArea();
		message.setEditable(true);
		submitMessage = new JButton("Submit Message");
		messagePane.add(messageLabel);
		messagePane.add(message);
		messagePane.add(submitMessage);
		// Dice
		dicePane = new JPanel();
		dicePane.setLayout(new GridLayout(1,2));
		diceLabel = new JLabel("Dice Roll");
		rollDice = new JButton("Dice");
		dicePane.add(diceLabel);
		dicePane.add(rollDice);
		// Choice
		choicePane = new JPanel();
		choicePane.setLayout(new GridLayout(1,3));
		choiceLabel = new JLabel("Choices");
		choiceBox = new JComboBox<String>();
		submitChoice = new JButton("Submit Choice");
		choicePane.add(choiceLabel);
		choicePane.add(choiceBox);
		choicePane.add(submitChoice);
	}
	
	public void updateChoices(String[] choices) {
		for(int i=0; i<choices.length; i++) {
			choiceBox.addItem(choices[i]);
		}
	}
}
