/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Service.UserService;
import Util.GeradorSenha;
import Util.Role;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla Morais
 */
public class UserController {

    private final UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public void CadastrarUsuarios(User usuarios) {
    String senhaGerada = GeradorSenha.generateRandomSenha();
    usuarios.setSenha(senhaGerada);
    User novoUsuario = this.userService.cadastrarUsuario(usuarios);
    if (novoUsuario != null) {
        JOptionPane.showMessageDialog(null, "O Usuário foi cadastrado com sucesso.");
    } else {
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuário.");
    }
}


    public void excluirUsuario(Long id) {
        if (this.userService.excluirUser(id)) {
            JOptionPane.showMessageDialog(null, " Usuário foi excluído com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Exclui o usuário. Verfique o Id inserido por favor.");
        }
    }

    public void exibirUsuario(JComboBox<String> comboBox) {
        Role[] roles = Role.values();
        if (roles != null && roles.length > 0) {

            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            for (Role role : roles) {
                model.addElement(role.toString());
            }
            comboBox.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "Não há níveis de acesso para exibir");
        }

    }

    
    public void buscarUsuariosPorEmail(String email, DefaultTableModel modeloTabela) {
    List<User> listUser = this.userService.buscarUsuariosPorEmail(email);

    if (listUser != null && !listUser.isEmpty()) {
        modeloTabela.setRowCount(0);

        for (User usuario : listUser) {
            Object[] dados = {usuario.getId(), usuario.getEmail(), usuario.getNivelAcesso()};
            modeloTabela.addRow(dados);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Não há usuários para exibir.");
    }
}

}
