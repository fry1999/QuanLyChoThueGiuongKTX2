package view.nhanvien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class SignUpFrm extends JFrame {
	public SignUpFrm() {
	}

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpView frame = new SignUpView();
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
	public SignUpView() {
		
		
		initComponents();
		creatEvents();
		
	}

	private void initComponents() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 414);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, -14, 278, 417);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(-78, 23, 356, 324);
		lblNewLabel_1.setIcon(new ImageIcon(SignUpView.class.getResource("/Resources/Images/bg.jpg")));
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("SignUp");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(241, 57, 83));
		btnNewButton.setBounds(293, 341, 228, 36);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(293, 37, 228, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.activeCaption);
		separator.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		separator.setBounds(512, 75, -217, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(293, 10, 88, 23);
		contentPane.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		separator_1.setBackground(SystemColor.activeCaption);
		separator_1.setBounds(512, 222, -217, 2);
		contentPane.add(separator_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(293, 184, 228, 36);
		contentPane.add(textField_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 14));
		lblPassword.setBounds(293, 156, 88, 23);
		contentPane.add(lblPassword);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		separator_2.setBackground(SystemColor.activeCaption);
		separator_2.setBounds(512, 148, -217, 2);
		contentPane.add(separator_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(293, 110, 228, 36);
		contentPane.add(textField_2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 14));
		lblEmail.setBounds(293, 83, 88, 23);
		contentPane.add(lblEmail);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		separator_3.setBackground(SystemColor.activeCaption);
		separator_3.setBounds(512, 299, -217, 2);
		contentPane.add(separator_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(293, 261, 228, 36);
		contentPane.add(textField_3);
		
		JLabel lblRepeatPassword = new JLabel("Repeat password");
		lblRepeatPassword.setFont(new Font("Arial", Font.BOLD, 14));
		lblRepeatPassword.setBounds(293, 234, 137, 23);
		contentPane.add(lblRepeatPassword);
		
		setBackground(Color.WHITE);
	}

	private void creatEvents() {
		// TODO Auto-generated method stub
		
	}
}
