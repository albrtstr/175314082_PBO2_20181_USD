/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orclTest;

import orclModel_RS.Dokter;
import orclModel_RS.RumahSakit;

/**
 *
 * @author user only
 */
public class TestRumahSakit2 {
    public static void main(String[] args) {
        RumahSakit rs = new RumahSakit("Panti Rapih", "Yogyakarta");
        rs.bacaDataDokter();
        for (int i = 0; i < rs.getDaftarDokter().size(); i++) {
            Dokter temp = rs.getDaftarDokter().get(i);
            System.out.println(temp.toString());
        }
    }
   
}
