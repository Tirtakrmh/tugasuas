package tirta.belajar;

public class AksesBelajar1 {

    public static void main(String[] args) {

        Belajar1 belajar1 = new NilaiAkhir("PBO", 85, 75, 85); //ini adalah object dari class Belajar1

        belajar1.setNamaMatkul("PBO"); //ngisi atribut matkul diclass Belaja1

        System.out.println("ini object belajar1 dengan nama matkul : "+belajar1.getNamaMatkul()); //ambil isi atribut matkul diclass Belajar1

        Belajar1 belajar2 = new NilaiAkhir();

        belajar2.setNamaMatkul("WEB");

        System.out.println("ini object belajar2 dengan nama matkul : "+belajar2.getNamaMatkul());

        System.out.println("============================");
        NilaiAkhir tirta = new NilaiAkhir(); // ini object type class NilaiAkhir
        tirta.namaMatkul = "Statiska"; //ini mengisi atribut dari class NilaiAkhir yang sebenarnya atribut dari class Belajar1
        tirta.nilaiAbsen = 90; //ini mengisi atribut dari class NilaiAkhir yang sebenarnya atribut dari class Belajar1
        tirta.nilaiUts = 95; //ini mengisi atribut dari class NilaiAkhir yang sebenarnya atribut dari class Belajar1
        tirta.nilaiUas = 90; //ini mengisi atribut dari class NilaiAkhir yang sebenarnya atribut dari class Belajar1

//        kalao mau print method tidak mengembalikan nilai
//        tirta.menghitungNilaiAkhir();
//        System.out.println("Nilai Akhir tirta : "+tirta.getNilai());

//        kalo mau print method pengembalaian nilai
        System.out.println("Nilai Akhir tirta : "+ tirta.menghitungNilaiAkhir());



        AksesBelajar1 aksesBelajar1 = new AksesBelajar1();
//        memanggil contoh menthod tanpa ngembalikan nilai
        aksesBelajar1.menghitungTanpaMengembalikaNilai(5, 5);

//        memanggil contoh menthod ngembalikan nilai
        System.out.println(aksesBelajar1.menghitungMengembalikaNilai(5, 5));

//        memanggil contoh dari method overloading
        NilaiAkhir nilaiBUdi = new NilaiAkhir("matematika", 75, 80, 75);
        double nilaiAkhirBudi = nilaiBUdi.menghitungNilaiAkhir();
        System.out.println("nilai akhir budi adalah : "+nilaiAkhirBudi);
        String keterangan = nilaiBUdi.cekLulus(nilaiAkhirBudi);
        System.out.println("budi : "+keterangan);

        NilaiAkhir nilaiJoni = new NilaiAkhir();
        String ketJoni = nilaiJoni.cekLulus(75, 80, 80);
        System.out.println("Joni : "+ketJoni);

        NilaiAkhir nilaiAsep =new NilaiAkhir("ipa", 80, 75, 90);
        nilaiAsep.menghitungNilaiAkhir();
        String ketAsep = nilaiAsep.cekLulus();
        System.out.println("asep : "+ketAsep);

        Belajar1 belajarAbstract = new NilaiAkhir();
        belajarAbstract.methodAbstract();

        BelajarInterface belajarInterface = new BelajarInterfaceImpl();
        belajarInterface.rodaMobil(4);

    }

    public void menghitungTanpaMengembalikaNilai(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public int menghitungMengembalikaNilai(int a, int b){
        int c = a + b;
        return c;
    }

}
