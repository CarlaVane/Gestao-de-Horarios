/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Model.Admin;
import Model.User;
import Service.AdminService;
import Util.SessaoAdmin;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Carla Morais
 */
public class ViewMudarSenha extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewMudarSenha
     */
    public ViewMudarSenha() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        passActual = new javax.swing.JPasswordField();
        passNova = new javax.swing.JPasswordField();
        passConfirmarNova = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Mudar Senha");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Senha Actual");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nova Senha");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Confirmar Senha");

        btnSalvar.setText("salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        passActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActualActionPerformed(evt);
            }
        });

        passConfirmarNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passConfirmarNovaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(passActual, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passNova, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passConfirmarNova, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passConfirmarNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passConfirmarNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passConfirmarNovaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passConfirmarNovaActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        // TODO add your handling code here:
        salvarSenha();
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void passActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActualActionPerformed

private void salvarSenha() {
    String senhaActual = new String(passActual.getPassword());
    String senhaNova = new String(passNova.getPassword());
    String confirmarSenha = new String(passConfirmarNova.getPassword());

    if (senhaActual.isEmpty() || senhaNova.isEmpty() || confirmarSenha.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        return;
    }

    Long adminId = SessaoAdmin.getAdminId();
    if (adminId == null) {
        JOptionPane.showMessageDialog(null, "Você precisa estar logado para atualizar a senha.");
        return;
    }

    if (!senhaNova.equals(confirmarSenha)) {
        JOptionPane.showMessageDialog(null, "A nova senha e a confirmação não coincidem.");
        return;
    }

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MeuSistema-jpa");
    EntityManager em = emf.createEntityManager();
    AdminService adminService = new AdminService(em);

    // Log para confirmar o ID do administrador logado
    System.out.println("Atualizando senha para o admin com ID: " + adminId);

    if (adminService.atualizarSenhaAdmin(adminId, confirmarSenha)) {
        JOptionPane.showMessageDialog(null, "Senha atualizada com sucesso.");
    } else {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar a senha.");
    }

    em.close();
    emf.close();
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passActual;
    private javax.swing.JPasswordField passConfirmarNova;
    private javax.swing.JPasswordField passNova;
    // End of variables declaration//GEN-END:variables
}
