package ateliedocetentacao.view;

import ateliedocetentacao.model.Produto;
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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaCadastroProduto extends JFrame {
    private JTextField textFieldNome;
    private JComboBox<String> comboBoxTipo;
    private JTextField textFieldQuantidade;
    private JTextField textFieldPreco;
    private JButton buttonCadastrar;
    private JTextArea textAreaProdutos;

    private List<Produto> produtos;

  
    public TelaCadastroProduto() {
        produtos = new ArrayList<>();

        // Configuração do JFrame
        
    }

    private void voltarTela() {
    }

    private void cadastrarProduto() {
        String nome = textFieldNome.getText();
        String un_medida = (String) comboBoxTipo.getSelectedItem();
        int quantidade = Integer.parseInt(textFieldQuantidade.getText());
        double preco = Double.parseDouble(textFieldPreco.getText());

        Produto produto = new Produto(nome, un_medida, quantidade, preco);
        produtos.add(produto);
        exibirProdutos();
        limparCampos();

        // Inserir o produto no banco de dados
        inserirProdutoNoBanco(produto);
    }

    private void exibirProdutos() {

        textAreaProdutos.setText("");
        for (Produto produto : produtos) {
            String info = "Nome: " + produto.getNome() +
                    "\nUnidade de medida: " + produto.getUn_medida() +
                    "\nQuantidade: " + produto.getQuantidade() +
                    "\nPreço: " + produto.getPreco() +
                    "\n----------------------\n";
            textAreaProdutos.append(info);
        }
    }

    private void limparCampos() {
        textFieldNome.setText("");
        comboBoxTipo.setSelectedIndex(0);
        textFieldQuantidade.setText("");
        textFieldPreco.setText("");
        textFieldNome.requestFocus();
    }

    private void inserirProdutoNoBanco(Produto produto) {
        try (Connection conn = DriverManager.getConnection(JDBC_URL + DB_NAME, DB_USER, DB_PASSWORD);
             PreparedStatement statement = conn.prepareStatement(
                     "INSERT INTO produto (nome, tipo, quantidade, preco) VALUES (?, ?, ?, ?)")) {

            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getUn_medida());
            statement.setInt(3, produto.getQuantidade());
            statement.setDouble(4, produto.getPreco());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }
}

