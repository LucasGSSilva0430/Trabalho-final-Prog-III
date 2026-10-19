/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.TelaBhaskara;
import View.TelaGeometriaPlana;
import View.TelaFracao;
import View.TelaJurosComposto;
import View.TelaJurosSimples;
import View.TelaLog;
import View.TelaPotenciacao;
import View.TelaRegraDe3;
import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author Usuário
 */
public class ControladorTela {
    JDesktopPane jDesktopPane;

    public ControladorTela(JDesktopPane jDesktopPane) {
        this.jDesktopPane = jDesktopPane;
    }
    
    public void telaGP(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        TelaGeometriaPlana tela = new TelaGeometriaPlana();
        Dimension t = jDesktopPane.getSize();
        tela.setSize(t);
        tela.setLocation(0, 0);
        jDesktopPane.add(tela);
        jDesktopPane.setVisible(true);
    }
    
    public void  telaFracao(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        TelaFracao tela = new TelaFracao();
        Dimension t = jDesktopPane.getSize();
        tela.setSize(t);
        tela.setLocation(0, 0);
        jDesktopPane.add(tela);
        jDesktopPane.setVisible(true);
    }
    
    public void telaR3(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        TelaRegraDe3 tela = new TelaRegraDe3();
        Dimension t = jDesktopPane.getSize();
        tela.setSize(t);
        tela.setLocation(0, 0);
        jDesktopPane.add(tela);
        jDesktopPane.setVisible(true);
    }
    public void telaJurosS(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        TelaJurosSimples tela = new TelaJurosSimples();
        Dimension t = jDesktopPane.getSize();
        tela.setSize(t);
        tela.setLocation(0, 0);
        jDesktopPane.add(tela);
        jDesktopPane.setVisible(true);
    }
    
    public void telaJuroC(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        TelaJurosComposto tela = new TelaJurosComposto();
        Dimension t = jDesktopPane.getSize();
        tela.setSize(t);
        tela.setLocation(0, 0);
        jDesktopPane.add(tela);
        jDesktopPane.setVisible(true);
    }
    
    public void telaPoten(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        TelaPotenciacao tela = new TelaPotenciacao();
        Dimension t = jDesktopPane.getSize();
        tela.setSize(t);
        tela.setLocation(0, 0);
        jDesktopPane.add(tela);
        jDesktopPane.setVisible(true);
    }
    
    public void telaBhas(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        TelaBhaskara tela = new TelaBhaskara();
        Dimension t = jDesktopPane.getSize();
        tela.setSize(t);
        tela.setLocation(0, 0);
        jDesktopPane.add(tela);
        jDesktopPane.setVisible(true);
    }
    
    public void telaL(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        TelaLog tela = new TelaLog();
        Dimension t = jDesktopPane.getSize();
        tela.setSize(t);
        tela.setLocation(0, 0);
        jDesktopPane.add(tela);
        jDesktopPane.setVisible(true);
    }
    
}
