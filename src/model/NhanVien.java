package model;

import java.io.Serializable;

public class NhanVien implements Serializable{
	private int ID;
	private String tenDangNhap;
	private String matKhau;
	private String ten;
	private String viTri;
	private String ghiChu;
	
	
	public NhanVien(String tenDangNhap, String matKhau, String ten, String viTri, String ghiChu) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.ten = ten;
		this.viTri = viTri;
		this.ghiChu = ghiChu;
	}
	public NhanVien() {
		super();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getViTri() {
		return viTri;
	}
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	
}
