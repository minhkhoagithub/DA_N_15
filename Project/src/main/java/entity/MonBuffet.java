package entity;

public class MonBuffet extends MonAn{

    public MonBuffet(String tenMon, double giaTien) {
        super(tenMon, giaTien);
    }

	public MonBuffet(String maMon, String tenMon, double giaTien) {
		super(maMon, tenMon, giaTien);
	}

	@Override
	public String toString() {
		return "MonBuffet [" + super.toString()+"]";
	}
}
