package entity;

public abstract class MonAn {
    private String maMon;
    private String tenMon;
    private double giaTien;
    
    private static int soThuTuMonAnPhu = 0;
    private static int soThuTuMonBuffet = 0;
    private static int soThuTuThucUong = 0;

    public MonAn(String maMon, String tenMon, double giaTien) {
        setMaMon(maMon);
        setTenMon(tenMon);
        setGiaTien(giaTien);
    }

    public MonAn(String tenMon, double giaTien) {
        this.maMon = taoMa();
        this.tenMon = tenMon;
        this.giaTien = giaTien;
    }

    public String taoMa() {
        String loaiMonAn = getClass().getSimpleName();
        String tienTo;
        int stt;

        switch (loaiMonAn) {
            case "MonAnPhu" -> {
                tienTo = "MP-";
                stt = ++soThuTuMonAnPhu;
            }
            case "MonBuffet" -> {
                tienTo = "MB-";
                stt = ++soThuTuMonBuffet;
            }
            case "ThucUong" -> {
                tienTo = "TU-";
                stt = ++soThuTuThucUong;
            }
            default -> throw new IllegalArgumentException("Món ăn không hợp lệ!");
        }

        return tienTo + String.format("%03d", stt);
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return String.format("%s {maMon='%s', tenMon='%s', giaTien=%.2f}", 
                getClass().getSimpleName(), maMon, tenMon, giaTien);
    }
}
