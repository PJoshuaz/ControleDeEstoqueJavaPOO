
package ateliedocetentacao.view;

import ateliedocetentacao.dao.UsuarioDAO;
import ateliedocetentacao.model.Usuario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
package ateliedocetentacao.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class TelaCadastroUsuario extends JFrame {

    private UsuarioDAO usuarioDAO;
    private JTextField nomeField;
    private JTextField emailField;
    private JTextField usernameField;
    private JPasswordField senhaField;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "banco_de_produto";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    
    public TelaCadastroUsuario() {

        setTitle("Cadastro de Usuário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        JLabel senhaLabel = new JLabel("Senha:");
        senhaField = new JPasswordField(20);

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
            }
        });

        add(nomeLabel);
        add(nomeField);
        add(emailLabel);
        add(emailField);
        add(usernameLabel);
        add(usernameField);
        add(senhaLabel);
        add(senhaField);
        add(new JLabel());
        add(cadastrarButton);
        
        // Criação do banco de dados e tabela
        criarBancoDeDados();
        criarTabela();
    }
    
        private void criarBancoDeDados() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
             Statement statement = conn.createStatement()) {

            String sql = "CREATE DATABASE IF NOT EXISTS " + DB_NAME;
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void criarTabela() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL + DB_NAME, DB_USER, DB_PASSWORD);
             Statement statement = conn.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS usuario (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome_usuario VARCHAR(100) NOT NULL," +
                    "email VARCHAR(50) NOT NULL," +
                    "username VARCHAR(100) NOT NULL," +
                    "senha INT NOT NULL," +
                    ")";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cadastrarUsuario() {
        String nome = nomeField.getText();
        String email = emailField.getText();
        String username = usernameField.getText();
        String senha = new String(senhaField.getPassword());

        if (nome.isEmpty() || email.isEmpty() || username.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario usuario = new Usuario(0, nome, email, username, senha);

        try {
            usuarioDAO.cadastrarUsuario(usuario);
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!", "Cadastro de Usuário", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        nomeField.setText("");
        emailField.setText("");
        usernameField.setText("");
        senhaField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
                telaCadastroUsuario.setVisible(true);
            }
        });
    }
}
