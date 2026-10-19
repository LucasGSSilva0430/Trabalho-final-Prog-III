/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Discentes
 */
public class ControladorFracao {
    JLabel jLabelTotal;
    JTextField jTextField1, jTextField2;

    public ControladorFracao(JLabel jLabelTotal, JTextField jTextField1, JTextField jTextField2) {
        this.jLabelTotal = jLabelTotal;
        this.jTextField1 = jTextField1;
        this.jTextField2 = jTextField2;
    }
    
    public void calcular(){
        int v1 = Integer.parseInt(jTextField1.getText());
        int v2 = Integer.parseInt(jTextField2.getText());
        float t = v1/v2;
        jLabelTotal.setText(String.format("%.2f", t));
    }
    
}
