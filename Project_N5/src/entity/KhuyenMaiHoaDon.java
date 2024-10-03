package entity;

import enums.TrangThaiKhuyenMai;

import java.time.LocalDate;

public class KhuyenMaiHoaDon extends KhuyenMai{
    private double giaTriPhanTramGiam;
    private double mocTongTienApDung;

    public KhuyenMaiHoaDon(String noiDungKM, LocalDate thoiGianBD, LocalDate thoiGianKT, TrangThaiKhuyenMai trangThaiKhuyenMai,double giaTriPhanTramGiam,double mocTongTienApDung) {
        super(noiDungKM, thoiGianBD, thoiGianKT, trangThaiKhuyenMai);
        this.giaTriPhanTramGiam = giaTriPhanTramGiam;
        this.mocTongTienApDung = mocTongTienApDung;
    }

    public double getGiaTriPhanTramGiam() {
        return giaTriPhanTramGiam;
    }

    public void setGiaTriPhanTramGiam(double giaTriPhanTramGiam) {
        this.giaTriPhanTramGiam = giaTriPhanTramGiam;
    }

    public double getMocTongTienApDung() {
        return mocTongTienApDung;
    }

    public void setMocTongTienApDung(double mocTongTienApDung) {
        this.mocTongTienApDung = mocTongTienApDung;
    }

    @Override
    public String toString() {
        return super.toString() +
                "giaTriPhanTramGiam=" + giaTriPhanTramGiam +
                ", mocTongTienApDung=" + mocTongTienApDung;
    }
}
