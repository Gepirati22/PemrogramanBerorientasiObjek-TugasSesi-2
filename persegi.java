public class persegi {
    private double sisi;

    public persegi(Double sisi) {
        this.sisi = sisi;
    }

    public void setSisi(Double sisi) {
        this.sisi = sisi;
    }

    public Double getLuas() {
        Double luas = sisi * sisi;
        return luas;
    }

    public Double getKeliling() {
        Double keliling = 4 * sisi;
        return keliling;
    }

}