package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel ContentPane;
	private SideBar SideBar; 
	private ArtikelPanel ArtikelPanel;
	private HeaderPanel HeaderPanel;
	
	
	public SideBar getSideBar() {
		return SideBar;
	}

	public void setSideBar(SideBar sideBar) {
		SideBar = sideBar;
	}

	public ArtikelPanel getArtikelPanel() {
		return ArtikelPanel;
	}

	public void setArtikelPanel(ArtikelPanel artikelPanel) {
		ArtikelPanel = artikelPanel;
	}

	public HeaderPanel getHeaderPanel() {
		return HeaderPanel;
	}

	public void setHeaderPanel(HeaderPanel headerPanel) {
		HeaderPanel = headerPanel;
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 794);
		ContentPane = new JPanel();
		ContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ContentPane);
		ContentPane.setLayout(new BorderLayout(0, 0));
		
		this. HeaderPanel = new HeaderPanel();
		ContentPane.add(HeaderPanel, BorderLayout.NORTH);
		
		this. ArtikelPanel = new ArtikelPanel();
		ContentPane.add(ArtikelPanel, BorderLayout.CENTER);
		
		this. SideBar = new SideBar();
		ContentPane.add(SideBar, BorderLayout.WEST);
		
		
		
		
	}

	
}
