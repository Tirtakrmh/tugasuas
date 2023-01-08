package tirta.tugasUas.no6;

import java.util.Scanner;

public class Pizza extends Resto{

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    static int pilToping, pilUkuran, pilPinggran;
    int toping = 0, pinggiran = 0, ukuran = 0;

    @Override
    public void toping() {
        System.out.println("Daftar Toping/Rasa Pizza");
        System.out.println("1. Meat Lovers (Rp. 84000)\n" +
                "2. Super Supreme (Rp. 84000)\n" +
                "3. American Favurite (Rp. 74000)");
        System.out.print("Toping Pilihan Anda = "); pilToping = input.nextInt();
        if (pilToping == 1){
            super.setToping("Meat Lovers");
            toping = 84000;
        } else if (pilToping == 2) {
            super.setToping("Super Supreme");
            toping = 84000;
        } else if (pilToping == 3) {
            super.setToping("American Favurite");
            toping = 74000;
        }else {
            System.out.println("Pilihan anda tidak ada!");
            System.exit(0);
        }
    }

    @Override
    public void pinggiran() {
        System.out.println("Daftar Pinggiran Pizza");
        System.out.println("1. Original crust (+Rp. 0)\n" +
                "2. Stuffed Crust (+Rp. 22,000)\n" +
                "3. Sausage Crust (+rp. 22,000)\n" +
                "4. Cheesy Bites (+Rp. 32,000)");
        System.out.print("Pinggran Pilahan Anda = "); pilPinggran = input.nextInt();
        if (pilPinggran == 1){
            super.setPinggiran("Original crust");
            pinggiran = 0;
        } else if (pilPinggran == 2) {
            super.setPinggiran("Stuffed Crust");
            pinggiran = 22000;
        } else if (pilPinggran == 3) {
            super.setPinggiran("Sausage Crust");
            pinggiran = 22000;
        } else if (pilPinggran == 4) {
            super.setPinggiran("Cheesy Bites");
            pinggiran = 32000;
        }else {
            System.out.println("Pilihan anda tidak ada!");
            System.exit(0);
        }
    }

    @Override
    public void ukuran() {
        System.out.println("Daftar Ukuran Pizza");
        System.out.println("1. Reguler 8slices (+Rp. 0)\n" +
                "2. Jumbo 10slices (+Rp. 40,000)");
        System.out.print("Ukuran Pilihan Anda = "); pilUkuran = input.nextInt();
        if (pilUkuran == 1){
            super.setUkuran("Reguler 8slices");
            ukuran = 0;
        } else if (pilUkuran == 2) {
            super.setUkuran("Jumbo 10slices");
            ukuran = 40000;
        } else {
            System.out.println("Pilihan anda tidak ada!");
            System.exit(0);
        }
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
        super.setBiaya(toping+pinggiran+ukuran);
        System.out.println("Total Biaya = Rp. "+super.getBiaya());
        System.out.println("=================================");
    }
}
