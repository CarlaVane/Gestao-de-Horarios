/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Aula;
import Service.AulaService;
import View.ViewCadastroAula;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla Morais
 */
public class AulaController {

    private AulaService aulaService;

    public AulaController() {
        this.aulaService = new AulaService();
    }

    public void CriarView() {
        ViewCadastroAula viewCadastroAula = new ViewCadastroAula();
        viewCadastroAula.setVisible(true);

    }

    public void CadastrarAula(Aula aula) {
        if (this.aulaService.salvar(aula)) {
            JOptionPane.showMessageDialog(null, " A aula foi Cadastrada com Sucesso ");
        } else {
            JOptionPane.showConfirmDialog(null, "Erro ao Cadastrar aula");
        }

    }

    public void actualizarAula(Long id, Aula aulaActualizada) {
        if (this.aulaService.ActualizarAulaMarcada(id, aulaActualizada)) {
            JOptionPane.showMessageDialog(null, "A aula foi actualizada com suceso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar a aula");
        }
    }

    public void excluirAula(Long id) {
        if (this.aulaService.eliminarAulaMarcada(id)) {
            JOptionPane.showMessageDialog(null, "A aula foi excluída com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Exclui a aula. Verfique o Id inserido por favor.");
        }
    }
 public void exibirAulas(DefaultTableModel modeloTabela) {
        List<Aula> listAulas = this.aulaService.listarAulasMarcadas();

        if (listAulas != null && !listAulas.isEmpty()) {
            modeloTabela.setRowCount(0);

            for (Aula aula: listAulas) {
                Object[] dados = {aula.getId(),aula.getNome(),aula.getSaladeAula(), aula.getHorario(),aula.getDocente(),aula.getCadeira(),aula.getCurso()};
                modeloTabela.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há Cursos para exibir");
        }
    }
   
}
