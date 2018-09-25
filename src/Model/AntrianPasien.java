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
    private Klinik klinik;
    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();
    
    
    public static ArrayList<AntrianPasien> daftarAntrian = new ArrayList <AntrianPasien>();
    
    
    public AntrianPasien(){
        
    }
    
    public AntrianPasien (int tanggalAntrian, int bulanAntri, int tahunAntri, Klinik klinik){
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntri = bulanAntri;
        this.tahunAntrian = tahunAntri;
        this.klinik = klinik;
    }


    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
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

    public ArrayList<Pasien> getDaftarPasienAntri() {
        return daftarPasienAntri;
    }

    public void setDaftarPasienAntri(ArrayList<Pasien> daftarPasienAntri) {
        this.daftarPasienAntri = daftarPasienAntri;
    }
    
    
//    public ArrayList<Pasien> daftarPasien(){
//        return daftarPasien;
//    }
    
    public static void daftarPasien (Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik){
        if (cariAntrian(tanggal, bulan, tahun, klinik) >= 0) {
            daftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        }
        else {
            buatAntrian(tanggal, bulan, tahun, klinik);
            daftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        }
    }
    
    public void Mendaftar (Pasien pasien){
        daftarPasienAntri.add(pasien);
    }
    
    public Pasien panggilPasien (int nomorPanggil){
        return daftarPasienAntri.get(nomorPanggil);
    }
    
    
    public AntrianPasien cariPasien (String noRM){
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (noRM.equals(daftarPasienAntri.get(i).getNoRekamMedis())) {
                return daftarAntrian.get(i);
            }
        }
        return null;
    }
    
    public static void buatAntrian (int tanggal, int bulan, int tahun, Klinik klinik){
        AntrianPasien antrian = new AntrianPasien();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntri(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        
        if (cariAntrian(tanggal, bulan, tahun, klinik) < 0) {
            daftarAntrian.add(antrian);
        } else {
            System.out.println("Antrian Sudah Terpakai");
        }
        
    }
    
    public static int cariAntrian (int tanggal, int bulan, int tahun, Klinik klinik){
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getTanggalAntrian() == tanggal
                    && daftarAntrian.get(i).getBulanAntri() == bulan
                    && daftarAntrian.get(i).getBulanAntri() == tahun
                    && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())
                    && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getNama())) {
                return 1;
            }
        }
        return -1;
    }
    
    @Override
    public String toString(){
        return String.valueOf(tahunAntrian) + String.valueOf(bulanAntri) + String.valueOf(tanggalAntrian) + klinik.getIdKlinik() + klinik.getNama();
    }
    
}
