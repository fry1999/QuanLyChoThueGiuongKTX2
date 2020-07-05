package view.nhanvien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.GiuongDAO;
import model.Giuong;
import model.GiuongDuocThue;
import model.NhanVien;
import view.giuong.ManageBedFrm;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class ManageHomeFrm extends JFrame implements ActionListener{
	ArrayList<GiuongDuocThue> listG ;
	private JPanel contentPane;
	private JButton btnLenHoaDon;
	private NhanVien nhanVien;
	private JLabel lblTen;
	private JButton btnHopDong;
	private JButton btnKTHopDong;
	private JButton btnNewButton;
	private JButton btnNewButton_1;


	public ManageHomeFrm(NhanVien nhanVien) {
		super();
		this.nhanVien = nhanVien;
		this.listG = new ArrayList<GiuongDuocThue>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Quan ly KTX");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(130, 10, 162, 32);
		contentPane.add(lblNewLabel);
		
		btnLenHoaDon = new JButton("Lên hoá đơn hàng tháng");
		btnLenHoaDon.addActionListener(this);
		btnLenHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLenHoaDon.setBounds(121, 190, 171, 25);
		contentPane.add(btnLenHoaDon);
		
		lblTen = new JLabel(nhanVien.getTen());
		lblTen.setBounds(378, 10, 46, 14);
		contentPane.add(lblTen);
		
		btnHopDong = new JButton("Tạo hợp đồng");
		btnHopDong.addActionListener(this);
		btnHopDong.setBounds(121, 50, 171, 23);
		contentPane.add(btnHopDong);
		
		btnKTHopDong = new JButton("Kết thúc hợp đồng");
		btnKTHopDong.addActionListener(this);
		btnKTHopDong.setBounds(121, 84, 171, 23);
		contentPane.add(btnKTHopDong);
		
		btnNewButton = new JButton("Quản lý cơ sở vật chất");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(121, 156, 171, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Quản lý dịch vụ");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(122, 122, 170, 23);
		contentPane.add(btnNewButton_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource() instanceof JButton) && (e.getSource().equals(btnLenHoaDon))){
			GiuongDAO gd = new GiuongDAO();
			listG = gd.timKiemGiuongChuaLenHoaDon();
			(new ManageBedFrm(nhanVien, listG)).setVisible(true);
			this.dispose();
		}
		else if((e.getSource() instanceof JButton) && (e.getSource().equals(btnHopDong))){
			(new SearchBedFrm(nhanVien)).setVisible(true);
			this.dispose();
		}
		else JOptionPane.showMessageDialog(this, "Chức năng đang phát triển!");
		
	}
}
