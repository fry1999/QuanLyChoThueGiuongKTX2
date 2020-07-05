package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import model.SinhVien;

public class SinhVienDAO extends DAO{

	public SinhVienDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static boolean SubmitStudentInfo(SinhVien SV) {
		String sql = "INSERT INTO `heroku_2b4b7a67e105418`.`tblsinhvien` (`ten`, `masinhvien`, `ngaysinh`, `gioitinh`, `socmt`, `quequan`, `email`, `sodienthoai`) VALUES (?,?,?,?,?,?,?,?)";
		boolean result = false;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, SV.getTen());
			ps.setString(2, SV.getMaSV());
			ps.setString(3, sdf.format(SV.getNgaySinh()));
			ps.setString(4, SV.getGioiTinh());
			ps.setString(5, SV.getSoCMT());
			ps.setString(6, SV.getQueQuan());
			ps.setString(7, SV.getEmail());
			ps.setString(8, SV.getSoDienThoai());
			ps.executeQuery();
			result = true;
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		
		return result;
	}

}
