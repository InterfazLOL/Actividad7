package client.components.barraNotificaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraLateralComponent implements ActionListener {

    private BarraLateralTemplate barraLateralTemplate;

    public BarraLateralComponent() {
        barraLateralTemplate = new BarraLateralTemplate(this);
    }

    public BarraLateralTemplate getBarraLateralTemplate() {
        return barraLateralTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

}