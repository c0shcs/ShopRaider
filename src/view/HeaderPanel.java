package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class HeaderPanel extends JPanel {

	private JPanel panHeadBar;
	private JPanel panHeader;
	private JLabel LabLogo;
	private JTextField textFSuchen;
	private JButton btnStartseite;
	private JButton btnWarenkorb;
	private JButton btnKasse;
	private JButton btnSuchen;
	
	
	public JPanel getPanHeadBar() {
		return panHeadBar;
	}

	public void setPanHeadBar(JPanel panHeadBar) {
		this.panHeadBar = panHeadBar;
	}

	public JPanel getPanHeader() {
		return panHeader;
	}

	public void setPanHeader(JPanel panHeader) {
		this.panHeader = panHeader;
	}

	public JLabel getLabLogo() {
		return LabLogo;
	}

	public void setLabLogo(JLabel labLogo) {
		LabLogo = labLogo;
	}

	public JTextField getTextFSuchen() {
		return textFSuchen;
	}

	public void setTextFSuchen(JTextField textFSuchen) {
		this.textFSuchen = textFSuchen;
	}

	public JButton getBtnStartseite() {
		return btnStartseite;
	}

	public void setBtnStartseite(JButton btnStartseite) {
		this.btnStartseite = btnStartseite;
	}

	public JButton getBtnWarenkorb() {
		return btnWarenkorb;
	}

	public void setBtnWarenkorb(JButton btnWarenkorb) {
		this.btnWarenkorb = btnWarenkorb;
	}

	public JButton getBtnKasse() {
		return btnKasse;
	}

	public void setBtnKasse(JButton btnKasse) {
		this.btnKasse = btnKasse;
	}

	public JButton getBtnSuchen() {
		return btnSuchen;
	}

	public void setBtnSuchen(JButton btnSuchen) {
		this.btnSuchen = btnSuchen;
	}
	
	
	public HeaderPanel() {
		super.setBounds(0, 0, 1024, 100);
		this.setBorder(getBorder());
		this.setLayout(null);
		super.setPreferredSize(new Dimension(1024,100));
		JPanel panHeader = new JPanel();
		panHeader.setBounds(0, 0, 1024, 100);
		add(panHeader);
		panHeader.setLayout(null);
		
		JLabel LabLogo = new JLabel("ShopRaider");
		LabLogo.setHorizontalAlignment(SwingConstants.CENTER);
		LabLogo.setIcon(new ImageIcon("C:\\Users\\mcwoh\\eclipse-workspace\\c0shop\\source\\SR Logo t.png"));
		LabLogo.setOpaque(true);
		LabLogo.setForeground(Color.BLACK);
		LabLogo.setBackground(new Color(192, 192, 192));
		LabLogo.setBounds(5, 5, 120, 52);
		panHeader.add(LabLogo);
		
		JPanel panHeadBar = new JPanel();
		panHeadBar.setBackground(new Color(192, 192, 192));
		panHeadBar.setBounds(5, 62, 1014, 33);
		panHeader.add(panHeadBar);
		
		JButton btnSuchen = new JButton("Suchen");
		btnSuchen.setIcon(new ImageIcon("C:\\Users\\mcwoh\\eclipse-workspace\\c0shop\\source\\Suche15x15k.png"));
		
		JButton btnWarenkorb = new JButton("Warenkorb");
		
		JButton btnKasse = new JButton("zur Kasse");
		
		JButton btnStartseite = new JButton("Startseite");
		panHeadBar.add(btnStartseite);
		
		JTextField textFSuchen = new JTextField();
		textFSuchen.setToolTipText("Such anfragie hier eingeben");
		textFSuchen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panHeadBar.add(textFSuchen);
		textFSuchen.setColumns(60);
		panHeadBar.add(btnSuchen);
		panHeadBar.add(btnWarenkorb);
		panHeadBar.add(btnKasse);
		
		
		
	}
}
