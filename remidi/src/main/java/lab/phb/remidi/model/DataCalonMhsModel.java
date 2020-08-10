package lab.phb.remidi.model;

import lombok.Data;

@Data
public class DataCalonMhsModel {

    private String nis;
    private String nama;
    private String asal_Sekolah;
    private String TTL;
    private String alamat;
    private String nama_Ortu;
    private String agama;
    private String no_hp;

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsalSekolah() { return asal_Sekolah; }

    public void setAsalSekolah(String asalSekolah) { this.asal_Sekolah = asalSekolah; }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }
//
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaOrtu() {
        return nama_Ortu;
    }

    public void setNamaOrtu(String namaOrtu) {
        this.nama_Ortu = namaOrtu;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }
}