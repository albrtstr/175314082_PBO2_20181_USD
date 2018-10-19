/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.Pasien;
import java.io.File;

/**
 *
 * @author jarkom
 */
public class TestStream2 {
    public static void main(String[] args) {
        Pasien test = new Pasien();
        test.setNama("puspa");
        test.setAlamat("klaten");
        
        Pasien test1 = new Pasien();
        test.setNama("adi");
        test.setAlamat("klaten");
        
        System.out.println(test.toString());
        System.out.println(test1.toString());
        
        Pasien.tambahPasienBaru(test);
        Pasien.tambahPasienBaru(test1);
        
        Pasien.simpanDaftarPasien(new File("daftar.txt"));
    }
}
