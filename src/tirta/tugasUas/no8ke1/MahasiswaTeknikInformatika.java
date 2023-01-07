package tirta.tugasUas.no8ke1;

public class MahasiswaTeknikInformatika extends Mahasiswa{

    private static final String gelar = "S.Kom";

    public String getGelar(){
        return gelar;
    }

    @Override
    public boolean cekSkripsi(byte skripsi){
        if(skripsi == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String predikat(boolean skripsi){
        String ket;
        if (!skripsi){
            super.predikat = "Tidak Ada";
            return "Harus Selesaikan Skripsi";

        }else{
            if (super.ipk > 3.50){
                ket = "Sangat Memuaskan";
            } else if (super.ipk > 2.76) {
                ket = "Memuaskan";
            } else if (super.ipk > 2.00) {
                ket = "Baik";
            }else {
                ket = "Kurang";
            }
            super.predikat = ket;
            return ket;
        }

    }

    @Override
    public String toString() {
        return "Nama     : "+super.nama+", "+gelar+"\n" +
                "NPM      : "+super.npm+"\n" +
                "Jurusan  : Teknik Elektro \n" +
                "IPK      : "+super.ipk+"\n" +
                "Predikat : "+super.predikat;
    }

    @Override
    public void tampil(){
        System.out.println("--- Hasil Akhir Data Mahasiswa ---");
        System.out.println(toString());
    }

}
