package dao;

import java.util.ArrayList;
import java.util.List;

import entity.KhuyenMai;

public class DAOKhuyenMai implements DAO<KhuyenMai> {
	List<KhuyenMai> dsKhuyenMai;
	
	public DAOKhuyenMai() {
		dsKhuyenMai = new ArrayList<KhuyenMai>();
	}
	
	@Override
	public List<KhuyenMai> getDS() {
		return dsKhuyenMai;
	}

	@Override
	public int getViTri(String id) {
		return dsKhuyenMai.indexOf(getDoiTuongTheoMa(id));
	}
	
	@Override
	public KhuyenMai getDoiTuongTheoMa(String id) {
		return dsKhuyenMai.stream().filter(km -> km.getMaKM().equals(id)).findFirst().orElse(null);
	}

	@Override
	public boolean them(KhuyenMai km) {
	    if (dsKhuyenMai.contains(km)) return false;
	    return dsKhuyenMai.add(km);
	}


	@Override
	public boolean xoa(String id) {
		KhuyenMai km = getDoiTuongTheoMa(id);
		if (km == null) return false;
		return dsKhuyenMai.remove(km);
	}

	@Override
	public boolean sua(KhuyenMai km) {
		int viTri = getViTri(km.getMaKM());
		if (viTri == -1) return false;
		dsKhuyenMai.set(viTri, km);
		return true;
	}
	
	@Override
	public void xoaRong() {
		dsKhuyenMai.clear();
	}

	@Override
	public String toString() {
	    return "DAOKhuyenMai:\n" + String.join("\n", dsKhuyenMai.stream().map(KhuyenMai::toString).toArray(String[]::new));
	}
}
