package tirta.tugasUas.no2;

public class Mobil {

    private int jumlahBan;
    private String warna;
    private String bahanBakar;

    public Mobil() {
    }

    public Mobil(int jumlahBan, String warna, String bahanBakar) {
        this.jumlahBan = jumlahBan;
        this.warna = warna;
        this.bahanBakar = bahanBakar;
    }

    public int getJumlahBan() {
        return jumlahBan;
    }

    public void setJumlahBan(int jumlahBan) {
        this.jumlahBan = jumlahBan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
}
