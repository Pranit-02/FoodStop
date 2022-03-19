import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220, 100, 1101, 680);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton login = new JButton(" LOGIN");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new FrameLogin().setVisible(true);
				home.this.dispose();
				 }
		});
		login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login.setBorderPainted(false);
		login.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		login.setFont(new Font("Bookman Old Style", Font.BOLD, 26));
		login.setFocusCycleRoot(true);
		login.setIcon(new ImageIcon("C:\\Users\\ABHISHEK YADAV\\Desktop\\foodstop\\LOGIN_32.png"));
		login.setHorizontalTextPosition(SwingConstants.RIGHT);
		login.setForeground(new Color(255, 51, 51));
		login.setBackground(new Color(255, 153, 0));
		login.setBounds(695, 340, 201, 73);
		contentPane.add(login);
		
		JButton signup = new JButton(" SIGN UP");
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		signup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameSignup fs =new FrameSignup();
				fs.setVisible(true);
				home.this.dispose();
			}
		});
		signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signup.setIcon(new ImageIcon("C:\\Users\\ABHISHEK YADAV\\Desktop\\foodstop\\SIGNUP_32.png"));
		signup.setHorizontalTextPosition(SwingConstants.RIGHT);
		signup.setForeground(new Color(255, 51, 51));
		signup.setFont(new Font("Bookman Old Style", Font.BOLD, 26));
		signup.setFocusCycleRoot(true);
		signup.setBorderPainted(false);
		signup.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		signup.setBackground(new Color(255, 153, 0));
		signup.setBounds(695, 456, 201, 73);
		contentPane.add(signup);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					home.this.dispose();
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
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(1069, 0, 32, 30);
		contentPane.add(lblX);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(0,0, 1101, 680);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\FoodStop_1101x680.jpg"));
		contentPane.add(lblNewLabel);
	}
}
