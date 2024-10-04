package entity;

import enums.LoaiThe;

public class TheKhachHang {
    private String maThe;
    private LoaiThe loaiThe;
    private int soDiem;

    public TheKhachHang(String maThe, LoaiThe loaiThe, int soDiem) {
        this.maThe = maThe;
        this.loaiThe = loaiThe;
        this.soDiem = soDiem;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public LoaiThe getLoaiThe() {
        return loaiThe;
    }

    public void setLoaiThe(LoaiThe loaiThe) {
        this.loaiThe = loaiThe;
    }

    public int getSoDiem() {
        return soDiem;
    }

    public void setSoDiem(int soDiem) {
        this.soDiem = soDiem;
    }

    @Override
    public String toString() {
        return "TheKhachHang{" +
                "maThe='" + maThe + '\'' +
                ", loaiThe=" + loaiThe +
                ", soDiem=" + soDiem +
                '}';
    }
}
