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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jarkom
 */
public class RumahSakit implements Serializable {

    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    private ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
    private ArrayList<AntrianKlinik> daftarAntrianKlinik = new ArrayList<AntrianKlinik>();
    private String nama;
    private String alamat;

    public RumahSakit() {

    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public Pasien cariPasien(String noRM) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (noRM == null ? daftarPasien.get(i).getNoRekamMedis() == null : noRM.equals(daftarPasien.get(i).getNoRekamMedis())) {
                return daftarPasien.get(i);
            }
        }
        return null;
    }

    public void tambahPasienBaru(Pasien test) {
        daftarPasien.add(test);
    }

    public void simpanDaftarPasien(File file) {
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

    public void bacaDaftarPasien(File file) throws IOException {
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

    public void simpanObjekRumahSakit(File file) throws IOException {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(this);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void bacaObjekRumahSakit(File file) throws IOException {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            RumahSakit rs = (RumahSakit) ois.readObject();
            this.nama = rs.nama;
            this.alamat = rs.alamat;
            this.daftarPasien = rs.daftarPasien;
            this.daftarKlinik = rs.daftarKlinik;
            this.daftarAntrianKlinik = rs.daftarAntrianKlinik;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        Pasien.daftarPasien = daftarPasien;
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

    public void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public Klinik cariKlinik(String namaKlinik) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNama().equalsIgnoreCase(namaKlinik)) {
                return daftarKlinik.get(i);
            }
        }
        return null;
    }

    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntri(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);

        if (cariAntrian(tanggal, bulan, tahun, klinik) < 0) {
            daftarAntrianKlinik.add(antrian);
        } else {
            System.out.println("Antrian Sudah Terpakai");
        }

    }

    public int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < daftarAntrianKlinik.size(); i++) {
            if (daftarAntrianKlinik.get(i).getTanggalAntrian() == tanggal
                    && daftarAntrianKlinik.get(i).getBulanAntri() == bulan
                    && daftarAntrianKlinik.get(i).getBulanAntri() == tahun
                    && daftarAntrianKlinik.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())
                    && daftarAntrianKlinik.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getNama())) {
                return 1;
            }
        }
        return -1;
    }

    public void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {
        if (cariAntrian(tanggal, bulan, tahun, klinik) >= 0) {
            daftarAntrianKlinik.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
            daftarAntrianKlinik.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        }
    }

    public ArrayList<AntrianKlinik> getDaftarAntrianKlinik() {
        return daftarAntrianKlinik;
    }

    public ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        Klinik.daftarKlinik = daftarKlinik;
    }
}
