package enums;

public enum LoaiThe {
    DONG("Đồng"),BAC("Bạc"),VANG("Vàng");

    private final String loaiThe;

    LoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }

    public String getLoaiThe() {
        return loaiThe;
    }
}
