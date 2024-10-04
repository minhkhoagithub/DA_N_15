package entity;

import enums.CaLam;
import enums.TrangThaiPhucVu;

import java.time.LocalDate;

public class NhanVien extends NguoiDung {
    private TrangThaiPhucVu trangThaiPhucVu;
    private CaLam caLam;

    public NhanVien(String tenND, LocalDate ngaySinh, LocalDate ngayVaoLam, String soDienThoai, String diaChi, TrangThaiPhucVu trangThaiPhucVu, CaLam caLam) {
        super(tenND, ngaySinh, ngayVaoLam, soDienThoai, diaChi);
        this.trangThaiPhucVu = trangThaiPhucVu;
        this.caLam = caLam;
    }

    public TrangThaiPhucVu getTrangThaiPhucVu() {
        return trangThaiPhucVu;
    }

    public void setTrangThaiPhucVu(TrangThaiPhucVu trangThaiPhucVu) {
        this.trangThaiPhucVu = trangThaiPhucVu;
    }

    public CaLam getCaLam() {
        return caLam;
    }

    public void setCaLam(CaLam caLam) {
        this.caLam = caLam;
    }

    @Override
    public String toString() {
        return super.toString() +
                "trangThaiPhucVu=" + trangThaiPhucVu +
                ", caLam=" + caLam +
                '}';
    }
}
