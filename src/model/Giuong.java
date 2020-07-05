package model;

import java.io.Serializable;

public class Giuong implements Serializable{
	private int ID;
	private String tenGiuong;
	private String kieuGiuong;
	private String moTa;
	private float giaThue;
	private float tienCoc;
	public Giuong() {
		super();
	}
	public Giuong(String tenGiuong, String kieuGiuong, String moTa, float giaThue, float tienCoc) {
		super();
		this.tenGiuong = tenGiuong;
		this.kieuGiuong = kieuGiuong;
		this.moTa = moTa;
		this.giaThue = giaThue;
		this.tienCoc = tienCoc;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTenGiuong() {
		return tenGiuong;
	}
	public void setTenGiuong(String tenGiuong) {
		this.tenGiuong = tenGiuong;
	}
	public String getKieuGiuong() {
		return kieuGiuong;
	}
	public void setKieuGiuong(String kieuGiuong) {
		this.kieuGiuong = kieuGiuong;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public float getGiaThue() {
		return giaThue;
	}
	public void setGiaThue(float giaThue) {
		this.giaThue = giaThue;
	}
	public float getTienCoc() {
		return tienCoc;
	}
	public void setTienCoc(float tienCoc) {
		this.tienCoc = tienCoc;
	}
	
	
}
