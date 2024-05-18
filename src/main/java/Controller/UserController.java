/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.User;
import Service.UserService;
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
        if (this.userService.CadastrarUsuario(usuarios)) {
            JOptionPane.showMessageDialog(null, " O Usuario foi Cadastrado com Sucesso ");
        } else {
            JOptionPane.showConfirmDialog(null, "Erro ao Cadastrar Usuario");
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
        List<User> ListUser = this.userService.listarUsuarios();

        if (ListUser!= null && !ListUser.isEmpty()) {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>();

            for (User usuario :ListUser) {
                model.addElement(usuario);
            }
            comboBox.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "Não há usuários  para exibir");
        }
    }

    public void exibirUsusarios(DefaultTableModel modeloTabela) {
        List<User> listUser = this.userService.listarUsuarios();

        if (listUser != null && !listUser.isEmpty()) {
            modeloTabela.setRowCount(0);

            for (User usuario : listUser) {
                Object[] dados = {usuario.getId(),usuario.getNomeDeUsuario()};
                modeloTabela.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não usuários para exibir");
        }
    }

    

}

