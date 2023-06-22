
package ateliedocetentacao.model;


public class Usuario {
    private String id;
    private String nome;
    private String email;
    private String username;
    private String senha;
    private int perfil;
    
    public Usuario(String id, String nome, String email, String username, String senha, int Perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.username = username;
        this.senha = senha;
        this.perfil = perfil;
    }

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    
    @Override
    public String toString(){
        return id +"|"
              + nome +"|"
              + email +"|"
              + username +"|"
              + senha +"|"
              + perfil;
    }
    
}

 