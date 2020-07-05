package model;

import java.io.Serializable;

public class CoSoVatChat  implements Serializable {
	private int ID;
	private String tenLoai;
	private String ghiChu;
	private float gia;
	public CoSoVatChat() {
		super();
	}
	
	public CoSoVatChat(String tenLoai, String ghiChu, float gia) {
		super();
		this.tenLoai = tenLoai;
		this.ghiChu = ghiChu;
		this.gia = gia;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
}
