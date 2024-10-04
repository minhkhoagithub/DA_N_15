package entity;

import enums.TrangThaiThanhToan;

import java.time.LocalDate;

public class HoaDon {
    private String maHoaDon;
    private LocalDate ngayXuat;
    private String ghiChu;
    private TrangThaiThanhToan trangThaiThanhToan;
    private double tongTien;
    private double tienPhaiTra;
    private String maKM;
    private String maNV;
    private String maKH;

    public HoaDon(String maHoaDon, LocalDate ngayXuat, String ghiChu, TrangThaiThanhToan trangThaiThanhToan, double tongTien, double tienPhaiTra, String maKM, String maNV, String maKH) {
        this.maHoaDon = maHoaDon;
        this.ngayXuat = ngayXuat;
        this.ghiChu = ghiChu;
        this.trangThaiThanhToan = trangThaiThanhToan;
        this.tongTien = tongTien;
        this.tienPhaiTra = tienPhaiTra;
        this.maKM = maKM;
        this.maNV = maNV;
        this.maKH = maKH;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalDate getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(LocalDate ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public TrangThaiThanhToan getTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(TrangThaiThanhToan trangThaiThanhToan) {
        this.trangThaiThanhToan = trangThaiThanhToan;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getTienPhaiTra() {
        return tienPhaiTra;
    }

    public void setTienPhaiTra(double tienPhaiTra) {
        this.tienPhaiTra = tienPhaiTra;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", ngayXuat=" + ngayXuat +
                ", ghiChu='" + ghiChu + '\'' +
                ", trangThaiThanhToan=" + trangThaiThanhToan +
                ", tongTien=" + tongTien +
                ", tienPhaiTra=" + tienPhaiTra +
                ", maKM='" + maKM + '\'' +
                ", maNV='" + maNV + '\'' +
                ", maKH='" + maKH + '\'' +
                '}';
    }
}
