package model;

import java.io.Serializable;
import java.util.Date;

public class CoSoVatChatSuDung implements Serializable{
	private int ID;
	private int soLuong;
	private float gia;
	private Date ngayBatDau;
	private CoSoVatChat coSoVatChat;
	
	public CoSoVatChatSuDung() {
		super();
	}

	public CoSoVatChatSuDung(int soLuong, float gia, Date ngayBatDau, CoSoVatChat coSoVatChat) {
		super();
		this.soLuong = soLuong;
		this.gia = gia;
		this.ngayBatDau = ngayBatDau;
		this.coSoVatChat = coSoVatChat;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public CoSoVatChat getCoSoVatChat() {
		return coSoVatChat;
	}

	public void setCoSoVatChat(CoSoVatChat coSoVatChat) {
		this.coSoVatChat = coSoVatChat;
	}
	
	
}
