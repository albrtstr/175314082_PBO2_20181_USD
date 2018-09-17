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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
    private JMenu file;
    private JMenuItem tambahPasien;
    private JMenuItem tambahAntrian;
    private JMenuItem exit;
    private JMenuBar menuBar;
    
    
    
    public MainFrame(){
        this.setTitle("PASIEN");
        init();
    }
    
    public void init(){
        this.setLayout(null);
        
        menuBar = new JMenuBar();
        file = new JMenu("Pasien");
        tambahPasien = new JMenuItem("Tambah Pasien");
        tambahAntrian = new JMenuItem ("Tambah Antrian");
        exit = new JMenuItem ("Exit");
        
        file.add(tambahPasien);
        file.add(tambahAntrian);
        file.add(exit);
        
        tambahPasien.addActionListener(this);
        tambahAntrian.addActionListener(this);
        exit.addActionListener(this);
        menuBar.add(file);
        this.setJMenuBar(menuBar);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            System.exit(0);
        }
        if (e.getSource() == tambahPasien) {
            DaftarPasienBaruDialog view = new DaftarPasienBaruDialog();
            view.setSize(400, 400);
            view.setVisible(true);
        }
        if (e.getSource() == tambahAntrian) {
            DaftarAntrianDialog view = new DaftarAntrianDialog();
            view.setSize(400, 400);
            view.setVisible(true);
            
        }
    }
    
}
