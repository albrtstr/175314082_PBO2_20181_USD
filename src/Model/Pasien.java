/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Test.TestStreaming1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Serializable berfungsi untuk mengubah atribut dari sebuah obyek
 * menjadi byte stream .
 */
public class Pasien implements Serializable {

    private String noRekamMedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String nik;
    public static ArrayList<Pasien> daftarPasien = new ArrayList<>();

    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String noRM) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.tahunLahir = tahunLahir;
        this.noRekamMedis = noRM;
    }

    public Pasien(String nik) {
        this.nik = nik;
    }

    public Pasien() {

    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRM) {
        this.noRekamMedis = noRM;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;

    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public static void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        Pasien.daftarPasien = daftarPasien;
    }

    public static Pasien cariPasien(String noRM) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (noRM == null ? daftarPasien.get(i).getNoRekamMedis() == null : noRM.equals(daftarPasien.get(i).getNoRekamMedis())) {
                return daftarPasien.get(i);
            }
        }
        return null;
    }

    public static void simpanDaftarPasien(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void bacaDaftarPasien(File file) throws IOException {
        FileInputStream fis = null;
        try {
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            boolean isNoRM = false;
            boolean isNama = false;
            boolean isAlamat = false;
            Pasien temp = new Pasien();
            while ((dataInt = fis.read()) != -1) {
                if (dataInt != '\n') {
                    if (dataInt != '\t' && isNoRM == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if (dataInt == '\t' && isNoRM == false) {
                        isNoRM = true;
                        temp.setNoRekamMedis(hasilBaca);
                        hasilBaca = "";
                    } else if (dataInt != '\t' && isNoRM == true && isNama == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if (dataInt == '\t' && isNoRM == true && isNama == false) {
                        isNama = true;
                        temp.setNama(hasilBaca);
                        hasilBaca = "";
                    } else if (dataInt != '\t' && isNoRM == true && isNama == true && isAlamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    }
                } else {

                    temp.setAlamat(hasilBaca);
                    isAlamat = true;
                    hasilBaca = "";
                    tambahPasienBaru(temp);
                    isNoRM = false;
                    isNama = false;
                    isAlamat = false;
                    temp = new Pasien();

                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestStreaming1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestStreaming1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(TestStreaming1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public String toString() {
        return noRekamMedis + "\t" + nama + "\t" + alamat + "\n";
    }

}
