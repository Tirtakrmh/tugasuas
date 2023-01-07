package tirta.tugasUas.no7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~ PROGRAM HITUNG LUAS & KELILING SEGITIGA, LUAS & VOLUME PRISMA ~~~");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Inputkan alas   : "); double alas = input.nextDouble();
        System.out.print("Inputkan Tinggi : "); double tinggi = input.nextDouble();
        System.out.print("Inputkan Sisi   : "); double sisi = input.nextDouble();
        Prisma hitung = new Prisma(tinggi, alas, sisi);
        System.out.println("\n~~~ HASIL LUAS & KELILING SEGITIGA ~~~");
        System.out.println("--------------------------------------");
        System.out.println("Luas : "+hitung.luas());
        System.out.println("Keliling : "+hitung.keliling());
        System.out.println("\n~~~ HASIL LUAS & VOLUME PERSEGI ~~~");
        System.out.println("--------------------------------------");
        System.out.println("Luas : "+hitung.luas());
        System.out.println("Volume : "+hitung.volume());
    }

}
