package entity;

public class TaiKhoan {
    private String tenDangNhap;
    private String matKhau;

    public TaiKhoan(String tenDangNhap, String matKhau) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) throws IllegalArgumentException {
        if (matKhau.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,16}$")) {
            this.matKhau = matKhau;
        } else {
            throw new IllegalArgumentException("Mật khẩu không hợp lệ. Mật khẩu phải chứa từ 8 đến 16 ký tự, bao gồm chữ cái và số.");
        }
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "tenDangNhap='" + tenDangNhap + '\'' +
                ", matKhau='" + matKhau + '\'' +
                '}';
    }
}

