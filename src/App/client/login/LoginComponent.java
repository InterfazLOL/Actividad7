package client.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import client.vistaPrincipal.VistaPrincipalComponent;

public class LoginComponent implements ActionListener {

    private LoginTemplate loginTemplate;

    public LoginComponent(){
        loginTemplate = new LoginTemplate(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="Entrar") {
            System.out.println("Magia magia");
        } else if (e.getSource()==loginTemplate.getbAyuda() ) {            
            JOptionPane.showMessageDialog(null, "Las ayudas no existen mrko", "Advertencia", 1); // 0 error, 1 informativo, 2  advertencia, 3 pregunta
        }else if (e.getSource()==loginTemplate.getbEntrar() ) { 
            entrar();
        }else if (e.getSource()==loginTemplate.getbAyuda() ) {            
            JOptionPane.showMessageDialog(null, "Las ayudas no existen mrko", "Advertencia", 1); // 0 error, 1 informativo, 2  advertencia, 3 pregunta
        }
    }

    private void entrar(){
        boolean mantenerSesion;
        if(loginTemplate.getcheckMantenerConexion().isSelected())
            mantenerSesion = true;
        
        VistaPrincipalComponent vistaPrincipalComponent = new VistaPrincipalComponent();
        loginTemplate.setVisible(false);
    }

    private void obtenerDatosUsuario(){
        String nombre = loginTemplate.gettNombreUsuario().getText();
        String clave = new String(loginTemplate.gettClaveUsuario().getPassword());
    }
    
}