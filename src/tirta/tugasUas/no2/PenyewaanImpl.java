package tirta.tugasUas.no2;

public class PenyewaanImpl implements Penyewaan{

    private short jumlahHari;
    private double totalSewa;

    public short getJumlahHari() {
        return jumlahHari;
    }

    public void setJumlahHari(short jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    public double getTotalSewa() {
        return totalSewa;
    }

    public void setTotalSewa(double totalSewa) {
        this.totalSewa = totalSewa;
    }

    @Override
    public double hitung(short jumlahHari, double harga) {
        this.totalSewa = jumlahHari * harga;
        return this.totalSewa;
    }

    @Override
    public double hitung(short jumlahHari, double harga, float diskon){
        double temp = (jumlahHari * harga) * diskon;
        this.totalSewa = (jumlahHari * harga) - temp;
        return this.totalSewa;
    }
}
