package dao;

import java.util.ArrayList;
import java.util.List;

import entity.KhachHangThanhVien;

public class DAOKHTV implements DAO<KhachHangThanhVien>{

	private List<KhachHangThanhVien> dsKHTV;
	
	public DAOKHTV() {
		dsKHTV = new ArrayList<KhachHangThanhVien>();
	}
	
	@Override
	public List<KhachHangThanhVien> getDS() {
		return dsKHTV;
	}
	
	@Override
	public int getViTri(String id) {
	    return dsKHTV.indexOf(getDoiTuongTheoMa(id));
	}
	
	@Override
	public KhachHangThanhVien getDoiTuongTheoMa(String id) {
		return dsKHTV.stream().filter(ma -> ma.getMaKH().equals(id)).findFirst().orElse(null);
	}

	@Override
	public boolean them(KhachHangThanhVien KHTV) {
	    if (KHTV == null || dsKHTV.contains(KHTV)) return false;
	    return dsKHTV.add(KHTV);
	}


	@Override
	public boolean xoa(String id) {
		KhachHangThanhVien KHTV = getDoiTuongTheoMa(id);
		if (KHTV == null)  return false;
		return dsKHTV.remove(KHTV);
	}

	@Override
	public boolean sua(KhachHangThanhVien KHTV) {
		int viTri = getViTri(KHTV.getMaKH());
		if (viTri == -1) return false;
		
		dsKHTV.set(viTri, KHTV);
		return true;
	}
	
	@Override
	public void xoaRong() {
		dsKHTV.clear();
	}
	
	@Override
	public String toString() {
		return "DAOKHTV [dsKHTV=" + String.join("\n", dsKHTV.stream().map(KhachHangThanhVien::toString).toArray(String[]::new)) + "]";
	}
}