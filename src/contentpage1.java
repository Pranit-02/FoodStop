

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class contentpage1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contentpage1 frame = new contentpage1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//private JCheckBox chckbxf1;
	public int f1qty, f2qty,f3qty,f4qty,f5qty,f7qty,f6qty,d1qty,d2qty,d4qty,d3qty,d6qty,d5qty,d7qty;
	public int v1qty,v2qty,v3qty,v4qty,v5qty,v6qty,v7qty,nv1qty,nv2qty,nv3qty,nv4qty,nv5qty,nv6qty,nv7qty;
	

	/**
	 * Create the frame.
	 */
	
	
	
	public contentpage1() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220,110, 1101, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel tabbedpanel = new JPanel();
		tabbedpanel.setBackground(new Color(245, 222, 179));
		tabbedpanel.setBounds(10, 192, 1081, 442);
		contentPane.add(tabbedpanel);
		tabbedpanel.setLayout(null);
		
		JTabbedPane tabbedpane = new JTabbedPane(JTabbedPane.TOP);
		tabbedpane.setFont(new Font("Century Gothic", Font.BOLD, 15));
		tabbedpane.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 0), new Color(222, 184, 135)));
		tabbedpane.setBounds(0, 10, 1071, 442);
		tabbedpanel.add(tabbedpane);
		
		JPanel tabbedFood = new JPanel();
		tabbedFood.setBackground(new Color(250, 240, 230));
		tabbedFood.setFont(new Font("Century Gothic", Font.BOLD, 15));
		tabbedFood.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		tabbedpane.addTab("FOOD ITEMS", null, tabbedFood, null);
		tabbedFood.setLayout(null);
		
		JLabel pricef1 = new JLabel("Rs.320/-");
		pricef1.setVisible(false);
		JLabel pricef4 = new JLabel("Rs.220/-");
		pricef4.setVisible(false);
		
		
		
		JLabel pricef5 = new JLabel("Rs.120/-");
		pricef5.setVisible(false);
		pricef5.setFont(new Font("Verdana", Font.BOLD, 12));
		pricef5.setHorizontalTextPosition(SwingConstants.CENTER);
		pricef5.setHorizontalAlignment(SwingConstants.CENTER);
		pricef5.setOpaque(true);
		pricef5.setBounds(620, 129, 130, 18);
		tabbedFood.add(pricef5);
		pricef4.setHorizontalTextPosition(SwingConstants.CENTER);
		pricef4.setHorizontalAlignment(SwingConstants.CENTER);
		pricef4.setFont(new Font("Verdana", Font.BOLD, 12));
		pricef4.setOpaque(true);
		pricef4.setBounds(461, 129, 130, 18);
		tabbedFood.add(pricef4);
		pricef1.setOpaque(true);
		pricef1.setBackground(SystemColor.inactiveCaptionBorder);
		pricef1.setForeground(Color.BLACK);
		pricef1.setHorizontalAlignment(SwingConstants.CENTER);
		pricef1.setFont(new Font("Verdana", Font.BOLD, 12));
		pricef1.setBounds(10, 129, 130, 21);
		tabbedFood.add(pricef1);
		
		JCheckBox chckbxf2 = new JCheckBox("");
		chckbxf2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxf2.isSelected()) {
					 f2qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
				}
			}
		});
		chckbxf2.setOpaque(false);
		chckbxf2.setBounds(158, 10, 21, 21);
		tabbedFood.add(chckbxf2);
		
		JCheckBox chckbxf3 = new JCheckBox("");
		chckbxf3.setOpaque(false);
		chckbxf3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxf3.isSelected()) {
					 f3qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
				}
			}
		});
		chckbxf3.setBounds(306, 13, 21, 18);
		tabbedFood.add(chckbxf3);
		
		JCheckBox chckbxf4 = new JCheckBox("");
		chckbxf4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxf4.isSelected()) {
					f4qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
				}
			}
		});
		chckbxf4.setOpaque(false);
		chckbxf4.setBounds(461, 10, 21, 21);
		tabbedFood.add(chckbxf4);
		
		JCheckBox chckbxf5 = new JCheckBox("");
		chckbxf5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxf5.isSelected()) {
					f5qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
				}
			}
		});
		chckbxf5.setOpaque(false);
		chckbxf5.setBounds(620, 10, 21, 21);
		tabbedFood.add(chckbxf5);
		
		JCheckBox chckbxf7 = new JCheckBox("");
		chckbxf7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxf7.isSelected()) {
					f7qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
				}
			}
		});
		chckbxf7.setOpaque(false);
		chckbxf7.setBounds(928, 10, 21, 21);
		tabbedFood.add(chckbxf7);
		
		JCheckBox chckbxf6 = new JCheckBox("");
		chckbxf6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxf6.isSelected()) {
					f6qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
				}
			}
		});
		chckbxf6.setOpaque(false);
		chckbxf6.setBounds(777, 10, 21, 21);
		tabbedFood.add(chckbxf6);
		
		JCheckBox chckbxd1 = new JCheckBox("");
		chckbxd1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxd1.isSelected()) {
					d1qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					
				}
			}
		});
		chckbxd1.setOpaque(false);
		chckbxd1.setBounds(10, 218, 21, 21);
		tabbedFood.add(chckbxd1);
		
		JCheckBox chckbxd2 = new JCheckBox("");
		chckbxd2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxd2.isSelected()) {
					d2qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
				}
			}
		});
		chckbxd2.setOpaque(false);
		chckbxd2.setBounds(158, 218, 21, 21);
		tabbedFood.add(chckbxd2);
		
		JCheckBox chckbxd4 = new JCheckBox("");
		chckbxd4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxd4.isSelected()) {
					d4qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
				}
			}
		});
		chckbxd4.setOpaque(false);
		chckbxd4.setBounds(461, 218, 21, 21);
		tabbedFood.add(chckbxd4);
		
		JCheckBox chckbxd3 = new JCheckBox("");
		chckbxd3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxd3.isSelected()) {
					d3qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
				}
			}
		});
		chckbxd3.setOpaque(false);
		chckbxd3.setBounds(306, 218, 21, 21);
		tabbedFood.add(chckbxd3);
		
		JCheckBox chckbxd6 = new JCheckBox("");
		chckbxd6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxd6.isSelected()) {
					d6qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
				}
			}
		});
		chckbxd6.setOpaque(false);
		chckbxd6.setBounds(777, 218, 21, 21);
		tabbedFood.add(chckbxd6);
		
		JCheckBox chckbxd5 = new JCheckBox("");
		chckbxd5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxd5.isSelected()) {
					d5qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
				}
			}
		});
		chckbxd5.setOpaque(false);
		chckbxd5.setBounds(620, 218, 21, 21);
		tabbedFood.add(chckbxd5);
		
		
		
		
		JCheckBox chckbxf1 = new JCheckBox("");
		chckbxf1.setForeground(new Color(0, 0, 0));
		chckbxf1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxf1.isSelected()) {
					f1qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxf1.setOpaque(false);
		chckbxf1.setBounds(10, 10, 21, 21);
		tabbedFood.add(chckbxf1);
		
		JCheckBox chckbxd7 = new JCheckBox("");
		chckbxd7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxd7.isSelected()) {
					d7qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
			  }
			}
		});
		chckbxd7.setOpaque(false);
		chckbxd7.setBounds(928, 218, 21, 21);
		tabbedFood.add(chckbxd7);
		
		JLabel f1 = new JLabel("");
		f1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricef1.setVisible(false);	
			}
		});
		f1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricef1.setVisible(true);
				
				}
		});
		f1.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\margherita.jpg"));
		f1.setBorder(new LineBorder(new Color(0, 0, 0)));
		f1.setBounds(10, 10, 130, 153);
		tabbedFood.add(f1);
		
		JLabel drinks = new JLabel("DRINKS");
		drinks.setHorizontalTextPosition(SwingConstants.CENTER);
		drinks.setHorizontalAlignment(SwingConstants.CENTER);
		drinks.setBackground(SystemColor.inactiveCaption);
		drinks.setOpaque(true);
		drinks.setFont(new Font("Century Gothic", Font.BOLD, 15));
		drinks.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.inactiveCaption, null, null, null));
		drinks.setBounds(10, 183, 81, 25);
		tabbedFood.add(drinks);
		
		JLabel pricef2 = new JLabel("Rs.440/-");
		pricef2.setVisible(false);
		pricef2.setOpaque(true);
		pricef2.setHorizontalTextPosition(SwingConstants.CENTER);
		pricef2.setHorizontalAlignment(SwingConstants.CENTER);
		pricef2.setFont(new Font("Verdana", Font.BOLD, 12));
		pricef2.setForeground(new Color(0, 0, 0));
		pricef2.setBounds(158, 129, 130, 19);
		tabbedFood.add(pricef2);
		
		JLabel f2 = new JLabel("");
		f2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricef2.setVisible(false);	
			}
		});
		f2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricef2.setVisible(true);
				}
		});
		
		f2.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\9-92696_classic-pizza-garden-fresh-pizza-hd_130x153m.png"));
		f2.setBorder(new LineBorder(new Color(0, 0, 0)));
		f2.setBounds(158, 10, 130, 153);
		tabbedFood.add(f2);
		
		JLabel pricef3 = new JLabel("Rs.180/-");
		pricef3.setOpaque(true);
		pricef3.setHorizontalTextPosition(SwingConstants.CENTER);
		pricef3.setHorizontalAlignment(SwingConstants.CENTER);
		pricef3.setFont(new Font("Verdana", Font.BOLD, 12));
		pricef3.setVisible(false);
		pricef3.setBounds(306, 129, 130, 21);
		tabbedFood.add(pricef3);
		
		JLabel f3 = new JLabel("");
		f3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricef3.setVisible(false);	
			}
		});
		f3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricef3.setVisible(true);
				
				}
		});
		f3.setIcon(new ImageIcon("C:\\Users\\pranit\\Downloads\\WhatsApp Image 2021-11-17 at 10.44.26 AM.jpeg"));
		f3.setBorder(new LineBorder(new Color(0, 0, 0)));
		f3.setBounds(306, 10, 130, 153);
		tabbedFood.add(f3);
		
		JLabel pricef6 = new JLabel("Rs.85/-");
		pricef6.setVisible(false);
		pricef6.setFont(new Font("Verdana", Font.BOLD, 12));
		pricef6.setHorizontalAlignment(SwingConstants.CENTER);
		pricef6.setHorizontalTextPosition(SwingConstants.CENTER);
		pricef6.setOpaque(true);
		pricef6.setBounds(777, 129, 130, 18);
		tabbedFood.add(pricef6);
		
		JLabel pricef7 = new JLabel("Rs.85/-");
		pricef7.setVisible(false);
		pricef7.setHorizontalTextPosition(SwingConstants.CENTER);
		pricef7.setHorizontalAlignment(SwingConstants.CENTER);
		pricef7.setFont(new Font("Verdana", Font.BOLD, 12));
		pricef7.setOpaque(true);
		pricef7.setBounds(928, 129, 130, 18);
		tabbedFood.add(pricef7);
		
		JLabel f6 = new JLabel("");
		f6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricef6.setVisible(false);	
			}
		});
		f6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricef6.setVisible(true);
			}
		});
		f6.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\apsaraicecream (1).jpg"));
		f6.setBorder(new LineBorder(new Color(0, 0, 0)));
		f6.setBounds(777, 10, 130, 153);
		tabbedFood.add(f6);
		
		JLabel f7 = new JLabel("");
		f7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricef7.setVisible(false);	
			}
		});
		f7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricef7.setVisible(true);
				}
		});
		f7.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\icecream (1).jpg"));
		f7.setBorder(new LineBorder(new Color(0, 0, 0)));
		f7.setBounds(928, 10, 130, 153);
		tabbedFood.add(f7);
		
		JLabel priced1 = new JLabel("Rs.65/-");
		priced1.setOpaque(true);
		priced1.setVisible(false);
		priced1.setHorizontalTextPosition(SwingConstants.CENTER);
		priced1.setHorizontalAlignment(SwingConstants.CENTER);
		priced1.setFont(new Font("Verdana", Font.BOLD, 12));
		priced1.setBackground(SystemColor.inactiveCaptionBorder);
		priced1.setPreferredSize(new Dimension(36, 13));
		priced1.setMinimumSize(new Dimension(36, 13));
		priced1.setMaximumSize(new Dimension(36, 13));
		priced1.setBounds(10, 328, 130, 21);
		tabbedFood.add(priced1);
		
		JLabel d1 = new JLabel("");
		d1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				priced1.setVisible(false);	
			}
		});
		d1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				priced1.setVisible(true);
				
				}
		});
		d1.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\dryfruiticecream (1).jpg"));
		d1.setBorder(new LineBorder(new Color(0, 0, 0)));
		d1.setBounds(10, 218, 130, 153);
		tabbedFood.add(d1);
		
		JLabel priced2 = new JLabel("Rs.75/-");
		priced2.setFont(new Font("Verdana", Font.BOLD, 12));
		priced2.setHorizontalTextPosition(SwingConstants.CENTER);
		priced2.setHorizontalAlignment(SwingConstants.CENTER);
		priced2.setOpaque(true);
		priced2.setVisible(false);
		priced2.setBackground(SystemColor.inactiveCaptionBorder);
		priced2.setBounds(158, 328, 130, 21);
		tabbedFood.add(priced2);
		
		JLabel d2 = new JLabel("");
		d2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				priced2.setVisible(false);	
			}
		});
		d2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				priced2.setVisible(true);
				}
		});
		d2.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\guavajuice (1).jpg"));
		d2.setBorder(new LineBorder(new Color(0, 0, 0)));
		d2.setBounds(158, 218, 130, 153);
		tabbedFood.add(d2);
		
		JLabel priced3 = new JLabel("Rs.45/-");
		priced3.setHorizontalTextPosition(SwingConstants.CENTER);
		priced3.setHorizontalAlignment(SwingConstants.CENTER);
		priced3.setOpaque(true);
		priced3.setFont(new Font("Verdana", Font.BOLD, 12));
		priced3.setVisible(false);
		priced3.setBounds(306, 328, 130, 21);
		tabbedFood.add(priced3);
		
		JLabel priced4 = new JLabel("Rs.45/-");
		priced4.setOpaque(true);
		priced4.setFont(new Font("Verdana", Font.BOLD, 12));
		priced4.setVisible(false);
		priced4.setHorizontalTextPosition(SwingConstants.CENTER);
		priced4.setHorizontalAlignment(SwingConstants.CENTER);
		priced4.setBounds(461, 328, 130, 18);
		tabbedFood.add(priced4);
		
		JLabel priced5 = new JLabel("Rs.35/-");
		priced5.setVisible(false);
		priced5.setFont(new Font("Verdana", Font.BOLD, 12));
		priced5.setHorizontalAlignment(SwingConstants.CENTER);
		priced5.setOpaque(true);
		priced5.setBounds(620, 328, 130, 18);
		tabbedFood.add(priced5);
		
		JLabel priced6 = new JLabel("Rs.25/-");
		priced6.setOpaque(true);
		priced6.setHorizontalTextPosition(SwingConstants.CENTER);
		priced6.setHorizontalAlignment(SwingConstants.CENTER);
		priced6.setVisible(false);
		priced6.setFont(new Font("Verdana", Font.BOLD, 12));
		priced6.setBounds(777, 328, 130, 18);
		tabbedFood.add(priced6);
		
		JLabel priced7 = new JLabel("Rs.25/-");
		priced7.setVisible(false);
		priced7.setHorizontalTextPosition(SwingConstants.CENTER);
		priced7.setHorizontalAlignment(SwingConstants.CENTER);
		priced7.setFont(new Font("Verdana", Font.BOLD, 12));
		priced7.setOpaque(true);
		priced7.setBounds(928, 328, 130, 18);
		tabbedFood.add(priced7);
		
		JLabel d3 = new JLabel("");
		d3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				priced3.setVisible(false);	
			}
		});
		d3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				priced3.setVisible(true);
				}
		});
		d3.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\image (1).jpg"));
		d3.setBorder(new LineBorder(new Color(0, 0, 0)));
		d3.setBounds(306, 218, 130, 153);
		tabbedFood.add(d3);
		
		JLabel d4 = new JLabel("");
		d4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				priced4.setVisible(false);	
			}
		});
		d4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				priced4.setVisible(true);
				
				}
		});
		d4.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\watermelonjuice (1).jpg"));
		d4.setBorder(new LineBorder(new Color(0, 0, 0)));
		d4.setBounds(461, 218, 130, 153);
		tabbedFood.add(d4);
		
		JLabel d5 = new JLabel("");
		d5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				priced5.setVisible(false);	
			}
		});
		d5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				priced5.setVisible(true);
				}
		});
		d5.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\500ml-coca-cola-cold-drinks-500x500 (1).jpg"));
		d5.setBorder(new LineBorder(new Color(0, 0, 0)));
		d5.setBounds(620, 218, 130, 153);
		tabbedFood.add(d5);
		
		JLabel d6 = new JLabel("");
		d6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				priced6.setVisible(false);	
			}
		});
		d6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				priced6.setVisible(true);
				
				}
		});
		d6.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\thums-up-330ml-rs-30--1582540576 (1).jpg"));
		d6.setBorder(new LineBorder(new Color(0, 0, 0)));
		d6.setBounds(777, 218, 130, 153);
		tabbedFood.add(d6);
		
		JLabel d7 = new JLabel("");
		d7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				priced7.setVisible(false);	
			}
		});
		d7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				priced7.setVisible(true);
				}
		});
		d7.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\ph0cc074-1-921387_l (1).jpg"));
		d7.setBorder(new LineBorder(new Color(0, 0, 0)));
		d7.setBounds(928, 218, 130, 153);
		tabbedFood.add(d7);
		
		JLabel f4 = new JLabel("");
		f4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricef4.setVisible(false);	
			}
		});
		f4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricef4.setVisible(true);
				}
		});
		f4.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\mozzarella-pizza-margherita-FT-RECIPE0621_130x153m.jpg"));
		f4.setBorder(new LineBorder(new Color(0, 0, 0)));
		f4.setBounds(461, 10, 130, 153);
		tabbedFood.add(f4);
		
		JLabel f5 = new JLabel("");
		f5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricef1.setVisible(false);	
			}
		});
		f5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricef1.setVisible(true);
			}
		});
		f5.setIcon(new ImageIcon("C:\\Users\\pranit\\Downloads\\WhatsApp Image 2021-11-17 at 10.43.19 AM.jpeg"));
		f5.setBorder(new LineBorder(new Color(0, 0, 0)));
		f5.setBounds(620, 10, 130, 153);
		tabbedFood.add(f5);
		
		JPanel tabbedFood1 = new JPanel();
		tabbedFood1.setBackground(new Color(250, 240, 230));
		tabbedpane.addTab("Veg/Non Veg", null, tabbedFood1, null);
		tabbedFood1.setLayout(null);
		
		JLabel pricev1 = new JLabel("Rs.99/-");
		pricev1.setVisible(false);
		
		JCheckBox chckbxnv7 = new JCheckBox("");
		chckbxnv7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxnv7.isSelected()) {
					nv7qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxnv7.setOpaque(false);
		chckbxnv7.setBounds(922, 230, 21, 25);
		tabbedFood1.add(chckbxnv7);
		
		JCheckBox chckbxnv6 = new JCheckBox("");
		chckbxnv6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxnv6.isSelected()) {
					nv6qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxnv6.setOpaque(false);
		chckbxnv6.setBounds(770, 230, 21, 25);
		tabbedFood1.add(chckbxnv6);
		
		JCheckBox chckbxnv5 = new JCheckBox("");
		chckbxnv5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxnv5.isSelected()) {
					nv5qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxnv5.setOpaque(false);
		chckbxnv5.setBounds(619, 230, 21, 25);
		tabbedFood1.add(chckbxnv5);
		
		JCheckBox chckbxnv4 = new JCheckBox("");
		chckbxnv4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxnv4.isSelected()) {
					nv4qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxnv4.setOpaque(false);
		chckbxnv4.setBounds(468, 230, 21, 25);
		tabbedFood1.add(chckbxnv4);
		
		JCheckBox chckbxnv3 = new JCheckBox("");
		chckbxnv3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxnv3.isSelected()) {
					nv3qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxnv3.setOpaque(false);
		chckbxnv3.setBounds(315, 230, 21, 25);
		tabbedFood1.add(chckbxnv3);
		
		JCheckBox chckbxnv2 = new JCheckBox("");
		chckbxnv2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxnv2.isSelected()) {
					nv2qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxnv2.setOpaque(false);
		chckbxnv2.setBounds(160, 230, 21, 25);
		tabbedFood1.add(chckbxnv2);
		
		JCheckBox chckbxnv1 = new JCheckBox("");
		chckbxnv1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxnv1.isSelected()) {
					nv1qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxnv1.setOpaque(false);
		chckbxnv1.setBounds(10, 230, 21, 25);
		tabbedFood1.add(chckbxnv1);
		
		JCheckBox chckbxv7 = new JCheckBox("");
		chckbxv7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxv7.isSelected()) {
					v7qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxv7.setOpaque(false);
		chckbxv7.setBounds(923, 31, 21, 25);
		tabbedFood1.add(chckbxv7);
		
		JCheckBox chckbxv6 = new JCheckBox("");
		chckbxv6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxv6.isSelected()) {
					v6qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxv6.setOpaque(false);
		chckbxv6.setBounds(770, 31, 21, 25);
		tabbedFood1.add(chckbxv6);
		
		JCheckBox chckbxv5 = new JCheckBox("");
		chckbxv5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxv5.isSelected()) {
					v5qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxv5.setOpaque(false);
		chckbxv5.setBounds(619, 31, 21, 25);
		tabbedFood1.add(chckbxv5);
		
		JCheckBox chckbxv4 = new JCheckBox("");
		chckbxv4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxv4.isSelected()) {
					v4qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxv4.setOpaque(false);
		chckbxv4.setBounds(470, 31, 21, 25);
		tabbedFood1.add(chckbxv4);
		
		JCheckBox chckbxv3 = new JCheckBox("");
		chckbxv3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxv3.isSelected()) {
					v3qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxv3.setOpaque(false);
		chckbxv3.setBounds(315, 31, 21, 25);
		tabbedFood1.add(chckbxv3);
		
		JCheckBox chckbxv2 = new JCheckBox("");
		chckbxv2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxv2.isSelected()) {
					v2qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxv2.setOpaque(false);
		chckbxv2.setBounds(160, 31, 21, 25);
		tabbedFood1.add(chckbxv2);
		
		JCheckBox chckbxv1 = new JCheckBox("");
		chckbxv1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxv1.isSelected()) {
					v1qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
					 					
				}
			}
		});
		chckbxv1.setOpaque(false);
		chckbxv1.setBounds(10, 31, 21, 25);
		tabbedFood1.add(chckbxv1);
		pricev1.setHorizontalAlignment(SwingConstants.CENTER);
		pricev1.setFont(new Font("Verdana", Font.BOLD, 12));
		pricev1.setOpaque(true);
		pricev1.setBounds(10, 146, 130, 25);
		tabbedFood1.add(pricev1);
		
		JLabel lblNonveg = new JLabel("NON-VEG");
		lblNonveg.setOpaque(true);
		lblNonveg.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNonveg.setHorizontalAlignment(SwingConstants.CENTER);
		lblNonveg.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNonveg.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.inactiveCaption, null, null, null));
		lblNonveg.setBackground(SystemColor.inactiveCaption);
		lblNonveg.setBounds(0, 195, 89, 25);
		tabbedFood1.add(lblNonveg);
		
		JLabel lblveg = new JLabel("VEG");
		lblveg.setOpaque(true);
		lblveg.setHorizontalTextPosition(SwingConstants.CENTER);
		lblveg.setHorizontalAlignment(SwingConstants.CENTER);
		lblveg.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblveg.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.inactiveCaption, null, null, null));
		lblveg.setBackground(SystemColor.inactiveCaption);
		lblveg.setBounds(0, 0, 73, 21);
		tabbedFood1.add(lblveg);
		
		JLabel v1 = new JLabel("");
		v1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricev1.setVisible(false);	
			}
		});
		v1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricev1.setVisible(true);
				}
		});
		v1.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\dosa.jpg"));
		v1.setBorder(new LineBorder(new Color(0, 0, 0)));
		v1.setBounds(10, 31, 130, 153);
		tabbedFood1.add(v1);
		
		JLabel pricev2 = new JLabel("Rs.59/-");
		pricev2.setVisible(false);
		pricev2.setOpaque(true);
		pricev2.setHorizontalAlignment(SwingConstants.CENTER);
		pricev2.setFont(new Font("Verdana", Font.BOLD, 12));
		pricev2.setBounds(160, 146, 130, 25);
		tabbedFood1.add(pricev2);
		
		JLabel v2 = new JLabel("");
		v2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricev2.setVisible(false);	
			}
		});
		v2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricev2.setVisible(true);
				}
		});
		v2.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\Veg-Stufffed-Idlis.jpg"));
		v2.setBorder(new LineBorder(new Color(0, 0, 0)));
		v2.setBounds(160, 31, 130, 153);
		tabbedFood1.add(v2);
		
		
		JLabel pricev3 = new JLabel("Rs.49/-");
		pricev3.setVisible(false);
		pricev3.setOpaque(true);
		pricev3.setHorizontalAlignment(SwingConstants.CENTER);
		pricev3.setFont(new Font("Verdana", Font.BOLD, 12));
		pricev3.setBounds(315, 146, 130, 25);
		tabbedFood1.add(pricev3);
		
		JLabel pricev4 = new JLabel("Rs.59/-");
		pricev4.setVisible(false);
		pricev4.setOpaque(true);
		pricev4.setHorizontalAlignment(SwingConstants.CENTER);
		pricev4.setFont(new Font("Verdana", Font.BOLD, 12));
		pricev4.setBounds(468, 146, 130, 25);
		tabbedFood1.add(pricev4);
		
		JLabel pricev5 = new JLabel("Rs.199/-");
		
		pricev5.setVisible(false);
		pricev5.setOpaque(true);
		pricev5.setHorizontalAlignment(SwingConstants.CENTER);
		pricev5.setFont(new Font("Verdana", Font.BOLD, 12));
		pricev5.setBounds(619, 146, 130, 25);
		tabbedFood1.add(pricev5);
		
		JLabel pricev6 = new JLabel("Rs.79/-");
		
		pricev6.setVisible(false);
		pricev6.setOpaque(true);
		pricev6.setHorizontalAlignment(SwingConstants.CENTER);
		pricev6.setFont(new Font("Verdana", Font.BOLD, 12));
		pricev6.setBounds(770, 146, 130, 25);
		tabbedFood1.add(pricev6);
		
		JLabel pricev7 = new JLabel("Rs.89/-");
		pricev7.setVisible(false);
		pricev7.setOpaque(true);
		pricev7.setHorizontalAlignment(SwingConstants.CENTER);
		pricev7.setFont(new Font("Verdana", Font.BOLD, 12));
		pricev7.setBounds(922, 146, 130, 25);
		tabbedFood1.add(pricev7);
		
		JLabel pricenv1 = new JLabel("Rs.159/-");
		pricenv1.setVisible(false);
		pricenv1.setInheritsPopupMenu(false);
		pricenv1.setOpaque(true);
		pricenv1.setHorizontalAlignment(SwingConstants.CENTER);
		pricenv1.setFont(new Font("Verdana", Font.BOLD, 12));
		pricenv1.setBounds(10, 343, 130, 25);
		tabbedFood1.add(pricenv1);
		
		JLabel pricenv2 = new JLabel("Rs.129/-");
		pricenv2.setVisible(false);
		pricenv2.setOpaque(true);
		pricenv2.setHorizontalAlignment(SwingConstants.CENTER);
		pricenv2.setFont(new Font("Verdana", Font.BOLD, 12));
		pricenv2.setBounds(160, 343, 130, 25);
		tabbedFood1.add(pricenv2);
		
		JLabel pricenv3 = new JLabel("Rs.159/-");
		pricenv3.setVisible(false);
		pricenv3.setOpaque(true);
		pricenv3.setHorizontalAlignment(SwingConstants.CENTER);
		pricenv3.setFont(new Font("Verdana", Font.BOLD, 12));
		pricenv3.setBounds(315, 343, 130, 25);
		tabbedFood1.add(pricenv3);
		
		JLabel pricenv4 = new JLabel("Rs.179/-");
		pricenv4.setVisible(false);
		pricenv4.setOpaque(true);
		pricenv4.setHorizontalAlignment(SwingConstants.CENTER);
		pricenv4.setFont(new Font("Verdana", Font.BOLD, 12));
		pricenv4.setBounds(468, 343, 130, 25);
		tabbedFood1.add(pricenv4);
		
		JLabel pricenv5 = new JLabel("Rs.99/-");
		pricenv5.setVisible(false);
		pricenv5.setOpaque(true);
		pricenv5.setHorizontalAlignment(SwingConstants.CENTER);
		pricenv5.setFont(new Font("Verdana", Font.BOLD, 12));
		pricenv5.setBounds(619, 343, 130, 25);
		tabbedFood1.add(pricenv5);
		
		JLabel pricenv6 = new JLabel("Rs.119/-");
		pricenv6.setVisible(false);
		pricenv6.setOpaque(true);
		pricenv6.setHorizontalAlignment(SwingConstants.CENTER);
		pricenv6.setFont(new Font("Verdana", Font.BOLD, 12));
		pricenv6.setBounds(770, 343, 130, 25);
		tabbedFood1.add(pricenv6);
		
		JLabel pricenv7 = new JLabel("Rs.159/-");
		
		pricenv7.setVisible(false);
		pricenv7.setOpaque(true);
		pricenv7.setHorizontalAlignment(SwingConstants.CENTER);
		pricenv7.setFont(new Font("Verdana", Font.BOLD, 12));
		pricenv7.setBounds(922, 343, 130, 25);
		tabbedFood1.add(pricenv7);
		
		JLabel v3 = new JLabel("");
		v3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricev3.setVisible(false);	
			}
		});
		v3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricev3.setVisible(true);
				}
		});
		v3.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\mendu vada.jpg"));
		v3.setBorder(new LineBorder(new Color(0, 0, 0)));
		v3.setBounds(315, 31, 130, 153);
		tabbedFood1.add(v3);
		
		JLabel v4 = new JLabel("");
		v4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricev4.setVisible(false);	
			}
		});
		v4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricev4.setVisible(true);
				}
		});
		v4.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\dhokla.jpg"));
		v4.setBorder(new LineBorder(new Color(0, 0, 0)));
		v4.setBounds(468, 31, 130, 153);
		tabbedFood1.add(v4);
		
		JLabel v5 = new JLabel("");
		v5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricev5.setVisible(false);	
			}
		});
		v5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricev5.setVisible(true);
				}
		});
		v5.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\veg 3.jpg"));
		v5.setBorder(new LineBorder(new Color(0, 0, 0)));
		v5.setBounds(619, 31, 130, 153);
		tabbedFood1.add(v5);
		
		JLabel v6 = new JLabel("");
		v6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricev6.setVisible(false);	
			}
		});
		v6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricev6.setVisible(true);
				}
		});
		v6.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\pulao.jpg"));
		v6.setBorder(new LineBorder(new Color(0, 0, 0)));
		v6.setBounds(770, 31, 130, 153);
		tabbedFood1.add(v6);
		
		JLabel v7 = new JLabel("");
		v7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricev7.setVisible(false);	
			}
		});
		v7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricev7.setVisible(true);
				}
		});
		v7.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\paneer tikka.jpg"));
		v7.setBorder(new LineBorder(new Color(0, 0, 0)));
		v7.setBounds(922, 31, 130, 153);
		tabbedFood1.add(v7);
		
		JLabel nv1 = new JLabel("");
		nv1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricenv1.setVisible(false);	
			}
		});
		nv1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricenv1.setVisible(true);
				}
		});
		nv1.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\chicken (1) (1).jpg"));
		nv1.setBorder(new LineBorder(new Color(0, 0, 0)));
		nv1.setBounds(10, 230, 130, 153);
		tabbedFood1.add(nv1);
		
		JLabel nv2 = new JLabel("");
		nv2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricenv2.setVisible(false);	
			}
		});
		nv2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricenv2.setVisible(true);
				}
		});
		nv2.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\grilled chicken (1).jpg"));
		nv2.setBorder(new LineBorder(new Color(0, 0, 0)));
		nv2.setBounds(160, 230, 130, 153);
		tabbedFood1.add(nv2);
		
		JLabel nv3 = new JLabel("");
		nv3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricenv3.setVisible(false);	
			}
		});
		nv3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricenv3.setVisible(true);
				}
		});
		nv3.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\chicken biryani (1).jpg"));
		nv3.setBorder(new LineBorder(new Color(0, 0, 0)));
		nv3.setBounds(315, 230, 130, 153);
		tabbedFood1.add(nv3);
		
		JLabel nv4 = new JLabel("");
		nv4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricenv4.setVisible(false);	
			}
		});
		nv4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricenv4.setVisible(true);
				}
		});
		nv4.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\chicken (2).jpg"));
		nv4.setBorder(new LineBorder(new Color(0, 0, 0)));
		nv4.setBounds(468, 230, 130, 153);
		tabbedFood1.add(nv4);
		
		JLabel nv5 = new JLabel("");
		nv5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricenv5.setVisible(false);	
			}
		});
		nv5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricenv5.setVisible(true);
				}
		});
		nv5.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\egg biryani (1).jpg"));
		nv5.setBorder(new LineBorder(new Color(0, 0, 0)));
		nv5.setBounds(619, 230, 130, 153);
		tabbedFood1.add(nv5);
		
		JLabel nv6 = new JLabel("");
		nv6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricenv6.setVisible(false);	
			}
		});
		nv6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricenv6.setVisible(true);
				}
		});
		nv6.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\fish (1).jpg"));
		nv6.setBorder(new LineBorder(new Color(0, 0, 0)));
		nv6.setBounds(770, 230, 130, 153);
		tabbedFood1.add(nv6);
		
		JLabel nv7 = new JLabel("");
		nv7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pricenv7.setVisible(false);	
			}
		});
		nv7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pricenv7.setVisible(true);
				}
		});
		nv7.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\images\\egg (1).jpg"));
		nv7.setBorder(new LineBorder(new Color(0, 0, 0)));
		nv7.setBounds(922, 230, 130, 153);
		tabbedFood1.add(nv7);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1101, 182);
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(255, 165, 0), new Color(255, 127, 80), new Color(0, 0, 0)));
		panel.setBackground(new Color(244, 164, 96));
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("<<< BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton.setHorizontalTextPosition(SwingConstants.LEFT);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(255, 228, 181));
		btnNewButton.setBounds(10, 10, 96, 34);
		panel.add(btnNewButton);
		
		JLabel lblX = new JLabel("X");
		lblX.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblX.setBounds(1059, 0, 42, 44);
		panel.add(lblX);
		lblX.setBackground(new Color(244, 164, 96));
		lblX.setOpaque(true);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					contentpage1.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.white);
			}
		});
		lblX.setForeground(Color.RED);
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\FoodStop-removebg-preview (1).png"));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setBorder(null);
		lblNewLabel.setBounds(260, 0, 564, 350);
		panel.add(lblNewLabel);
		
		JButton btnProceed = new JButton("PROCEED>>");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProceed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				checkout ck =new checkout();
				ck.setVisible(true);
				contentpage1.this.dispose();
				if(chckbxf1.isSelected()) {
					ck.loaddata("Mergherita",320,f1qty);
					}
				if(chckbxf2.isSelected()) {
					ck.loaddata("Cheese Pizza", 440 , f2qty);
					}
				if(chckbxf3.isSelected()) {
					ck.loaddata("Burger(non-veg)", 180 , f3qty);
					}
				if(chckbxf4.isSelected()) {
					ck.loaddata("Mozarella Pizza", 220 , f4qty);
					}
				if(chckbxf5.isSelected()) {
					ck.loaddata("Burger(veg)", 180 , f5qty);
					}
				if(chckbxf6.isSelected()) {
					ck.loaddata("Icecream cup(Elaichi Flavour)", 85 , f6qty);
					}
				if(chckbxf7.isSelected()) {
					ck.loaddata("Icecream cup(Vanilla Chocochip)", 85 , f7qty);
					}
				if(chckbxd1.isSelected()) {
					ck.loaddata("Mix Dryfruit Milshake", 65 , d1qty);
					}
				if(chckbxd2.isSelected()) {
					ck.loaddata("Guava Icecrem Shake", 75 , d2qty);
					}
				if(chckbxd3.isSelected()) {
					ck.loaddata("Orange Juice", 440 , d3qty);
					}
				if(chckbxd4.isSelected()) {
					ck.loaddata("Watermelon Juice", 45 , d4qty);
					}
				if(chckbxd5.isSelected()) {
					ck.loaddata("Cocacola(150 ml)", 35 , d5qty);
					}
				if(chckbxd6.isSelected()) {
					ck.loaddata("Thumsup(150 ml)", 25 , d6qty);
					}
				if(chckbxd7.isSelected()) {
					ck.loaddata("Pepsi(150ml)", 25 , d7qty);
					}
				if(chckbxv1.isSelected()) {
					ck.loaddata("Masala Dosa", 99  , v1qty);
					}
				if(chckbxv2.isSelected()) {
					ck.loaddata("Stuffed Idlis", 59  , v2qty);
					}
				if(chckbxv3.isSelected()) {
					ck.loaddata("Mendu Vada", 49  , v3qty);
					}
				if(chckbxv4.isSelected()) {
					ck.loaddata("Dhokla", 59  , v4qty);
					}
				if(chckbxv5.isSelected()) {
					ck.loaddata("Indian Thali", 199  , v5qty);
					}
				if(chckbxv6.isSelected()) {
					ck.loaddata("Pulao",  79 , v6qty);
					}
				if(chckbxv7.isSelected()) {
					ck.loaddata("Panner Tikka ", 89  , v7qty);
					}
				if(chckbxnv1.isSelected()) {
					ck.loaddata("Chicken lollipop", 159 , nv1qty);
					}
				if(chckbxnv2.isSelected()) {
					ck.loaddata("Grilled Chicken", 129  , nv2qty);
					}
				if(chckbxnv3.isSelected()) {
					ck.loaddata("Chicken Biryani", 159  , nv3qty);
					}
				if(chckbxnv4.isSelected()) {
					ck.loaddata("Chicken ", 179 , nv4qty);
					}
				if(chckbxnv5.isSelected()) {
					ck.loaddata("Masala Egg Rice", 99 , nv5qty);
					}
				if(chckbxnv6.isSelected()) {
					ck.loaddata("Fried Fice", 119  , nv6qty);
					}
				if(chckbxnv7.isSelected()) {
					ck.loaddata("Egg Curry", 159 , nv7qty);
					}
				
				
				}
					
			
		});
		btnProceed.setHorizontalTextPosition(SwingConstants.CENTER);
		btnProceed.setFont(new Font("Dialog", Font.BOLD, 14));
		btnProceed.setFocusTraversalKeysEnabled(false);
		btnProceed.setFocusPainted(false);
		btnProceed.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnProceed.setBackground(new Color(245, 222, 179));
		btnProceed.setBounds(925, 640, 155, 30);
		contentPane.add(btnProceed);
		
		
	}
}
