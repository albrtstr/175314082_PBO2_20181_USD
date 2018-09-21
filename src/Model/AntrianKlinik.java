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
public class AntrianKlinik {
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }


    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }


    public AntrianKlinik (int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik){
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.klinik = klinik;
    }
    
    public AntrianKlinik(){
        
    }

    public static ArrayList<AntrianKlinik> getDaftarAntrian() {
        return daftarAntrian;
    }

    public static void setDaftarAntrian(ArrayList<AntrianKlinik> daftarAntrian) {
        AntrianKlinik.daftarAntrian = daftarAntrian;
    }

    public static ArrayList<Pasien> getDaftarPasienAntri() {
        return daftarPasienAntri;
    }

    public static void setDaftarPasienAntri(ArrayList<Pasien> daftarPasienAntri) {
        AntrianKlinik.daftarPasienAntri = daftarPasienAntri;
    }
    
    
    
    public static ArrayList<AntrianKlinik> daftarAntrian = new ArrayList <AntrianKlinik>();
    
    public static ArrayList <Pasien> daftarPasienAntri = new ArrayList<Pasien>();
    
    @Override
    public String toString(){
        return String.valueOf(tahunAntrian)+
                String.valueOf(bulanAntrian)+
                String.valueOf(tanggalAntrian)+
                klinik.getIdKlinik()+
                klinik.getNama();
    }
    
    public static int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getTanggalAntrian() == tanggal
                    && daftarAntrian.get(i).getBulanAntrian() == bulan
                    && daftarAntrian.get(i).getTahunAntrian() == tahun
                    && daftarAntrian.get(i).getKlinik().getNama().equalsIgnoreCase(klinik.getNama())
                    && daftarAntrian.get(i).getKlinik().getNama().equalsIgnoreCase(klinik.getIdKlinik())) {
                return i;
                
            }
        }
        return -1;
    }
    
    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        if (cariAntrian(tanggal, bulan, tahun, klinik) < 0) {
            daftarAntrian.add(antrian);
        } else {
            System.out.println("antrian sudah ada");
        }
               
    }
    
 
        
    
    //public AntrianKlinik(String string, String anak) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
    
}
