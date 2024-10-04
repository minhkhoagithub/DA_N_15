package entity;

public class MonAn {
    private String maMon;
    private String tenMon;
    private double giaTien;

    public MonAn(String maMon, String tenMon, double giaTien) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.giaTien = giaTien;
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
        return getClass().toString() +
                "maMon='" + maMon + '\'' +
                ", tenMon='" + tenMon + '\'' +
                ", giaTien=" + giaTien;
    }
}
