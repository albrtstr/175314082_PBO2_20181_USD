/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewCanvas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelCanvas.Bola;

/**
 *
 * @author basisa02
 */
public class CanvasFrame extends JFrame{
    private BolaPanel bolaPanel;
    private JLabel perintahlabel;
    private JTextField perintahText;
    private JButton okButton;

    public CanvasFrame() {
        init();
    }

    public void init() {
        this.setSize(500, 300);
        this.setLayout(new BorderLayout());
        this.setTitle("My Game");

        // pnel center
        bolaPanel = new BolaPanel();
        this.add(bolaPanel, BorderLayout.CENTER);
        bolaPanel.setVisible(true);

        // panel selatan
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());

        this.perintahlabel = new JLabel("Perintah");
        southPanel.add(perintahlabel);

        this.perintahText = new JTextField(20);
        southPanel.add(perintahText);

        this.okButton = new JButton("OK");
        southPanel.add(okButton);

        this.add(southPanel, BorderLayout.SOUTH);

        // buat obyek Bola
        Bola bola1 = new Bola(20, 20, 30, Color.RED);
        Bola bola2 = new Bola(20, 50, 30, Color.BLUE);
        Bola bola3 = new Bola(60, 50, 30, Color.CYAN);

        // buat list bola
        ArrayList<Bola> listBola = new ArrayList<>();
        listBola.add(bola1);
        listBola.add(bola2);
        listBola.add(bola3);

        // set list bola di bolaPanel
        this.bolaPanel.setListBola(listBola);

        // set logo panel
        this.okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pindah();
            }
        });
        this.setVisible(true);
    }

    private void pindah() {
        ArrayList<Bola> daftarSementara = this.bolaPanel.getListBola();
        for (int i = 0; i < daftarSementara.size(); i++) {
            daftarSementara.get(i).setPosisiX(
                    daftarSementara.get(i).getPosisiX()+20);
        }
        this.bolaPanel.setListBola(daftarSementara);
        this.bolaPanel.gambarUlang();
    }
}
