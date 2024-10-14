package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Ban;

public class DAOBan implements DAO<Ban> {
	List<Ban> dsBan = new ArrayList<>();

	@Override
	public List<Ban> getDS() {
		return dsBan;
	}

	@Override
	public int getViTri(String id) {
		Ban ban = getDoiTuongTheoMa(id);
		return dsBan.indexOf(ban);
	}

	@Override
	public Ban getDoiTuongTheoMa(String id) {
		return dsBan.stream().filter(ban -> ban.getMaBan().equals(id)).findFirst().orElse(null);
	}

	@Override
	public boolean them(Ban ban) {
		if (dsBan.contains(ban)) return false;
		return dsBan.add(ban);
	}
	@Override
	public boolean xoa(String id) {
		Ban ban = getDoiTuongTheoMa(id);
		return dsBan.remove(ban);
	}

	@Override
	public boolean sua(Ban ban) {
		int viTri = getViTri(ban.getMaBan());
		if (viTri ==-1) return false;
		dsBan.set(viTri, ban);
		return true;
	}

	@Override
	public void xoaRong() {
		dsBan.clear();
	}
}
