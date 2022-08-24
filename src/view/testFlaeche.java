package view;

import javax.swing.JPanel;

import view.main.MenuPanel;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Button;
import java.awt.CardLayout;

public class testFlaeche extends JPanel {

	/**
	 * Create the panel.
	 */
	public testFlaeche() {
		setLayout(null);
		
		JPanel panelComponents = new JPanel();
		panelComponents.setBounds(10, 11, 430, 132);
		add(panelComponents);
		
		JLabel lblNewLabelComponents = new JLabel("New label Components");
		panelComponents.add(lblNewLabelComponents);
		
		JButton btnNewButtonComponents = new JButton("New button Components");
		panelComponents.add(btnNewButtonComponents);
		
		Panel panelAWT = new Panel();
		panelAWT.setBounds(10, 144, 430, 146);
		add(panelAWT);
		panelAWT.setLayout(new CardLayout(0, 0));
		
		Label labelAWT = new Label("New label AWT");
		panelAWT.add(labelAWT, "name_13429856463800");
		
		Button buttonAWT = new Button("New button AWT");
		panelAWT.add(buttonAWT, "name_13429906735400");

		
		//was zur hölle
		
	}
}
