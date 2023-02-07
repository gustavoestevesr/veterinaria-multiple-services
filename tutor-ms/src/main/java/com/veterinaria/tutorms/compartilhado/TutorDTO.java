package com.veterinaria.tutorms.compartilhado;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class TutorDTO {
    
    private String id;
    @NotBlank(message = "Campo 'nome' deve possuir caracteres não brancos")
    private String nome;
    @NotBlank(message = "Campo 'email' deve possuir caracteres não brancos")
    private String email;
    @Size(min = 6, max = 12, message = "Campo 'senha' deve possuir entre 6 a 12 caracteres")
    private String senha;
    @NotBlank(message = "Campo 'telefone' deve possuir caracteres não brancos")
    private String telefone;
    private LocalDate dataCadastro;
    
    public TutorDTO() {
        this.dataCadastro = LocalDate.now();
    }
    
    public TutorDTO(String nome, String email, String senha, String telefone, LocalDate dataCadastro) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.dataCadastro = LocalDate.now();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public String getTelefone() {
        return telefone;
    }
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
