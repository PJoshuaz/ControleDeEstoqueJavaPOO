package ateliedocetentacao.dao;

import ateliedocetentacao.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class ProdutoDAO {
    private Connection conexao;

    public ProdutoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void cadastrarProduto(Produto produto) throws SQLException {
        String sql = "INSERT INTO tbprodutos (idpro, nomepro, un_medidapro, preçopro, quantidadepro) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, produto.getId());
            stmt.setString(2, produto.getNome());
            stmt.setString(3, produto.getUn_medida());
            stmt.setString(4, produto.getPreco());
            stmt.setString(5, produto.getQuantidade());

            stmt.executeUpdate();
        }
    }

    public void atualizarProduto(Produto produto) throws SQLException {
        String sql = "UPDATE tbprodutos SET nomepro = ?, un_medidapro = ?, preçopro = ?, quantidadepro = ? WHERE idpro = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getUn_medida());
            stmt.setString(3, produto.getPreco());
            stmt.setString(4, produto.getQuantidade());
            stmt.setInt(5, produto.getId());

            stmt.executeUpdate();
        }
    }

    public void removerProduto(int id) throws SQLException {
        String sql = "DELETE FROM tbprodutos WHERE idpro = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public List<Produto> buscarProdutos() throws SQLException {
        String sql = "SELECT * FROM tbprodutos";
        List<Produto> produtos = new ArrayList<>();

        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("idpro");
                String nome = rs.getString("nomepro");
                String tipoUnidade = rs.getString("tipounidpro");
                String preco = rs.getString("preçopro");
                String quantidade = rs.getString("quantidadepro");

                Produto produto = new Produto(id, nome, tipoUnidade, preco, quantidade);
                produtos.add(produto);
            }
        }

        return produtos;
    }

    public List<Produto> buscarProdutosPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM tbprodutos WHERE nomepro LIKE ?";
        List<Produto> produtos = new ArrayList<>();

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, "%" + nome + "%");

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("idpro");
                    String nomeProduto = rs.getString("nomepro");
                    String tipoUnidade = rs.getString("tipounidpro");
                    String preco = rs.getString("preçopro");
                    String quantidade = rs.getString("quantidadepro");

                    Produto produto = new Produto(id, nomeProduto, tipoUnidade, preco, quantidade);
                    produtos.add(produto);
                }
            }
        }

        return produtos;
    }
}
