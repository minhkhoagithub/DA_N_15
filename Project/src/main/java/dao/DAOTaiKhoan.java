package dao;

import java.util.ArrayList;
import java.util.List;

import entity.TaiKhoan;

public class DAOTaiKhoan implements DAO<TaiKhoan> {
	List<TaiKhoan> dsTaiKhoan = new ArrayList<TaiKhoan>();
	
	@Override
	public List<TaiKhoan> getDS() {
		return dsTaiKhoan;
	}

	@Override
	public int getViTri(String tenDangNhap) {
		TaiKhoan tk = getDoiTuongTheoMa(tenDangNhap);
		return dsTaiKhoan.indexOf(tk);
	}

	@Override
	public TaiKhoan getDoiTuongTheoMa(String tenDangNhap) {
		return dsTaiKhoan.stream().filter(tk -> tk.getTenDangNhap().equals(tenDangNhap)).findFirst().orElse(null);
	}

	@Override
	public boolean them(TaiKhoan tk) {
		if (dsTaiKhoan.contains(tk)) return false;
		return dsTaiKhoan.add(tk);
	}

	@Override
	public boolean xoa(String tenDangNhap) {
		TaiKhoan tk = getDoiTuongTheoMa(tenDangNhap);
		if (tk == null) return false;
		
		dsTaiKhoan.remove(tk);
		return true;
	}

	@Override
	public boolean sua(TaiKhoan tk) {
		int viTri = getViTri(tk.getTenDangNhap());
		if (viTri == -1) return false;
		
		dsTaiKhoan.set(viTri, tk);
		return true;
	}

	@Override
	public void xoaRong() {
		dsTaiKhoan.clear();
	}

	@Override
	public String toString() {
		return "DAOTaiKhoan [dsTaiKhoan=" + String.join("\n", dsTaiKhoan.stream().map(TaiKhoan::toString).toArray(String[]::new)) + "]";
	}
}