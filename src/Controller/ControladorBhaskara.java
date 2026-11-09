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
public class ControladorBhaskara {
    JLabel jl1, jl2;
    JTextField jtfA, jtfB, jtfC;

    public ControladorBhaskara(JLabel jl1, JLabel jl2, JTextField jtfA, JTextField jtfB, JTextField jtfC) {
        this.jl1 = jl1;
        this.jl2 = jl2;
        this.jtfA = jtfA;
        this.jtfB = jtfB;
        this.jtfC = jtfC;
    }
    
    public void calcular(){
        int a = Integer.parseInt(jtfA.getText());
        int b = Integer.parseInt(jtfB.getText());
        int c = Integer.parseInt(jtfC.getText());
        double delta = Math.pow(b, 2) - 4 * a * c;
        double t1 = (-b + Math.sqrt(delta)) / (2 * a);
        double t2 = (-b - Math.sqrt(delta)) / (2 * a);
        jl1.setText(String.format("Xi = %.2f", t1));
        jl2.setText(String.format("Xii = %.2f", t2));
    }
    
}
