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
public class ControladorLogaritmo {
    JLabel jl1;
    JTextField jtf1, jtf2;

    public ControladorLogaritmo(JLabel jl1, JTextField jtf1, JTextField jtf2) {
        this.jl1 = jl1;
        this.jtf1 = jtf1;
        this.jtf2 = jtf2;
    }
    
    public void calcular(){
        int v1 = Integer.parseInt(jtf1.getText());
        int v2 = Integer.parseInt(jtf2.getText());
        double t = Math.log(v1) / Math.log(v2);
        jl1.setText(String.format("%.2f", t));
    }
    
}
