package model;

import java.io.Serializable;
import java.util.Date;

public class NuocSuDung  implements Serializable{
	private int ID;
	private Date ngay;
	private float donGia;
	private int dongHo;
	private boolean daThanhToan;
	public NuocSuDung() {
		super();
	}
	public NuocSuDung(Date ngay, float donGia, int dongHo, boolean daThanhToan) {
		super();
		this.ngay = ngay;
		this.donGia = donGia;
		this.dongHo = dongHo;
		this.daThanhToan = daThanhToan;
	}
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public int getDongHo() {
		return dongHo;
	}
	public void setDongHo(int dongHo) {
		this.dongHo = dongHo;
	}
	public boolean isDaThanhToan() {
		return daThanhToan;
	}
	public void setDaThanhToan(boolean daThanhToan) {
		this.daThanhToan = daThanhToan;
	}
	
	
}
