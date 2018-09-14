/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author ASUS
 */
public class Dokter {
    private String noPegawai;
    private String nama;
    private String alamat;
    private String tmptLahir;
    private int tnggalLahir;
    private int bulanLahir;
    private int thLahir;

    public Dokter() {

    }

    public Dokter(String noPegawai, String nama, String alamat, String tmptLahir, int tnggalLahir, int bulanLahir, int thLahir) {
        this.noPegawai = noPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.tmptLahir = tmptLahir;
        this.tnggalLahir = tnggalLahir;
        this.bulanLahir = bulanLahir;
        this.thLahir = thLahir;
    }

    public String getNoPegawai() throws Exception {
        return noPegawai + nama.substring(0, 3);
    }

    public void setNoPegawai(String noPegawai) throws Exception {
        if (noPegawai.length() == 5) {
            this.noPegawai = noPegawai;
        } else {
            throw new Exception("Salah Tanggal");
        }

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTmptLahir() {
        return tmptLahir;
    }

    public void setTmptLahir(String tmptLahir) {
        this.tmptLahir = tmptLahir;
    }

    public int getTnggalLahir() {
        return tnggalLahir;
    }

    public void setTnggalLahir(int tnggalLahir) throws Exception {
        if (tnggalLahir > 0) {
            if (tnggalLahir <= 31) {
                this.tnggalLahir = tnggalLahir;
            } else {
                throw new Exception("Tanggal Salah");
            }
        } else {
            throw new Exception("Salah Tanggal");
        }

    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("Salah Bulan");
            }

        } else {
            throw new Exception("Salah Bulan");
        }

    }

    public int getThLahir() {
        return thLahir;
    }

    public void setThLahir(int thLahir) throws Exception {
        if (thLahir > 0) {
            this.thLahir = thLahir;
        } else {
            throw new Exception("Salah Bulan");
        }

    }
}
