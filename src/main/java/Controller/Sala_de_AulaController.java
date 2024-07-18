/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Sala_de_Aula;
import Model.Sala_de_Aula;
import Service.Sala_de_AulaService;
import View.ViewCadastradoSaladeAula;
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
public class Sala_de_AulaController {

    private Sala_de_AulaService SalaAulaService;

    public Sala_de_AulaController() {
        this.SalaAulaService = new Sala_de_AulaService();
    }

    public void CriarView() {
        ViewCadastradoSaladeAula viewCadastroSala = new ViewCadastradoSaladeAula();
        viewCadastroSala.setVisible(true);

    }

    public void CadastrarSala(Sala_de_Aula SalaDeaula) {
        if (this.SalaAulaService.salvar(SalaDeaula)) {
            JOptionPane.showMessageDialog(null, " A Sala de Aula foi Cadastrada com Sucesso ");
        }

    }

    public void excluirSala(Long id) {
        if (this.SalaAulaService.eliminarSala(id)) {
            JOptionPane.showMessageDialog(null, "A  Sala de aula foi excluída com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Exclui a Sala de aula. Verfique o Id inserido por favor.");
        }
    }

    public void exibirSalas() {
        List<Sala_de_Aula> ListSalas = this.SalaAulaService.listarSalas();

        if (ListSalas != null && !ListSalas.isEmpty()) {
            for (Sala_de_Aula Salas : ListSalas) {
                System.out.println(Salas);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há Salas Cadastradas para exibir");
        }
    }

    public void exibirSala(DefaultTableModel modeloTabela) {
        List<Sala_de_Aula> listSalas = this.SalaAulaService.listarSalas();

        if (listSalas != null && !listSalas.isEmpty()) {
            modeloTabela.setRowCount(0);

            for (Sala_de_Aula sala : listSalas) {
                Object[] dados = {sala.getId(), sala.getNomeSala(), sala.getEdificio(), sala.getAndar(), sala.getCapacidade()};
                modeloTabela.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há Salas para exibir");
        }
    }
    
    public void exibirSalas(JComboBox<String> comboBox) {
        List<Sala_de_Aula> ListSala = this.SalaAulaService.listarSalas();

        if (ListSala != null && !ListSala.isEmpty()) {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>();

            for (Sala_de_Aula sala : ListSala) {
                model.addElement(sala);
            }
            comboBox.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "Não há Salas para exibir");
        }
    }
}
