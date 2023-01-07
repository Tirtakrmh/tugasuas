package tirta.latihan.soalno2;

public class Karyawan {

    private String nama;
    private String alamat;
    private int noTelp;
    private int NIP;
    private String tglLahir;
    private String department;
    private double gaji;

    public void tampilDeatilKaryawan(){
        System.out.println("nama           \t\t:"+this.nama);
        System.out.println("alamat         \t\t:"+this.alamat);
        System.out.println("tanggal lahir  \t\t:"+this.tglLahir);
        System.out.println("nomor telpon   \t\t:"+this.noTelp);
        System.out.println("NIP            \t\t:"+this.NIP);
        System.out.println("department     \t\t:"+this.department);
    }

    public void tampilDetailGaji(Penggajian penggajian){
        System.out.println("jam kerja      \t\t:"+penggajian.getJamKerja());
        System.out.println("jam lembur     \t\t:"+penggajian.getJamLembur());
        System.out.println("absen          \t\t:"+penggajian.getAbsen());
        System.out.println("gaji di terima \t\t:"+penggajian.getTotalGaji());
        this.gaji = penggajian.getTotalGaji();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
