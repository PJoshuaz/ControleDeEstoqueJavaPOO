
package ateliedocetentacao.view;

import ateliedocetentacao.form.TelaFormLogin;
import ateliedocetentacao.model.Usuario;
import ateliedocetentacao.dao.UsuarioDAO;
import ateliedocetentacao.model.Dados;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class TelaLogin extends JFrame {

    
    public static void main(String[] args) {
        Dados msDados = new Dados();
        TelaFormLogin frmLogin = new TelaFormLogin();
        frmLogin.setDados(msDados);
        frmLogin.setLocationRelativeTo(null);
        frmLogin.setVisible(true);
    }
}
