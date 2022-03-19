import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class splash extends JFrame {

	private JPanel contentPane;
	private  static JLabel label;
	private static JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int i;
		splash frame = new splash();
		frame.setVisible(true);
		 
				try { 
					for(i=0;i<=100;i++)
					{
						splash.progressBar.setValue(i);
						splash.label.setText(Integer.toString(i)+"%");
						Thread.sleep(40);
						
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				new home().setVisible(true);
				frame.dispose();
				
			}
	


	/**
	 * Create the frame.
	 */
	public splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220, 100, 1101, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(151,215,206));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(0, 0, 0));
		progressBar.setBounds(0, 633, 1101, 37);
		progressBar.setBackground(new Color(255, 255, 0));
		contentPane.add(progressBar);
		
		 JLabel gif = new JLabel("");
		 gif.setIcon(new ImageIcon("C:\\Users\\pranit\\OneDrive\\Desktop\\java project\\161121 (1)\\imges\\newgifec.gif"));
		 gif.setBounds(308, 73, 500, 470);
		 contentPane.add(gif);
		
		label = new JLabel("");
		label.setFont(new Font("Rockwell Nova Light", Font.BOLD, 20));
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(533, 571, 68, 69);
		contentPane.add(label);
	}

}
