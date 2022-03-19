import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FrameLogin extends JFrame {
	
	
	

	private JPanel contentPane;
	private JPasswordField txtPassword;
	private JTextField txtUsername;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
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
	public FrameLogin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(360, 160, 761, 495);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new LineBorder(Color.ORANGE, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 144, 302, 40);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
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
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 17));
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 10, 183, 20);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/user.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
		lblIconUsername.setIcon(new ImageIcon(img));
		lblIconUsername.setBounds(257, 0, 45, 38);
		panel.add(lblIconUsername);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(39, 208, 302, 40);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
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
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char)0);
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 17));
		txtPassword.setText("Password");
		txtPassword.setBounds(12, 10, 183, 20);
		panel_1.add(txtPassword);
		
		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setHorizontalAlignment(SwingConstants.CENTER);
		Image pics = new ImageIcon(this.getClass().getResource("/lock.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
		lblIconPassword.setIcon(new ImageIcon(pics));
		lblIconPassword.setBounds(257, 0, 45, 38);
		panel_1.add(lblIconPassword);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(447, 0, 314, 495);
		panel_2.setBackground(new Color(112, 128, 144));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					FrameLogin.this.dispose();
					new home().setVisible(true);
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
		lblX.setForeground(new Color(248, 248, 255));
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(284, 0, 30, 30);
		panel_2.add(lblX);
		
		JLabel lblNewLabel_1 = new JLabel("FoodStop");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(46, 112, 223, 84);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\pranit\\Downloads\\delboy (1).png"));
		lblNewLabel_2.setBounds(41, 185, 223, 223);
		panel_2.add(lblNewLabel_2);
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.setBounds(49, 296, 281, 40);
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PreparedStatement st;
				ResultSet rs;
				
				String username = txtUsername.getText();
				String password = String.valueOf(txtPassword.getPassword());
				
				String query = "SELECT * FROM `login1` WHERE `username` = ? AND `password` = ?";
	
				 try {
					st = connect.getConnection().prepareStatement(query);
					
					st.setString(1, username);
					st.setString(2, password);
					rs = st.executeQuery();
					
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL","Login Success",2);
						new contentpage1().setVisible(true);
						FrameLogin.this.dispose();
						
					
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "INVALID Username / Password","Login Error",2);
					}
						
					}
				
					 catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(30, 60, 60));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(119, 136, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(60, 80, 80));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(30, 60, 60));
			}
		});
		pnlBtnLogin.setBackground(new Color(119, 136, 153));
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setBounds(91, 10, 105, 20);
		pnlBtnLogin.add(lblNewLabel);
		
		JLabel lblIconLogin = new JLabel("");
		lblIconLogin.setBounds(149, 0, 50, 40);
		pnlBtnLogin.add(lblIconLogin);
		lblIconLogin.setHorizontalAlignment(SwingConstants.CENTER);
		Image pict = new ImageIcon(this.getClass().getResource("/key.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
		lblIconLogin.setIcon(new ImageIcon(pict));
		
		JLabel lblIconLogo = new JLabel("W E L C O M E");
		lblIconLogo.setBounds(39, 81, 302, 49);
		lblIconLogo.setFont(new Font("Monotype Corsiva", Font.BOLD, 40));
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblIconLogo);
		lblLoginMessage.setBounds(39, 273, 250, 13);
		
		lblLoginMessage.setForeground(new Color(0, 0, 128));
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.add(lblLoginMessage);
		
		setLocationRelativeTo(null);
	}
}
