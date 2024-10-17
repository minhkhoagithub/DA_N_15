package dao;

import entity.KhuyenMaiTrenMon;

import java.util.ArrayList;
import java.util.List;

public class DAOKhuyenMaiTrenMon implements DAO<KhuyenMaiTrenMon> {
    private List<KhuyenMaiTrenMon> danhSachKhuyenMaiTrenMon = new ArrayList<>();

    @Override
    public List<KhuyenMaiTrenMon> getDS() {
        return danhSachKhuyenMaiTrenMon;
    }

    @Override
    public int getViTri(String id) {
        for (int i = 0; i < danhSachKhuyenMaiTrenMon.size(); i++) {
            if (danhSachKhuyenMaiTrenMon.get(i).getMaKM().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public KhuyenMaiTrenMon getDoiTuongTheoMa(String id) {
        for (KhuyenMaiTrenMon khuyenMaiTrenMon : danhSachKhuyenMaiTrenMon) {
            if (khuyenMaiTrenMon.getMaKM().equals(id)) {
                return khuyenMaiTrenMon;
            }
        }
        return null;
    }

    @Override
    public boolean them(KhuyenMaiTrenMon doiTuong) {
        return danhSachKhuyenMaiTrenMon.add(doiTuong);
    }

    @Override
    public boolean xoa(String id) {
        int viTri = getViTri(id);
        if (viTri != -1) {
            danhSachKhuyenMaiTrenMon.remove(viTri);
            return true;
        }
        return false;
    }

    @Override
    public boolean sua(KhuyenMaiTrenMon doiTuong) {
        int viTri = getViTri(doiTuong.getMaKM());
        if (viTri != -1) {
            danhSachKhuyenMaiTrenMon.set(viTri, doiTuong);
            return true;
        }
        return false;
    }

    @Override
    public void xoaRong() {
        danhSachKhuyenMaiTrenMon.clear();
    }
}
