/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Util.Role;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Administrador extends Pessoa implements Serializable {

    @ManyToOne
    private User usuario;

    public Administrador() {
        super();
        this.usuario = new User();
        this.usuario.setNivelAcesso(Role.ADMIN);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
        this.usuario.setNivelAcesso(Role.ADMIN);
    }
}
