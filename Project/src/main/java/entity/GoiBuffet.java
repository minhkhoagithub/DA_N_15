package entity;

public class GoiBuffet {
    private String maGoi;
    private String tenGoi;
    private double giaTien;

    public GoiBuffet(String maGoi, String tenGoi, double giaTien) {
    	setMaGoi(maGoi);
    	setTenGoi(tenGoi);
    	setGiaTien(giaTien);
    }

    public String getMaGoi() {
        return maGoi;
    }

    public void setMaGoi(String maGoi) {
        this.maGoi = maGoi;
    }

    public String getTenGoi() {
        return tenGoi;
    }

    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        if(giaTien < 0){
            throw new IllegalArgumentException("Giá tiền phải lớn hơn 0");
        }else{
            this.giaTien = giaTien;
        }
    }

    @Override
    public String toString() {
        return "GoiBuffet{" +
                "maGoi='" + maGoi + '\'' +
                ", tenGoi='" + tenGoi + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }
}
