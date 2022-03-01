/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estilos2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author co2
 */
public class DashedBorder extends AbstractBorder
{
    @Override
    public void paintBorder(Component comp, Graphics g, int x, int y, int w, int h) {
        Graphics2D conntrolG = (Graphics2D) g;
        conntrolG.setColor(Color.red);
        conntrolG.setStroke(new BasicStroke(1.3f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{1}, 0));
        conntrolG.drawRect(x, y, w - 1, h - 1);
        conntrolG.fillRect(x, y, w - 1, y + 5);
    }
}