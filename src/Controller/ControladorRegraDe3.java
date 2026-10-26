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
public class ControladorRegraDe3 {
    JTextField jTextField1, jTextField2, jTextField3;
    JLabel jLabelTotal;

    public ControladorRegraDe3(JTextField jTextField1, JTextField jTextField2, JTextField jTextField3, JLabel jLabelTotal) {
        this.jTextField1 = jTextField1;
        this.jTextField2 = jTextField2;
        this.jTextField3 = jTextField3;
        this.jLabelTotal = jLabelTotal;
    }
    
    public void calcular(){
        int v1 = Integer.parseInt(jTextField1.getText());
        int v2 = Integer.parseInt(jTextField2.getText());
        int v3 = Integer.parseInt(jTextField3.getText());
        int parte1 = v2*v3;
        float t = parte1/v1;
        jLabelTotal.setText(String.format("%.2f", t));
    }
}
