package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class HopDong  implements Serializable{
	private int ID;
	private Date ngayThue;
	private float giaThueKhoiDiem;
	private float tienCoc;
	private SinhVien sinhVien;
	private NhanVien nhanVien;
	private ArrayList<GiuongDuocThue> giuongDuocThue;
	private ArrayList<DichVuDuocDung> dichVuDuocDung;
	private DienSuDung dienSuDung;
	private NuocSuDung nuocSuDung;
	public HopDong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HopDong(Date ngayThue, float giaThueKhoiDiem, float tienCoc, SinhVien sinhVien, NhanVien nhanVien,
			ArrayList<GiuongDuocThue> giuongDuocThue, ArrayList<DichVuDuocDung> dichVuDuocDung, DienSuDung dienSuDung,
			NuocSuDung nuocSuDung) {
		super();
		this.ngayThue = ngayThue;
		this.giaThueKhoiDiem = giaThueKhoiDiem;
		this.tienCoc = tienCoc;
		this.sinhVien = sinhVien;
		this.nhanVien = nhanVien;
		this.giuongDuocThue = giuongDuocThue;
		this.dichVuDuocDung = dichVuDuocDung;
		this.dienSuDung = dienSuDung;
		this.nuocSuDung = nuocSuDung;
	}
	public Date getNgayThue() {
		return ngayThue;
	}
	public void setNgayThue(Date ngayThue) {
		this.ngayThue = ngayThue;
	}
	public float getGiaThueKhoiDiem() {
		return giaThueKhoiDiem;
	}
	public void setGiaThueKhoiDiem(float giaThueKhoiDiem) {
		this.giaThueKhoiDiem = giaThueKhoiDiem;
	}
	public float getTienCoc() {
		return tienCoc;
	}
	public void setTienCoc(float tienCoc) {
		this.tienCoc = tienCoc;
	}
	public SinhVien getSinhVien() {
		return sinhVien;
	}
	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public ArrayList<GiuongDuocThue> getGiuongDuocThue() {
		return giuongDuocThue;
	}
	public void setGiuongDuocThue(ArrayList<GiuongDuocThue> giuongDuocThue) {
		this.giuongDuocThue = giuongDuocThue;
	}
	public ArrayList<DichVuDuocDung> getDichVuDuocDung() {
		return dichVuDuocDung;
	}
	public void setDichVuDuocDung(ArrayList<DichVuDuocDung> dichVuDuocDung) {
		this.dichVuDuocDung = dichVuDuocDung;
	}
	public DienSuDung getDienSuDung() {
		return dienSuDung;
	}
	public void setDienSuDung(DienSuDung dienSuDung) {
		this.dienSuDung = dienSuDung;
	}
	public NuocSuDung getNuocSuDung() {
		return nuocSuDung;
	}
	public void setNuocSuDung(NuocSuDung nuocSuDung) {
		this.nuocSuDung = nuocSuDung;
	}
	
	
}
