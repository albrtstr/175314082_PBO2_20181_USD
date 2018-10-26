/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.AntrianKlinik;
import Model.Pasien;

/**
 *
 * @author ASUS
 */
public class TestKelasPasien {

    public static void main(String[] args) {
        AntrianKlinik antri = new AntrianKlinik();
        try {
            Pasien test = new Pasien(
                    "Bayu", // nama pasien
                    "Jalan Paingan", // alamat
                    "Tanjung Pinang", // tempat lahir
                    04, // tanggal lahir
                    11, // bulan lahir
                    1999, // tahun lahir
                    "19991104" // NIK
            );

            Pasien test1 = new Pasien(
                    "Albertus", // nama pasien
                    "Jalan Paingan 2", // alamat
                    "Batam", // tempat lahir
                    04, // tanggal lahir
                    11, // bulan lahir
                    1999, // tahun lahir
                    "19991105" // NIK
            );

            Pasien.tambahPasienBaru(test);
            Pasien.tambahPasienBaru(test1);

            for (int i = 0; i < Pasien.daftarPasien.size(); i++) {
                System.out.println("Nama : " + Pasien.daftarPasien.get(i).getNama());
            }

            Pasien cari = Pasien.cariPasien("19991105");
            System.out.println(cari.getNama());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
