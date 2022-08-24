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
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

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
		
		JLabel lblAddName_1 = new JLabel("Name");
		lblAddName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddName_1.setBackground(Color.GRAY);
		lblAddName_1.setBounds(3, 5, 50, 20);
		panelLieferAddressfeld.add(lblAddName_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(30);
		textField_7.setBounds(55, 5, 280, 20);
		panelLieferAddressfeld.add(textField_7);
		
		JLabel lblAddVorname_1 = new JLabel("Vorname");
		lblAddVorname_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddVorname_1.setBackground(Color.GRAY);
		lblAddVorname_1.setBounds(3, 30, 50, 20);
		panelLieferAddressfeld.add(lblAddVorname_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(30);
		textField_8.setBounds(55, 30, 280, 20);
		panelLieferAddressfeld.add(textField_8);
		
		JLabel lblAddStrasse_1 = new JLabel("Strasse");
		lblAddStrasse_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddStrasse_1.setBackground(Color.GRAY);
		lblAddStrasse_1.setBounds(3, 55, 50, 20);
		panelLieferAddressfeld.add(lblAddStrasse_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(25);
		textField_9.setBounds(55, 55, 210, 20);
		panelLieferAddressfeld.add(textField_9);
		
		JLabel lblAddNr_1 = new JLabel("Nr:");
		lblAddNr_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNr_1.setBackground(Color.GRAY);
		lblAddNr_1.setBounds(270, 55, 20, 20);
		panelLieferAddressfeld.add(lblAddNr_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(14);
		textField_10.setBounds(295, 55, 40, 20);
		panelLieferAddressfeld.add(textField_10);
		
		JLabel lblAddPlz_1 = new JLabel("PLZ");
		lblAddPlz_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddPlz_1.setBackground(Color.GRAY);
		lblAddPlz_1.setBounds(3, 80, 50, 20);
		panelLieferAddressfeld.add(lblAddPlz_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(8);
		textField_11.setBounds(55, 80, 90, 20);
		panelLieferAddressfeld.add(textField_11);
		
		JLabel lblAddOrt_1 = new JLabel("Ort");
		lblAddOrt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddOrt_1.setBackground(Color.GRAY);
		lblAddOrt_1.setBounds(150, 80, 20, 20);
		panelLieferAddressfeld.add(lblAddOrt_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(175, 80, 160, 20);
		panelLieferAddressfeld.add(textField_12);
		
		JLabel lblAddLand_1 = new JLabel("Land");
		lblAddLand_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddLand_1.setBackground(Color.GRAY);
		lblAddLand_1.setBounds(3, 105, 50, 20);
		panelLieferAddressfeld.add(lblAddLand_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(55, 105, 280, 20);
		panelLieferAddressfeld.add(textField_13);
		
		JCheckBox chckbxLieferaddresse = new JCheckBox("Fals Abweichend bitte ankreutzen: ");
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
		
		Component horizontalStrutKassenListe03 = Box.createHorizontalStrut(20);
		horizontalStrutKassenListe03.setBackground(Color.GRAY);
		horizontalStrutKassenListe03.setBounds(5, 149, 658, 12);
		KassenListe.add(horizontalStrutKassenListe03);
		
		Component horizontalStrutKassenListe01 = Box.createHorizontalStrut(20);
		horizontalStrutKassenListe01.setBackground(new Color(128, 128, 128));
		horizontalStrutKassenListe01.setBounds(5, 30, 658, 12);
		KassenListe.add(horizontalStrutKassenListe01);
		
		Component horizontalStrutKassenListe02 = Box.createHorizontalStrut(20);
		horizontalStrutKassenListe02.setBackground(Color.GRAY);
		horizontalStrutKassenListe02.setBounds(5, 110, 658, 12);
		KassenListe.add(horizontalStrutKassenListe02);

	}
}
