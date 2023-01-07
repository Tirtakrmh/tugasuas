package tirta.tugasUas.no8ke1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mahasiswa = null;
        System.out.println("1. Teknik Elektro\n" +
                "2. Teknik Informatika\n" +
                "3. Teknik Sipil\n");
        System.out.print("Mahasiswa Tersebut Prodi studi (1/2/3) : "); byte studi = input.nextByte();
        System.out.println("=============================================");
        if (studi == 1){
            mahasiswa = new MahasiswaTeknikElektro();
        } else if (studi == 2) {
            mahasiswa = new MahasiswaTeknikInformatika();
        } else if (studi == 3) {
            mahasiswa = new MahasiswaTeknikSipil();
        }
        System.out.print("Input kan nama mahasiswa : "); mahasiswa.nama = input.next();
        System.out.print("Input kan npm mahasiswa : "); mahasiswa.npm = input.next();
        System.out.print("Input kan ipk : "); mahasiswa.ipk = input.nextDouble();
        System.out.print("Apakah Mahasiswa tersebut sudah menyelesaikan Skripsi (0.Tidak/1.YA) : ");
        mahasiswa.predikat(mahasiswa.cekSkripsi(input.nextByte()));
        mahasiswa.tampil();

    }
}
