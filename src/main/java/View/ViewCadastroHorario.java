/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.HorarioController;
import Model.Horario;
import Service.HorarioService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla Morais
 */
public class ViewCadastroHorario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewCadastroHorario
     */
    public ViewCadastroHorario() {
        initComponents();
    }

    private void popularTabela() {
        DefaultTableModel modeloTabela = (DefaultTableModel) TabelaHorario.getModel();
        HorarioController horario = new HorarioController();
        horario.exibirHorarios(modeloTabela);

    }

    private void actualizarTabela() {
        popularTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textHoraInicio = new javax.swing.JTextField();
        textHorafim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxPeriodo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxDiaSemana = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaHorario = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tela Cadastro Horario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Hora");

        textHorafim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHorafimActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Periodo");

        ComboBoxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Dia da Semana");

        ComboBoxDiaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sábado", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira" }));
        ComboBoxDiaSemana.setSelectedIndex(1);
        ComboBoxDiaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDiaSemanaActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        TabelaHorario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TabelaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Hora Inicio", "Hora fim", "Periodo", "Dia da Semana"
            }
        ));
        jScrollPane1.setViewportView(TabelaHorario);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel7.setText("às");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(119, 119, 119))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboBoxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(13, 13, 13)
                        .addComponent(textHorafim, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHorafim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(ComboBoxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textHorafimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHorafimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHorafimActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        CadastrarHorario();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void ComboBoxDiaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxDiaSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDiaSemanaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        excluirHorario();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void CadastrarHorario() {
        String horaInicioTexto = textHoraInicio.getText();
        String horaFimTexto = textHorafim.getText();
        String diaDaSemana = (String) ComboBoxDiaSemana.getSelectedItem();
        String perido = (String) ComboBoxPeriodo.getSelectedItem();

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        try {
            Date horaInicio = sdf.parse(horaInicioTexto);
            Date horaFim = sdf.parse(horaFimTexto);
            if (horaInicioTexto.isEmpty() || horaFimTexto.isEmpty() || diaDaSemana.isEmpty() || perido == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
                return;
            }
            Horario horario = new Horario();
            horario.setHoraInicio(horaInicio);
            horario.setHoraFim(horaFim);
            horario.setDia(diaDaSemana);
            horario.setPeriodo(perido);

            HorarioController horarioController = new HorarioController();
            horarioController.CadastrarHorario(horario);
            System.out.println("Hora de Início Formatada: " + sdf.format(horaInicio));
            System.out.println("Hora de Fim Formatada: " + sdf.format(horaFim));

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de hora inválido. Por favor, use o formato HH:mm.");
            e.printStackTrace();

        }
        popularTabela();
    }

    private void excluirHorario() {
        DefaultTableModel TBHorario = (DefaultTableModel) TabelaHorario.getModel();
        int selectedRow = TabelaHorario.getSelectedRow();

        if (selectedRow != -1) {
            Object idObj = TBHorario.getValueAt(selectedRow, 0);

            if (idObj != null) {
                try {
                    Long id = Long.valueOf(String.valueOf(idObj));

                    HorarioService horarioService = new HorarioService();

                    if (horarioService.excluirHorario(id)) {

                        TBHorario.removeRow(selectedRow);

                        JOptionPane.showMessageDialog(null, " Horário foi excluído com sucesso na base de dados");
                    } else {
                        JOptionPane.showMessageDialog(null, " Horário com ID " + id + " não foi encontrado na base de dados");
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
    private javax.swing.JComboBox<String> ComboBoxDiaSemana;
    private javax.swing.JComboBox<String> ComboBoxPeriodo;
    private javax.swing.JTable TabelaHorario;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textHoraInicio;
    private javax.swing.JTextField textHorafim;
    // End of variables declaration//GEN-END:variables
}
