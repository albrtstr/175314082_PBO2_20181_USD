/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.AntrianPasien;
import Model.AntrianPasien;
import Model.Klinik;

/**
 *
 * @author jarkom
 */
public class TestAntrianKlinik {
    public static void main(String[] args) {
        AntrianPasien.buatAntrian(
                21, 
                9, 
                2018, 
                new Klinik("001","anak"));
        
        AntrianPasien.buatAntrian(
                21, 
                9, 
                2018, 
                new Klinik("002","saraf"));
        
        AntrianPasien.buatAntrian(
                21, 
                9, 
                2018, 
                new Klinik("001","anak"));
        for (int i = 0; i < AntrianPasien.daftarAntrian.size(); i++) {
            System.out.println(AntrianPasien.
                    daftarAntrian.get(i));
        }
        
    }
}
