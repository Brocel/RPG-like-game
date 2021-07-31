package com.brocels.rpg.gui.panel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.annotation.PostConstruct;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

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
	
	private Box messageBox;
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
		// Dice
		dicePane = new JPanel();
		dicePane.setLayout(new GridLayout(2,1));
		diceLabel = new JLabel("Dice Roll", SwingConstants.CENTER);
		rollDice = new JButton("Dice");
		dicePane.add(diceLabel);
		dicePane.add(rollDice);
		// Choice
		choicePane = new JPanel();
		choicePane.setLayout(new GridLayout(3,1));
		choiceLabel = new JLabel("Choices", SwingConstants.CENTER);
		choiceBox = new JComboBox<String>();
		submitChoice = new JButton("Submit Choice");
		choicePane.add(choiceLabel);
		choicePane.add(choiceBox);
		choicePane.add(submitChoice);
		// Adding elements
		this.add(choicePane);
		this.add(dicePane);
		buildMessagePane();
	}
	
	public void updateChoices(String[] choices) {
		for(int i=0; i<choices.length; i++) {
			choiceBox.addItem(choices[i]);
		}
	}
	
	public void buildMessagePane() {
		messageBox = new Box(BoxLayout.Y_AXIS);
		messageLabel = new JLabel("Message", SwingConstants.CENTER);
		message = new JTextArea();
		message.setEditable(true);
		submitMessage = new JButton("Submit Message");
		Box content = new Box(BoxLayout.X_AXIS);
		messageBox.add(messageLabel);
		content.add(message);
		content.add(submitMessage);
		messageBox.add(content);

		this.add(messageBox);
	}
}
