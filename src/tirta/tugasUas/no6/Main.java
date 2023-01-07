package tirta.tugasUas.no6;

import java.util.Scanner;

public class Main extends Pizza{
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        int toping = 0, pinggiran = 0, ukuran = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("           PIZZA MOTARU");
        System.out.println("    Terkenal Sejak Tahun 1988");
        System.out.println("=================================");

        System.out.println("Input data pesnan");
        System.out.print("Nama pemesan : "); String nama = input.next();

        pizza.toping();

        if (pilToping == 1 || pilToping == 2){
            toping = 84000;
        } else if (pilToping == 3) {
            toping = 74000;
        } else {
            System.out.println("Pilihan anda tidak ada!");
            System.exit(0);
        }

        pizza.pinggiran();

        if (pilPinggran == 1){
            pinggiran = 0;
        } else if (pilPinggran == 2 || pilPinggran == 3) {
            pinggiran = 22000;
        } else if (pilPinggran == 4) {
            pinggiran = 32000;
        } else {
            System.out.println("Pilihan anda tidak ada!");
            System.exit(0);
        }

        pizza.ukuran();

        if (pilUkuran == 1){
            ukuran = 0;
        } else if (pilUkuran == 2) {
            ukuran = 40000;
        } else {
            System.out.println("Pilihan anda tidak ada!");
            System.exit(0);
        }

        pizza.cetakData(nama);

        pizza.setBiaya(toping+pinggiran+ukuran);
        pizza.cetaTotal();

    }
}
