package dao;

import java.util.ArrayList;
import java.util.List;

import entity.TheKhachHang;

public class DAOTheKhachHang implements DAO<TheKhachHang>{
	List<TheKhachHang> dsTheKH = new ArrayList<>();
	
	@Override
	public List<TheKhachHang> getDS() {
		return dsTheKH;
	}

	@Override
	public int getViTri(String id) {
		TheKhachHang tkh = getDoiTuongTheoMa(id);
		return dsTheKH.indexOf(tkh);
	}

	@Override
	public TheKhachHang getDoiTuongTheoMa(String id) {
		return dsTheKH.stream().filter(tkh -> tkh.getMaThe().equals(id)).findFirst().orElse(null);
	}

	@Override
	public boolean them(TheKhachHang tkh) {
		if (dsTheKH.contains(tkh)) return false;
		return dsTheKH.add(tkh);
	}

	@Override
	public boolean xoa(String id) {
		TheKhachHang tkh = getDoiTuongTheoMa(id);
		if (tkh == null) return false;
		
		dsTheKH.remove(tkh);
		return true;
	}

	@Override
	public boolean sua(TheKhachHang tkh) {
		int viTri = getViTri(tkh.getMaThe());
		if (viTri == -1) return false;
		
		dsTheKH.set(viTri, tkh);
		return true;
	}

	@Override
	public void xoaRong() {
		dsTheKH.clear();
	}

	@Override
	public String toString() {
		return "DAOTheKhachHang [dsTheKH=" + String.join("\n", dsTheKH.stream().map(TheKhachHang::toString).toArray(String[]::new)) + "]";
	}
}