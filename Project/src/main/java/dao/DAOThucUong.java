package dao;

import entity.ThucUong;

import java.util.ArrayList;
import java.util.List;

public class DAOThucUong implements DAO<ThucUong> {
    private List<ThucUong> danhSachThucUong = new ArrayList<>();

    @Override
    public List<ThucUong> getDS() {
        return danhSachThucUong;
    }

    @Override
    public int getViTri(String id) {
        for (int i = 0; i < danhSachThucUong.size(); i++) {
            if (danhSachThucUong.get(i).getMaMon().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ThucUong getDoiTuongTheoMa(String id) {
        for (ThucUong thucUong : danhSachThucUong) {
            if (thucUong.getMaMon().equals(id)) {
                return thucUong;
            }
        }
        return null;
    }

    @Override
    public boolean them(ThucUong doiTuong) {
        return danhSachThucUong.add(doiTuong);
    }

    @Override
    public boolean xoa(String id) {
        int viTri = getViTri(id);
        if (viTri != -1) {
            danhSachThucUong.remove(viTri);
            return true;
        }
        return false;
    }

    @Override
    public boolean sua(ThucUong doiTuong) {
        int viTri = getViTri(doiTuong.getMaMon());
        if (viTri != -1) {
            danhSachThucUong.set(viTri, doiTuong);
            return true;
        }
        return false;
    }

    @Override
    public void xoaRong() {
        danhSachThucUong.clear();
    }
}
