package model;

public class Suratkeluar {

    private String nomor;
    private String hal;
    private String tanggal_keluar;
    private String alamat;

    public Suratkeluar() {}

    public Suratkeluar(String nomor, String hal, String tanggal_keluar, String alamat) {
        this.nomor = nomor;
        this.hal = hal;
        this.tanggal_keluar = tanggal_keluar;
        this.alamat = alamat;
    }

    @Override
    public boolean equals(Object obj) {
        Suratkeluar sk = (Suratkeluar) obj;
        if(this.nomor.equals(sk.getNomor())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "[ " + nomor + ", " + hal + ", " + tanggal_keluar + ", " + alamat + " ];";
    }



    public void setNomor(String nomor) { this.nomor = nomor; }

    public String getNomor() { return nomor; }

    public void setHal(String hal) { this.hal = hal; }

    public String getHal() { return hal; }

    public void setTanggal_keluar(String tanggal_keluar) { this.tanggal_keluar = tanggal_keluar; }

    public String getTanggal_keluar() { return tanggal_keluar; }

    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getAlamat() { return alamat; }

}