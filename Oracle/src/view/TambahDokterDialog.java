/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model_RS.Dokter;
import model_RS.RumahSakit;

/**
 *
 * @author user only
 */
public class TambahDokterDialog extends JDialog{
    private RumahSakit rumahSakit;
    private JLabel tambahDokterLabel;
    private JLabel idDokterLabel;
    private JTextField idDokterText;
    private JLabel namaDokterLabel;
    private JTextField namaDokterText;
    private JButton tambahButton;
    private MyDokterDialog owner;
    
    public TambahDokterDialog(MyDokterDialog owner, RumahSakit rs) {
        super(owner);
        this.owner = owner;
        rumahSakit = rs;
        init();
    }
    
    /**
     * Fungsi untuk inisialisasi
     */
    public void init(){
        // set size
        setSize(400, 300);
        // set layout
        setLayout(null);
        // tambah Tombol Tambah
        tambahButton = new JButton("Tambah");
        tambahButton.setBounds(50, 200, 100, 30);
        add(tambahButton);
        
        idDokterLabel = new JLabel ("ID Dokter ");
        idDokterLabel.setBounds(50, 50, 100, 30);
        add(idDokterLabel);
        
        namaDokterLabel = new JLabel ("Nama Dokter ");
        namaDokterLabel.setBounds(50, 100, 100, 30);
        add(namaDokterLabel);
        
        idDokterText = new JTextField();
        idDokterText.setBounds(140, 55, 100, 25);
        add(idDokterText);
        
        namaDokterText = new JTextField();
        namaDokterText.setBounds(140, 105, 100, 25);
        add(namaDokterText);
        
        // set action listener button
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahDokter();
            }
        });
    }
    public void tambahDokter(){
        Dokter tambah = new Dokter();
        tambah.setIdDokter(idDokterText.getText());
        tambah.setNama(namaDokterText.getText());
        rumahSakit.tambahDokter(tambah);
        
        
        
        owner.refreshTabelDokter();
        dispose();
    }
}
