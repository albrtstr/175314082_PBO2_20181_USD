/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewCanvas;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import modelCanvas.Bola;

/**
 *
 * @author basisa02
 */
public class BolaPanel extends JPanel {

    private ArrayList<Bola> listBola = new ArrayList<>();

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        for (int i = 0; i < listBola.size(); i++) {
            g.setColor(listBola.get(i).getColor());
            g.fillOval(listBola.get(i).getPosisiX(),
                    listBola.get(i).getPosisiY(),
                    listBola.get(i).getDiameter(),
                    listBola.get(i).getDiameter());
        }
    }

    /**
     * @return the listBola
     */
    public ArrayList<Bola> getListBola() {
        return listBola;
    }

    /**
     * @param listBola the listBola to set
     */
    public void setListBola(ArrayList<Bola> listBola) {
        this.listBola = listBola;
    }

    public void gambarUlang() {
        this.repaint();
    }
}
