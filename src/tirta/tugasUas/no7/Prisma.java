package tirta.tugasUas.no7;

public class Prisma extends Segitiga{

    public Prisma(double tinggi, double alas, double sisi) {
        super(tinggi, alas, sisi);
    }

    public Prisma(double tinggi) {
        super(tinggi);
    }

    public Prisma() {
    }

    public double volume(){
        return super.luas()*tinggi;
    }

}
