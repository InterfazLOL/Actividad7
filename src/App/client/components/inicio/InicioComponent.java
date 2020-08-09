package client.components.inicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import client.components.inicio.vistaGeneral.VistaGeneralComponent;
import client.vistaPrincipal.VistaPrincipalComponent;

public class InicioComponent implements ActionListener {

    private InicioTemplate inicioTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private VistaGeneralComponent vistaGeneralComponent;

    public InicioComponent(VistaPrincipalComponent vistaPrincipalComponent) {

        this.vistaPrincipalComponent = vistaPrincipalComponent;
        inicioTemplate = new InicioTemplate(this);
        vistaGeneralComponent = new VistaGeneralComponent();
       /*  inicioTemplate.gPPestanas().add(vistaPrincipalComponent.getVistaPrincipalTemplate());
        inicioTemplate.repaint(); */
    }

    public InicioTemplate gInicioTemplate() {
        return inicioTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inicioTemplate.gPPestanas().removeAll();
        String comando = e.getActionCommand();
        switch (comando) {
            case "VISTA GENERAL":
                inicioTemplate.gPPestanas().add(vistaGeneralComponent.gVistaGeneralTemplate());
                break;
            case "NOTICIAS":
                
                break;
            case "NOTAS DE VERSIÓN":

                break;
            default:
                break;
        }
        inicioTemplate.gPPestanas().repaint();
    }
}