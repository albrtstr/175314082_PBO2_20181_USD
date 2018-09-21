/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class AntrianPasien {
    private int tanggalAntrian;
    private int bulanAntri;
    private int tahunAntrian;
    private AntrianKlinik klinik;
    private Pasien daftarAntrianPasien[];
    
    public static ArrayList<AntrianPasien> daftarAntrian = new ArrayList <AntrianPasien>();
    
    public AntrianPasien(){
        
    }
    
    public AntrianPasien (int tanggalAntrian, int bulanAntri, int tahunAntri){
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntri = bulanAntri;
        this.tahunAntrian = tahunAntri;
    }

    public AntrianPasien(int i, int i0, int i1, AntrianKlinik klinik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public AntrianKlinik getKlinik() {
        return klinik;
    }

    public void setKlinik(AntrianKlinik klinik) {
        this.klinik = klinik;
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }
    
    

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntri() {
        return bulanAntri;
    }

    public void setBulanAntri(int bulanAntri) {
        this.bulanAntri = bulanAntri;
    }
    
    private static ArrayList<Pasien> daftarPasien = new ArrayList<>();
    
    public ArrayList<Pasien> daftarPasien(){
        return daftarPasien;
    }
    
    public void Mendaftar (Pasien pasien){
        daftarPasien.add(pasien);
    }
    
    public Pasien panggilPasien (int nomorPanggil){
        return daftarPasien.get(nomorPanggil);
    }
    
    public Pasien cariPasien (String noRM, int tanggal, int bulan, int tahun){
        return null;
    }
    
    public AntrianPasien cariPasien (String noRM){
        return null;
    }
    
    public static void buatAntrian (int tanggal, int bulan, int tahun, AntrianKlinik klinik){
        AntrianPasien antrian = new AntrianPasien();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntri(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        daftarAntrian.add(antrian);
        
    }
    
    public AntrianPasien cariAntrian (int tanggal, int bulan, int tahun, AntrianKlinik klinik){
        return null;
    }
    
}
