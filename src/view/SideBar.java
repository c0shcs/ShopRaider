package view;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
public class SideBar extends JPanel {

	private JPanel panSideBar;
	private JLabel lblKategorieLabel;
	private JMenu mnKat01Menu;
	private JMenuItem mntmKat01Comp;

	
	
	public JPanel getPanSideBar() {
		return panSideBar;
	}

	public void setPanSideBar(JPanel panSideBar) {
		this.panSideBar = panSideBar;
	}

	public JLabel getLblKategorieLabel() {
		return lblKategorieLabel;
	}

	public void setLblKategorieLabel(JLabel lblKategorieLabel) {
		this.lblKategorieLabel = lblKategorieLabel;
	}

	public JMenu getMnKat01Menu() {
		return mnKat01Menu;
	}

	public void setMnKat01Menu(JMenu mnKat01Menu) {
		this.mnKat01Menu = mnKat01Menu;
	}

	public JMenuItem getMntmKat01Comp() {
		return mntmKat01Comp;
	}

	public void setMntmKat01Comp(JMenuItem mntmKat01Comp) {
		this.mntmKat01Comp = mntmKat01Comp;
	}
	
	
	
	public SideBar() {
		setBackground(new Color(240, 240, 240));
		setBounds(100, 100, 120, 400);
		super.setPreferredSize(new Dimension(120,400));
		setLayout(null);
		
		JPanel panSideBar = new JPanel();
		panSideBar.setBackground(new Color(240, 240, 240));
		panSideBar.setBounds(0, 0, 120, 400);
		add(panSideBar);
		panSideBar.setLayout(null);
		
			
		JLabel lblKategorieLabel = new JLabel("Kategorien");
		lblKategorieLabel.setBounds(5, 0, 110, 26);
		lblKategorieLabel.setBackground(new Color(70, 130, 180));
		lblKategorieLabel.setForeground(new Color(0, 0, 0));
		lblKategorieLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblKategorieLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panSideBar.add(lblKategorieLabel);
		
		JMenu mnKat01Menu = new JMenu("Kat01");
		mnKat01Menu.setHorizontalAlignment(SwingConstants.CENTER);
		mnKat01Menu.setBounds(5, 26, 110, 26);
		mnKat01Menu.setBackground(new Color(192, 192, 192));
		mnKat01Menu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panSideBar.add(mnKat01Menu);
		
		JMenuItem mntmKat01Comp = new JMenuItem("Kat01Componente");
		mntmKat01Comp.setBackground(new Color(192, 192, 192));
		mntmKat01Comp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mnKat01Menu.add(mntmKat01Comp);
		
		JMenu mnKat02 = new JMenu("Kat02");
		mnKat02.setBounds(5, 52, 110, 26);
		mnKat02.setHorizontalAlignment(SwingConstants.CENTER);
		mnKat02.setBackground(new Color(192, 192, 192));
		mnKat02.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panSideBar.add(mnKat02);
		
		JMenuItem mntmKat02Comp = new JMenuItem("Kat02Componente");
		mntmKat02Comp.setBackground(new Color(192, 192, 192));
		mntmKat02Comp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mnKat02.add(mntmKat02Comp);
		
		JMenuItem mntmKat0Comp02 = new JMenuItem("Kat02Componente02");
		mntmKat0Comp02.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mnKat02.add(mntmKat0Comp02);
		
		JMenuItem mntmKat03 = new JMenuItem("Kat03");
		mntmKat03.setBackground(new Color(192, 192, 192));
		mntmKat03.setBounds(5, 78, 110, 26);
		mntmKat03.setHorizontalAlignment(SwingConstants.CENTER);
		mntmKat03.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panSideBar.add(mntmKat03);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(5, 26, 110, 1);
		panSideBar.add(separator);
		
		
	}

	
}
