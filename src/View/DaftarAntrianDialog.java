/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
/**
 *
 * @author ASUS
 */
public class DaftarAntrianDialog extends JDialog implements ActionListener{
    private JLabel NoRM;
    private JLabel nama;
    private JLabel alamat;
    private JTextField TextNoRM;
    private JTextField TextNama;
    private JTextField TextAlamat;
    private JButton saveButton;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem tambahPasienMenuItem;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton tambahButton;
    private JTextField alamatText;
    
    public static void main(String[] args) {
        DaftarAntrianDialog test = new DaftarAntrianDialog();
        test.setSize(400, 250);
        test.setVisible(true);
    }
    
    public DaftarAntrianDialog(){
        this.setSize(300, 500);
        this.setTitle("Daftar Antrian Pasien");
        Init();
        //init1();
    }
    
    public void Init(){
        this.setLayout(null);
        
        NoRM = new JLabel ("No RM ");
        NoRM.setBounds(10, 10, 150, 25);
        this.add(NoRM);
        
        nama = new JLabel ("Nama ");
        nama.setBounds(10, 50, 150, 25);
        this.add(nama);
        
        alamat = new JLabel ("Alamat ");
        alamat.setBounds(10, 90, 150, 25);
        this.add(alamat);
        
        TextNoRM = new JTextField();
        TextNoRM.setBounds(60, 10, 200, 25);
        this.add(TextNoRM);
        
        TextNama = new JTextField();
        TextNama.setBounds(60, 50, 200, 25);
        this.add(TextNama);
        
        TextAlamat = new JTextField();
        TextAlamat.setBounds(60, 90, 200, 25);
        this.add(TextAlamat);
        
        saveButton = new JButton("OK");
        saveButton.setBounds(150, 150, 75, 30);
        this.add(saveButton);
        
        menuBar = new JMenuBar();
        this.setTitle("Main Frame");
        fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("exit");
        tambahPasienMenuItem = new JMenuItem("TambahPasien");
        fileMenu.add(tambahPasienMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        exitMenuItem.addActionListener((ActionListener) this);
        tambahPasienMenuItem.addActionListener((ActionListener) this);

        this.setJMenuBar(menuBar);
        
        
        
    }
    

    
    @Override
    public void actionPerformed (ActionEvent e){
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == tambahPasienMenuItem) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            
            Pasien.tambahPasienBaru(baru);
            
        }
    }
    
}
