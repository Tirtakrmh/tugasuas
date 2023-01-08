package tirta.tugasUas.no6;

import java.util.Scanner;

public class Main extends Pizza{
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        int toping = 0, pinggiran = 0, ukuran = 0;
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("=================================");
        System.out.println("           PIZZA MOTARU");
        System.out.println("    Terkenal Sejak Tahun 1988");
        System.out.println("=================================");

        System.out.println("Input data pesnan");
        System.out.print("Nama pemesan : "); String nama = input.next();

        pizza.toping();
        pizza.pinggiran();
        pizza.ukuran();
        pizza.cetakData(nama);
        pizza.cetaTotal();

    }
}
