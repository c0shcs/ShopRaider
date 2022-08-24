package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.Component;
import javax.swing.Box;

public class KassenPanel extends JPanel {
	private JTextField textName;
	private JTextField textVorname;
	private JTextField textStrasse;
	private JTextField textHausNr;
	private JTextField textPlz;
	private JTextField textOrt;
	private JTextField textLand;
	private JTextField textLieferName;
	private JTextField textLieferVorname;
	private JTextField textLieferStrasse;
	private JTextField textLieferHausNr;
	private JTextField textLieferPlz;
	private JTextField textLieferOrt;
	private JTextField textLieferLand;

	/**
	 * Create the panel.
	 */
	public KassenPanel() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JPanel panelAddressfeldRamen = new JPanel();
		panelAddressfeldRamen.setBackground(new Color(255, 255, 255));
		panelAddressfeldRamen.setBounds(0, 256, 668, 325);
		add(panelAddressfeldRamen);
		panelAddressfeldRamen.setLayout(null);
		
		JLabel lblAddresse = new JLabel("Addressfeld:");
		lblAddresse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddresse.setBounds(5, 5, 227, 25);
		panelAddressfeldRamen.add(lblAddresse);
		
		JPanel panelAdressfeld = new JPanel();
		panelAdressfeld.setLayout(null);
		panelAdressfeld.setBounds(5, 30, 340, 130);
		panelAddressfeldRamen.add(panelAdressfeld);
		
		JLabel lblAddName = new JLabel("Name");
		lblAddName.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddName.setBackground(Color.GRAY);
		lblAddName.setBounds(3, 5, 50, 20);
		panelAdressfeld.add(lblAddName);
		
		textName = new JTextField();
		textName.setColumns(30);
		textName.setBounds(55, 5, 280, 20);
		panelAdressfeld.add(textName);
		
		JLabel lblAddVorname = new JLabel("Vorname");
		lblAddVorname.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddVorname.setBackground(Color.GRAY);
		lblAddVorname.setBounds(3, 30, 50, 20);
		panelAdressfeld.add(lblAddVorname);
		
		textVorname = new JTextField();
		textVorname.setColumns(30);
		textVorname.setBounds(55, 30, 280, 20);
		panelAdressfeld.add(textVorname);
		
		JLabel lblAddStrasse = new JLabel("Strasse");
		lblAddStrasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddStrasse.setBackground(Color.GRAY);
		lblAddStrasse.setBounds(3, 55, 50, 20);
		panelAdressfeld.add(lblAddStrasse);
		
		textStrasse = new JTextField();
		textStrasse.setColumns(25);
		textStrasse.setBounds(55, 55, 210, 20);
		panelAdressfeld.add(textStrasse);
		
		JLabel lblAddNr = new JLabel("Nr:");
		lblAddNr.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNr.setBackground(Color.GRAY);
		lblAddNr.setBounds(270, 55, 20, 20);
		panelAdressfeld.add(lblAddNr);
		
		textHausNr = new JTextField();
		textHausNr.setColumns(14);
		textHausNr.setBounds(295, 55, 40, 20);
		panelAdressfeld.add(textHausNr);
		
		JLabel lblAddPlz = new JLabel("PLZ");
		lblAddPlz.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddPlz.setBackground(Color.GRAY);
		lblAddPlz.setBounds(3, 80, 50, 20);
		panelAdressfeld.add(lblAddPlz);
		
		textPlz = new JTextField();
		textPlz.setColumns(8);
		textPlz.setBounds(55, 80, 90, 20);
		panelAdressfeld.add(textPlz);
		
		JLabel lblAddOrt = new JLabel("Ort");
		lblAddOrt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddOrt.setBackground(Color.GRAY);
		lblAddOrt.setBounds(150, 80, 20, 20);
		panelAdressfeld.add(lblAddOrt);
		
		textOrt = new JTextField();
		textOrt.setColumns(10);
		textOrt.setBounds(175, 80, 160, 20);
		panelAdressfeld.add(textOrt);
		
		JLabel lblAddLand = new JLabel("Land");
		lblAddLand.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddLand.setBackground(Color.GRAY);
		lblAddLand.setBounds(3, 105, 50, 20);
		panelAdressfeld.add(lblAddLand);
		
		
		
		textLand = new JTextField();
		textLand.setColumns(10);
		textLand.setBounds(55, 105, 280, 20);
		panelAdressfeld.add(textLand);
		
		JButton btnWeiterShoppen = new JButton("Weiter\r\nShoppen");
		btnWeiterShoppen.setBounds(350, 30, 80, 55);
		panelAddressfeldRamen.add(btnWeiterShoppen);
		
		JButton btnBestellen = new JButton("Zahlungspflichtig\r\nBestellen");
		btnBestellen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBestellen.setBounds(435, 30, 150, 55);
		panelAddressfeldRamen.add(btnBestellen);
		
		JLabel lblLiefAddresse = new JLabel("Lieferaddresse:");
		lblLiefAddresse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLiefAddresse.setBounds(5, 165, 150, 25);
		panelAddressfeldRamen.add(lblLiefAddresse);
		
		JPanel panelLieferAddressfeld = new JPanel();
		panelLieferAddressfeld.setLayout(null);
		panelLieferAddressfeld.setBounds(5, 190, 340, 130);
		panelAddressfeldRamen.add(panelLieferAddressfeld);
		
		JLabel lblLieferName = new JLabel("Name");
		lblLieferName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLieferName.setBackground(Color.GRAY);
		lblLieferName.setBounds(3, 5, 50, 20);
		panelLieferAddressfeld.add(lblLieferName);
		
		textLieferName = new JTextField();
		textLieferName.setColumns(30);
		textLieferName.setBounds(55, 5, 280, 20);
		panelLieferAddressfeld.add(textLieferName);
		
		JLabel lblLieferVorname = new JLabel("Vorname");
		lblLieferVorname.setHorizontalAlignment(SwingConstants.CENTER);
		lblLieferVorname.setBackground(Color.GRAY);
		lblLieferVorname.setBounds(3, 30, 50, 20);
		panelLieferAddressfeld.add(lblLieferVorname);
		
		textLieferVorname = new JTextField();
		textLieferVorname.setColumns(30);
		textLieferVorname.setBounds(55, 30, 280, 20);
		panelLieferAddressfeld.add(textLieferVorname);
		
		JLabel lblLieferStrasse = new JLabel("Strasse");
		lblLieferStrasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblLieferStrasse.setBackground(Color.GRAY);
		lblLieferStrasse.setBounds(3, 55, 50, 20);
		panelLieferAddressfeld.add(lblLieferStrasse);
		
		textLieferStrasse = new JTextField();
		textLieferStrasse.setColumns(25);
		textLieferStrasse.setBounds(55, 55, 210, 20);
		panelLieferAddressfeld.add(textLieferStrasse);
		
		JLabel lblLieferNr = new JLabel("Nr:");
		lblLieferNr.setHorizontalAlignment(SwingConstants.CENTER);
		lblLieferNr.setBackground(Color.GRAY);
		lblLieferNr.setBounds(270, 55, 20, 20);
		panelLieferAddressfeld.add(lblLieferNr);
		
		textLieferHausNr = new JTextField();
		textLieferHausNr.setColumns(14);
		textLieferHausNr.setBounds(295, 55, 40, 20);
		panelLieferAddressfeld.add(textLieferHausNr);
		
		JLabel lblLieferPlz = new JLabel("PLZ");
		lblLieferPlz.setHorizontalAlignment(SwingConstants.CENTER);
		lblLieferPlz.setBackground(Color.GRAY);
		lblLieferPlz.setBounds(3, 80, 50, 20);
		panelLieferAddressfeld.add(lblLieferPlz);
		
		textLieferPlz = new JTextField();
		textLieferPlz.setColumns(8);
		textLieferPlz.setBounds(55, 80, 90, 20);
		panelLieferAddressfeld.add(textLieferPlz);
		
		JLabel lblLieferOrt = new JLabel("Ort");
		lblLieferOrt.setHorizontalAlignment(SwingConstants.CENTER);
		lblLieferOrt.setBackground(Color.GRAY);
		lblLieferOrt.setBounds(150, 80, 20, 20);
		panelLieferAddressfeld.add(lblLieferOrt);
		
		textLieferOrt = new JTextField();
		textLieferOrt.setColumns(10);
		textLieferOrt.setBounds(175, 80, 160, 20);
		panelLieferAddressfeld.add(textLieferOrt);
		
		JLabel lblLieferLand = new JLabel("Land");
		lblLieferLand.setHorizontalAlignment(SwingConstants.CENTER);
		lblLieferLand.setBackground(Color.GRAY);
		lblLieferLand.setBounds(3, 105, 50, 20);
		panelLieferAddressfeld.add(lblLieferLand);
		
		textLieferLand = new JTextField();
		textLieferLand.setColumns(10);
		textLieferLand.setBounds(55, 105, 280, 20);
		panelLieferAddressfeld.add(textLieferLand);
		
		JCheckBox chckbxLieferaddresse = new JCheckBox("Fals Abweichend bitte ankreutzen: ");
		chckbxLieferaddresse.setHorizontalTextPosition(SwingConstants.LEFT);
		chckbxLieferaddresse.setFont(new Font("Tahoma", Font.PLAIN, 8));
		chckbxLieferaddresse.setBackground(Color.WHITE);
		chckbxLieferaddresse.setBounds(195, 167, 150, 25);
		panelAddressfeldRamen.add(chckbxLieferaddresse);
		
		JPanel KassenListe = new JPanel();
		KassenListe.setBackground(new Color(255, 255, 255));
		KassenListe.setBounds(0, 0, 668, 255);
		add(KassenListe);
		KassenListe.setLayout(null);
		
		JLabel lblKasse = new JLabel("Kasse:");
		lblKasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKasse.setBounds(5, 5, 227, 25);
		KassenListe.add(lblKasse);

	}
}
