package dao;

import entity.KhuyenMaiTrenGoiBuffet;

import java.util.ArrayList;
import java.util.List;

public class DAOKhuyenMaiTrenGoiBuffet implements DAO<KhuyenMaiTrenGoiBuffet> {
    private List<KhuyenMaiTrenGoiBuffet> danhSachKhuyenMaiTrenGoiBuffet = new ArrayList<>();

    @Override
    public List<KhuyenMaiTrenGoiBuffet> getDS() {
        return danhSachKhuyenMaiTrenGoiBuffet;
    }

    @Override
    public int getViTri(String id) {
        for (int i = 0; i < danhSachKhuyenMaiTrenGoiBuffet.size(); i++) {
            if (danhSachKhuyenMaiTrenGoiBuffet.get(i).getMaKM().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public KhuyenMaiTrenGoiBuffet getDoiTuongTheoMa(String id) {
        for (KhuyenMaiTrenGoiBuffet khuyenMaiTrenGoiBuffet : danhSachKhuyenMaiTrenGoiBuffet) {
            if (khuyenMaiTrenGoiBuffet.getMaKM().equals(id)) {
                return khuyenMaiTrenGoiBuffet;
            }
        }
        return null;
    }

    @Override
    public boolean them(KhuyenMaiTrenGoiBuffet doiTuong) {
        return danhSachKhuyenMaiTrenGoiBuffet.add(doiTuong);
    }

    @Override
    public boolean xoa(String id) {
        int viTri = getViTri(id);
        if (viTri != -1) {
            danhSachKhuyenMaiTrenGoiBuffet.remove(viTri);
            return true;
        }
        return false;
    }

    @Override
    public boolean sua(KhuyenMaiTrenGoiBuffet doiTuong) {
        int viTri = getViTri(doiTuong.getMaKM());
        if (viTri != -1) {
            danhSachKhuyenMaiTrenGoiBuffet.set(viTri, doiTuong);
            return true;
        }
        return false;
    }

    @Override
    public void xoaRong() {
        danhSachKhuyenMaiTrenGoiBuffet.clear();
    }
}
