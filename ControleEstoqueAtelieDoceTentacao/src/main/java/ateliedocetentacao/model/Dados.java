
package ateliedocetentacao.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Dados {
    private int maxUsu = 50;
    private int maxPro = 200;
    private Usuario msUsuarios[]= new Usuario[maxUsu];
    private Produto msProdutos[]= new Produto[maxPro];
    private int contUsu = 0;
    private int contPro = 0;
    
    public Dados() {
        
        preencherUsuarios();
        
        preencherProdutos();
        
        
    }
    
    public int numeroUsuarios(){
        return contUsu;
    }
    
    public int numeroProdutos(){
        return contPro;
    }
    
    public Usuario[]getUsuarios(){
        return msUsuarios;
    }
    
    public Produto[]getProdutos(){
        return msProdutos;
    }
    
    public boolean validarUsuario(String usuario,String senha){
        boolean aux = false;
        for(int i = 0; i < contUsu; i++) {
            if(msUsuarios[i].getUsername().equals(usuario)&&msUsuarios[i].getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
    
    public int posicaoUsuario(String usuario){
        
        for(int i = 0; i < contUsu; i++) {
            if(msUsuarios[i].getId().equals(usuario)) {
                return i;
            }
        }
        return -1;
    }
    
    public int posicaoProduto(String produto){
        
        for(int i = 0; i < contPro; i++) {
            if(msProdutos[i].getIdproduto().equals(produto)) {
                return i;
            }
        }
        return -1;
    }
    
    public String adicionarUsuario(Usuario mUsuario){
        if(contUsu==maxUsu){
            return"NÃO É POSSÍVEL CADASTRAR MAIS USUARIO (LIMITE ATINGIDO)";
        }
        msUsuarios[contUsu] = mUsuario;
        contUsu++;
        return"USUARIO CADASTRADO COM SUCESSO";
    }
    
    public String adicionarProduto(Produto mProduto){
        if(contPro==maxPro){
            return"NÃO É POSSÍVEL CADASTRAR MAIS PRODUTOS (LIMITE ATINGIDO)";
        }
        msProdutos[contPro] = mProduto;
        contPro++;
        return"PRODUTO CADASTRADO COM SUCESSO";
    }
    
    public String editarUsuario(Usuario mUsuario,int pos){
        msUsuarios[pos].setNome(mUsuario.getNome());
        msUsuarios[pos].setEmail(mUsuario.getEmail());
        msUsuarios[pos].setUsername(mUsuario.getUsername());
        msUsuarios[pos].setSenha(mUsuario.getSenha());
        msUsuarios[pos].setPerfil(mUsuario.getPerfil());
        
        return"USUARIO ALTERADO COM SUCESSO";
    }
    
    public String editarProduto(Produto mProduto,int pos){
        msProdutos[pos].setIdproduto(mProduto.getIdproduto());
        msProdutos[pos].setNome(mProduto.getNome());
        msProdutos[pos].setQuantidade(mProduto.getQuantidade());
        msProdutos[pos].setUn_medida(mProduto.getUn_medida());
        msProdutos[pos].setPreco(mProduto.getPreco());
        
        return"PRODUTO ALTERADO COM SUCESSO";
    }
    
    public String deletarUsuario(int pos) {
        for (int i = pos; i < contUsu -1; i++){
            msUsuarios[i]= msUsuarios[i + 1];
        }
    contUsu--;
    return"USUARIO DELETADO COM SUCESSO";
    }
    
    public String deletarProduto(int pos) {
        for (int i = pos; i < contPro -1; i++){
            msProdutos[i]= msProdutos[i + 1];
        }
    contPro--;
    return"PRODUTO DELETADO COM SUCESSO";
    }
    
    public void salvarTodo(){
        salvarUsuarios();
        salvarProdutos();
        
    }
    
    public void salvarUsuarios(){
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/usuarios.txt");
            pw = new PrintWriter(fw);
            
            for (int i = 0; i < contUsu; i++){
                pw.println(msUsuarios[i].toString());
            }
        } catch (Exception e1) {
                    e1.printStackTrace();
        }finally{
            try {
                if(fw != null){
                    fw.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
    
    public void salvarProdutos(){
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/produtos.txt");
            pw = new PrintWriter(fw);
            
            for (int i = 0; i < contPro; i++){
                pw.println(msProdutos[i].toString());
            }
        } catch (Exception e1) {
                    e1.printStackTrace();
        }finally{
            try {
                if(fw != null){
                    fw.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
    
    public void preencherUsuarios(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            arquivo = new File("Data/usuarios.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            
            String id;
            String nome;
            String email;
            String username;
            String senha;
            int perfil;
            
            while((linha = br.readLine())!=null){
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                id = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                nome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                email = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                username = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                senha = aux;
                linha = linha.substring(pos + 1);
                perfil = new Integer(linha);
                
                Usuario mUsuario = new Usuario(id, nome, email, username, senha, perfil);
                msUsuarios[contUsu]= mUsuario;
                contUsu++;
            }
            
        }catch(Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(fr !=null){
                    fr.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
    
        public void preencherProdutos(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            arquivo = new File("Data/produtos.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            
            String idproduto;
            String nome;
            int quantidade;
            int un_medida;
            int preco;
            
            
            while((linha = br.readLine())!=null){
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                idproduto = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                nome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                quantidade = new Integer(aux);
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0,pos);
                un_medida = new Integer(aux);
                linha = linha.substring(pos + 1);
                 
                preco = new Integer(linha);
                
                Produto mProduto = new Produto(idproduto, nome, quantidade, un_medida, preco);
                msProdutos[contUsu]= mProduto;
                contUsu++;
            }
            
        }catch(Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(fr !=null){
                    fr.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
    
    
    
    
}