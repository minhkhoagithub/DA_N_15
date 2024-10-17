package dao;

import entity.MonThuocGoi;

import java.util.ArrayList;
import java.util.List;

public class DAOMonThuocGoi implements DAO<MonThuocGoi> {
    private List<MonThuocGoi> danhSachMonThuocGoi = new ArrayList<>();

    @Override
    public List<MonThuocGoi> getDS() {
        return danhSachMonThuocGoi;
    }

    @Override
    public int getViTri(String id) {
        for (int i = 0; i < danhSachMonThuocGoi.size(); i++) {
            if (danhSachMonThuocGoi.get(i).getMaMonBuffet().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public MonThuocGoi getDoiTuongTheoMa(String id) {
        for (MonThuocGoi monThuocGoi : danhSachMonThuocGoi) {
            if (monThuocGoi.getMaMonBuffet().equals(id)) {
                return monThuocGoi;
            }
        }
        return null;
    }

    @Override
    public boolean them(MonThuocGoi doiTuong) {
        return danhSachMonThuocGoi.add(doiTuong);
    }

    @Override
    public boolean xoa(String id) {
        int viTri = getViTri(id);
        if (viTri != -1) {
            danhSachMonThuocGoi.remove(viTri);
            return true;
        }
        return false;
    }

    @Override
    public boolean sua(MonThuocGoi doiTuong) {
        int viTri = getViTri(doiTuong.getMaMonBuffet());
        if (viTri != -1) {
            danhSachMonThuocGoi.set(viTri, doiTuong);
            return true;
        }
        return false;
    }

    @Override
    public void xoaRong() {
        danhSachMonThuocGoi.clear();
    }
}
