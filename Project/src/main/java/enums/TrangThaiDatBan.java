package enums;

public enum TrangThaiDatBan {
    CHUA_DAT_TRUOC("Chưa đặt trước"),DA_DAT_TRUOC("Đã đặt trước");

    private final String trangThaiDatBan;

    public String getTrangThaiDatBan() {
        return trangThaiDatBan;
    }

    TrangThaiDatBan(String trangThaiDatBan) {
        this.trangThaiDatBan = trangThaiDatBan;
    }
}
