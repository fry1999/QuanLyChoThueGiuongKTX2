package model;


import java.io.Serializable;
import java.util.Date;

public class DichVuDuocDung implements Serializable {
	private int ID;
	private Date ngayBatDau;
	private Date NgayKetThuc;
	private String ghiChu;
	private DichVu dichVu;
	public DichVuDuocDung() {
		super();
	}
	
	public DichVuDuocDung(Date ngayBatDau, Date ngayKetThuc, String ghiChu, DichVu dichVu) {
		super();
		this.ngayBatDau = ngayBatDau;
		NgayKetThuc = ngayKetThuc;
		this.ghiChu = ghiChu;
		this.dichVu = dichVu;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Date getNgayKetThuc() {
		return NgayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		NgayKetThuc = ngayKetThuc;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public DichVu getDichVu() {
		return dichVu;
	}
	public void setDichVu(DichVu dichVu) {
		this.dichVu = dichVu;
	}
	
}
