package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;


public class ArtikelPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ArtikelPanel() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		setBounds(100, 100, 800, 215);
		
		JPanel panArtikel = new JPanel();
		panArtikel.setBounds(0, 0, 800, 215);
		add(panArtikel);
		panArtikel.setLayout(null);
		
		JLabel lblArtBild = new JLabel("");
		lblArtBild.setIcon(new ImageIcon("C:\\Users\\mcwoh\\eclipse-workspace\\c0shop\\source\\Inno3D-GeForce-RTX-3060-12GB-Twin-X2-LHR-p727310.png"));
		lblArtBild.setBounds(10, 10, 195, 195);
		panArtikel.add(lblArtBild);
		
		JLabel lblArtBezeichnung = new JLabel("Artikelnamen");
		lblArtBezeichnung.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblArtBezeichnung.setBounds(215, 10, 450, 25);
		panArtikel.add(lblArtBezeichnung);
		
		JLabel lblArtBeschreibung = new JLabel("Artikelbeschreibung ");
		lblArtBeschreibung.setBounds(215, 38, 450, 167);
		panArtikel.add(lblArtBeschreibung);
		
		JButton btnZuWarenkorb = new JButton("in den Warenkorb");
		btnZuWarenkorb.setBounds(675, 181, 117, 23);
		panArtikel.add(btnZuWarenkorb);
		
		JLabel lblPreis = new JLabel("Preis:");
		lblPreis.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPreis.setBounds(675, 108, 115, 25);
		panArtikel.add(lblPreis);

	}
}
