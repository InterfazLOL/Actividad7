package client.components.juega;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import client.components.juega.coop.CoopComponent;
import client.components.juega.entrenamiento.EntrenamientoComponent;
import client.components.juega.personalizada.PersonalizadaComponent;
import client.components.juega.pvp.PVPComponent;

public class JuegaComponent implements ActionListener {

    private JuegaTemplate juegaTemplate;
    private PVPComponent pvpComponent;
    private CoopComponent coopComponent;
    private EntrenamientoComponent entrenamientoComponent;
    private PersonalizadaComponent personalizadaComponent;

    public JuegaComponent() {

        juegaTemplate = new JuegaTemplate(this);
        pvpComponent = new PVPComponent();
        juegaTemplate.gPPestanas().add(pvpComponent.gPvpTemplate());
    }

    public JuegaTemplate gJuegaTemplate() {
        return juegaTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        juegaTemplate.gPPestanas().removeAll();
        String comando = e.getActionCommand();
        switch (comando) {
            case "PVP":
                if (pvpComponent == null)
                    pvpComponent = new PVPComponent();
                juegaTemplate.gPPestanas().add(pvpComponent.gPvpTemplate());
                break;
            case "COOP. VS IA":
                if (coopComponent == null)
                    coopComponent = new CoopComponent();
                juegaTemplate.gPPestanas().add(coopComponent.gCoopTemplate());
                break;
            case "ENTRENAMIENTO":
                if (entrenamientoComponent == null)
                    entrenamientoComponent = new EntrenamientoComponent();
                juegaTemplate.gPPestanas().add(entrenamientoComponent.gEntrenamientoTemplate());
                break;
            case "CREAR PERSONALIZADA":
                if (personalizadaComponent == null)
                personalizadaComponent = new PersonalizadaComponent();
                juegaTemplate.gPPestanas().add(personalizadaComponent.gPersonalizadaTemplate());
                break;
            case "UNIRSE A PERSONALIZADA":

                break;
            default:
                break;
        }
        juegaTemplate.gPPestanas().repaint();

    }
}