package entity;

public class MonThuocGoi {
    private String maGoiBuffet;
    private String maMonBuffet;

    public MonThuocGoi(String maMonBuffet, String maGoiBuffet) {
        this.maMonBuffet = maMonBuffet;
        this.maGoiBuffet = maGoiBuffet;
    }

    public String getMaGoiBuffet() {
        return maGoiBuffet;
    }

    public void setMaGoiBuffet(String maGoiBuffet) {
        this.maGoiBuffet = maGoiBuffet;
    }

    public String getMaMonBuffet() {
        return maMonBuffet;
    }

    public void setMaMonBuffet(String maMonBuffet) {
        this.maMonBuffet = maMonBuffet;
    }

    @Override
    public String toString() {
        return "MonThuocGoi{" +
                "maGoiBuffet='" + maGoiBuffet + '\'' +
                ", maMonBuffet='" + maMonBuffet + '\'' +
                '}';
    }
}
