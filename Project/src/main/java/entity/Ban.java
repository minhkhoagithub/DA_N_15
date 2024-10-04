package entity;

import enums.KhuVuc;
import enums.TrangThaiBan;
import enums.TrangThaiDatBan;

import java.sql.Time;

public class Ban {
    private String maBan;
    private String tenBan;
    private KhuVuc khuVuc;
    private TrangThaiBan trangThaiBan;
    private TrangThaiDatBan trangThaiDatBan;
    private Time thoiGianBatDauPhucVu;
    private Time thoiGianKetThucPhucVu;
    private Time thoiGianNgungGoiMon;

    public Ban(String maBan, String tenBan, KhuVuc khuVuc, TrangThaiBan trangThaiBan, TrangThaiDatBan trangThaiDatBan, Time thoiGianBatDauPhucVu, Time thoiGianKetThucPhucVu, Time thoiGianNgungGoiMon) {
        this.maBan = maBan;
        this.tenBan = tenBan;
        this.khuVuc = khuVuc;
        this.trangThaiBan = trangThaiBan;
        this.trangThaiDatBan = trangThaiDatBan;
        this.thoiGianBatDauPhucVu = thoiGianBatDauPhucVu;
        this.thoiGianKetThucPhucVu = thoiGianKetThucPhucVu;
        this.thoiGianNgungGoiMon = thoiGianNgungGoiMon;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public KhuVuc getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(KhuVuc khuVuc) {
        this.khuVuc = khuVuc;
    }

    public TrangThaiBan getTrangThaiBan() {
        return trangThaiBan;
    }

    public void setTrangThaiBan(TrangThaiBan trangThaiBan) {
        this.trangThaiBan = trangThaiBan;
    }

    public TrangThaiDatBan getTrangThaiDatBan() {
        return trangThaiDatBan;
    }

    public void setTrangThaiDatBan(TrangThaiDatBan trangThaiDatBan) {
        this.trangThaiDatBan = trangThaiDatBan;
    }

    public Time getThoiGianBatDauPhucVu() {
        return thoiGianBatDauPhucVu;
    }

    public void setThoiGianBatDauPhucVu(Time thoiGianBatDauPhucVu) {
        this.thoiGianBatDauPhucVu = thoiGianBatDauPhucVu;
    }

    public Time getThoiGianKetThucPhucVu() {
        return thoiGianKetThucPhucVu;
    }

    public void setThoiGianKetThucPhucVu(Time thoiGianKetThucPhucVu) {
        this.thoiGianKetThucPhucVu = thoiGianKetThucPhucVu;
    }

    public Time getThoiGianNgungGoiMon() {
        return thoiGianNgungGoiMon;
    }

    public void setThoiGianNgungGoiMon(Time thoiGianNgungGoiMon) {
        this.thoiGianNgungGoiMon = thoiGianNgungGoiMon;
    }

    @Override
    public String toString() {
        return "Ban{" +
                "maBan='" + maBan + '\'' +
                ", tenBan='" + tenBan + '\'' +
                ", khuVuc=" + khuVuc +
                ", trangThaiBan=" + trangThaiBan +
                ", trangThaiDatBan=" + trangThaiDatBan +
                ", thoiGianBatDauPhucVu=" + thoiGianBatDauPhucVu +
                ", thoiGianKetThucPhucVu=" + thoiGianKetThucPhucVu +
                ", thoiGianNgungGoiMon=" + thoiGianNgungGoiMon +
                '}';
    }
}
