/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Util.Role;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Docente extends Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String especializacao;
    private int experiencia;
    private String endereco;

    @ManyToOne
    private Cadeira cadeira;

    @ManyToOne
    private User usuario;

   public Docente() {
        // Construtor padrão
    }

    // Construtor com parâmetros, se necessário
    public Docente(String especializacao, int experiencia, String endereco, Cadeira cadeira, User usuario) {
        this.especializacao = especializacao;
        this.experiencia = experiencia;
        this.endereco = endereco;
        this.cadeira = cadeira;
        this.usuario = usuario;
        if (this.usuario != null) {
            this.usuario.setNivelAcesso(Role.DOCENTE);
        }
    }
    public Cadeira getCadeira() {
        return cadeira;
    }

    public void setCadeira(Cadeira cadeira) {
        this.cadeira = cadeira;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
        this.usuario.setNivelAcesso(Role.DOCENTE); 
    }
}
