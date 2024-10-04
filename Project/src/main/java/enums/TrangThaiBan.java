package enums;

public enum TrangThaiBan {
    TRONG("Trống"),DANG_PHUC_VU("Đang phục vụ"),DA_DUOC_DAT("Đã được đặt");

    private final String trangThaiBan;

    public String getTrangThaiBan() {
        return trangThaiBan;
    }

    private TrangThaiBan(String trangThaiBan) {
        this.trangThaiBan = trangThaiBan;
    }
}
