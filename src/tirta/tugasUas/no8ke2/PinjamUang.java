package tirta.tugasUas.no8ke2;

import java.util.Scanner;

public class PinjamUang {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new PinjamUang().menuControl();

    }

    void menuControl(){
        System.out.println("~~~ Koperasi Pinjam Karyawan ~~~");
        System.out.println("================================");
        System.out.print("Input nama karyawan : "); String nama = input.next();
        System.out.print("Input NIK karyawan : "); String nik = input.next();
        System.out.print("Input Status karyawan : "); byte status = input.nextByte();
        KaryawanTetap karyawan = null;
        if (status == 1){
            karyawan = new KaryawanTetap(nama, nik);
        }else if (status == 2){
            karyawan = new KaryawanHonorer(nama, nik);
        }else {
            System.out.println("Status karywan tidak ada!!");
            System.exit(1);
        }
        System.out.print("Input Golongan karyawan : "); byte golongan = input.nextByte();
        System.out.print("Input Berapa lama meminjam (bulan) : "); byte bulan = input.nextByte();
        karyawan.tampilkan(golongan, bulan);

    }
}
