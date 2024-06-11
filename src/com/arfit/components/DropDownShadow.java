/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arfit.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author yunac
 */
public class DropDownShadow extends JPanel {
    private static final long serialVersionUID = 1L;

    public int pixels;

    public DropDownShadow(int pix) {
        this.pixels = pix;
        Border border = BorderFactory.createEmptyBorder(pixels, pixels, pixels, pixels);
        this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(), border));
        this.setLayout(new BorderLayout());
    }

    @Override
    protected void paintComponent(Graphics g) {
        int shade = 0;
        int topOpacity = 80;
        for (int i = 0; i < pixels; i++) {
            g.setColor(new Color(shade, shade, shade, ((topOpacity / pixels) * i)));
            g.drawRect(i, i, this.getWidth() - ((i * 2) + 1), this.getHeight() - ((i * 2) + 1));
        }
    }
}
