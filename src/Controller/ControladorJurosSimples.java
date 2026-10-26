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
public class ControladorJurosSimples {
    JTextField jTextFieldC, jTextFieldJ, jTextFieldT;
    JLabel jLabelTotal;

    public ControladorJurosSimples(JTextField jTextFieldC, JTextField jTextFieldJ, JTextField jTextFieldT, JLabel jLabelTotal) {
        this.jTextFieldC = jTextFieldC;
        this.jTextFieldJ = jTextFieldJ;
        this.jTextFieldT = jTextFieldT;
        this.jLabelTotal = jLabelTotal;
    }
    
   public void calcular(){
       int capital = Integer.parseInt(jTextFieldC.getText());
       float taxaJuros = Float.parseFloat(jTextFieldJ.getText());
       int tempo = Integer.parseInt(jTextFieldT.getText());
       float t = capital * taxaJuros * tempo;
       jLabelTotal.setText(String.format("%.2f", t));
   } 
}
