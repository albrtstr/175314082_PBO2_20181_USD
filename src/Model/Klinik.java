/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jarkom
 */
public class Klinik {
    private String idKlinik;
    private String nama;

    public static ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public static void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        Klinik.daftarKlinik = daftarKlinik;
    }
    
    
    public Klinik(){
        
    }
    
    public Klinik (String idKlinik, String namaKlinik){
        this.idKlinik = idKlinik;
        this.nama = namaKlinik;
    }

    public String getIdKlinik() {
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public static ArrayList<Klinik> daftarKlinik = new ArrayList <Klinik>();
    
    public static void tambahKlinik (Klinik klinik){
        daftarKlinik.add(klinik);
    }
    
    public static Klinik cariKlinik (String namaKlinik){
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNama().equalsIgnoreCase(namaKlinik)) {
                return daftarKlinik.get(i);
            }
        }
        return null;
    }
    
}
