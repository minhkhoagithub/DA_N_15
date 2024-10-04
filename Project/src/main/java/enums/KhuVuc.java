package enums;

public enum KhuVuc {
    LAU1("Lầu 1"),TRET_PHONG1("Trệt phòng 1"),TRET_PHONG2("Trệt phòng 2"),TRET_PHONG3("Trệt phòng 3");

    private final String khuVuc;

    public String getKhuVuc() {
        return khuVuc;
    }

    KhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }
}
