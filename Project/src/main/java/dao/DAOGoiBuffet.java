package dao;

import java.util.ArrayList;
import java.util.List;

import entity.GoiBuffet;

public class DAOGoiBuffet implements DAO<GoiBuffet> {
	List<GoiBuffet> dsGoiBF = new ArrayList<GoiBuffet>();

	@Override
	public List<GoiBuffet> getDS() {
		return dsGoiBF;
	}

	@Override
	public int getViTri(String id) {
		GoiBuffet goi = getDoiTuongTheoMa(id);
		return dsGoiBF.indexOf(goi);
	}

	@Override
	public GoiBuffet getDoiTuongTheoMa(String id) {
		return dsGoiBF.stream().filter(goi -> goi.getMaGoi().equals(id)).findFirst().orElse(null);
	}

	@Override
	public boolean them(GoiBuffet doiTuong) {
		if (dsGoiBF.contains(doiTuong)) return false;
		return dsGoiBF.add(doiTuong);
	}

	@Override
	public boolean xoa(String id) {
		GoiBuffet goiBF = getDoiTuongTheoMa(id);
		if (goiBF == null) return false;
		dsGoiBF.remove(goiBF);
		return true;
	}

	@Override
	public boolean sua(GoiBuffet goi) {
		int viTri = getViTri(goi.getMaGoi());
		if (viTri == -1) return false;
		
		dsGoiBF.set(viTri, goi);
		return true;
	}

	@Override
	public void xoaRong() {
		dsGoiBF.clear();
	}

	@Override
	public String toString() {
		return "DAOGoiBuffet [dsGoiBF=" + String.join("\n", dsGoiBF.stream().map(GoiBuffet::toString).toArray(String[]::new)) + "]";
	}
}