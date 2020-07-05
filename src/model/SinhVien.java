package model;

import java.io.Serializable;
import java.util.Date;

public class SinhVien  implements Serializable{
	private int ID;
	private String maSV;
	private String khoa;
	private String nganhHoc;
	private Date ngaySinh;
	private String gioiTinh;
	private String soCMT;
	private String queQuan;
	private String ten;
	private String email;
	private String soDienThoai;
	private String ghiChu;
	public SinhVien(String maSV, String khoa, String nganhHoc, Date ngaySinh, String gioiTinh, String soCMT,
			String queQuan, String ten, String email, String soDienThoai, String ghiChu) {
		super();
		this.maSV = maSV;
		this.khoa = khoa;
		this.nganhHoc = nganhHoc;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soCMT = soCMT;
		this.queQuan = queQuan;
		this.ten = ten;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.ghiChu = ghiChu;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getNganhHoc() {
		return nganhHoc;
	}
	public void setNganhHoc(String nganhHoc) {
		this.nganhHoc = nganhHoc;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoCMT() {
		return soCMT;
	}
	public void setSoCMT(String soCMT) {
		this.soCMT = soCMT;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	
}
