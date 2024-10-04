package enums;

public enum TrangThaiPhucVu {
    NGHI_DAI_HAN("Nghỉ dài hạn"),NGHI_NGAN_HAN("Nghỉ ngắn hạn"),DANG_LAM_VIEC("Đang làm việc");
    private final String trangThaiPhucVu;

    private TrangThaiPhucVu(String trangThaiPhucVu) {
        this.trangThaiPhucVu = trangThaiPhucVu;
    }

    public String getTrangThaiPhucVu() {
        return trangThaiPhucVu;
    }


}
