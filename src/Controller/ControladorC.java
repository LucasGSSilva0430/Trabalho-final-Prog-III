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
public class ControladorC {
    JLabel jl;
    JTextField jtf;

    public ControladorC(JLabel jl, JTextField jtf) {
        this.jl = jl;
        this.jtf = jtf;
    }
    
    public void calcular(){
        double t = Math.PI * Math.pow(Float.parseFloat(jtf.getText()), 2);
        jl.setText(String.format("%.2f", t));
    }
    
}
