/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.Sala_de_AulaController;
import Model.Curso;
import Model.Sala_de_Aula;
import Service.Sala_de_AulaService;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla Morais
 */
public class ViewCadastradoSaladeAula extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewCadastradoSaladeAula
     */
    public ViewCadastradoSaladeAula() {
        initComponents();
        
    }
 private void popularTabela() {
        DefaultTableModel modeloTabela = (DefaultTableModel) TableSalaDeAula.getModel();
        Sala_de_AulaController sala = new Sala_de_AulaController();
        sala.exibirSala(modeloTabela);
   
    }

    private void atualizarTabela() {
        popularTabela();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TexttCapacidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxAndar = new javax.swing.JComboBox<>();
        ComboBoxEdificio = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSalaDeAula = new javax.swing.JTable();
        BtnSalvar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        LabelDisponibilidade = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome da Sala");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Capacidade");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Edifício");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Andar");

        ComboBoxAndar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        ComboBoxEdificio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunda", "Bengo", "Luanda", "Malanje" }));

        TableSalaDeAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Edificio", "Andar", "Capacidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableSalaDeAula);

        BtnSalvar.setText("Salvar");
        BtnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalvarMouseClicked(evt);
            }
        });
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
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
                .addGap(297, 297, 297)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(LabelDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TexttCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBoxEdificio, 0, 194, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(ComboBoxAndar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(LabelDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexttCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void BtnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalvarMouseClicked
       salvarSala();
    }//GEN-LAST:event_BtnSalvarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
      ExcluirSala();
    }//GEN-LAST:event_btnEliminarMouseClicked
    private void salvarSala() {

        String nome = TextNome.getText();
        int capacidade = Integer.parseInt(TexttCapacidade.getText());
        String edificio = ComboBoxEdificio.getSelectedItem().toString();
        String andarString = ComboBoxAndar.getSelectedItem().toString();
        int andar = Integer.parseInt(andarString);

        Sala_de_Aula novaSala = new Sala_de_Aula();
        Sala_de_AulaController salaController = new Sala_de_AulaController();

        novaSala.setNomeSala(nome);
        novaSala.setCapacidade(capacidade);
        novaSala.setEdificio(edificio);
        novaSala.setAndar(andar);
        novaSala.setDisponivel(true);

        salaController.CadastrarSala(novaSala);
        if (novaSala.isDisponivel()) {
            LabelDisponibilidade.setText("Disponível");
        } else {
            LabelDisponibilidade.setText("Não Disponível");
        }
        popularTabela();
        limparCampos();
    }

    private void ExcluirSala() {
        DefaultTableModel TBSala = (DefaultTableModel) TableSalaDeAula.getModel();
        int selectedRow = TableSalaDeAula.getSelectedRow();

        if (selectedRow != -1) {
            Object idObj = TBSala.getValueAt(selectedRow, 0);

            if (idObj != null) {
                try {
                    Long id = Long.valueOf(String.valueOf(idObj));

                    Sala_de_AulaService salaService = new Sala_de_AulaService();

                    if (salaService.eliminarSala(id)) {

                        TBSala.removeRow(selectedRow);

                        JOptionPane.showMessageDialog(null, "A sala foi excluída com sucesso na base de dados");
                    } else {
                        JOptionPane.showMessageDialog(null, "A sala com ID " + id + " não foi encontrada na base de dados");
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

    private void limparCampos() {
        TextNome.setText("");
        TexttCapacidade.setText("");
        TexttCapacidade.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JComboBox<String> ComboBoxAndar;
    private javax.swing.JComboBox<String> ComboBoxEdificio;
    private javax.swing.JLabel LabelDisponibilidade;
    private javax.swing.JTable TableSalaDeAula;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TexttCapacidade;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
