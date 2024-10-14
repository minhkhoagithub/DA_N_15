package dao;

import java.util.ArrayList;
import java.util.List;

import entity.NguoiDung;

public class DAONguoiDung implements DAO<NguoiDung> {
	List<NguoiDung> dsNguoiDung = new ArrayList<>();
	
	@Override
	public List<NguoiDung> getDS() {
		return null;
	}

	@Override
	public int getViTri(String id) {
		NguoiDung nd = getDoiTuongTheoMa(id);
		return dsNguoiDung.indexOf(nd);
	}

	@Override
	public NguoiDung getDoiTuongTheoMa(String id) {
		return dsNguoiDung.stream().filter(nd -> nd.getMaND().equals(id)).findFirst().orElse(null);
	}

	@Override
	public boolean them(NguoiDung nguoiDung) {
		if (dsNguoiDung.contains(nguoiDung)) return false;
		return dsNguoiDung.add(nguoiDung);
	}

	@Override
	public boolean xoa(String id) {
		NguoiDung nguoiDung = getDoiTuongTheoMa(id);
		if (nguoiDung == null) return false;
		
		dsNguoiDung.remove(nguoiDung);
		return true;
	}

	@Override
	public boolean sua(NguoiDung nguoiDung) {
		int viTri = getViTri(nguoiDung.getMaND());
		if (viTri == -1) return false;
		
		dsNguoiDung.set(viTri, nguoiDung);
		return true;
	}

	@Override
	public void xoaRong() {
		dsNguoiDung.clear();
	}

	@Override
	public String toString() {
		return "DAONguoiDung [dsNguoiDung=" + String.join("\n", dsNguoiDung.stream().map(NguoiDung::toString).toArray(String[]::new)) + "]";
	}	
}