import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.ComponentOrientation;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.Dimension;

public class checkout extends JFrame {
	Connection con= null;
	PreparedStatement pst = null;

	private JPanel contentPane;
	private JTextField txtemail;
	private JTextField txtcity;
	private JTextField txtpincode;
	private JTextField txtstate;
	private JTextField txtcontactnumber;
	private JTable table;
	private JLabel subtotalvalue;
	private JLabel totalvalue;
	private JLabel taxesvalue;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkout frame = new checkout();
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
	@SuppressWarnings("serial")
	public checkout() {
		setBackground(Color.ORANGE);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220, 100, 1101, 680);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(255, 127, 80), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(210, 105, 30)));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(255, 228, 181));
		panel_1.setBounds(554, 202, 537, 468);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblcustdet = new JLabel("CUSTOMER DETAILS");
		lblcustdet.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		lblcustdet.setForeground(SystemColor.menuText);
		lblcustdet.setFont(new Font("Artifakt Element Medium", Font.BOLD, 18));
		lblcustdet.setBounds(10, 10, 196, 23);
		panel_1.add(lblcustdet);
		
		txtemail = new JTextField();
		txtemail.setOpaque(false);
		txtemail.setBackground(SystemColor.menu);
		txtemail.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "EMAIL ID :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtemail.setToolTipText("Add Email Id");
		txtemail.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtemail.setBounds(10, 60, 462, 52);
		panel_1.add(txtemail);
		txtemail.setColumns(10);
		
		JTextArea txtaddress = new JTextArea();
		txtaddress.setOpaque(false);
		txtaddress.setBackground(SystemColor.menu);
		txtaddress.setCaretColor(new Color(0, 0, 0));
		txtaddress.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtaddress.setLineWrap(true);
		txtaddress.setRows(4);
		txtaddress.setToolTipText("Add Delivery Address");
		txtaddress.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		txtaddress.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "DELIVERY ADDRESS  ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtaddress.setBounds(10, 140, 462, 74);
		panel_1.add(txtaddress);
		
		txtcity = new JTextField();
		txtcity.setOpaque(false);
		txtcity.setBackground(SystemColor.menu);
		txtcity.setToolTipText("Add CITY");
		txtcity.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtcity.setColumns(10);
		txtcity.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "CITY", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtcity.setBounds(10, 244, 180, 39);
		panel_1.add(txtcity);
		
		txtpincode = new JTextField();
		txtpincode.setOpaque(false);
		txtpincode.setBackground(SystemColor.menu);
		txtpincode.setToolTipText("Add PINCODE");
		txtpincode.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtpincode.setColumns(10);
		txtpincode.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "PINCODE ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtpincode.setBounds(298, 244, 174, 39);
		panel_1.add(txtpincode);
		
		txtstate = new JTextField();
		txtstate.setOpaque(false);
		txtstate.setBackground(SystemColor.menu);
		txtstate.setToolTipText("Add STATE");
		txtstate.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtstate.setColumns(10);
		txtstate.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "STATE ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtstate.setBounds(10, 313, 228, 39);
		panel_1.add(txtstate);
		
		txtcontactnumber = new JTextField();
		txtcontactnumber.setOpaque(false);
		txtcontactnumber.setToolTipText("Add CONTACT NUMBER");
		txtcontactnumber.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtcontactnumber.setColumns(10);
		txtcontactnumber.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "CONTACT NUMBER  ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtcontactnumber.setBackground(SystemColor.menu);
		txtcontactnumber.setBounds(10, 388, 228, 39);
		panel_1.add(txtcontactnumber);
		
		JButton btnCheckout = new JButton(" PROCEED TO CHECKOUT  >>>");
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query ="INSERT INTO `user1`(`email`, `address`, `city`, `pincode`, `state`, `phone`) VALUES (?, ?, ?, ?, ?, ?)";
							con = DriverManager.getConnection("jdbc:mysql://localhost/userregistration", "root", "");
							pst=con.prepareStatement(query);
							pst.setString(1, txtemail.getText());
							pst.setString(2, txtaddress.getText());
							pst.setString(3, txtcity.getText());
							pst.setString(4, txtpincode.getText());
							pst.setString(5, txtstate.getText());
							pst.setString(6, txtcontactnumber.getText());
							pst.executeUpdate();
							JOptionPane.showMessageDialog(null, "Your Order is Successfull \n "+"Order will be delivered to you soon \n " +"Stay Safe...Happy Eating");
							
							
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
				checkout.this.dispose();
			}
		});
		btnCheckout.setBounds(280, 427, 247, 31);
		panel_1.add(btnCheckout);
		btnCheckout.setOpaque(false);
		btnCheckout.setHorizontalTextPosition(SwingConstants.LEADING);
		btnCheckout.setHorizontalAlignment(SwingConstants.LEADING);
		btnCheckout.setFont(new Font("Dialog", Font.BOLD, 15));
		btnCheckout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnCheckout.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCheckout.setBackground(new Color(250, 235, 215));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(Color.WHITE);
		panel_1_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(210, 105, 30)));
		panel_1_1.setBackground(new Color(255, 228, 181));
		panel_1_1.setBounds(10, 202, 534, 468);
		contentPane.add(panel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBackground(new Color(245, 222, 179));
		scrollPane.setFont(new Font("Century Gothic", Font.BOLD, 15));
		scrollPane.setBounds(10, 10, 514, 286);
		panel_1_1.add(scrollPane);
		
	    table = new JTable();
	    table.setRowSelectionAllowed(false);
	    table.setRowMargin(2);
	    table.setRowHeight(20);
	    table.setFillsViewportHeight(true);
	    table.setUpdateSelectionOnSort(false);
	    table.setSelectionForeground(new Color(0, 0, 0));
	    table.setIntercellSpacing(new Dimension(4, 4));
	    table.setEnabled(false);
	    table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
	    table.setBorder(new LineBorder(new Color(0, 0, 0)));
	    table.setSelectionBackground(new Color(255, 215, 0));
	    table.setGridColor(new Color(245, 222, 179));
	    table.setBackground(new Color(245, 222, 179));
		scrollPane.setViewportView(table);
		table.setName("");
		table.setFont(new Font("Century Gothic", Font.BOLD, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"Items", "Price ( in  Rs.)", "Quantity", "Total ( in  Rs.)"}
				));
	      TableColumnModel columnModel = table.getColumnModel();
	      columnModel.getColumn(0).setPreferredWidth(130);
	      columnModel.getColumn(1).setPreferredWidth(30);
	      columnModel.getColumn(2).setPreferredWidth(20);
	      columnModel.getColumn(3).setPreferredWidth(40);
	      
		
		JLabel lblNewLabel_3_1 = new JLabel("Total : ");
		lblNewLabel_3_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_3_1.setBounds(10, 385, 101, 31);
		panel_1_1.add(lblNewLabel_3_1);
		
		JSeparator separator = new JSeparator();
		separator.setOpaque(true);
		separator.setBackground(new Color(112, 128, 144));
		separator.setBounds(10, 378, 467, 2);
		panel_1_1.add(separator);
		
		JLabel lblNewLabel_3_2 = new JLabel(" taxes :");
		lblNewLabel_3_2.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_2.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblNewLabel_3_2.setBounds(10, 345, 91, 31);
		panel_1_1.add(lblNewLabel_3_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOpaque(true);
		separator_1.setBackground(new Color(112, 128, 144));
		separator_1.setBounds(10, 306, 467, 2);
		panel_1_1.add(separator_1);
		
		 subtotalvalue = new JLabel("");
		 subtotalvalue.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		 subtotalvalue.setForeground(new Color(0, 0, 0));
		 subtotalvalue.setHorizontalTextPosition(SwingConstants.LEFT);
		 subtotalvalue.setHorizontalAlignment(SwingConstants.LEFT);
		subtotalvalue.setBounds(121, 306, 130, 31);
		panel_1_1.add(subtotalvalue);
		
		JLabel lblNewLabel_3 = new JLabel(" subtotal : ");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(10, 306, 120, 31);
		panel_1_1.add(lblNewLabel_3);
		
		 totalvalue = new JLabel("");
		 totalvalue.setBackground(new Color(0, 0, 0));
		 totalvalue.setHorizontalTextPosition(SwingConstants.LEFT);
		 totalvalue.setHorizontalAlignment(SwingConstants.LEFT);
		 totalvalue.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		totalvalue.setBounds(121, 385, 225, 31);
		panel_1_1.add(totalvalue);
		
	    taxesvalue = new JLabel("");
		taxesvalue.setHorizontalTextPosition(SwingConstants.LEFT);
		taxesvalue.setHorizontalAlignment(SwingConstants.LEFT);
		taxesvalue.setForeground(Color.BLACK);
		taxesvalue.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		taxesvalue.setBounds(121, 349, 130, 31);
		panel_1_1.add(taxesvalue);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(255, 165, 0), new Color(255, 127, 80), new Color(0, 0, 0)));
		panel.setBackground(new Color(244, 164, 96));
		panel.setBounds(10, 10, 1081, 182);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(263, 0, 564, 344);
		lblNewLabel.setBorder(null);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\FoodStop-removebg-preview (1).png"));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("<<< BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentpage1 cp = new contentpage1();
			    cp.setVisible(true);
			    
			    
				checkout.this.dispose();
			}
		});
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFont(new Font("Stylus BT", Font.BOLD, 14));
		btnNewButton.setHorizontalTextPosition(SwingConstants.LEFT);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBackground(new Color(255, 228, 181));
		btnNewButton.setBounds(10, 10, 96, 34);
		panel.add(btnNewButton);
		
		JLabel lblX = new JLabel("X");
		lblX.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblX.setBounds(1049, 0, 32, 30);
		panel.add(lblX);
		lblX.setBackground(new Color(244, 164, 96));
		lblX.setOpaque(true);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					checkout.this.dispose();
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
	}
		
		
		
	

	 public void  loaddata(String name,int x,int y) {
		contentpage1 cp = new contentpage1();
		String Items=name;	
		int Price=x;
		int Quantity=y;
		int Total=Price*Quantity;
		
		String data1[]= {Items,Integer.toString(Price),Integer.toString(Quantity),Integer.toString(Total)};
		DefaultTableModel jtable=(DefaultTableModel)table.getModel();
		jtable.addRow(data1);
		
		int sum=0;
		for(int i=0;i<jtable.getRowCount();i++) {
			sum=sum+Integer.parseInt(jtable.getValueAt(i, 3).toString());
			}
		
		subtotalvalue.setText("Rs."+Integer.toString(sum)+"/--");
		
		int taxes=(int) (0.05*sum);
		taxesvalue.setText("Rs."+taxes+"/--");
		
	     int tvalue=sum+taxes;
		totalvalue.setText("Rs."+tvalue+"/--");
		
		
		
		
	 }
}

