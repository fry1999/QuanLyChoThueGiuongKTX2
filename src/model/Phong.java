package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Phong  implements Serializable {
	private int ID;
	private String tenPhong;
	private String loaiPhong;
	private String moTa;
	private ArrayList<DienSuDung> listDienSuDung;
	private ArrayList<NuocSuDung> listNuocSuDung;
	private ArrayList<Giuong> listGiuong;
	private ArrayList<CoSoVatChatSuDung> listCoSoVatChatSuDung;
	public Phong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phong(String tenPhong, String loaiPhong, String moTa, ArrayList<DienSuDung> listDienSuDung,
			ArrayList<NuocSuDung> listNuocSuDung, ArrayList<Giuong> listGiuong,
			ArrayList<CoSoVatChatSuDung> listCoSoVatChatSuDung) {
		super();
		this.tenPhong = tenPhong;
		this.loaiPhong = loaiPhong;
		this.moTa = moTa;
		this.listDienSuDung = listDienSuDung;
		this.listNuocSuDung = listNuocSuDung;
		this.listGiuong = listGiuong;
		this.listCoSoVatChatSuDung = listCoSoVatChatSuDung;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public String getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public ArrayList<DienSuDung> getListDienSuDung() {
		return listDienSuDung;
	}
	public void setListDienSuDung(ArrayList<DienSuDung> listDienSuDung) {
		this.listDienSuDung = listDienSuDung;
	}
	public ArrayList<NuocSuDung> getListNuocSuDung() {
		return listNuocSuDung;
	}
	public void setListNuocSuDung(ArrayList<NuocSuDung> listNuocSuDung) {
		this.listNuocSuDung = listNuocSuDung;
	}
	public ArrayList<Giuong> getListGiuong() {
		return listGiuong;
	}
	public void setListGiuong(ArrayList<Giuong> listGiuong) {
		this.listGiuong = listGiuong;
	}
	public ArrayList<CoSoVatChatSuDung> getListCoSoVatChatSuDung() {
		return listCoSoVatChatSuDung;
	}
	public void setListCoSoVatChatSuDung(ArrayList<CoSoVatChatSuDung> listCoSoVatChatSuDung) {
		this.listCoSoVatChatSuDung = listCoSoVatChatSuDung;
	}
	
}
