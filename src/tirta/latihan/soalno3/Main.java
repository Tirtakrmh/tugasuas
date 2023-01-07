package tirta.latihan.soalno3;

import tirta.latihan.soalno2.Penggajian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("            PROGRAM HOTEL");
        System.out.println("===========================================");
        System.out.println("~~~ DAFTAR ROOM ~~~");
        System.out.println("1. STANDAR ROOM\n" +
                            "2. SUPERIOR ROOM\n" +
                            "3. DELUXE ROOM\n" +
                            "4. SUITE ROOM");
        System.out.println("===========================================");
        System.out.println("~~~ INPUT DATA TRANSAKSI ~~~");
        System.out.print("Nama Pengunjung : "); String nama = input.next();
        System.out.print("Tipe Kamar      : "); int tipe = input.nextInt();
        System.out.print("Lama Menginap   : "); int lama = input.nextInt();
        Pengunjung pengunjung = new Pengunjung(nama, tipe, lama);
        System.out.println("===========================================");
        System.out.println("~~~ TRANSAKSI ~~~");
        System.out.println("Harga Kamar   : "+pengunjung.getHargaKamar());
        System.out.println("Total Tagihan : "+pengunjung.getTotalBayar());
        System.out.print("Dibayar       :"); int bayar = input.nextInt();
        double kembalian = bayar - pengunjung.getTotalBayar();
        System.out.println("Kembalian     :"+kembalian);
        System.out.println("===========================================");

    }
}
