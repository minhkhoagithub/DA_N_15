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

    public KhuyenMai(String noiDungKM, LocalDate thoiGianBD, LocalDate thoiGianKT, TrangThaiKhuyenMai trangThaiKhuyenMai) {
        this.noiDungKM = noiDungKM;
        this.thoiGianBD = thoiGianBD;
        this.thoiGianKT = thoiGianKT;
        this.trangThaiKhuyenMai = trangThaiKhuyenMai;
        this.maKM = generateMaKM();
    }

    private String generateMaKM() {
        int soThuTu;
        String loaiKhuyenMai = getClass().getSimpleName();
        String prefix;

        soThuTu = switch (loaiKhuyenMai) {
            case "KhuyenMaiTrenMon" -> {
                prefix = "KMMA-";
                yield ++soThuTuKMTheoMon;
            }
            case "KhuyenMaiHoaDon" -> {
                prefix = "KMHD-";
                yield ++soThuTuKMTrenHoaDon;
            }
            case "KhuyenMaiTrenGoiBuffet" -> {
                prefix = "KMBF-";
                yield ++soThuTuKMTrenGoiBuffet;
            }
            default -> throw new IllegalArgumentException("Loại khuyến mãi không hợp lệ");
        };

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

    public void setThoiGianKT(LocalDate thoiGianKT) throws IllegalArgumentException {
        if (thoiGianKT.isBefore(thoiGianBD)) {
            throw new IllegalArgumentException("Thời gian kết thúc phải sau thời gian bắt đầu");
        }
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
        return getClass().getSimpleName() +
                "maKM='" + maKM + '\'' +
                ", noiDungKM='" + noiDungKM + '\'' +
                ", thoiGianBD=" + thoiGianBD +
                ", thoiGianKT=" + thoiGianKT +
                ", trangThaiKhuyenMai=" + trangThaiKhuyenMai +
                '\'';
    }
}

