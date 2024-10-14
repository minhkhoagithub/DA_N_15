package entity;

public class ThucUong extends MonAn{
    public ThucUong(String tenMon, double giaTien) {
        super(tenMon, giaTien);
    }

	public ThucUong(String maMon, String tenMon, double giaTien) {
		super(maMon, tenMon, giaTien);
	}
}
