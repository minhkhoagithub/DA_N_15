package entity;

import enums.TrangThaiKhuyenMai;

import java.time.LocalDate;

public class KhuyenMaiTrenMon extends KhuyenMai{
    private double giaTriTienGiam;

    public KhuyenMaiTrenMon(String noiDungKM, LocalDate thoiGianBD, LocalDate thoiGianKT, TrangThaiKhuyenMai trangThaiKhuyenMai, double giaTriTienGiam) {
        super(noiDungKM, thoiGianBD, thoiGianKT, trangThaiKhuyenMai);
        setGiaTriTienGiam(giaTriTienGiam);
    }
    
    public KhuyenMaiTrenMon(String maKM, String noiDungKM, LocalDate thoiGianBD, LocalDate thoiGianKT,
			TrangThaiKhuyenMai trangThaiKhuyenMai, double giaTriTienGiam) {
		super(maKM, noiDungKM, thoiGianBD, thoiGianKT, trangThaiKhuyenMai);
		this.giaTriTienGiam = giaTriTienGiam;
	}

	public double getGiaTriTienGiam() {
        return giaTriTienGiam;
    }

    public void setGiaTriTienGiam(double giaTriTienGiam) {
        this.giaTriTienGiam = giaTriTienGiam;
    }

//    public double apDung(double giaTien){
//
//    }

    @Override
    public String toString() {
        return super.toString() +
                "giaTriTienGiam=" + giaTriTienGiam;
    }
}
