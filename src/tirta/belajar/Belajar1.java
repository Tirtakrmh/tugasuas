package tirta.belajar;

public abstract class Belajar1 {

//1. Encapsulation
//2. Inheritanc
//3. Abstrac
//4. Polymophism

    protected String namaMatkul;
    protected int nilaiUts;
    protected int nilaiUas;
    protected int nilaiAbsen;

    //ini adalah constructor
    public Belajar1(String namaMatkul, int nilaiUts, int nilaiUas, int nilaiAbsen){
        this.namaMatkul = namaMatkul;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        this.nilaiAbsen = nilaiAbsen;
    }

    //ini adalah constructor overloading
    public Belajar1(){
    }

    //ini contoh method untuk memanggil atribut namaMatkul
    public String getNamaMatkul(){
        return this.namaMatkul;
    }

    //ini contoh method untuk mengisi nilai atribut namaMatkul
    public void setNamaMatkul(String namaMatkul){
        this.namaMatkul = namaMatkul;
    }

    public int getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUts(int nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public int getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUas(int nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public int getNilaiAbsen() {
        return nilaiAbsen;
    }

    public void setNilaiAbsen(int nilaiAbsen) {
        this.nilaiAbsen = nilaiAbsen;
    }

    public abstract void methodAbstract();

//    class testInlineClass{
//        Belajar1 belajar1 = new Belajar1();
//
//        public void method() {
//            belajar1.namaMatkul;
//
//        }
//    }

}

//class testPrivate {
//    Belajar1 belajar1 = new Belajar1();
//
//    public void method(){
//        String namaMatkul = belajar1.namaMatkul;
//    }
//
//}

