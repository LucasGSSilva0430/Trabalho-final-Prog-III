/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Usuário
 */
public class ControladorJurosCompostos {
    JLabel jLabel1;
    JTextField jtf1, jtf2, jtf3;

    public ControladorJurosCompostos(JLabel jLabel1, JTextField jtf1, JTextField jtf2, JTextField jtf3) {
        this.jLabel1 = jLabel1;
        this.jtf1 = jtf1;
        this.jtf2 = jtf2;
        this.jtf3 = jtf3;
    }
    
    public void calcular(){
        int v1 = Integer.parseInt(jtf1.getText());
        float v2 = Float.parseFloat(jtf2.getText());
        int v3 = Integer.parseInt(jtf3.getText());
        double t = v1 * Math.pow(1 + (v2 / 100), v3);
        jLabel1.setText(String.format("%.2f", t));
    }
    
}
