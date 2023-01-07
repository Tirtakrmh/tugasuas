package tirta.tugasUas.no8ke1;

public abstract class Mahasiswa {

    protected String nama;
    protected String npm;
    protected double ipk;
    protected String predikat;

    public abstract String predikat(boolean skripsi);
    public abstract boolean cekSkripsi(byte skripsi);
    public abstract void tampil();

}
