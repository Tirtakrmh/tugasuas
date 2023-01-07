package tirta.tugasUas.no6;

public abstract class Resto {

    private String toping,ukuran,nama,pinggiran;
    private int biaya;

    public String getToping() {
        return toping;
    }

    public void setToping(String toping) {
        this.toping = toping;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPinggiran() {
        return pinggiran;
    }

    public void setPinggiran(String pinggiran) {
        this.pinggiran = pinggiran;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public abstract void toping();
    public abstract void ukuran();
    public abstract void pinggiran();
    public abstract void cetakData(String nama);
    public abstract void cetaTotal();

}
