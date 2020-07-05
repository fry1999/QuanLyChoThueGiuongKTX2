package view.giuong;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.HoaDonDAO;
import model.Giuong;
import model.GiuongDuocThue;
import model.HoaDon;
import model.HopDong;
import model.NhanVien;

import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManageBedFrm extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable tblGiuong;
	private NhanVien nhanVien;
	private ArrayList<GiuongDuocThue> listG;
	private JScrollPane scrollPane;


	public ManageBedFrm(NhanVien nhanVien, ArrayList<GiuongDuocThue> listG) {
		this.nhanVien = nhanVien;
		this.listG = listG;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Arial", Font.BOLD, 16));
		scrollPane.setBounds(10, 58, 737, 236);
		contentPane.add(scrollPane);
		
		tblGiuong = new JTable();
//		tblGiuong.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				int column = tblGiuong.getColumnModel().getColumnIndexAtX(e.getX());
//				int row = e.getY()/tblGiuong.getRowHeight();
//				if(row < tblGiuong.getRowCount() && row >=0 && column < tblGiuong.getColumnCount() && column > 0) {
//					HoaDon hoaDon = new HoaDon();
//					HoaDonDAO hoaDonDAO = new HoaDonDAO();

		scrollPane.setViewportView(tblGiuong);
		tblGiuong.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("Danh sách giường chưa lên hóa đơn");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(153, 10, 502, 28);
		contentPane.add(lblNewLabel);
		
		hienthi();
	}


	private void hienthi() {
		String[] columnNames = {"ID","IDGiuong", "Tên giường", "Kiểu giường", "Giá thuê", "Mô tả", "Ngày bắt đầu", "Ngày kết thúc", };
		int n = listG.size();
		System.out.println(n);
		String[][] value = new String[n][8];
		for(int i=0; i<n; ++i) {
			value[i][0] = listG.get(i).getID()+"";
			value[i][1] = listG.get(i).getGiuong().getID()+"";
			value[i][2] = listG.get(i).getGiuong().getTenGiuong()+"";
			value[i][3] = listG.get(i).getGiuong().getKieuGiuong()+"";
			value[i][4] = listG.get(i).getGiuong().getGiaThue()+"";
			value[i][5] = listG.get(i).getGiuong().getMoTa()+"";
			value[i][6] = listG.get(i).getNgayBatDau()+"";
			value[i][7] = listG.get(i).getNgayKetThuc()+"";
		}
		
		DefaultTableModel tableModel = new DefaultTableModel(value, columnNames) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		//tableModel.setColumnIdentifiers(columnNames);
		tblGiuong.setModel(tableModel);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
