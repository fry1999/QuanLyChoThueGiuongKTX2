package model;

import java.io.Serializable;
import java.sql.Date;

//Serializable is serialized an object to a file
public class GiuongDuocThue implements Serializable{
	private int ID;
	private Giuong giuong;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	private float gia;
	private String ghiChu;
	
	public GiuongDuocThue() {
		super();
	}
	
	public GiuongDuocThue(Giuong giuong, Date ngayBatDau, Date ngayKetThuc, float gia, String ghiChu) {
		super();
		this.giuong = giuong;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.gia = gia;
		this.ghiChu = ghiChu;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int ID){
		this.ID = ID;
	}
	public Giuong getGiuong() {
		return giuong;
	}
	public void setGiuong(Giuong giuong) {
		this.giuong = giuong;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	
}
