package enums;

public enum CaLam {
    CA_1("Ca 1"),CA_2("Ca 2");
    private final String caLam;

    private CaLam(String caLam){
        this.caLam=caLam;
    }

    public String getCaLam() {
        return caLam;
    }
}
