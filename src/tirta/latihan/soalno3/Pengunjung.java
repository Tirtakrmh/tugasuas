package tirta.latihan.soalno3;

public class Pengunjung {

    private String namaPengunjung;
    private int tipeKamar;
    private double hargaKamar;
    private int lamaNginap;
    private double totalBayar;

    public Pengunjung() {
    }

    public Pengunjung(String namaPengunjung, int tipeKamar, int lamaNginap) {
        this.namaPengunjung = namaPengunjung;
        this.tipeKamar = tipeKamar;
        this.lamaNginap = lamaNginap;
        Hotel hotel = new Hotel();
        this.totalBayar = hotel.hitungBiayaNginap(tipeKamar, lamaNginap);
        this.hargaKamar = totalBayar/lamaNginap;
    }

    public String getNamaPengunjung() {
        return namaPengunjung;
    }

    public void setNamaPengunjung(String namaPengunjung) {
        this.namaPengunjung = namaPengunjung;
    }

    public int getTipeKamar() {
        return tipeKamar;
    }

    public void setTipeKamar(int tipeKamar) {
        this.tipeKamar = tipeKamar;
    }

    public double getHargaKamar() {
        return hargaKamar;
    }

    public void setHargaKamar(double hargaKamar) {
        this.hargaKamar = hargaKamar;
    }

    public int getLamaNginap() {
        return lamaNginap;
    }

    public void setLamaNginap(int lamaNginap) {
        this.lamaNginap = lamaNginap;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }
}
