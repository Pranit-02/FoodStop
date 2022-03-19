import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.FlowLayout;
import javax.swing.border.EtchedBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DropMode;

public class FrameSignup extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPasswordField txtConfirmPassword;
	private JLabel lblSignupMessage = new JLabel("");
	private JTextField txtmob;
	private JTextField txtfullname;
	private JComboBox comboBox;
	private JCheckBox chckbxNewCheckBox;
	

	/**
	 * Launch the application.
	 */
	public boolean verifyFields()
	{
		String fname = txtfullname.getText();
		String uname = txtUsername.getText();
		String phone = txtmob.getText();
		String pass1 = String.valueOf(txtPassword.getPassword());
		String pass2 = String.valueOf(txtConfirmPassword.getPassword());
		
		
		
		
		if(fname.trim().equals("") ||fname.trim().equals("Full Name") || uname.trim().equals("") ||uname.trim().equals("Username") || phone.trim().equals("") ||phone.trim().equals("Contact No.") || pass1.trim().equals("") ||pass1.trim().equals("Enter Password") || pass2.trim().equals("")||pass2.trim().equals("Confirm Password"))
		{
			JOptionPane.showMessageDialog(null, "One or More Fields Are Empty","Empty Fields",1);
		     return false;
		}
		
		else if(!pass1.equals(pass2))
		{
			JOptionPane.showMessageDialog(null, "Password Doesn't Match !!!","Confirm Password",2);
		    return false;
		}
		
		
		else if(!chckbxNewCheckBox.isSelected()){
			JOptionPane.showMessageDialog(null, "Please Agree To Terms And Conditions Before Proceeding");
			return false;
		}
		
		
		  
			else {
				return true;
			}
		}

	
	
	 
	 
        public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSignup frame = new FrameSignup();
					frame.setVisible(true);
				    } catch (Exception e) {
					e.printStackTrace();
				    }
			  }
		});
	  }

 public boolean checkUsername(String username) {
	  
	PreparedStatement st;
	ResultSet rs;
	boolean username_exist=false;
	
	String query = "SELECT * FROM `login1` WHERE `username`= ?";
	
	try {
		st = connect.getConnection().prepareStatement(query);
		st.setString(1, username);
		rs = st.executeQuery();
		
		if(rs.next())
		{
			username_exist = true;
			JOptionPane.showMessageDialog(null, "This Username Is Already Taken.Choose Another One.","Ussrname Failed", 2);
			
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 
	return username_exist;
	 
 }
        

		

	/**
	 * Create the frame.
	 */
	public FrameSignup() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(360, 150, 761, 495);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new LineBorder(Color.ORANGE, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 0, 0);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel pnlusername = new JPanel();
		pnlusername.setLayout(null);
		pnlusername.setBackground(Color.WHITE);
		pnlusername.setBounds(56, 138, 302, 40);
		contentPane.add(pnlusername);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setForeground(new Color(0, 0, 0));
		txtUsername.setText("Username");
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 17));
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setBounds(10, 10, 183, 20);
		pnlusername.add(txtUsername);
		
		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/user.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
		lblIconUsername.setIcon(new ImageIcon(img));
		lblIconUsername.setBounds(257, 0, 45, 38);
		pnlusername.add(lblIconUsername);
		
		JPanel pnlpassword = new JPanel();
		pnlpassword.setLayout(null);
		pnlpassword.setBackground(Color.WHITE);
		pnlpassword.setBounds(56, 295, 302, 40);
		contentPane.add(pnlpassword);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Enter Password")) {
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
				}
				else {
					txtPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("Enter Password");
					txtPassword.setEchoChar((char)0);
				}
			}
		});
		txtPassword.setEchoChar((char)0);
		txtPassword.setText("Enter Password");
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 17));
		txtPassword.setBorder(null);
		txtPassword.setBounds(10, 10, 237, 28);
		pnlpassword.add(txtPassword);
		
		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setHorizontalAlignment(SwingConstants.CENTER);
		Image pics = new ImageIcon(this.getClass().getResource("/lock.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
		lblIconPassword.setIcon(new ImageIcon(pics));
		lblIconPassword.setBounds(257, 0, 45, 38);
		pnlpassword.add(lblIconPassword);
		Image pictus = new ImageIcon(this.getClass().getResource("/key.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
		
		JPanel pnlcpassword = new JPanel();
		pnlcpassword.setLayout(null);
		pnlcpassword.setBackground(Color.WHITE);
		pnlcpassword.setBounds(56, 345, 302, 40);
		contentPane.add(pnlcpassword);
		
		txtConfirmPassword = new JPasswordField();
		txtConfirmPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtConfirmPassword.getText().equals("Confirm Password")) {
					txtConfirmPassword.setEchoChar('●');
					txtConfirmPassword.setText("");
				}
				else {
					txtConfirmPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtConfirmPassword.getText().equals("")) {
					txtConfirmPassword.setText("Confirm Password");
					txtConfirmPassword.setEchoChar((char)0);
				}
			}
		});
		txtConfirmPassword.setEchoChar((char)0);
		txtConfirmPassword.setText("Confirm Password");
		txtConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 17));
		txtConfirmPassword.setBorder(null);
		txtConfirmPassword.setBounds(10, 0, 237, 38);
		pnlcpassword.add(txtConfirmPassword);
		
		JLabel lblIconConfirmPassword = new JLabel("");
		lblIconConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		Image picts = new ImageIcon(this.getClass().getResource("/lock2.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
		lblIconConfirmPassword.setIcon(new ImageIcon(picts));
		lblIconConfirmPassword.setBounds(257, 0, 45, 38);
		pnlcpassword.add(lblIconConfirmPassword);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(112, 128, 144));
		panel_2.setBounds(447, 0, 314, 495);
		contentPane.add(panel_2);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(278, 0, 36, 30);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this Page?", "Confirmation", JOptionPane.YES_NO_OPTION) ==0) {
					FrameSignup.this.dispose();
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
		panel_2.setLayout(null);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(new Color(248, 248, 255));
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		panel_2.add(lblX);
		
		JLabel lbldelicn = new JLabel("");
		lbldelicn.setIcon(new ImageIcon("C:\\Users\\pranit\\Downloads\\delboy (1).png"));
		lbldelicn.setHorizontalTextPosition(SwingConstants.CENTER);
		lbldelicn.setBorder(null);
		lbldelicn.setBounds(41, 185, 213, 223);
		panel_2.add(lbldelicn);
		
		JLabel lblNewLabel_1 = new JLabel(" FoodStop");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Ink Free", Font.BOLD, 41));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(45, 85, 223, 97);
		panel_2.add(lblNewLabel_1);
		
		
		lblSignupMessage.setForeground(new Color(0, 0, 128));
		lblSignupMessage.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSignupMessage.setBounds(43, 307, 302, 13);
		contentPane.add(lblSignupMessage);
		
		JPanel pnlmob = new JPanel();
		pnlmob.setLayout(null);
		pnlmob.setBackground(Color.WHITE);
		pnlmob.setBounds(56, 188, 302, 40);
		contentPane.add(pnlmob);
		
		txtmob = new JTextField();
		txtmob.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
				
				
			}
		});
		txtmob.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {if(txtmob.getText().equals("Contact No.")) {
				txtmob.setText("");
			}
			else {
				txtmob.selectAll();
			}
			
		}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtmob.getText().equals(""))
					txtmob.setText("Contact No.");
				
			}
		});
		txtmob.setText("Contact No.");
		txtmob.setForeground(Color.BLACK);
		txtmob.setFont(new Font("Arial", Font.PLAIN, 17));
		txtmob.setColumns(10);
		txtmob.setBorder(null);
		txtmob.setBounds(10, 10, 183, 20);
		pnlmob.add(txtmob);
		
		JLabel lbliconmob = new JLabel("");
		lbliconmob.setIcon(new ImageIcon("C:\\Users\\pranit\\Downloads\\contact_32.png"));
		lbliconmob.setHorizontalAlignment(SwingConstants.CENTER);
		lbliconmob.setBounds(257, 0, 45, 38);
		pnlmob.add(lbliconmob);
		
		JPanel pnlfullname = new JPanel();
		pnlfullname.setLayout(null);
		pnlfullname.setBackground(Color.WHITE);
		pnlfullname.setBounds(56, 88, 302, 40);
		contentPane.add(pnlfullname);
		
		txtfullname = new JTextField();
		
		txtfullname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtfullname.getText().equals("Full Name")) {
					txtfullname.setText("");
				}
				else {
					txtfullname.selectAll();
				}
			}
		});
		
		txtfullname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtfullname.getText().equals("")) {
					txtfullname.setText("Full Name");
				}
			}
		});
		
	
		
		txtfullname.setText("Full Name");
		txtfullname.setForeground(Color.BLACK);
		txtfullname.setFont(new Font("Arial", Font.PLAIN, 17));
		txtfullname.setColumns(10);
		txtfullname.setBorder(null);
		txtfullname.setBounds(10, 10, 225, 21);
		pnlfullname.add(txtfullname);
		
		JLabel iconfullname = new JLabel("");
		iconfullname.setIcon(new ImageIcon("C:\\Users\\pranit\\Downloads\\fullname_32.png"));
		iconfullname.setHorizontalAlignment(SwingConstants.CENTER);
		iconfullname.setBounds(257, 0, 45, 38);
		pnlfullname.add(iconfullname);
		
		JLabel lblregister = new JLabel(" R E G I S T E R ");
		lblregister.setVerticalTextPosition(SwingConstants.TOP);
		lblregister.setHorizontalTextPosition(SwingConstants.CENTER);
		lblregister.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 0, 0), new Color(255, 255, 0)));
		lblregister.setForeground(Color.WHITE);
		lblregister.setHorizontalAlignment(SwingConstants.CENTER);
		lblregister.setFont(new Font("Arial", Font.BOLD, 32));
		lblregister.setBounds(29, 20, 352, 58);
		contentPane.add(lblregister);
		
	    comboBox = new JComboBox();
		comboBox.setOpaque(false);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBorder(null);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT GENGER", "MALE", "FEMALE", "OTHER"}));
		comboBox.setBounds(59, 249, 168, 29);
		contentPane.add(comboBox);
		
		chckbxNewCheckBox = new JCheckBox("I,Accept All Terms And Conditions.");
		chckbxNewCheckBox.setVerticalTextPosition(SwingConstants.TOP);
		chckbxNewCheckBox.setVerticalAlignment(SwingConstants.BOTTOM);
		chckbxNewCheckBox.setHorizontalTextPosition(SwingConstants.RIGHT);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setForeground(Color.BLUE);
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setFont(new Font("Consolas", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(56, 393, 302, 29);
		contentPane.add(chckbxNewCheckBox);
		
		
		
		JLabel lblSignupMeassage = new JLabel("");
		lblSignupMeassage.setBounds(56, 478, 302, 13);
		contentPane.add(lblSignupMeassage);
		lblSignupMeassage.setForeground(new Color(0, 0, 128));
		lblSignupMeassage.setFont(new Font("Arial", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.addMouseListener(new MouseAdapter() {
			private String username;

			@Override
			public void mouseClicked(MouseEvent e) {
				String fname = txtfullname.getText();
				String username = txtUsername.getText();
				String phone = txtmob.getText();
				String pass1 = String.valueOf(txtPassword.getPassword());
				String pass2 = String.valueOf(txtConfirmPassword.getPassword());
				String gender = comboBox.getSelectedItem().toString();
				
				
				
				if(verifyFields())
				{
				  if(!checkUsername(username))
			      	{
				 PreparedStatement ps;
				 ResultSet rs;
				 String registerUserQuery = "INSERT INTO `login1`( `full_name`, `username`, `password`, `phone`, `gender`) VALUES (?,?,?,?,?)";
				 
				 try {
					  ps = connect.getConnection().prepareStatement(registerUserQuery);
					  ps.setString(1, fname);
					  ps.setString(2, username);
					  ps.setString(3, pass1);
					  ps.setString(4, phone);
					  ps.setString(5, gender);
					  
					  if(ps.executeUpdate()!=0) {
						  JOptionPane.showMessageDialog(null,"Your Account Has Been Created. LOGIN TO CONTINUE.");
					   }
					  else {
						JOptionPane.showMessageDialog(null,"ERROR : Check Your Details" );
					  }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			      	}
				  FrameSignup.this.dispose();
				  FrameLogin first= new FrameLogin();
					first.setVisible(true);
				}
			}
			
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 22));
		btnNewButton.setBackground(new Color(119, 136, 153));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(119, 136, 153), new Color(255, 255, 0)));
		btnNewButton.setBounds(66, 428, 292, 40);
		contentPane.add(btnNewButton);
 }
}
