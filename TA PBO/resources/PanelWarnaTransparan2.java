package resources;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author FUCK_HIM
 */
public class PanelWarnaTransparan2 extends JPanel{
    Color col;

    public PanelWarnaTransparan2(){
        setOpaque(false);
        col=new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),80);
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        col=new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),80);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gg=(Graphics2D) g.create();
        gg.setColor(col);
        gg.fillRoundRect(0, 0, getWidth(),getHeight(), 0, 0);
        gg.dispose();
    }




}
