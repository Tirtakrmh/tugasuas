package tirta.tugasUas.no2;

public class Customer {

    private String nama;
    private String alamat;
    private String noIdentitas;

    public Customer() {
    }

    public Customer(String nama, String alamat, String noIdentitas) {
        this.nama = nama;
        this.alamat = alamat;
        this.noIdentitas = noIdentitas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }

    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }
}
