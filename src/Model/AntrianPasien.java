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
    
    public AntrianPasien(){
        
    }
    
    public AntrianPasien (int tanggalAntrian, int bulanAntri){
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntri = bulanAntri;
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
    
    public ArrayList<Pasien> getList(){
        return daftarPasien;
    }
    
    public void Mendaftar (Pasien pasien){
        daftarPasien.add(pasien);
    }
    
    public Pasien panggilPasien (int nomorPanggil){
        return daftarPasien.get(nomorPanggil);
    }
}
