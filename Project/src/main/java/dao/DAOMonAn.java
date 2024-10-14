package dao;

import java.util.ArrayList;
import java.util.List;

import entity.MonAn;

public class DAOMonAn implements DAO<MonAn>{

	private List<MonAn> dsMonAn;
	
	public DAOMonAn() {
		dsMonAn = new ArrayList<MonAn>();
	}
	
	@Override
	public List<MonAn> getDS() {
		return dsMonAn;
	}
	
	@Override
	public int getViTri(String id) {
	    return dsMonAn.indexOf(getDoiTuongTheoMa(id));
	}
	
	@Override
	public MonAn getDoiTuongTheoMa(String id) {
		return dsMonAn.stream().filter(ma -> ma.getMaMon().equals(id)).findFirst().orElse(null);
	}

	@Override
	public boolean them(MonAn monAn) {
	    if (monAn == null || dsMonAn.contains(monAn)) return false;
	    return dsMonAn.add(monAn);
	}


	@Override
	public boolean xoa(String id) {
		MonAn monAn = getDoiTuongTheoMa(id);
		if (monAn == null)  return false;
		return dsMonAn.remove(monAn);
	}

	@Override
	public boolean sua(MonAn monAn) {
		int viTri = getViTri(monAn.getMaMon());
		if (viTri == -1) return false;
		
		dsMonAn.set(viTri, monAn);
		return true;
	}
	
	@Override
	public String toString() {
		return "DAOMonAn [dsMonAn=" + String.join("\n", dsMonAn.stream().map(MonAn::toString).toArray(String[]::new)) + "]";
	}

	@Override
	public void xoaRong() {
		dsMonAn.clear();
	}
}