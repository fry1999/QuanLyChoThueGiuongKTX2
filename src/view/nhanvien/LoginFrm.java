package view.nhanvien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.NhanVienDAO;
import model.NhanVien;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrm extends JFrame implements ActionListener{
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JButton btnLogin;
	private JLabel lblUsername;
	private JLabel lblPassword;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrm frame = new LoginFrm();
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
	public LoginFrm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", Font.BOLD, 14));
		txtUsername.setBounds(197, 88, 178, 28);
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsername.setBounds(78, 91, 87, 13);
		getContentPane().add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 14));
		lblPassword.setBounds(78, 141, 87, 13);
		getContentPane().add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Arial", Font.BOLD, 14));
		txtPassword.setBounds(197, 137, 178, 28);
		getContentPane().add(txtPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		
		btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
		btnLogin.setBounds(258, 189, 117, 21);
		getContentPane().add(btnLogin);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource() instanceof JButton) && (e.getSource().equals(btnLogin))) {
			
			String username = txtUsername.getText().trim();
			String password = String.valueOf(txtPassword.getPassword());
			
			//String str = null;
			//System.println.out(String.valueOf(str)) : will print a string equal to null
			//System.println.out(str.toString) : will throw a NullPointerException -> less safe
			
			NhanVien nv = new NhanVien();
			nv.setTenDangNhap(username);
			nv.setMatKhau(password);
			
			NhanVienDAO nvd = new NhanVienDAO();
			if(nvd.checkLogin(nv)) {
				if(nv.getViTri().equalsIgnoreCase("quan_ly")) {
					(new ManageHomeFrm(nv)).setVisible(true);
					this.dispose();
				}
				else {
					JOptionPane.showMessageDialog(this, "Chua xay dung chuc nang cho "+ nv.getViTri());
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không chính xác!");
			}
			
		}
	}
	
	
}
