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
public class ControladorTri {
    JLabel jl;
    JTextField jtf1, jtf2;

    public ControladorTri(JLabel jl, JTextField jtf1, JTextField jtf2) {
        this.jl = jl;
        this.jtf1 = jtf1;
        this.jtf2 = jtf2;
    }
    public void calcular(){
        float t = (Integer.parseInt(jtf1.getText()) * Integer.parseInt(jtf2.getText())) / 2.0f;
        jl.setText(String.format("%.2f", t));
    }
    
}
