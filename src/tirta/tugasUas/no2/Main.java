package tirta.tugasUas.no2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ini data mobile yang tersedia
        Pribadi avanza = new Pribadi(4, "Biru", "Pertamax", "Avanza" ,700_000);
        Pribadi xenia = new Pribadi(4, "Hitam", "Pertamax", "Xenia" ,800_000);
        Pribadi kijang = new Pribadi(4, "Hijau", "Disel", "Kijang" ,1_000_000);
        Pribadi[] mobilAvailable = {avanza, xenia, kijang};

//      inputan
        Scanner input = new Scanner(System.in);

//      program
        System.out.println("~~~         SELAMAT DATANG DI PENYEWAAN MOBIL TIRTA     ~~~");
        System.out.println("===========================================================\n");
        System.out.println("Daftar Mobile yang tersedia   : ");
        for (int i = 0; i < mobilAvailable.length; i++) {
            Pribadi mobil = mobilAvailable[i];
            System.out.println(i+1+". "+mobil.getMerek()+", harga sewa perhari Rp. "+mobil.getHarga());
        }
        System.out.println("\nInput kan data yang dibutuhkan dibawah : ");
        System.out.println("------------------------------------------------------------");
        Customer customer = new Customer();
        System.out.print("Nama cutomer                              : "); customer.setNama(input.next());
        System.out.print("Alamat cutomer                            : "); customer.setAlamat(input.next());
        System.out.print("No Identitas cutomer                      : "); customer.setNoIdentitas(input.next());
        System.out.print("Kendaran Di Sewa (masukan nomor saja)     : "); short pilihan = input.nextShort();
        System.out.print("Berapa lama akan menyewa                  : "); short hari = input.nextShort();
        System.out.print("Masukan diskon jika ada contoh(0.1 = 10%) : "); float diskon = input.nextFloat();

        PenyewaanImpl penyewaan = new PenyewaanImpl();
        double hargaMobile = 0;

        if (pilihan == 1){
            hargaMobile = mobilAvailable[0].getHarga();
        }else if (pilihan == 2){
            hargaMobile = mobilAvailable[1].getHarga();
        } else if (pilihan == 3) {
            hargaMobile = mobilAvailable[2].getHarga();
        } else {
            System.out.println("Maaf pilihan anda tidak ada!!");
            System.exit(1);
        }

        if (diskon != 0){
            penyewaan.hitung(hari, hargaMobile);
        }else {
            penyewaan.hitung(hari, hargaMobile, diskon);
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("total harga untuk menyewa Rp. "+penyewaan.getTotalSewa());
    }
}
