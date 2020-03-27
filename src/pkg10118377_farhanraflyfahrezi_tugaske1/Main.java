/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10118377_farhanraflyfahrezi_tugaske1;

import java.awt.Color;

/**
 *
 * @author Farhan Rafly Fahrezi
 */
public class Main {
    public static void main(String[] args) {
        layout layout_obj = new layout();
        
        layout_obj.setTitle("10118377");
        layout_obj.getNama().setForeground(Color.WHITE);
        layout_obj.getNim().setForeground(Color.WHITE);
        layout_obj.getKelas().setForeground(Color.WHITE);
        layout_obj.getContentPane().setBackground(Color.DARK_GRAY);
        layout_obj.setLocationRelativeTo(null);
        layout_obj.setVisible(true);
    }
}
