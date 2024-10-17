package dao;

import entity.MonBuffet;

import java.util.ArrayList;
import java.util.List;

public class DAOMonBuffet implements DAO<MonBuffet> {
    private List<MonBuffet> danhSachMonBuffet = new ArrayList<>();

    @Override
    public List<MonBuffet> getDS() {
        return danhSachMonBuffet;
    }

    @Override
    public int getViTri(String id) {
        for (int i = 0; i < danhSachMonBuffet.size(); i++) {
            if (danhSachMonBuffet.get(i).getMaMon().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public MonBuffet getDoiTuongTheoMa(String id) {
        for (MonBuffet monBuffet : danhSachMonBuffet) {
            if (monBuffet.getMaMon().equals(id)) {
                return monBuffet;
            }
        }
        return null;
    }

    @Override
    public boolean them(MonBuffet doiTuong) {
        return danhSachMonBuffet.add(doiTuong);
    }

    @Override
    public boolean xoa(String id) {
        int viTri = getViTri(id);
        if (viTri != -1) {
            danhSachMonBuffet.remove(viTri);
            return true;
        }
        return false;
    }

    @Override
    public boolean sua(MonBuffet doiTuong) {
        int viTri = getViTri(doiTuong.getMaMon());
        if (viTri != -1) {
            danhSachMonBuffet.set(viTri, doiTuong);
            return true;
        }
        return false;
    }

    @Override
    public void xoaRong() {
        danhSachMonBuffet.clear();
    }
}
