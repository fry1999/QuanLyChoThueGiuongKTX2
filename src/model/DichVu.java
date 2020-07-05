package model;

import java.io.Serializable;

public class DichVu  implements Serializable {
	private int ID;
	private String tenDichVu;
	private float donGia;
	private String donVi;
	public DichVu() {
		super();
	}
	
	public DichVu(String tenDichVu, float donGia, String donVi) {
		super();
		this.tenDichVu = tenDichVu;
		this.donGia = donGia;
		this.donVi = donVi;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTenDichVu() {
		return tenDichVu;
	}
	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public String getDonVi() {
		return donVi;
	}
	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}
	
}
