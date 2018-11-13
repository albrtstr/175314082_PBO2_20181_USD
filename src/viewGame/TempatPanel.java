/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewGame;

import java.awt.Graphics;
import javax.swing.JPanel;
import modelGame.Sel;
import modelGame.Tempat;

/**
 *
 * @author basisa02
 */
public class TempatPanel extends JPanel{
    private Tempat tempat;
    
    public TempatPanel(){
        
    }
    
    public TempatPanel(Tempat tempat){
        this.tempat = tempat;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(0, 0, Tempat.batasKanan, Tempat.batasBawah);
        if (tempat != null) {
            for (int i = 0; i < tempat.getIsiTempat().size(); i++) {
                Sel sel = tempat.getIsiTempat().get(i);
                g.setColor(sel.getWarna());
                g.fillOval(sel.getKolom()*sel.getLebar(), sel.getBaris()*sel.getTinggi(), sel.getLebar(), sel.getTinggi());
            }
        }
    }

    public Tempat getTempat() {
        return tempat;
    }

    public void setTempat(Tempat tempat) {
        this.tempat = tempat;
    }
    
    
}
