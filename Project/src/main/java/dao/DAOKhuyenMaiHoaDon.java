package dao;

import entity.KhuyenMaiHoaDon;

import java.util.ArrayList;
import java.util.List;

public class DAOKhuyenMaiHoaDon implements DAO<KhuyenMaiHoaDon> {
    private List<KhuyenMaiHoaDon> danhSachKhuyenMaiHoaDon = new ArrayList<>();

    @Override
    public List<KhuyenMaiHoaDon> getDS() {
        return danhSachKhuyenMaiHoaDon;
    }

    @Override
    public int getViTri(String id) {
        for (int i = 0; i < danhSachKhuyenMaiHoaDon.size(); i++) {
            if (danhSachKhuyenMaiHoaDon.get(i).getMaKM().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public KhuyenMaiHoaDon getDoiTuongTheoMa(String id) {
        for (KhuyenMaiHoaDon khuyenMaiHoaDon : danhSachKhuyenMaiHoaDon) {
            if (khuyenMaiHoaDon.getMaKM().equals(id)) {
                return khuyenMaiHoaDon;
            }
        }
        return null;
    }

    @Override
    public boolean them(KhuyenMaiHoaDon doiTuong) {
        return danhSachKhuyenMaiHoaDon.add(doiTuong);
    }

    @Override
    public boolean xoa(String id) {
        int viTri = getViTri(id);
        if (viTri != -1) {
            danhSachKhuyenMaiHoaDon.remove(viTri);
            return true;
        }
        return false;
    }

    @Override
    public boolean sua(KhuyenMaiHoaDon doiTuong) {
        int viTri = getViTri(doiTuong.getMaKM());
        if (viTri != -1) {
            danhSachKhuyenMaiHoaDon.set(viTri, doiTuong);
            return true;
        }
        return false;
    }

    @Override
    public void xoaRong() {
        danhSachKhuyenMaiHoaDon.clear();
    }
}
