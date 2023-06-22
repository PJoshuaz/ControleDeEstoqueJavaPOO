
package ateliedocetentacao.model;



public class Produto {
    private String idproduto;
    private String nome;
    private int quantidade;
    private int un_medida;
    private int preco;
    
    public Produto(String idproduto, String nome, int quantidade, int un_medida, int preco) {
        this.idproduto = idproduto;
        this.nome = nome;
        this.quantidade = quantidade;
        this.un_medida = un_medida;
        this.preco = preco;
    }
    

    public String getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(String idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getUn_medida() {
        return un_medida;
    }

    public void setUn_medida(int un_medida) {
        this.un_medida = un_medida;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        return idproduto +"|"
              + nome +"|"
              + quantidade +"|"
              + un_medida +"|"
              + preco;
    }
    
}