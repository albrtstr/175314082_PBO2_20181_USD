/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class MainFrame extends JFrame implements ActionListener{
    private JButton tambahPasienButton;
    private JButton tambahAntrianButton;
    private JButton keluarButton;
    private JLabel tambahPasienLabel;
    private JLabel tambahAntrianLabel;
    private JLabel keluarLabel;
    
    
    public MainFrame(){
        this.setTitle("PASIEN");
        init();
    }
    
    public void init(){
        this.setLayout(null);
        
        tambahPasienButton = new JButton ("Tambah Pasien");
        tambahPasienButton.setFont(new Font ("Rockwell", Font.TRUETYPE_FONT, 20));
        tambahPasienButton.setBounds(90, 30, 200, 40);
        this.add(tambahPasienButton);
        
        tambahAntrianButton = new JButton ("Tambah Antrian");
        tambahAntrianButton.setFont(new Font ("Rockwell", Font.TRUETYPE_FONT, 20));
        tambahAntrianButton.setBounds(90, 90, 200, 40);
        this.add(tambahAntrianButton);
        
        keluarButton = new JButton ("Keluar");
        keluarButton.setFont(new Font ("Rockwell", Font.TRUETYPE_FONT, 20));
        keluarButton.setBounds(90, 150, 200, 40);
        this.add(keluarButton);
        
        tambahPasienButton.addActionListener(this);
        tambahAntrianButton.addActionListener(this);
        keluarButton.addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == keluarButton) {
            System.exit(0);
        }
        if (e.getSource() == tambahPasienButton) {
            DaftarPasienBaruDialog view = new DaftarPasienBaruDialog();
            view.setSize(400, 400);
            view.setVisible(true);
        }
        if (e.getSource() == tambahAntrianButton) {
            DaftarAntrianDialog view = new DaftarAntrianDialog();
            view.setSize(400, 400);
            view.setVisible(true);
            
        }
    }
    
}
