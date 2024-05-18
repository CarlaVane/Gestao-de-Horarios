/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Docente;
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

    public void CadastrarDocente(Docente docente) {
        if (this.docenteService.CadastrarDocente(docente)) {
            JOptionPane.showMessageDialog(null, " O Docente foi Cadastrado com Sucesso ");
        } else {
            JOptionPane.showConfirmDialog(null, "Erro ao Cadastrar o Docente");
        }

    }

    public void actualizarDocente(Long id) {
        if (this.docenteService.UpdateDocente(id) ){
            JOptionPane.showMessageDialog(null, " O  Docente foi actualizado com suceso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar o Docente");
        }
    }

    public void excluirDocente(Long id) {
        if (this.docenteService.excluirDocente(id)) {
            JOptionPane.showMessageDialog(null, "O Docente foi excluída com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Exclui o docente. Verfique o Id inserido por favor.");
        }
    }

    public void exibirDocente(JComboBox<String> comboBox) {
        List<Docente> ListDocentes = this.docenteService.listarDocentes();

        if (ListDocentes != null && !ListDocentes.isEmpty()) {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>();

            for (Docente docente : ListDocentes) {
                model.addElement(docente);
            }
            comboBox.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "Não há docentes  para exibir");
        }
    }

    public void exibirDocente(DefaultTableModel modeloTabela) {
        List<Docente> listDocente = this.docenteService.listarDocentes();

        if (listDocente != null && !listDocente.isEmpty()) {
            modeloTabela.setRowCount(0);

            for (Docente docente : listDocente) {
                Object[] dados = {docente.getId(), docente.getNome(), docente.getEmail(), docente.getTelefone(), docente.getEspecializacao(), docente.getExperiencia(), docente.getEndereco() /* adicione outros campos conforme necessário */};
                modeloTabela.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há Docentes para exibir");
        }
    }

}
