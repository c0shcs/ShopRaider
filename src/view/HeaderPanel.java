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

//	private JPanel panHeadBar;
//	private JPanel panHeader;
//	private JLabel LabLogo;
//	private JTextField textFSuchen;
	//private JButton btnStartseite;



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
		LabLogo.setBackground(Color.LIGHT_GRAY);
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
