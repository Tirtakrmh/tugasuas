package tirta.latihan.soalno2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=======================================================");
        System.out.println("    PROGRAM PENGGAJIAN KARYAWAN");
        System.out.println("=======================================================");
        System.out.println("~~~INPUT DETAIL KARYAWAN~~~");
        Karyawan karyawan = new Karyawan();
        System.out.print("Inputkan nama Karyawan            : "); karyawan.setNama(input.next());
        System.out.print("Inputkan alamat Karyawan          : "); karyawan.setAlamat(input.next());
        System.out.print("Inputkan tanggal lahir Karyawan   : "); karyawan.setTglLahir(input.next());
        System.out.print("Inputkan NIP Karyawan             : "); String nip = (input.next());
        karyawan.setNIP(Integer.parseInt(nip));
        System.out.print("Inputkan no telpon Karyawan       : "); String no = (input.next());
        karyawan.setNoTelp(Integer.parseInt(no));
        System.out.print("Inputkan department Karyawan      : "); karyawan.setDepartment(input.next());
        System.out.println("=======================================================");
        System.out.println("~~~INPUT DETAIL JAM KERJA(dalam bulan) KARYAWAN~~~");
        System.out.print("Inputkan Jam Kerja              : "); String jmKerja = input.next();
        int jamKerja = Integer.parseInt(jmKerja);
        System.out.print("Inputkan Jam Lembur             : "); String jmlembur = input.next();
        int jamLembur = Integer.parseInt(jmlembur);
        System.out.print("Inputkan Absen/Tidak Masuk      : "); String absn = input.next();
        int absen = Integer.parseInt(absn);
        Penggajian penggajian = new Penggajian(jamKerja, jamLembur, absen);
        System.out.println("=======================================================");
        System.out.println("~~~ Detail Karyawan ~~~");
        karyawan.tampilDeatilKaryawan();
        System.out.println("=======================================================");
        System.out.println("~~~ Detail Gaji Karyawan ~~~");
        penggajian.hitungGaji();
        karyawan.tampilDetailGaji(penggajian);
    }
}
