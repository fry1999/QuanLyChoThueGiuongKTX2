package model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

public class HoaDon implements Serializable{
	private int ID;
	private Date ngayThanhToan;
	private float tongTien;
	private String hinhThuc;
	private String ghiChu;
	private NhanVien nhanVien;
	private SinhVien sinhVien;
	private HopDong hopDong;
	private GiuongDuocThue giuongDuocThue;
	private ArrayList<DichVuDuocDung> dichVuDuocDung;
	private ArrayList<DienSuDung> dienSuDung;
	private ArrayList<NuocSuDung> nuocSuDung;
	private ArrayList<DichVuThanhToan> dichVuThanhToan;
	public HoaDon() {
		super();
	}
	public HoaDon(Date ngayThanhToan, float tongTien, String hinhThuc, String ghiChu, NhanVien nhanVien,
			SinhVien sinhVien, HopDong hopDong, GiuongDuocThue giuongDuocThue, ArrayList<DichVuDuocDung> dichVuDuocDung,
			ArrayList<DienSuDung> dienSuDung, ArrayList<NuocSuDung> nuocSuDung) {
		super();
		this.ngayThanhToan = ngayThanhToan;
		this.tongTien = tongTien;
		this.hinhThuc = hinhThuc;
		this.ghiChu = ghiChu;
		this.nhanVien = nhanVien;
		this.sinhVien = sinhVien;
		this.hopDong = hopDong;
		this.giuongDuocThue = giuongDuocThue;
		this.dichVuDuocDung = dichVuDuocDung;
		this.dienSuDung = dienSuDung;
		this.nuocSuDung = nuocSuDung;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getNgayThanhToan() {
		return ngayThanhToan;
	}
	public void setNgayThanhToan(Date ngayThanhToan) {
		this.ngayThanhToan = ngayThanhToan;
	}
	public float getTongTien() {
		return tongTien;
	}
	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}
	public String getHinhThuc() {
		return hinhThuc;
	}
	public void setHinhThuc(String hinhThuc) {
		this.hinhThuc = hinhThuc;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public SinhVien getSinhVien() {
		return sinhVien;
	}
	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}
	public HopDong getHopDong() {
		return hopDong;
	}
	public void setHopDong(HopDong hopDong) {
		this.hopDong = hopDong;
	}
	public GiuongDuocThue getGiuongDuocThue() {
		return giuongDuocThue;
	}
	public void setGiuongDuocThue(GiuongDuocThue giuongDuocThue) {
		this.giuongDuocThue = giuongDuocThue;
	}
	public ArrayList<DichVuDuocDung> getDichVuDuocDung() {
		return dichVuDuocDung;
	}
	public void setDichVuDuocDung(ArrayList<DichVuDuocDung> dichVuDuocDung) {
		this.dichVuDuocDung = dichVuDuocDung;
	}
	public ArrayList<DienSuDung> getDienSuDung() {
		return dienSuDung;
	}
	public void setDienSuDung(ArrayList<DienSuDung> dienSuDung) {
		this.dienSuDung = dienSuDung;
	}
	public ArrayList<NuocSuDung> getNuocSuDung() {
		return nuocSuDung;
	}
	public void setNuocSuDung(ArrayList<NuocSuDung> nuocSuDung) {
		this.nuocSuDung = nuocSuDung;
	}
	
}
