/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Horario;
import Service.HorarioService;
import View.ViewCadastroHorario;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla Morais
 */
public class HorarioController {

    private HorarioService horarioService;

    public HorarioController() {
        this.horarioService = new HorarioService();
    }

    public void CriarView() {
        ViewCadastroHorario viewCadastroHorario = new ViewCadastroHorario();
        viewCadastroHorario.setVisible(true);

    }

    public void CadastrarHorario(Horario horario) {
        if (this.horarioService.CadastrarHorario(horario)) {
            JOptionPane.showMessageDialog(null, " A aula foi Cadastrada com Sucesso ");
        } else {
            JOptionPane.showConfirmDialog(null, "Erro ao Cadastrar aula");
        }

    }

    public void UpdateHorario(Long id, Horario horarioActualizado) {
        if (this.horarioService.UpdateHorario(id, horarioActualizado)) {
            JOptionPane.showMessageDialog(null, "O horário foi actualizado com suceso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar o horário,");
        }
    }

    public void excluirHorario(Long id) {
        if (this.horarioService.excluirHorario(id)) {
            JOptionPane.showMessageDialog(null, "foi excluído com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Exclui a aula. Verfique o Id inserido por favor.");
        }
    }

    public void exibirHorario(JComboBox<String> comboBox) {
        List<Horario> ListHorario = this.horarioService.listarHorarios();

        if (ListHorario != null && !ListHorario.isEmpty()) {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>();

            for (Horario horario : ListHorario) {
                model.addElement(horario);
            }
            comboBox.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "Não há Horarios  para exibir");
        }
    }

    public void exibirHorarios(DefaultTableModel modeloTabela) {
        List<Horario> listHorario = this.horarioService.listarHorarios();

        if (listHorario != null && !listHorario.isEmpty()) {
            modeloTabela.setRowCount(0);

            for (Horario horario : listHorario) {
                Object[] dados = {horario.getId(), horario.getHoraInicio(), horario.getHoraFim(), horario.getPeriodo(), horario.getDia(),};
                modeloTabela.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há Cursos para exibir");
        }
    }
    
    
     public void exibirHorarioss(DefaultTableModel modeloTabela) {
        List<Horario> listHorario = this.horarioService.listarHorarios();

        if (listHorario != null && !listHorario.isEmpty()) {
            modeloTabela.setRowCount(0);

            for (Horario horario : listHorario) {
                Object[] dados = {horario.getId(), horario.getHoraInicio(), horario.getHoraFim(), horario.getPeriodo(), horario.getDia(),};
                modeloTabela.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há Cursos para exibir");
        }
    }
}
