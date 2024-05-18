/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.AulaController;
import Controller.CadeiraController;
import Controller.CursoController;
import Controller.DocenteController;
import Controller.HorarioController;
import Controller.Sala_de_AulaController;
import Model.Aula;
import Model.Cadeira;
import Model.Curso;
import Model.Docente;
import Model.Horario;
import Model.Sala_de_Aula;
import Service.AulaService;
import Util.Connection;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla Morais
 */
public class ViewCadastroAula extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewCadastroAula
     */
    public ViewCadastroAula() {
        initComponents();

    }

     private void popularTabela() {
        DefaultTableModel modeloTabela = (DefaultTableModel) TableAgendamento.getModel();
        AulaController aula = new AulaController();
        aula.exibirAulas(modeloTabela);

    }

    private void actualizarTabela() {
        popularTabela();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ComboxDocente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ComboBoxCadeira = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ComboxCurso = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxSala = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ComboBoxHorario = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAgendamento = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Tela Cadastro Aula");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Docente");

        ComboxDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboxDocente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ComboxDocenteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Cadeira");

        ComboBoxCadeira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxCadeira.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ComboBoxCadeiraAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Curso");

        ComboxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboxCurso.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ComboxCursoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Sala de Aula");

        ComboBoxSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxSala.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ComboBoxSalaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Horario");

        ComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxHorario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ComboBoxHorarioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        TableAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Sala de Aula", "Horário", "Docente", "Cadeira", "Curso"
            }
        ));
        jScrollPane1.setViewportView(TableAgendamento);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6)
                        .addComponent(TextNome)
                        .addComponent(ComboBoxSala, 0, 199, Short.MAX_VALUE))
                    .addComponent(ComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ComboBoxCadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(ComboxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4)
                    .addComponent(ComboxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxCadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        // TODO add your handling code here:
        CadastrarAula();
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void ComboxDocenteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ComboxDocenteAncestorAdded
        jComboBoxDocenteAncestorAdded(evt);
    }//GEN-LAST:event_ComboxDocenteAncestorAdded

    private void ComboBoxCadeiraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ComboBoxCadeiraAncestorAdded
        jComboBoxCadeiraAncestorAdded(evt);
    }//GEN-LAST:event_ComboBoxCadeiraAncestorAdded

    private void ComboBoxSalaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ComboBoxSalaAncestorAdded
        jComboBoxSalaAncestorAdded(evt);
    }//GEN-LAST:event_ComboBoxSalaAncestorAdded

    private void ComboBoxHorarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ComboBoxHorarioAncestorAdded
        jComboBoxHorarioAncestorAdded(evt);
    }//GEN-LAST:event_ComboBoxHorarioAncestorAdded

    private void ComboxCursoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ComboxCursoAncestorAdded
        jComboBoxCursoAncestorAdded(evt);
    }//GEN-LAST:event_ComboxCursoAncestorAdded

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        excluirAula();
        
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void jComboBoxCursoAncestorAdded(javax.swing.event.AncestorEvent evt) {
        CursoController cursoController = new CursoController();
        cursoController.exibirCurso(ComboxCurso);
    }

    private void jComboBoxDocenteAncestorAdded(javax.swing.event.AncestorEvent evt) {
        DocenteController docenteController = new DocenteController();
        docenteController.exibirDocente(ComboxDocente);
    }

    private void jComboBoxCadeiraAncestorAdded(javax.swing.event.AncestorEvent evt) {
        CadeiraController cadeiraController = new CadeiraController();
        cadeiraController.exibirCadeira(ComboBoxCadeira);
    }

    private void jComboBoxSalaAncestorAdded(javax.swing.event.AncestorEvent evt) {
        Sala_de_AulaController salaController = new Sala_de_AulaController();
        salaController.exibirSalas(ComboBoxSala);
    }

    private void jComboBoxHorarioAncestorAdded(javax.swing.event.AncestorEvent evt) {
        HorarioController horariocontroller = new HorarioController();
        horariocontroller.exibirHorario(ComboBoxHorario);
    }

    private void CadastrarAula() {
        EntityManager em = Connection.getEntityManager();

        try {
            em.getTransaction().begin();

            String nome = TextNome.getText();
            Curso cursoSelecionado = (Curso) ComboxCurso.getSelectedItem();
            Cadeira cadeiraSelecionada = (Cadeira) ComboBoxCadeira.getSelectedItem();
            Docente docenteSelecionado = (Docente) ComboxDocente.getSelectedItem();
            Sala_de_Aula salaSelecionada = (Sala_de_Aula) ComboBoxSala.getSelectedItem();
            Horario horarioSelecionado = (Horario) ComboBoxHorario.getSelectedItem();

            if (nome.isEmpty() || cursoSelecionado == null || cadeiraSelecionada == null
                    || docenteSelecionado == null || salaSelecionada == null || horarioSelecionado == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
                return;
            }

            Aula aulanova = new Aula();
            aulanova.setNome(nome);
            aulanova.setCurso(cursoSelecionado);
            aulanova.setDocente(docenteSelecionado);
            aulanova.setCadeira(cadeiraSelecionada);
            aulanova.setSaladeAula(salaSelecionada);
            aulanova.setHorario(horarioSelecionado);

            AulaService aulaService = new AulaService();

            TypedQuery<Long> query = em.createQuery(
                    "SELECT COUNT(a) FROM Model.Aula a "
                    + "WHERE a.horario.dia = :dia "
                    + "AND a.horario.periodo = :periodo "
                    + "AND a.SaladeAula.nomeSala = :nomeSala "
                    + "AND ( "
                    + "(:horaInicio BETWEEN a.horario.horaInicio AND a.horario.horaFim) "
                    + "OR (:horaInicio BETWEEN a.horario.horaInicio AND a.horario.horaFim) "
                    + "OR (a.horario.horaInicio BETWEEN :horaInicio AND :horaFim) "
                    + "OR (a.horario.horaFim BETWEEN :horaInicio AND :horaFim) "
                    + ")",
                    Long.class);

            query.setParameter("dia", aulanova.getHorario().getDia());
            query.setParameter("periodo", aulanova.getHorario().getPeriodo());
            query.setParameter("nomeSala", aulanova.getSaladeAula().getNomeSala());
            query.setParameter("horaInicio", aulanova.getHorario().getHoraInicio());
            query.setParameter("horaFim", aulanova.getHorario().getHoraFim());

            Long quantidadeConflitos = query.getSingleResult();

            if (quantidadeConflitos > 0) {
                JOptionPane.showMessageDialog(null, "Conflito detectado! Não é permitido agendar aula nessas condições.");
            } else {
                AulaController aulaController = new AulaController();
                aulaController.CadastrarAula(aulanova);
                JOptionPane.showMessageDialog(null, "Aula cadastrada com sucesso!");
            }

            em.getTransaction().commit();
        } catch (PersistenceException ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex.getMessage());
        } finally {
            em.close();
        }
        popularTabela();
    }

    private void LimparCampo() {
        TextNome.setText("");
    }

private void excluirAula(){
          DefaultTableModel TBHorario = (DefaultTableModel) TableAgendamento.getModel();
        int selectedRow = TableAgendamento.getSelectedRow();

        if (selectedRow != -1) {
            Object idObj = TBHorario.getValueAt(selectedRow, 0);

            if (idObj != null) {
                try {
                    Long id = Long.valueOf(String.valueOf(idObj));

                    AulaService aulaService = new AulaService();

                    if (aulaService.eliminarAulaMarcada(id)) {

                        TBHorario.removeRow(selectedRow);

                        JOptionPane.showMessageDialog(null, " Aula foi excluído com sucesso na base de dados");
                    } else {
                        JOptionPane.showMessageDialog(null, " Aula com ID " + id + " não foi encontrado na base de dados");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao converter o ID para Long. Verifique o formato do ID, por favor.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ID é nulo. Verifique a linha selecionada, por favor.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para excluir.");
        }
       popularTabela();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCadeira;
    private javax.swing.JComboBox<String> ComboBoxHorario;
    private javax.swing.JComboBox<String> ComboBoxSala;
    private javax.swing.JComboBox<String> ComboxCurso;
    private javax.swing.JComboBox<String> ComboxDocente;
    private javax.swing.JTable TableAgendamento;
    private javax.swing.JTextField TextNome;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
