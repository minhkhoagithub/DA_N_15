package dao;

import java.util.ArrayList;
import java.util.List;

import entity.HoaDon;

public class DAOHoaDon implements DAO<HoaDon>{

	private List<HoaDon> dsHoaDon;
	
	public DAOHoaDon() {
		dsHoaDon = new ArrayList<HoaDon>();
	}
	
	@Override
	public List<HoaDon> getDS() {
		return dsHoaDon;
	}
	
	@Override
	public int getViTri(String id) {
	    return dsHoaDon.indexOf(getDoiTuongTheoMa(id));
	}
	
	@Override
	public HoaDon getDoiTuongTheoMa(String id) {
		return dsHoaDon.stream().filter(ma -> ma.getMaHoaDon().equals(id)).findFirst().orElse(null);
	}

	@Override
	public boolean them(HoaDon hoaDon) {
	    if (hoaDon == null || dsHoaDon.contains(hoaDon)) return false;
	    return dsHoaDon.add(hoaDon);
	}


	@Override
	public boolean xoa(String id) {
		HoaDon hoaDon = getDoiTuongTheoMa(id);
		if (hoaDon == null)  return false;
		return dsHoaDon.remove(hoaDon);
	}

	@Override
	public boolean sua(HoaDon HoaDon) {
		int viTri = getViTri(HoaDon.getMaHoaDon());
		if (viTri == -1) return false;
		
		dsHoaDon.set(viTri, HoaDon);
		return true;
	}
	
	@Override
	public void xoaRong() {
		dsHoaDon.clear();
	}
	
	@Override
	public String toString() {
		return "DAOHoaDon [dsHoaDon=" + String.join("\n", dsHoaDon.stream().map(HoaDon::toString).toArray(String[]::new)) + "]";
	}
}