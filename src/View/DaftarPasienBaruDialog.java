/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class DaftarPasienBaruDialog extends JDialog implements ActionListener{
    private JLabel nama;
    private JLabel alamat;
    private JLabel NoRM;
    private JTextField textNama;
    private JTextField textAlamat;
    private JTextField textNoRM;
    private JButton saveButton; 
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem tambahPasien;
    private JLabel namaLabel;
    private JButton tambahButton;
    private JRadioButton lakiButton;
    private JRadioButton perempuanButton;
    private ButtonGroup bg;
    private JLabel jenisKlamin;
    private JLabel tanggalLahirLabel;
    private JLabel bulanLahirLabel;
    private JLabel tahunLahirLabel;
    private JComboBox tanggalComBox;
    private JComboBox bulanComBox;
    private JComboBox tahunComBox;
    private final String tanggalArray[]= {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10", 
                                          "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
                                          "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private final String bulanArray[]  = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    private final String tahunArray[]  = {"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979",
                                          "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", 
                                          "1990", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
                                          "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", 
                                          "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", 
                                          "2015", "2016", "2017", "2018"};
    
    public DaftarPasienBaruDialog(){
        this.setTitle("Form Tambah Pasien");
        init();
    }
    
    public void init(){
        this.setLayout(null);
        
        NoRM = new JLabel ("NIK ");
        NoRM.setBounds(10, 10, 150, 25);
        this.add(NoRM);
        
        nama = new JLabel ("Nama ");
        nama.setBounds(10, 50, 150, 25);
        this.add(nama);
        
        alamat = new JLabel ("Alamat ");
        alamat.setBounds(10, 90, 150, 25);
        this.add(alamat);
        
        jenisKlamin = new JLabel ("Jenis Kelamin");
        jenisKlamin.setBounds(10, 140, 160, 25);
        this.add(jenisKlamin);
        
        textNoRM = new JTextField ();
        textNoRM.setBounds(60, 10, 200, 25);
        this.add(textNoRM);
        
        textNama = new JTextField();
        textNama.setBounds(60, 50, 200, 25);
        this.add(textNama);
        
        textAlamat = new JTextField();
        textAlamat.setBounds(60, 90, 200, 25);
        this.add(textAlamat);
        
        
        
        lakiButton = new JRadioButton ("Laki-Laki");
        lakiButton.setActionCommand("Laki-Laki"); 
        lakiButton.addActionListener(this);
        lakiButton.setBounds(100, 140, 90, 25);
        
        perempuanButton = new JRadioButton ("Perempuan");
        perempuanButton.setActionCommand("Perempuan");
        perempuanButton.addActionListener(this);
        perempuanButton.setBounds (100, 160, 100, 25);
        
        bg = new ButtonGroup();
        bg.add(lakiButton);
        bg.add(perempuanButton);
        this.setSize(100, 200);
        this.add(lakiButton);
        this.add(perempuanButton);
        
        tanggalLahirLabel = new JLabel ("Tanggal");
        tanggalLahirLabel.setBounds(10, 200, 150, 25);
        this.add(tanggalLahirLabel);
        
        bulanLahirLabel = new JLabel ("Bulan");
        bulanLahirLabel.setBounds(120, 200, 150, 25);
        this.add(bulanLahirLabel);
        
        tahunLahirLabel = new JLabel ("Tahun");
        tahunLahirLabel.setBounds(220, 200, 150, 25);
        this.add(tahunLahirLabel);
        
        tanggalComBox = new JComboBox (tanggalArray);
        tanggalComBox.setBounds(65, 200, 40, 25);
        this.add(tanggalComBox);
        
        bulanComBox = new JComboBox (bulanArray);
        bulanComBox.setBounds(165, 200, 40, 25);
        this.add(bulanComBox);
        
        tahunComBox = new JComboBox (tahunArray);
        tahunComBox.setBounds(265, 200, 75, 25);
        this.add(tahunComBox);
        
        saveButton = new JButton ("Simpan");
        saveButton.setBounds(140, 250, 100, 30);
        this.add(saveButton);
        
        menuBar = new JMenuBar();
        this.setTitle("Form Tambah Pasien ");
        fileMenu = new JMenu ("File");
        exitMenuItem = new JMenuItem ("Exit");
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        
        exitMenuItem.addActionListener((ActionListener) this);
        saveButton.addActionListener(this);
        
        this.setJMenuBar(menuBar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == saveButton) {
            Pasien baru = new Pasien();
            baru.setNama(textNama.getText());
            baru.setNoRekamMedis(textNoRM.getText());
            baru.setAlamat(textAlamat.getText());
            Pasien.tambahPasienBaru(baru);
            JOptionPane.showMessageDialog(null, textNama.getText()+ " Anda Terdaftar");
            this.dispose();
        }
        
    }
    
    
}
