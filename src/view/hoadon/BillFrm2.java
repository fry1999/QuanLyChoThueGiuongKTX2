package view.hoadon;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.HoaDon;
import model.NhanVien;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;

public class BillFrm2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable tblThanhToan;
	private JTable tblDienNuoc;
	private JTable tblDichVu;
	private JTable tblSinhVien;
	private JTable tblPhong;
	private JTable tblGiuong;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	private JScrollPane scrollPane_5;
	private JButton btnXacNhan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillFrm2 frame = new BillFrm2();
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
	public BillFrm2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin hóa đơn");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(428, 10, 203, 24);
		contentPane.add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 47, 964, 63);
		contentPane.add(scrollPane);
		
		tblGiuong = new JTable();
		scrollPane.setViewportView(tblGiuong);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 120, 964, 63);
		contentPane.add(scrollPane_1);
		
		tblPhong = new JTable();
		scrollPane_1.setViewportView(tblPhong);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 193, 964, 63);
		contentPane.add(scrollPane_2);
		
		tblSinhVien = new JTable();
		scrollPane_2.setViewportView(tblSinhVien);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 278, 964, 94);
		contentPane.add(scrollPane_3);
		
		tblDichVu = new JTable();
		scrollPane_3.setViewportView(tblDichVu);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 404, 964, 84);
		contentPane.add(scrollPane_4);
		
		tblDienNuoc = new JTable();
		scrollPane_4.setViewportView(tblDienNuoc);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 512, 964, 91);
		contentPane.add(scrollPane_5);
		
		tblThanhToan = new JTable();
		scrollPane_5.setViewportView(tblThanhToan);
		
		btnXacNhan = new JButton("XÁC NHẬN");
		btnXacNhan.addActionListener(this);
			
		btnXacNhan.setBackground(Color.RED);
		btnXacNhan.setForeground(Color.WHITE);
		btnXacNhan.setBounds(428, 613, 148, 24);
		contentPane.add(btnXacNhan);
		
		hienThi();
	}

	private void hienThi() {
		String[] columnNameGiuong = {"IDGiuong", "Tên giường", "Kiểu giường", "Giá thuê", "Mô tả", "Ngày bắt đầu", "Ngày kết thúc", "Thành tiền"};
		String[] columnNamePhong = {"IDPhong", "Tên phòng", "Loại phòng", "Giá thuê", "Mô tả", "Thành tiền"};
		String[] columnNameSinhVien = {"Mã sinh viên", "Tên sinh viên", "Ngày sinh", "Quê quán", "Giới tính", "Trường", "Khoa", "Quốc tịch", "Số CMT"};
		String[] columnNameDichVu = {"Tên loại", "Số lượng", "Đơn giá", "Thành tiền/phòng", "Thành tiền/Giường"};
		String[] columnNameDienNuoc = {"Tên loại", "Chỉ số cũ", "Chỉ số mới","Tổng số sử dung", "Đơn giá", "Thành tiền/phòng", "Thành tiền/giường"};
		String[] rowNameThanhToan = {"Số nợ tồn dư tháng trước", "Tổng tiền phải đóng"};

//
//		int n = listG.size();
//		System.out.println(n);
		String[][] valueGiuong = new String[1][8];
//		for(int i=0; i<n; ++i) {
//			value[i][0] = listG.get(i).getID()+"";
//			value[i][1] = listG.get(i).getGiuong().getID()+"";
//			value[i][2] = listG.get(i).getGiuong().getTenGiuong()+"";
//			value[i][3] = listG.get(i).getGiuong().getKieuGiuong()+"";
//			value[i][4] = listG.get(i).getGiuong().getGiaThue()+"";
//			value[i][5] = listG.get(i).getGiuong().getMoTa()+"";
//			value[i][6] = listG.get(i).getNgayBatDau()+"";
//			value[i][7] = listG.get(i).getNgayKetThuc()+"";
//		}
		
		DefaultTableModel tableModelGiuong = new DefaultTableModel(valueGiuong, columnNameGiuong) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		//tableModel.setColumnIdentifiers(columnNames);
		tblGiuong.setModel(tableModelGiuong);
		
		
		String[][] valuePhong = new String[1][6];
//		for(int i=0; i<n; ++i) {
//			value[i][0] = listG.get(i).getID()+"";
//			value[i][1] = listG.get(i).getGiuong().getID()+"";
//			value[i][2] = listG.get(i).getGiuong().getTenGiuong()+"";
//			value[i][3] = listG.get(i).getGiuong().getKieuGiuong()+"";
//			value[i][4] = listG.get(i).getGiuong().getGiaThue()+"";
//			value[i][5] = listG.get(i).getGiuong().getMoTa()+"";
//			value[i][6] = listG.get(i).getNgayBatDau()+"";
//			value[i][7] = listG.get(i).getNgayKetThuc()+"";
//		}
		
		DefaultTableModel tableModelPhong = new DefaultTableModel(valuePhong, columnNamePhong) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		//tableModel.setColumnIdentifiers(columnNames);
		tblPhong.setModel(tableModelPhong);
		
		
		String[][] valueSinhVien = new String[1][9];
//		for(int i=0; i<n; ++i) {
//			value[i][0] = listG.get(i).getID()+"";
//			value[i][1] = listG.get(i).getGiuong().getID()+"";
//			value[i][2] = listG.get(i).getGiuong().getTenGiuong()+"";
//			value[i][3] = listG.get(i).getGiuong().getKieuGiuong()+"";
//			value[i][4] = listG.get(i).getGiuong().getGiaThue()+"";
//			value[i][5] = listG.get(i).getGiuong().getMoTa()+"";
//			value[i][6] = listG.get(i).getNgayBatDau()+"";
//			value[i][7] = listG.get(i).getNgayKetThuc()+"";
//		}
		
		DefaultTableModel tableModelSinhVien = new DefaultTableModel(valueSinhVien, columnNameSinhVien) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		//tableModel.setColumnIdentifiers(columnNames);
		tblSinhVien.setModel(tableModelSinhVien);
		
		
		String[][] valueDichVu = new String[3][5];
//		for(int i=0; i<n; ++i) {
//			value[i][0] = listG.get(i).getID()+"";
//			value[i][1] = listG.get(i).getGiuong().getID()+"";
//			value[i][2] = listG.get(i).getGiuong().getTenGiuong()+"";
//			value[i][3] = listG.get(i).getGiuong().getKieuGiuong()+"";
//			value[i][4] = listG.get(i).getGiuong().getGiaThue()+"";
//			value[i][5] = listG.get(i).getGiuong().getMoTa()+"";
//			value[i][6] = listG.get(i).getNgayBatDau()+"";
//			value[i][7] = listG.get(i).getNgayKetThuc()+"";
//		}
		
		DefaultTableModel tableModelDichVu = new DefaultTableModel(valueDichVu, columnNameDichVu) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		//tableModel.setColumnIdentifiers(columnNames);
		tblDichVu.setModel(tableModelDichVu);
		
		
		
		String[][] valueDienNuoc = new String[2][5];
//		for(int i=0; i<n; ++i) {
//			value[i][0] = listG.get(i).getID()+"";
//			value[i][1] = listG.get(i).getGiuong().getID()+"";
//			value[i][2] = listG.get(i).getGiuong().getTenGiuong()+"";
//			value[i][3] = listG.get(i).getGiuong().getKieuGiuong()+"";
//			value[i][4] = listG.get(i).getGiuong().getGiaThue()+"";
//			value[i][5] = listG.get(i).getGiuong().getMoTa()+"";
//			value[i][6] = listG.get(i).getNgayBatDau()+"";
//			value[i][7] = listG.get(i).getNgayKetThuc()+"";
//		}
		
		DefaultTableModel tableModelDienNuoc = new DefaultTableModel(valueDienNuoc, columnNameDienNuoc) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		//tableModel.setColumnIdentifiers(columnNames);
		tblDienNuoc.setModel(tableModelDienNuoc);
		
		
		
		String[][] valueThanhToan = new String[2][2];
		valueThanhToan[0][0] = "Số tiền còn nợ tháng trước:";
		valueThanhToan[0][1] = "10000";
		valueThanhToan[1][0] = "Tổng tiền thanh toán:";
		valueThanhToan[1][1] = "20000";
		
		DefaultTableModel tableModelThanhToan = new DefaultTableModel(valueThanhToan, new String[2]) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		//tableModel.setColumnIdentifiers(columnNames);
		tblThanhToan.setModel(tableModelThanhToan);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource() instanceof JButton) && (e.getSource().equals(btnXacNhan))) {
			
			
			
		}
		
	}
}
