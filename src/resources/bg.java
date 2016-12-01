/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Naufal
 */
public class bg extends JPanel{
    private Image image;
    public bg(){
        image = new ImageIcon(getClass().getResource("/resources/background dbd.jpg")).getImage();
    }
    @Override
    protected void paintComponent(Graphics graphics){
    super.paintComponent(graphics);
    Graphics2D gd = (Graphics2D) graphics.create();
    gd.drawImage(image, 0, 0, getWidth(),getHeight(),null);
    gd.dispose();
    }
}
