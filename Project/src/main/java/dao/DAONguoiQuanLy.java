package dao;

import entity.NguoiQuanLy;

import java.util.ArrayList;
import java.util.List;

public class DAONguoiQuanLy implements DAO<NguoiQuanLy> {
    private List<NguoiQuanLy> danhSachNguoiQuanLy = new ArrayList<>();

    @Override
    public List<NguoiQuanLy> getDS() {
        return danhSachNguoiQuanLy;
    }

    @Override
    public int getViTri(String id) {
        for (int i = 0; i < danhSachNguoiQuanLy.size(); i++) {
            if (danhSachNguoiQuanLy.get(i).getMaND().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public NguoiQuanLy getDoiTuongTheoMa(String id) {
        for (NguoiQuanLy nguoiQuanLy : danhSachNguoiQuanLy) {
            if (nguoiQuanLy.getMaND().equals(id)) {
                return nguoiQuanLy;
            }
        }
        return null;
    }

    @Override
    public boolean them(NguoiQuanLy doiTuong) {
        return danhSachNguoiQuanLy.add(doiTuong);
    }

    @Override
    public boolean xoa(String id) {
        int viTri = getViTri(id);
        if (viTri != -1) {
            danhSachNguoiQuanLy.remove(viTri);
            return true;
        }
        return false;
    }

    @Override
    public boolean sua(NguoiQuanLy doiTuong) {
        int viTri = getViTri(doiTuong.getMaND());
        if (viTri != -1) {
            danhSachNguoiQuanLy.set(viTri, doiTuong);
            return true;
        }
        return false;
    }

    @Override
    public void xoaRong() {
        danhSachNguoiQuanLy.clear();
    }
}
