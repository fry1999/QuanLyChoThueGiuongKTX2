package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.NhanVien;

public class NhanVienDAO extends DAO {

	public NhanVienDAO() {
		super();
	}
	public static boolean checkLogin(NhanVien nv) {
		String sql = "SELECT ID, ten, vitri FROM tblNhanVien WHERE tendangnhap = ? and matkhau = ?";
		boolean result = false;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, nv.getTenDangNhap());
			ps.setString(2, nv.getMatKhau());
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				nv.setID(rs.getInt("ID"));
				nv.setViTri(rs.getString("viTri"));
				nv.setTen(rs.getString("ten"));
				result = true;
			}
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		
		return result;
		
	}
}
