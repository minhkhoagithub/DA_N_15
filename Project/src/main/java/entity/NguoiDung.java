package entity;

import java.time.LocalDate;

public abstract class NguoiDung {
    private String maND;
    private String tenND;
    private LocalDate ngaySinh;
    private LocalDate ngayVaoLam;
    private String soDienThoai;
    private String diaChi;
    private static int soThuTu = 0;

    public NguoiDung(String tenND, LocalDate ngaySinh, LocalDate ngayVaoLam, String soDienThoai, String diaChi) {
        setTenND(tenND);
        setNgaySinh(ngaySinh);
        setNgayVaoLam(ngayVaoLam);
        setSoDienThoai(soDienThoai);
        setDiaChi(diaChi);
        setDiaChi(diaChi);
    }

    public NguoiDung(String maND, String tenND, LocalDate ngaySinh, LocalDate ngayVaoLam, String soDienThoai,
			String diaChi) {
		super();
		this.maND = maND;
		this.tenND = tenND;
		this.ngaySinh = ngaySinh;
		this.ngayVaoLam = ngayVaoLam;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}

	private String generateMaND(LocalDate ngayVaoLam) {
        soThuTu++;
        String year = String.valueOf(ngayVaoLam.getYear()).substring(2);
        String month = String.format("%02d", ngayVaoLam.getMonthValue());
        String order = String.format("%03d", soThuTu);
        return year + month + order;
    }

    public String getMaND() {
        return maND;
    }

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) throws IllegalArgumentException {
        if (tenND == null || tenND.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên người dùng không được rỗng");
        }
        this.tenND = tenND;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
        this.maND = generateMaND(ngayVaoLam); // Cập nhật mã người dùng khi thay đổi ngày vào làm
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) throws IllegalArgumentException {
        if (soDienThoai.matches("^0[0-9]{9}$")) {
            this.soDienThoai = soDienThoai;
        } else {
            throw new IllegalArgumentException("Số điện thoại không hợp lệ");
        }
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + '\'' +
                "maND='" + maND + '\'' +
                ", tenND='" + tenND + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", ngayVaoLam=" + ngayVaoLam +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", diaChi='" + diaChi + '\'';
    }
}
