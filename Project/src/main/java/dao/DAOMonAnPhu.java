package dao;

import entity.MonAnPhu;

import java.util.ArrayList;
import java.util.List;

public class DAOMonAnPhu implements DAO<MonAnPhu> {
    private List<MonAnPhu> danhSachMonAnPhu = new ArrayList<>();

    @Override
    public List<MonAnPhu> getDS() {
        return danhSachMonAnPhu;
    }

    @Override
    public int getViTri(String id) {
        for (int i = 0; i < danhSachMonAnPhu.size(); i++) {
            if (danhSachMonAnPhu.get(i).getMaMon().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public MonAnPhu getDoiTuongTheoMa(String id) {
        for (MonAnPhu monAnPhu : danhSachMonAnPhu) {
            if (monAnPhu.getMaMon().equals(id)) {
                return monAnPhu;
            }
        }
        return null;
    }

    @Override
    public boolean them(MonAnPhu doiTuong) {
        return danhSachMonAnPhu.add(doiTuong);
    }

    @Override
    public boolean xoa(String id) {
        int viTri = getViTri(id);
        if (viTri != -1) {
            danhSachMonAnPhu.remove(viTri);
            return true;
        }
        return false;
    }

    @Override
    public boolean sua(MonAnPhu doiTuong) {
        int viTri = getViTri(doiTuong.getMaMon());
        if (viTri != -1) {
            danhSachMonAnPhu.set(viTri, doiTuong);
            return true;
        }
        return false;
    }

    @Override
    public void xoaRong() {
        danhSachMonAnPhu.clear();
    }
}
