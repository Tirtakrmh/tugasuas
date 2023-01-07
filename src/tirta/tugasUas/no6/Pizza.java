package tirta.tugasUas.no6;

import java.util.Scanner;

public class Pizza extends Resto{

    Scanner input = new Scanner(System.in);
    static int pilToping, pilUkuran, pilPinggran;

    @Override
    public void toping() {
        System.out.println("Daftar Toping/Rasa Pizza");
        System.out.println("1. Meat Lovers (Rp. 84000)\n" +
                "2. Super Supreme (Rp. 84000)\n" +
                "3. American Favurite (Rp. 74000)");
        System.out.print("Toping Pilihan Anda + "); pilToping = input.nextInt();
    }

    @Override
    public void pinggiran() {
        System.out.println("Daftar Pinggiran Pizza");
        System.out.println("1. Original crust (+Rp. 0)\n" +
                "2. Stuffed Crust (+Rp. 22,000)\n" +
                "3. Sausage Crust (+rp. 22,000)\n" +
                "4. Cheesy Bites (+Rp. 32,000)");
        System.out.print("Pinggran Pilahan Anda = "); pilUkuran = input.nextInt();
    }

    @Override
    public void ukuran() {
        System.out.println("Daftar Ukuran Pizza");
        System.out.println("1. Reguler 8slices (+Rp. 0)\n" +
                "2. Jumbo 10slices (+Rp. 40,000)");
        System.out.print("Ukuran Pilihan Anda = "); pilPinggran = input.nextInt();

    }

    @Override
    public void cetakData(String nama) {
        super.setNama(nama);
        System.out.println("========  Data Pesanan  ========");
        System.out.println("Nama Pemesan = "+nama);
        System.out.println("Pizza yang dipesan = "+super.getToping()+"/"+super.getPinggiran()+"/"+super.getUkuran());
    }

    @Override
    public void cetaTotal() {
        System.out.println("Total Biaya = Rp. "+super.getBiaya());
        System.out.println("=================================");
    }
}
