package view.hoadon;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BillViewFrm extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable table;
	private JButton btnXacNhan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillViewFrm frame = new BillViewFrm();
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
	public BillViewFrm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1360, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lên hóa đơn");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(511, 0, 263, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Thông tin sinh viên");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(46, 46, 166, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Họ tên:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 81, 102, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblHoTen = new JLabel("Nguyen Văn Chien");
		lblHoTen.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHoTen.setBounds(135, 81, 160, 24);
		contentPane.add(lblHoTen);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mã sinh viên:");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 123, 102, 24);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNguyenVnChien = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien.setBounds(135, 123, 160, 24);
		contentPane.add(lblNguyenVnChien);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Khoa:");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(10, 157, 102, 24);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNguyenVnChien_1 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_1.setBounds(135, 157, 160, 24);
		contentPane.add(lblNguyenVnChien_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Ngành học:");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_2.setBounds(10, 196, 102, 24);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNguyenVnChien_2 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_2.setBounds(135, 196, 160, 24);
		contentPane.add(lblNguyenVnChien_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Ngày sinh:");
		lblNewLabel_2_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_3.setBounds(10, 233, 102, 24);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNguyenVnChien_3 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_3.setBounds(135, 233, 160, 24);
		contentPane.add(lblNguyenVnChien_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Giới tính:");
		lblNewLabel_2_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_4.setBounds(305, 81, 76, 24);
		contentPane.add(lblNewLabel_2_1_4);
		
		JLabel lblNguyenVnChien_4 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_4.setBounds(391, 81, 160, 24);
		contentPane.add(lblNguyenVnChien_4);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Quốc tịch:");
		lblNewLabel_2_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_5.setBounds(305, 123, 76, 24);
		contentPane.add(lblNewLabel_2_1_5);
		
		JLabel lblNguyenVnChien_5 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_5.setBounds(391, 123, 160, 24);
		contentPane.add(lblNguyenVnChien_5);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("Số CMT:");
		lblNewLabel_2_1_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_6.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_6.setBounds(305, 157, 76, 24);
		contentPane.add(lblNewLabel_2_1_6);
		
		JLabel lblNguyenVnChien_6 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_6.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_6.setBounds(391, 157, 160, 24);
		contentPane.add(lblNguyenVnChien_6);
		
		JLabel lblNewLabel_2_1_7 = new JLabel("Trường:");
		lblNewLabel_2_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_7.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_7.setBounds(305, 196, 76, 24);
		contentPane.add(lblNewLabel_2_1_7);
		
		JLabel lblNguyenVnChien_7 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_7.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_7.setBounds(391, 196, 160, 24);
		contentPane.add(lblNguyenVnChien_7);
		
		JLabel lblNewLabel_2_1_8 = new JLabel("Ghi chú:");
		lblNewLabel_2_1_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_8.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_8.setBounds(305, 233, 76, 24);
		contentPane.add(lblNewLabel_2_1_8);
		
		JLabel lblNguyenVnChien_8 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_8.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_8.setBounds(391, 233, 160, 24);
		contentPane.add(lblNguyenVnChien_8);
		
		JLabel lblNewLabel_1_1 = new JLabel("Thông tin giường và phòng");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(929, 46, 218, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Tên giường:");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(809, 89, 82, 24);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblHoTen_1 = new JLabel("Nguyen Văn Chien");
		lblHoTen_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHoTen_1.setBounds(914, 89, 160, 24);
		contentPane.add(lblHoTen_1);
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("Tên phòng:");
		lblNewLabel_2_1_4_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_4_1.setBounds(1084, 89, 80, 24);
		contentPane.add(lblNewLabel_2_1_4_1);
		
		JLabel lblNguyenVnChien_4_1 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_4_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_4_1.setBounds(1174, 89, 160, 24);
		contentPane.add(lblNguyenVnChien_4_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Kiểu giường:");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(809, 123, 82, 24);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblHoTen_2 = new JLabel("Nguyen Văn Chien");
		lblHoTen_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHoTen_2.setBounds(914, 123, 160, 24);
		contentPane.add(lblHoTen_2);
		
		JLabel lblNewLabel_2_1_4_2 = new JLabel("Loại phòng");
		lblNewLabel_2_1_4_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_4_2.setBounds(1084, 123, 80, 24);
		contentPane.add(lblNewLabel_2_1_4_2);
		
		JLabel lblNguyenVnChien_4_2 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_4_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_4_2.setBounds(1174, 123, 160, 24);
		contentPane.add(lblNguyenVnChien_4_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("Mô tả:");
		lblNewLabel_2_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(809, 157, 82, 24);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblHoTen_3 = new JLabel("Nguyen Văn Chien");
		lblHoTen_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHoTen_3.setBounds(914, 157, 160, 24);
		contentPane.add(lblHoTen_3);
		
		JLabel lblNewLabel_2_1_4_3 = new JLabel("Mô tả");
		lblNewLabel_2_1_4_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_4_3.setBounds(1084, 157, 80, 24);
		contentPane.add(lblNewLabel_2_1_4_3);
		
		JLabel lblNguyenVnChien_4_3 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_4_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_4_3.setBounds(1174, 157, 160, 24);
		contentPane.add(lblNguyenVnChien_4_3);
		
		JLabel lblNewLabel_2_5 = new JLabel("Giá thuê:");
		lblNewLabel_2_5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_5.setBounds(809, 191, 82, 24);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblHoTen_4 = new JLabel("Nguyen Văn Chien");
		lblHoTen_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHoTen_4.setBounds(914, 191, 160, 24);
		contentPane.add(lblHoTen_4);
		
		JLabel lblNewLabel_2_1_4_4 = new JLabel("Giá thuê:");
		lblNewLabel_2_1_4_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_4_4.setBounds(1084, 191, 80, 24);
		contentPane.add(lblNewLabel_2_1_4_4);
		
		JLabel lblNguyenVnChien_4_4 = new JLabel("Nguyen Văn Chien");
		lblNguyenVnChien_4_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNguyenVnChien_4_4.setBounds(1174, 191, 160, 24);
		contentPane.add(lblNguyenVnChien_4_4);
		
		table = new JTable();
		table.setBounds(208, 370, 881, 89);
		contentPane.add(table);
		
		JLabel lblNewLabel_3 = new JLabel("Thông tin khoản thu");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(532, 303, 224, 22);
		contentPane.add(lblNewLabel_3);
		
		btnXacNhan = new JButton("Xác nhận");
		btnXacNhan.addActionListener(this);
		btnXacNhan.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnXacNhan.setBounds(613, 503, 110, 36);
		contentPane.add(btnXacNhan);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource() instanceof JButton) && (e.getSource().equals(btnXacNhan))) {
			String path = "";
			JFileChooser fc = new JFileChooser();
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int x = fc.showSaveDialog(this);
			
			if(x == JFileChooser.APPROVE_OPTION) {
				path = fc.getSelectedFile().getPath();
				System.out.println(path);
				
			}
			
			
			try {
				Document doc = new Document();
				PdfWriter.getInstance(doc, new FileOutputStream(path + "chien.pdf"));
				doc.open();
				PdfPTable tbl = new PdfPTable(3);
				tbl.addCell("Employee ID");
				tbl.addCell("Employee name");
				tbl.addCell("Emplouee Tele");
				doc.add(tbl);
				
				Paragraph p = new Paragraph("This is tesing from Trans to pdf");
				doc.add(p);
				doc.close();
				JOptionPane.showMessageDialog(this, "Đã lên hóa đơn thành công!");
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
			
		
			
		}
	}

	private OutputStream FileOutputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
