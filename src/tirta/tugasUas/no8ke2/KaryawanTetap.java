package tirta.tugasUas.no8ke2;

public class KaryawanTetap {

    protected String namaPeminjam;
    protected String nikPeminjam;
    protected double bungaPinjaman;
    protected double kewajiban;
    protected double totalPinjaman;
    protected static final double bungaPersen = 0.025;
    private static final int golA = 100_000_000;
    private static final int golB = 75_000_000;
    private static final int golC = 50_000_000;

    public KaryawanTetap(String namaPeminjam, String nikPeminjam) {
        this.namaPeminjam = namaPeminjam;
        this.nikPeminjam = nikPeminjam;
    }

    public int hitung(byte golongan, byte bulan){
        if (golongan == 1){
            bungaPinjaman = golA*bungaPersen;
            totalPinjaman = golA+bungaPinjaman;
            kewajiban = totalPinjaman/bulan;
            return golA;
        } else if (golongan == 2) {
            bungaPinjaman = golB*bungaPersen;
            totalPinjaman = golB+bungaPinjaman;
            kewajiban = totalPinjaman/bulan;
            return golB;
        }else if (golongan == 3) {
            bungaPinjaman = golC*bungaPersen;
            totalPinjaman = golB+bungaPinjaman;
            kewajiban = totalPinjaman/bulan;
            return golC;
        }else {
            System.out.println("Golongan tidak ada!!!");
            System.exit(1);
            return 0;
        }
    }

    public void tampilkan(byte golongan, byte bulan){
        System.out.println("Nama Peminjam "+ namaPeminjam);
        System.out.println("NIK Peminjam "+ nikPeminjam);
        System.out.println("Pinjaman Rp. "+ hitung(golongan, bulan));
        System.out.println("Bunga Pinjaman Rp. "+ bungaPinjaman);
        System.out.printf("Total Pinjaman Rp. %2f\n", totalPinjaman);
        System.out.println("Kewajiban pembayaran tiap bulan Rp. "+kewajiban+" selama "+bulan);
    }


}
