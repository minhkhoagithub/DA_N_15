package dao;

import java.util.List;

public interface DAO<T> {
	List<T> getDS();
	int getViTri(String id);
	T getDoiTuongTheoMa(String id);
	boolean them(T doiTuong);
	boolean xoa(String id);
	boolean sua(T doiTuong);
	void xoaRong();
}
