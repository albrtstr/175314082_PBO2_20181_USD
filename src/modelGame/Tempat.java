/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelGame;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author basisa02
 */
public class Tempat {
    private int tinggi;
    private int lebar;
    private ArrayList<Sel> isiTempat = new ArrayList<>();
    private String isi;
    public static int batasKanan;
    public static int batasBawah;
    
    public void bacaKonfigurasiFile(File file){
        
    }
    
    public void addSel(Sel sel){
        isiTempat.add(sel);
    }
    
    public Tempat(){
        isiTempat = new ArrayList<Sel>();
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public ArrayList<Sel> getIsiTempat() {
        return isiTempat;
    }

    public void setIsiTempat(ArrayList<Sel> isiTempat) {
        this.isiTempat = isiTempat;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public Object getDaftarSel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

