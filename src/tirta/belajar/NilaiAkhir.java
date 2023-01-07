package tirta.belajar;

public class NilaiAkhir extends Belajar1{

    private double nilai;

    public NilaiAkhir(){

    }

    @Override
    public void methodAbstract() {
        System.out.println("ini adalah method abstract");
    }

    public NilaiAkhir(String namaMatkul, int nilaiUts, int nilaiUas, int nilaiAbsen){
        super.namaMatkul = namaMatkul;
        super.nilaiUts = nilaiUts;
        super.nilaiUas = nilaiUas;
        super.nilaiAbsen = nilaiAbsen;
    }
//    ini method void tidak mengembalikan nilai
//    public void menghitungNilaiAkhir(){
//        this.nilai = ((super.nilaiUts*.30) + (super.nilaiUas*0.60) + (super.nilaiAbsen*0.10));
//    }

//    ini method dengan mengembalikan nilai
    public double menghitungNilaiAkhir(){
        return this.nilai = ((super.nilaiUts*.30) + (super.nilaiUas*0.60) + (super.nilaiAbsen*0.10));
    }

//    ini method pertama

    public String cekLulus(){
        if (this.nilai >= 75){
            return "lulus";
        }else {
            return "tidak lulus";
        }
    }

    public String cekLulus(double nilaiakhir){
        String keterangan;
        if (nilaiakhir >= 75){
            keterangan = "lulus";
        }else {
            keterangan = "tidak lulus";
        }
        return keterangan;
    }

//    ini method overloading
    public String cekLulus(int nilaiUts, int nilaiUas, int nilaiAbsen){
        String keterangan;
        double nilaiakhir = nilaiUts*0.40 + nilaiUas*0.60;
        if (nilaiakhir >= 75 && nilaiAbsen >= 80){
            keterangan = "lulus";
        }else {
            keterangan = "tidak lulus";
        }
        return keterangan;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}
