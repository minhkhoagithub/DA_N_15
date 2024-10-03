package entity;

import enums.TrangThaiKhuyenMai;

import java.time.LocalDate;

public class KhuyenMai {
    private String maKM;
    private String noiDungKM;
    LocalDate thoiGianBD;
    LocalDate thoiGianKT;
    TrangThaiKhuyenMai trangThaiKhuyenMai;
    private static int soThuTuKMTheoMon = 0;
    private static int soThuTuKMTrenHoaDon = 0;
    private static int soThuTuKMTrenGoiBuffet = 0;

    public KhuyenMai(String noiDungKM, LocalDate thoiGianBD, LocalDate thoiGianKT, TrangThaiKhuyenMai trangThaiKhuyenMai, String loaiKhuyenMai) {
        this.noiDungKM = noiDungKM;
        this.thoiGianBD = thoiGianBD;
        this.thoiGianKT = thoiGianKT;
        this.trangThaiKhuyenMai = trangThaiKhuyenMai;
        this.maKM = generateMaKM(loaiKhuyenMai);
    }

    private String generateMaKM(String loaiKhuyenMai) {
        int soThuTu;
        String prefix;

        switch (loaiKhuyenMai) {
            case "MON":
                prefix = "KMMA-";
                soThuTu = ++soThuTuKMTheoMon;
                break;
            case "HOA_DON":
                prefix = "KMHD-";
                soThuTu = ++soThuTuKMTrenHoaDon;
                break;
            case "BUFFET":
                prefix = "KMBF-";
                soThuTu = ++soThuTuKMTrenGoiBuffet;
                break;
            default:
                throw new IllegalArgumentException("Loại khuyến mãi không hợp lệ");
        }

        return prefix + String.format("%03d", soThuTu);
    }

    public String getMaKM() {
        return maKM;
    }

    public String getNoiDungKM() {
        return noiDungKM;
    }

    public void setNoiDungKM(String noiDungKM) {
        this.noiDungKM = noiDungKM;
    }

    public LocalDate getThoiGianBD() {
        return thoiGianBD;
    }

    public void setThoiGianBD(LocalDate thoiGianBD) {
        this.thoiGianBD = thoiGianBD;
    }

    public LocalDate getThoiGianKT() {
        return thoiGianKT;
    }

    public void setThoiGianKT(LocalDate thoiGianKT) {
        this.thoiGianKT = thoiGianKT;
    }

    public TrangThaiKhuyenMai getTrangThaiKhuyenMai() {
        return trangThaiKhuyenMai;
    }

    public void setTrangThaiKhuyenMai(TrangThaiKhuyenMai trangThaiKhuyenMai) {
        this.trangThaiKhuyenMai = trangThaiKhuyenMai;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" +
                "maKM='" + maKM + '\'' +
                ", noiDungKM='" + noiDungKM + '\'' +
                ", thoiGianBD=" + thoiGianBD +
                ", thoiGianKT=" + thoiGianKT +
                ", trangThaiKhuyenMai=" + trangThaiKhuyenMai +
                '}';
    }
}

