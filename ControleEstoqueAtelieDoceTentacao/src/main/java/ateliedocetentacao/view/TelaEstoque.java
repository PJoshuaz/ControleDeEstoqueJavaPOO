package ateliedocetentacao.view;

import ateliedocetentacao.dao.ProdutoDAO;
import ateliedocetentacao.model.Produto;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;


public class TelaEstoque extends JFrame {

    private ProdutoDAO produtoDAO;

    private JTable tabelaProdutos;
    private DefaultTableModel tableModel;

    public TelaEstoque() {

        setTitle("Estoque");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel();
        tabelaProdutos = new JTable(tableModel);

        tableModel.addColumn("ID");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Tipo de Unidade");
        tableModel.addColumn("Preço");
        tableModel.addColumn("Quantidade");

        JScrollPane scrollPane = new JScrollPane(tabelaProdutos);

        JButton atualizarButton = new JButton("Atualizar");
        atualizarButton.addActionListener(e -> atualizarTabela());

        add(scrollPane, BorderLayout.CENTER);
        add(atualizarButton, BorderLayout.SOUTH);

        atualizarTabela();
    }

    private void atualizarTabela() {
        try {
            List<Produto> produtos = produtoDAO.buscarProdutos();

            tableModel.setRowCount(0);

            for (Produto produto : produtos) {
                Object[] row = {
                        produto.getId(),
                        produto.getNome(),
                        produto.getUn_medida(),
                        produto.getPreco(),
                        produto.getQuantidade()
                };
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar produtos: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaEstoque telaEstoque = new TelaEstoque();
            telaEstoque.setVisible(true);
        });
    }
}
