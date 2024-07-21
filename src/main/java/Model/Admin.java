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

/**
 *
 * @author Carla Morais
 */
@Entity
public class Admin extends Pessoa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    
    
    @ManyToOne
    private User usuario;

    
     
    public Admin() {
        this.usuario = new User();
        this.usuario.setNivelAcesso(Role.ADMIN);
    }

    /**
     *
     * @return
     */
    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
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
