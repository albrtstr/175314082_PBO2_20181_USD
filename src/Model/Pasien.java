/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Pasien {
    private String noRekamMedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String nik;
    //Pasien daftarPasienKlinik[];

    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.tahunLahir = tahunLahir;
        this.nik = nik;
    }

    public Pasien() {
         //To change body of generated methods, choose Tools | Templates.
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String tahunLahir) throws Exception {
        if (tahunLahir.length() >= 6) {
            this.noRekamMedis = tahunLahir;
        } else {
            throw new Exception("Salah Tanggal");
        }

    }

    public String BuatRekamMedis() {
        String noRekamMedis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        noRekamMedis = ft.format(date) + nama.substring(0, 3);
        return noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("Tanggal Salah");
            }
        } else {
            throw new Exception("Tanggal Salah");
        }

    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("Salah Bulan");
            }
        } else {
            throw new Exception("Bulan Salah");
        }

    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("Salah Tahun");
        }

    }

    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<>();
    
    public static void tambahPasienBaru(Pasien pasien) {

    }

    public static Pasien cariPasien(String noRM) {
        
        return null;
    }
}
