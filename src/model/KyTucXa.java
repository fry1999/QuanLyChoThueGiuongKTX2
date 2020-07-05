package model;

import java.util.ArrayList;

public class KyTucXa {
	private int ID;
	private String tenKTX;
	private int soTang;
	private int soPhong;
	private String moTa;
	private String diaChi;
	private ArrayList<Phong> listPhong;
	
	public KyTucXa() {
		super();
	}
	public KyTucXa(String tenKTX, int soTang, int soPhong, String moTa, String diaChi, ArrayList<Phong> listPhong) {
		super();
		this.tenKTX = tenKTX;
		this.soTang = soTang;
		this.soPhong = soPhong;
		this.moTa = moTa;
		this.diaChi = diaChi;
		this.listPhong = listPhong;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTenKTX() {
		return tenKTX;
	}
	public void setTenKTX(String tenKTX) {
		this.tenKTX = tenKTX;
	}
	public int getSoTang() {
		return soTang;
	}
	public void setSoTang(int soTang) {
		this.soTang = soTang;
	}
	public int getSoPhong() {
		return soPhong;
	}
	public void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}
