package dao;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.Giuong;
import model.GiuongDuocThue;
import model.Phong;

public class GiuongDAO extends DAO {

	public GiuongDAO() {
		super();
	}
	
	public static ArrayList<GiuongDuocThue> timKiemGiuongChuaLenHoaDon(){
		ArrayList<GiuongDuocThue> listG = new ArrayList<GiuongDuocThue>();
		String sqlSearch = "(SELECT tblgiuong.*, GDT.* FROM tblgiuong INNER JOIN (SELECT * FROM tblgiuongduocthue WHERE ID NOT IN (SELECT tblhoadon.IDgiuongduocthue FROM tblhoadon)) AS GDT ON (tblgiuong.ID = GDT.IDgiuong))";
		try {
			
			PreparedStatement ps = con.prepareStatement(sqlSearch);
			ResultSet rs = ps.executeQuery();
			System.out.println("1");
			while(rs.next()) {
				Giuong giuong = new Giuong();
				giuong.setID(rs.getInt("tblgiuong.ID"));
				giuong.setTenGiuong(rs.getString("tblgiuong.tengiuong"));
				giuong.setKieuGiuong(rs.getString("tblgiuong.kieugiuong"));
				giuong.setGiaThue(rs.getFloat("tblgiuong.giathue"));
				giuong.setMoTa(rs.getString("tblgiuong.mota"));
				
				
				GiuongDuocThue giuongDuocThue = new GiuongDuocThue();
				giuongDuocThue.setGiuong(giuong);
				giuongDuocThue.setID(rs.getInt("GDT.ID"));
				giuongDuocThue.setNgayBatDau(rs.getDate("GDT.ngaybatdau"));
				giuongDuocThue.setNgayKetThuc(rs.getDate("GDT.ngaybatdau"));
				giuongDuocThue.setGia(rs.getFloat("GDT.giathue"));
				giuongDuocThue.setGhiChu(rs.getString("GDT.ghichu"));
				listG.add(giuongDuocThue);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listG;
		
	}
	
	public ArrayList<Giuong> timKiemGiuongTrong(Date checkin, float gia){
		ArrayList<Giuong> result = new ArrayList<Giuong>();
		String sql = "SELECT tblgiuong.tengiuong, tblgiuong.kieugiuong, tblgiuong.giaThue, tblgiuong.moTa, tblgiuong.id, tblphong.tenphong FROM tblphong INNER JOIN tblgiuong ";
		String sql2 = "SELECT * FROM tblgiuong WHERE id NOT IN (SELECT id FROM tblgiuongduocthue WHERE ngayketthuc > ?) AND giathue <= ?";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try{
			PreparedStatement ps = con.prepareStatement(sql2);
			ps.setString(1, sdf.format(checkin));
			ps.setFloat(2, gia);
			ResultSet rs = ps.executeQuery();
			System.out.print("done");
			while(rs.next()){
				System.out.print(rs.getString("tengiuong"));
//				Giuong rm = new Giuong();
//				Phong p = new Phong();
//				rm.setID(rs.getInt("id"));
//				rm.setTenGiuong(rs.getString("tengiuong"));
//				rm.setKieuGiuong(rs.getString("kieugiuong"));
//				rm.setGiaThue(rs.getFloat("giathue"));
//				rm.setMoTa(rs.getString("mota"));
//				p.setTenPhong(rs.getString("tenphong"));
//				rm.setPhong(p);
//				result.add(rm);
			}
		}catch(Exception e){
			e.printStackTrace();
		}	
		return result;
	}
	
}
