package tirta.tugasUas.no7;

public class Segitiga {

    protected double tinggi;
    private double alas;
    private double sisi;

    public double luas(){
        return 0.5*alas*tinggi;
    }

    public double keliling(){
        return sisi*sisi*sisi;
    }

    public Segitiga(double tinggi, double alas, double sisi) {
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisi = sisi;
    }

    public Segitiga(double tinggi) {
        this.tinggi = tinggi;
    }

    public Segitiga() {
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
