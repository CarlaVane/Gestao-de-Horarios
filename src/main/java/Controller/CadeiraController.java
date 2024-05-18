/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cadeira;
import Model.Curso;
import Service.CadeiraService;
import Service.CursoService;
import View.ViewCadastroAula;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla Morais
 */
public class CadeiraController {

    private CadeiraService cadeiraService;

    public CadeiraController() {
        this.cadeiraService = new CadeiraService();
    }

    public void CriarView() {
        ViewCadastroAula viewCadastroAula = new ViewCadastroAula();
        viewCadastroAula.setVisible(true);

    }

    public void CadastrarCadeira(Cadeira cadeira) {
        if (this.cadeiraService.CadastraCadeira(cadeira)) {
            JOptionPane.showMessageDialog(null, " A A cadeira foi Cadastrada com Sucesso ");
        } else {
            JOptionPane.showConfirmDialog(null, "Erro ao Cadastrar a C");
        }

    }

    public void actualizarCadeira(Long id, Cadeira cadeiraActualizada) {
        if (this.cadeiraService.UpdateCadeira(id, cadeiraActualizada)) {
            JOptionPane.showMessageDialog(null, "A Cadeira foi actualizada com suceso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar a Cadeira");
        }
    }

    public void excluirCadeira(Long id) {
        if (this.cadeiraService.excluirCadeira(id)) {
            JOptionPane.showMessageDialog(null, "A cadeira foi excluída com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Exclui a aula. Verfique o Id inserido por favor.");
        }
    }

    public void exibirCadeira(JComboBox<String> comboBox) {
        List<Cadeira> Listcadeiras = this.cadeiraService.listarCadeiras();

        if (Listcadeiras != null && !Listcadeiras.isEmpty()) {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>();

            for (Cadeira cadeira : Listcadeiras) {
               model.addElement(cadeira);
            }
            comboBox.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "Não há Cadeiras marcadas para exibir");
        }
    }
      public void exibirCadeira(DefaultTableModel modeloTabela) {
    List<Cadeira> listCadeira = this.cadeiraService.listarCadeiras();

    if (listCadeira != null && !listCadeira.isEmpty()) {
        modeloTabela.setRowCount(0); 

        for (Cadeira cadeira : listCadeira) {
            Object[] dados = {cadeira.getId(),cadeira.getNome(),cadeira.getCargaHoraria(),cadeira.getCurso(),cadeira.getAno(),cadeira.getSemestre()};
            modeloTabela.addRow(dados);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Não há Cadeiras para exibir");
    }
}

}
