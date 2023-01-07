package tirta.latihan.soalno2;

public class Penggajian{

    private static final int gajiPerjam = 25_000;
    private int jamKerja;
    private int jamLembur;
    private int absen;
    private double totalGaji;

    public Penggajian(int jamKerja, int jamLembur, int absen) {
        this.jamKerja = jamKerja;
        this.jamLembur = jamLembur;
        this.absen = absen;
        hitungGaji();
    }

    public double hitungGaji(){
        double gajiPerjamLembur = (gajiPerjam*0.20)+gajiPerjam;
        if (this.jamLembur != 0){
            return this.totalGaji = jamKerja*gajiPerjam + jamLembur*(gajiPerjamLembur);
        }
        if (this.absen != 0){
            return this.totalGaji = jamKerja*gajiPerjam + jamLembur*(gajiPerjamLembur) - (absen*100_000);
        }
        return this.totalGaji = jamKerja*gajiPerjam;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getJamLembur() {
        return jamLembur;
    }

    public void setJamLembur(int jamLembur) {
        this.jamLembur = jamLembur;
    }

    public int getAbsen() {
        return absen;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(double totalGaji) {
        this.totalGaji = totalGaji;
    }
}
