package dao;

import entity.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class DAONhanVien implements DAO<NhanVien> {
    private List<NhanVien> danhSachNhanVien = new ArrayList<>();

    @Override
    public List<NhanVien> getDS() {
        return danhSachNhanVien;
    }

    @Override
    public int getViTri(String id) {
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            if (danhSachNhanVien.get(i).getMaND().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public NhanVien getDoiTuongTheoMa(String id) {
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getMaND().equals(id)) {
                return nhanVien;
            }
        }
        return null;
    }

    @Override
    public boolean them(NhanVien doiTuong) {
        return danhSachNhanVien.add(doiTuong);
    }

    @Override
    public boolean xoa(String id) {
        int viTri = getViTri(id);
        if (viTri != -1) {
            danhSachNhanVien.remove(viTri);
            return true;
        }
        return false;
    }

    @Override
    public boolean sua(NhanVien doiTuong) {
        int viTri = getViTri(doiTuong.getMaND());
        if (viTri != -1) {
            danhSachNhanVien.set(viTri, doiTuong);
            return true;
        }
        return false;
    }

    @Override
    public void xoaRong() {
        danhSachNhanVien.clear();
    }
}
