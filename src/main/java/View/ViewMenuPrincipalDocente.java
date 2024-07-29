/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.AdminController;
import Util.Role;
import javax.swing.JOptionPane;

/**
 *
 * @author Carla Morais
 */
public class ViewMenuPrincipalDocente extends javax.swing.JFrame {

    /**
     * Creates new form ViewMenuPrincipal
     */
    public ViewMenuPrincipalDocente() {
        initComponents(); 
        configurarPermissoes();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDesktop1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Dashboard = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenu();
        MenuMudarSenha = new javax.swing.JMenu();
        MenuInformações = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        MenuDocente = new javax.swing.JMenu();
        MenuCadeira = new javax.swing.JMenu();
        MenuSala = new javax.swing.JMenuItem();
        MenuCurso = new javax.swing.JMenu();
        MenuAdmin = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        MenuHorario = new javax.swing.JMenuItem();
        MenuMarcacaoAula = new javax.swing.JMenuItem();
        MenuVisualizarHorario = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        MenuUserCadastrados = new javax.swing.JMenu();
        MenuRelatorios = new javax.swing.JMenu();
        MenuSobre = new javax.swing.JMenu();

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setText("Docentes");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktop1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktop1Layout = new javax.swing.GroupLayout(jDesktop1);
        jDesktop1.setLayout(jDesktop1Layout);
        jDesktop1Layout.setHorizontalGroup(
            jDesktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        jDesktop1Layout.setVerticalGroup(
            jDesktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagens/icons8-dashboard-50 (1).png"))); // NOI18N
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        Dashboard.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DashboardPropertyChange(evt);
            }
        });
        jMenuBar1.add(Dashboard);

        jMenu2.setText("Sistema");

        MenuSair.setText("Logout");
        MenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSairMouseClicked(evt);
            }
        });
        jMenu2.add(MenuSair);

        MenuMudarSenha.setText("Mudar Senha");
        MenuMudarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMudarSenhaMouseClicked(evt);
            }
        });
        jMenu2.add(MenuMudarSenha);

        MenuInformações.setText("Informações Pessoais");
        MenuInformações.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuInformaçõesMouseClicked(evt);
            }
        });
        jMenu2.add(MenuInformações);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cadastro");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        MenuDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagens/teacher.png"))); // NOI18N
        MenuDocente.setText("Docente");
        MenuDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDocenteMouseClicked(evt);
            }
        });
        MenuDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDocenteActionPerformed(evt);
            }
        });
        jMenu3.add(MenuDocente);

        MenuCadeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagens/books.png"))); // NOI18N
        MenuCadeira.setText("Cadeira");
        MenuCadeira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuCadeiraMouseClicked(evt);
            }
        });
        MenuCadeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadeiraActionPerformed(evt);
            }
        });
        jMenu3.add(MenuCadeira);

        MenuSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagens/school-desk.png"))); // NOI18N
        MenuSala.setText("Sala");
        MenuSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSalaMouseClicked(evt);
            }
        });
        MenuSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalaActionPerformed(evt);
            }
        });
        jMenu3.add(MenuSala);

        MenuCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagens/graduacao.png"))); // NOI18N
        MenuCurso.setText("Curso");
        MenuCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuCursoMouseClicked(evt);
            }
        });
        MenuCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCursoActionPerformed(evt);
            }
        });
        jMenu3.add(MenuCurso);

        MenuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagens/admin_user_icon_217189 (1).png"))); // NOI18N
        MenuAdmin.setText("Administrador");
        MenuAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAdminMouseClicked(evt);
            }
        });
        jMenu3.add(MenuAdmin);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Gerenciamento de Horários");

        MenuHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagens/timetable.png"))); // NOI18N
        MenuHorario.setText("Criação e edição de horários");
        MenuHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuHorarioMouseClicked(evt);
            }
        });
        MenuHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHorarioActionPerformed(evt);
            }
        });
        jMenu5.add(MenuHorario);

        MenuMarcacaoAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagens/livro.png"))); // NOI18N
        MenuMarcacaoAula.setText("Agendamento de Aula");
        MenuMarcacaoAula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMarcacaoAulaMouseClicked(evt);
            }
        });
        MenuMarcacaoAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMarcacaoAulaActionPerformed(evt);
            }
        });
        jMenu5.add(MenuMarcacaoAula);

        MenuVisualizarHorario.setText("Visualização de horário");
        jMenu5.add(MenuVisualizarHorario);

        jMenuBar1.add(jMenu5);

        jMenu9.setText("Consulta e Relatórios");

        MenuUserCadastrados.setText("Visualização de Usuários Cadastrados");
        MenuUserCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuUserCadastradosMouseClicked(evt);
            }
        });
        jMenu9.add(MenuUserCadastrados);

        MenuRelatorios.setText("Relatórios de horários disponíveis");
        jMenu9.add(MenuRelatorios);

        jMenuBar1.add(jMenu9);

        MenuSobre.setText("Sobre");
        MenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSobreMouseClicked(evt);
            }
        });
        MenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDocenteMouseClicked
      jDesktop1.removeAll();
        ViewCadastroDocente docente = new    ViewCadastroDocente();
         jDesktop1.add(docente).setVisible(true);
    }//GEN-LAST:event_MenuDocenteMouseClicked

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked

        jDesktop1.removeAll();
        HomeAdmin admin = new HomeAdmin();
        jDesktop1.add(admin).setVisible(true);
    }//GEN-LAST:event_DashboardMouseClicked

    private void MenuCadeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadeiraActionPerformed
   
    }//GEN-LAST:event_MenuCadeiraActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void MenuCadeiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuCadeiraMouseClicked
        // TODO add your handling code here:
        jDesktop1.removeAll();
        ViewCadastroCadeira cadeira = new ViewCadastroCadeira();

        jDesktop1.add(cadeira).setVisible(true);
    }//GEN-LAST:event_MenuCadeiraMouseClicked

    private void MenuCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCursoActionPerformed

    private void MenuDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuDocenteActionPerformed

    private void MenuCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuCursoMouseClicked
       jDesktop1.removeAll();
        ViewCadastroCurso curso = new ViewCadastroCurso();

        jDesktop1.add(curso).setVisible(true);
    }//GEN-LAST:event_MenuCursoMouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void MenuHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHorarioActionPerformed
        // TODO add your handling code here:
         jDesktop1.removeAll();
        ViewCadastroHorario horario = new ViewCadastroHorario();
        jDesktop1.add(horario).setVisible(true);
    }//GEN-LAST:event_MenuHorarioActionPerformed

    private void MenuHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuHorarioMouseClicked
        jDesktop1.removeAll();
        ViewCadastroHorario horario = new ViewCadastroHorario();
        jDesktop1.add(horario).setVisible(true);
    }//GEN-LAST:event_MenuHorarioMouseClicked

    private void MenuSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalaActionPerformed
        // TODO add your handling code here:
        jDesktop1.removeAll();
        ViewCadastradoSaladeAula sala = new ViewCadastradoSaladeAula();

        jDesktop1.add(sala).setVisible(true);
    }//GEN-LAST:event_MenuSalaActionPerformed

    private void MenuSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSalaMouseClicked
        // TODO add your handling code here:
        jDesktop1.removeAll();
        ViewCadastradoSaladeAula sala = new ViewCadastradoSaladeAula();

        jDesktop1.add(sala).setVisible(true);
    }//GEN-LAST:event_MenuSalaMouseClicked

    private void MenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSairMouseClicked
       AdminController admin = new AdminController();
      
               
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
             admin.realizarLogout();
            Login login = new Login();
            login.setVisible(true);
            dispose();

    }
    }//GEN-LAST:event_MenuSairMouseClicked

    private void MenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSobreMouseClicked
        // TODO add your handling code here:
         jDesktop1.removeAll();
        ViewSobre sobre = new ViewSobre();
        jDesktop1.add(sobre).setVisible(true);
    }//GEN-LAST:event_MenuSobreMouseClicked

    private void MenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSobreActionPerformed
        // TODO add your handling code here:
         jDesktop1.removeAll();
        ViewSobre sobre = new ViewSobre();
        jDesktop1.add(sobre).setVisible(true);
    }//GEN-LAST:event_MenuSobreActionPerformed

    private void MenuMudarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMudarSenhaMouseClicked
        // TODO add your handling code here:
          jDesktop1.removeAll();
        ViewMudarSenhaDocente senha = new    ViewMudarSenhaDocente();
         jDesktop1.add(senha).setVisible(true);
    }//GEN-LAST:event_MenuMudarSenhaMouseClicked

    private void MenuAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAdminMouseClicked
        // TODO add your handling code here:
        jDesktop1.removeAll();
        ViewCadastroUser user = new ViewCadastroUser();
        jDesktop1.add(user).setVisible(true);
    }//GEN-LAST:event_MenuAdminMouseClicked

    private void MenuUserCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuUserCadastradosMouseClicked
    jDesktop1.removeAll();
    ViewUsuariosCadastrados usuarios = new ViewUsuariosCadastrados();
    jDesktop1.add(usuarios).setVisible(true);
    }//GEN-LAST:event_MenuUserCadastradosMouseClicked

    private void MenuInformaçõesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInformaçõesMouseClicked
        // TODO add your handling code here:
        jDesktop1.removeAll();
        InformacoesDocente abrir = new InformacoesDocente();
        jDesktop1.add(abrir).setVisible(true);
    }//GEN-LAST:event_MenuInformaçõesMouseClicked

    private void MenuMarcacaoAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMarcacaoAulaActionPerformed
        jDesktop1.removeAll();
        ViewCadastroAula aula = new ViewCadastroAula();
        jDesktop1.add(aula).setVisible(true);
    }//GEN-LAST:event_MenuMarcacaoAulaActionPerformed

    private void MenuMarcacaoAulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMarcacaoAulaMouseClicked
     

    }//GEN-LAST:event_MenuMarcacaoAulaMouseClicked

    private void DashboardPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DashboardPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_DashboardPropertyChange

    
    private void configurarPermissoes() {
    // Obter o nível de acesso do usuário logado
        MenuVisualizarHorario.setEnabled(true);
        MenuMudarSenha.setEnabled(true);
        MenuDocente.setEnabled(false);
        MenuCurso.setEnabled(false);
        MenuInformações.setEnabled(true);
        MenuSobre.setEnabled(true);
        MenuSala.setEnabled(false);
        MenuUserCadastrados.setEnabled(false);
        MenuHorario.setEnabled(false);
        MenuSair.setEnabled(true);
        MenuCadeira.setEnabled(false);
        MenuMarcacaoAula.setEnabled(false);
        MenuSobre.setEnabled(true);
        MenuAdmin.setEnabled(false);
        MenuRelatorios.setEnabled(false);
        Dashboard.setEnabled(false);
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipalDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipalDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipalDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipalDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenuPrincipalDocente().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Dashboard;
    private javax.swing.JMenu MenuAdmin;
    private javax.swing.JMenu MenuCadeira;
    private javax.swing.JMenu MenuCurso;
    private javax.swing.JMenu MenuDocente;
    private javax.swing.JMenuItem MenuHorario;
    private javax.swing.JMenu MenuInformações;
    private javax.swing.JMenuItem MenuMarcacaoAula;
    private javax.swing.JMenu MenuMudarSenha;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JMenuItem MenuSala;
    private javax.swing.JMenu MenuSobre;
    private javax.swing.JMenu MenuUserCadastrados;
    private javax.swing.JMenu MenuVisualizarHorario;
    private javax.swing.JPanel jDesktop1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
