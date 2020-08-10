package lab.phb.remidi.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_mhs")
@Data
public class DataCalonMhs {

    @Id @Column(name = "nis")
    private String nis;
    @Column(name = "nama")
    private String nama;
    @Column(name = "asal_Sekolah")
    private String asal_Sekolah;
    @Column(name = "TTL")
    private String TTL;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "nama_Ortu")
    private String nama_Ortu;
    @Column(name = "agama")
    private String agama;
    @Column(name = "no_hp")
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