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
public class ControladorPotenciacao {
    JLabel jl1;
    JTextField jtf1, jtf2;

    public ControladorPotenciacao(JLabel jl1, JTextField jtf1, JTextField jtf2) {
        this.jl1 = jl1;
        this.jtf1 = jtf1;
        this.jtf2 = jtf2;
    }
    
    public void calcular(){
        double t = Math.pow(Integer.parseInt(jtf1.getText()), Integer.parseInt(jtf2.getText()));
        jl1.setText(String.format("%.2f", t));
    }
    
}
