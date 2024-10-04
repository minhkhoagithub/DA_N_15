package entity;

import java.time.LocalDate;

public class NguoiQuanLy extends NguoiDung{
    public NguoiQuanLy(String tenND, LocalDate ngaySinh, LocalDate ngayVaoLam, String soDienThoai, String diaChi) {
        super(tenND, ngaySinh, ngayVaoLam, soDienThoai, diaChi);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
