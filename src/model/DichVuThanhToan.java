package model;

public class DichVuThanhToan {
	private int ID;
	private float tongTien;
	private float soTienConNo;
	private DichVuDuocDung dichVuDuocDung;
	public DichVuThanhToan() {
		super();
	}
	public DichVuThanhToan(float tongTien, float soTienConNo, DichVuDuocDung dichVuDuocDung) {
		super();
		this.tongTien = tongTien;
		this.soTienConNo = soTienConNo;
		this.dichVuDuocDung = dichVuDuocDung;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	
}
