/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Aula;
import Service.AulaService;
import View.ViewCadastroAula;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
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
   

    public void exibirAulasDoDia(DefaultTableModel modeloTabela, Long docenteId) {
        List<Aula> listAulas = this.aulaService.listarAulasDoDiaPorDocente(docenteId);

        if (listAulas != null && !listAulas.isEmpty()) {
            modeloTabela.setRowCount(0);

            for (Aula aula : listAulas) {
                Object[] dados = {
                    aula.getId(),
                    aula.getNome(),
                    aula.getSaladeAula()+"-"+aula.getSaladeAula().getEdificio()+"-"+aula.getSaladeAula().getAndar(),
                    aula.getHorario().getHoraInicio() + " - " + aula.getHorario().getHoraFim(),  // Exibe o horário de início e fim
                    aula.getCadeira().getNome(),
                    aula.getCurso().getNome()
                };
                modeloTabela.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há aulas para exibir hoje");
        }
    }
    
    public void exibirAulasDoDiaAdmin(DefaultTableModel modeloTabela) {
        List<Aula> listAulas = this.aulaService.listarAulasDoDia();

        if (listAulas != null && !listAulas.isEmpty()) {
            modeloTabela.setRowCount(0);

            for (Aula aula : listAulas) {
                Object[] dados = {
                    aula.getSaladeAula()+"-"+aula.getSaladeAula().getEdificio()+"-"+aula.getSaladeAula().getAndar(),
                    aula.getHorario().getHoraInicio() + " - " + aula.getHorario().getHoraFim(),  
                    aula.getDocente().getNome()+ "-" +aula.getDocente().getEmail(),
                    aula.getCadeira().getNome(),
                    aula.getCurso().getNome()
                };
                modeloTabela.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há aulas para exibir hoje");
        }
    }
}
