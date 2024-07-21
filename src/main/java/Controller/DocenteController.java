/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Docente;
import Util.Role;
import Model.User;
import Service.DocenteService;
import View.ViewCadastroDocente;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla Morais
 */
public class DocenteController {

    private final DocenteService docenteService;

    public DocenteController() {
        this.docenteService = new DocenteService();
    }

    public void CriarView() {
        ViewCadastroDocente viewCadastrodocente = new ViewCadastroDocente();
        viewCadastrodocente.setVisible(true);
    }
/*
    public void CadastrarDocente(Docente docente) {
        if (this.docenteService.cadastrarDocente(docente)) {
            JOptionPane.showMessageDialog(null, "O Docente foi cadastrado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Docente.");
        }
    }
*/

    public void cadastrarDocenteComUsuario(Docente docente, User usuario) {
        if (this.docenteService.cadastrarDocenteComUsuario(docente, usuario)) {
            JOptionPane.showMessageDialog(null, "O Docente e o usuário foram cadastrados com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Docente e o usuário.");
        }
    }

    public void actualizarDocente(Docente docente) {
        if (this.docenteService.updateDocente(docente)) {
            JOptionPane.showMessageDialog(null, "O Docente foi atualizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o Docente.");
        }
    }

    public void excluirDocente(Long id) {
        if (this.docenteService.excluirDocente(id)) {
            JOptionPane.showMessageDialog(null, "O Docente foi excluído com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o Docente. Verifique o ID inserido por favor.");
        }
    }

    public void exibirDocente(JComboBox<String> comboBox) {
        List<Docente> Listdocente = this.docenteService.listarDocentes();

        if (Listdocente != null && !Listdocente.isEmpty()) {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>();

            for (Docente docente : Listdocente) {
               model.addElement(docente);
            }
            comboBox.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "Não há Docente para exibir");
        }
    }

    public void exibirDocente(DefaultTableModel modeloTabela) {
        List<Docente> listDocente = this.docenteService.listarDocentes();

        if (listDocente != null && !listDocente.isEmpty()) {
            modeloTabela.setRowCount(0);

            for (Docente docente : listDocente) {
                Object[] dados = {
                    docente.getId(),
                    docente.getNome(),
                    docente.getEmail(),
                    docente.getTelefone(),
                    docente.getEspecializacao(),
                    docente.getExperiencia(),
                    docente.getEndereco()
                    // Adicione outros campos conforme necessário
                };
                modeloTabela.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há Docentes para exibir.");
        }
    }
}
