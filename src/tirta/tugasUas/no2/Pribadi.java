package tirta.tugasUas.no2;

public class Pribadi extends Mobil {

    private String merek;
    private double harga;

    public Pribadi(){
    }

    public Pribadi(String merek, double harga) {
        this.merek = merek;
        this.harga = harga;
    }

    public Pribadi(int jumlahBan, String warna, String bahanBakar, String merek, double harga) {
        super(jumlahBan, warna, bahanBakar);
        this.merek = merek;
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
