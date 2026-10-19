/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.SubTelaC;
import View.SubTelaPR;
import View.SubTelaQR;
import View.SubTelaTra;
import View.SubTelaTri;
import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author Usuário
 */
public class ControladorTelaGP {
    JDesktopPane jDesktopPaneGP;

    public ControladorTelaGP(JDesktopPane jDesktopPaneGP) {
        this.jDesktopPaneGP = jDesktopPaneGP;
    }
    
    public void alterarCalculadora(String opc){
        Dimension t = jDesktopPaneGP.getSize();
        switch (opc){
            case "Quadrado/Retângulo":
                jDesktopPaneGP.removeAll();
                jDesktopPaneGP.updateUI();
                SubTelaQR telaQR = new SubTelaQR();
                telaQR.setSize(t);
                telaQR.setLocation(0, 0);
                jDesktopPaneGP.add(telaQR);
                jDesktopPaneGP.setVisible(true);
                break;
            case "Triângulo":
                jDesktopPaneGP.removeAll();
                jDesktopPaneGP.updateUI();
                SubTelaTri telaTri = new SubTelaTri();
                telaTri.setSize(t);
                telaTri.setLocation(0, 0);
                jDesktopPaneGP.add(telaTri);
                jDesktopPaneGP.setVisible(true);
                break;
            case "Trapézio":
                jDesktopPaneGP.removeAll();
                jDesktopPaneGP.updateUI();
                SubTelaTra telaTra = new SubTelaTra();
                telaTra.setSize(t);
                telaTra.setLocation(0, 0);
                jDesktopPaneGP.add(telaTra);
                jDesktopPaneGP.setVisible(true);
                break;
            case "Polígono Regular":
                jDesktopPaneGP.removeAll();
                jDesktopPaneGP.updateUI();
                SubTelaPR telaPR = new SubTelaPR();
                telaPR.setSize(t);
                telaPR.setLocation(0, 0);
                jDesktopPaneGP.add(telaPR);
                jDesktopPaneGP.setVisible(true);
                break;
            case "Círculo":
                jDesktopPaneGP.removeAll();
                jDesktopPaneGP.updateUI();
                SubTelaC telaC = new SubTelaC();
                telaC.setSize(t);
                telaC.setLocation(0, 0);
                jDesktopPaneGP.add(telaC);
                jDesktopPaneGP.setVisible(true);
                break;
        }
    }
    
}
