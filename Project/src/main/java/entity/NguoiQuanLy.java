package entity;

import java.time.LocalDate;

public class NguoiQuanLy extends NguoiDung{
    public NguoiQuanLy(String tenND, LocalDate ngaySinh, LocalDate ngayVaoLam, String soDienThoai, String diaChi) {
        super(tenND, ngaySinh, ngayVaoLam, soDienThoai, diaChi);
    }

    
    
    public NguoiQuanLy(String maND, String tenND, LocalDate ngaySinh, LocalDate ngayVaoLam, String soDienThoai, String diaChi) {
		super(maND, tenND, ngaySinh, ngayVaoLam, soDienThoai, diaChi);
	}

	@Override
    public String toString() {
        return super.toString();
    }
}
