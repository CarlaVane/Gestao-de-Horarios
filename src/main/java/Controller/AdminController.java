/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Admin;
import Model.User;
import Service.AdminService;
import Util.SessaoAdmin;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Controlador para a entidade Admin
 */
public class AdminController {

    private final AdminService adminService;

    public AdminController() {
        this.adminService = new AdminService();
    }
   public int getDocentesCount() {
        return adminService.getDocentesCount();
    }
   public int getCadeirasCount(){
       return adminService.getCadeiraCount();
   }
   public int getCursoCount(){
       return adminService.getCursoCount();
   }
   public int getSalaCount(){
       return adminService.getSalaCount();
   }
   public int getAulaCount(){
       return adminService.getAulaCount();
   }
    public void cadastrarAdminComUsuario(Admin admin, User usuario) {
        if (this.adminService.cadastrarAdminComUsuario(admin, usuario)) {
            JOptionPane.showMessageDialog(null, "Administrador e o usuário foram cadastrados com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o administrador e o usuário.");
        }
    }

    public void atualizarAdmin(Long id, Admin adminAtualizado) {
        if (this.adminService.atualizarDados(id, adminAtualizado)) {
            JOptionPane.showMessageDialog(null, "Os dados do administrador foram atualizados com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados do administrador.");
        }
    }

    public void excluirAdmin(Long id) {
        if (this.adminService.eliminarAdmin(id)) {
            JOptionPane.showMessageDialog(null, "Administrador excluído com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o administrador. Verifique o ID inserido.");
        }
    }
    
    
    public void atualizarSenhaAdmin(Long adminId, String novaSenha) {
        if (adminService.atualizarSenhaAdmin(adminId, novaSenha)) {
            JOptionPane.showMessageDialog(null, "Senha atualizada com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a senha.");
        }
    }

     
    public void realizarLogout() {
        SessaoAdmin.clear(); 
        JOptionPane.showMessageDialog(null, "Você saiu do sistema.");
        
    }
    public void exibirAdmin(DefaultTableModel modeloTabela) {
        List<Admin> listAdmin = this.adminService.listarAdmin();

        if (listAdmin != null && !listAdmin.isEmpty()) {
            modeloTabela.setRowCount(0);

            for (Admin admin : listAdmin) {
                Object[] dados = {admin.getId(), admin.getNome(), admin.getTelefone(), admin.getEmail()};
                modeloTabela.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há administradores para exibir.");
        }
    }
}
