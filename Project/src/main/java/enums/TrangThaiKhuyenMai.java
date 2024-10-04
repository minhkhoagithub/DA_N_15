package enums;

public enum TrangThaiKhuyenMai {
    SAP_TRIEN_KHAI("Sắp triển khai"),DANG_TRIEN_KHAI("Đang triển khai"),DA_KET_THUC("Đã kết thúc");
    private final String trangThaiKhuyenMai;

    private TrangThaiKhuyenMai(String trangThaiKhuyenMai) {

        this.trangThaiKhuyenMai = trangThaiKhuyenMai;
    }

    public String getTrangThaiKhuyenMai() {
        return trangThaiKhuyenMai;
    }
}
