package entity;

public class MonAnPhu extends MonAn{

    public MonAnPhu(String tenMon, double giaTien) {
        super(tenMon, giaTien);
    }

	public MonAnPhu(String maMon, String tenMon, double giaTien) {
		super(maMon, tenMon, giaTien);
	}

	@Override
	public String toString() {
		return "MonAnPhu ["+super.toString()+"]";
	}
}
