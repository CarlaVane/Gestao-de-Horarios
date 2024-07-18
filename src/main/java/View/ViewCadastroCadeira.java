/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.CadeiraController;
import Controller.CursoController;
import Controller.DocenteController;
import Model.Cadeira;
import Model.Curso;
import Model.Docente;
import Service.CadeiraService;
import Service.DocenteService;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla Morais
 */
public class ViewCadastroCadeira extends javax.swing.JInternalFrame {
   
     private JTextField campoNome;
    private JTextField campoCargaHoraria;
   

    public ViewCadastroCadeira() {
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
        TextNCadeira = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextCargaH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCadeira = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ComoboxCurso = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComoBoxAno = new javax.swing.JComboBox<>();
        ComoboxSemestre = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Tela Cadastro Cadeira");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Carga Horária");

        TextCargaH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCargaHActionPerformed(evt);
            }
        });

        TabelaCadeira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome ", "Carga Horaria", "Curso", "Ano", "Semestre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaCadeira);

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Ano");

        ComoboxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        ComoboxCurso.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ComoboxCursoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ComoboxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComoboxCursoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Curso");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Semestre");

        ComoBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        ComoBoxAno.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ComoBoxAnoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ComoBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComoBoxAnoActionPerformed(evt);
            }
        });

        ComoboxSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        ComoboxSemestre.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ComoboxSemestreAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ComoboxSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComoboxSemestreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextNCadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(ComoboxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(ComoBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextCargaH, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(ComoboxSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextNCadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComoBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextCargaH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComoboxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComoboxSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextCargaHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCargaHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCargaHActionPerformed

    private void ComoboxCursoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ComoboxCursoAncestorAdded
      CursoController cursoController = new CursoController();
      cursoController.exibirCurso(ComoboxCurso);
    }//GEN-LAST:event_ComoboxCursoAncestorAdded

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        // TODO add your handling code here:
        salvarCadeira();
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        ExcluirCadeira();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
                                                                                                                                                                                                                                                                                                        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void ComoboxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComoboxCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComoboxCursoActionPerformed

    private void ComoBoxAnoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ComoBoxAnoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ComoBoxAnoAncestorAdded

    private void ComoBoxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComoBoxAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComoBoxAnoActionPerformed

    private void ComoboxSemestreAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ComoboxSemestreAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ComoboxSemestreAncestorAdded

    private void ComoboxSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComoboxSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComoboxSemestreActionPerformed
    private void salvarCadeira() {

        String nome = TextNCadeira.getText();
        int cargaHoraria = Integer.parseInt(TextCargaH.getText());
        String anoString = ComoBoxAno.getSelectedItem().toString();
        int ano = Integer.parseInt(anoString);
        String semestreString = ComoboxSemestre.getSelectedItem().toString();
        int semestre = Integer.parseInt(semestreString);
        Curso nomeCurso = (Curso) ComoboxCurso.getSelectedItem();

        Cadeira novaCadeira = new Cadeira();
        novaCadeira.setNome(nome);
        novaCadeira.setCargaHoraria(cargaHoraria);
        novaCadeira.setCurso(nomeCurso);
        novaCadeira.setAno(ano);
        novaCadeira.setSemestre(semestre);

        CadeiraController cadeiraController = new CadeiraController();
        cadeiraController.CadastrarCadeira(novaCadeira);

        limparCampos();
        popularTabela();
    }
 private void limparCampos() {
        TextNCadeira.setText("");
        TextCargaH.setText("");
       
    }
 
 
 private void ExcluirCadeira(){
        DefaultTableModel TBCadeira = (DefaultTableModel) TabelaCadeira.getModel();
        int selectedRow = TabelaCadeira.getSelectedRow();

        if (selectedRow != -1) {
            Object idObj = TBCadeira.getValueAt(selectedRow, 0);

            if (idObj != null) {
                try {
                    Long id = Long.valueOf(String.valueOf(idObj));
                    CadeiraService cadeiraService = new CadeiraService();
                    if (cadeiraService.excluirCadeira(id)) {
                       
                        TBCadeira.removeRow(selectedRow);

                        JOptionPane.showMessageDialog(null, "A Cadeira  foi excluída com sucesso na base de dados");
                    } else {
                        JOptionPane.showMessageDialog(null, " A cadeira com ID " + id + " não foi encontrado na base de dados");
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

 private void popularTabela() {
        // Supondo que você tenha uma referência ao modelo da tabela
        DefaultTableModel modeloTabela = (DefaultTableModel) TabelaCadeira.getModel();
      CadeiraController cadeira = new CadeiraController();
      cadeira.exibirCadeira(modeloTabela);
    }

private void jComboBoxMostrar(javax.swing.event.AncestorEvent evt) {                                         
    CursoController cursoController = new CursoController();
    cursoController.exibirCurso(ComoboxCurso);
    }
private void AlterarCadeira(){

DefaultTableModel TBCadeira = (DefaultTableModel) TabelaCadeira.getModel();
        int selectedRow = TabelaCadeira.getSelectedRow();
        campoNome = new javax.swing.JTextField();
        campoCargaHoraria = new javax.swing.JTextField();
        
    
        if (selectedRow != -1) {
            Object idObj = TBCadeira.getValueAt(selectedRow, 0); // Substitua "ID" pelo nome da coluna que contém o ID

            if (idObj != null) {
                try {
                    Long id = Long.valueOf(String.valueOf(idObj));

                   
                    carregarDadosParaEdicao(id);

                   
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao converter o ID para Long. Verifique o formato do ID, por favor.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ID é nulo. Verifique a linha selecionada, por favor.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para alterar.");
        }


    }                                          

    private void MostrarMouseClicked(java.awt.event.MouseEvent evt) {                                     
         popularTabela();
    }                                    
    private Docente carregarDadosParaEdicao(Long id) {
        // Aqui você deve implementar a lógica para carregar os dados do Docente para a tela de edição

        // Exemplo: Suponha que você tenha uma classe de serviço DocenteService que retorna um objeto Docente com base no ID
        DocenteService docenteService = new DocenteService();
        Docente docente = docenteService.buscarDocente(id);

        if (docente != null) {
            // Preencha os campos da tela de edição com os dados do Docente
            campoNome.setText(docente.getNome());
            campoCargaHoraria.setText(docente.getEspecializacao());
            

            return docente;
        } else {
            JOptionPane.showMessageDialog(null, "Docente com ID " + id + " não foi encontrado na base de dados");
            return null;
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComoBoxAno;
    private javax.swing.JComboBox<String> ComoboxCurso;
    private javax.swing.JComboBox<String> ComoboxSemestre;
    private javax.swing.JTable TabelaCadeira;
    private javax.swing.JTextField TextCargaH;
    private javax.swing.JTextField TextNCadeira;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
