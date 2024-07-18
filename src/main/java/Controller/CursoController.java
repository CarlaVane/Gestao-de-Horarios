/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.Curso;
import Service.CursoService;
import View.ViewCadastroCurso;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla Morais
 */
public class CursoController {

    private CursoService cursoService;

    public CursoController() {
        this.cursoService = new CursoService();
    }

    public void CriarView() {
        ViewCadastroCurso viewCadastrocurso = new ViewCadastroCurso();
        viewCadastrocurso.setVisible(true);

    }

    public void CadastrarCurso(Curso curso) {
        if (this.cursoService.CadastrarCurso(curso)) {
            JOptionPane.showMessageDialog(null, "O curso foi Cadastrado com Sucesso ");
        } else {
            JOptionPane.showConfirmDialog(null, "Erro ao Cadastrar o Curso");
        }

    }

    public void actualizarCurso(Long id, Curso cursoActualizada) {
        if (this.cursoService.UpdateCurso(id, cursoActualizada)) {
            JOptionPane.showMessageDialog(null, "O curso foi actualizado com suceso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar o curso");
        }
    }

    public void excluirCurso(Long id) {
        if (this.cursoService.excluirCurso(id)) {
            JOptionPane.showMessageDialog(null, "O curso foi excluído com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Exclui o curso. Verfique o Id inserido por favor.");
        }
    }

    public void exibirCurso(JComboBox<String> comboBox) {
        List<Curso> ListCurso = this.cursoService.listarCursos();

        if (ListCurso != null && !ListCurso.isEmpty()) {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>();

            for (Curso curso : ListCurso) {
                model.addElement(curso);
            }
            comboBox.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "Não há Cursos para exibir");
        }
    }

    public void exibirCursos(DefaultTableModel modeloTabela) {
        List<Curso> listCurso = this.cursoService.listarCursos();

        if (listCurso != null && !listCurso.isEmpty()) {
            modeloTabela.setRowCount(0);

            for (Curso curso : listCurso) {
                Object[] dados = {curso.getId(),curso.getNome(), curso.getDuracao()};
                modeloTabela.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há Cursos para exibir");
        }
    }
}
