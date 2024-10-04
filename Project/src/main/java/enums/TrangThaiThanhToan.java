package enums;

public enum TrangThaiThanhToan {
    DA_THANH_TOAN("Đã thanh toán"),CHUA_THANH_TOAN("Chưa thanh toán");

    private final String trangThaiThanhToan;

    TrangThaiThanhToan(String trangThaiThanhToan) {
        this.trangThaiThanhToan = trangThaiThanhToan;
    }

    public String getTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }
}
