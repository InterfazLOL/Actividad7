package client.components.barraNavegacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import client.vistaPrincipal.VistaPrincipalComponent;

public class BarraSuperiorComponent implements ActionListener{

    private BarraSuperiorTemplate barraSuperiorTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    
    public BarraSuperiorComponent(VistaPrincipalComponent vistaPrincipalComponent){
        this.barraSuperiorTemplate = new BarraSuperiorTemplate(this);
        this.vistaPrincipalComponent = vistaPrincipalComponent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vistaPrincipalComponent.mostrarComponente(e.getActionCommand().trim(), e); // trim quita los espacios antes o despues del texto
    }

    public BarraSuperiorTemplate getBarraSuperiorTemplate(){
        return barraSuperiorTemplate;
    }
    
}