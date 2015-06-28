/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.controls;

import esII.dao.MaterialDAO;
import esII.dao.TarefaDAO;
import esII.entidades.Material;
import esII.entidades.Projeto;
import esII.entidades.Tarefa;
import esII.forms.ConsultaForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class ConsultaControler {
    
    ConsultaForm consulta;
    Projeto projeto;
    int semanaConsulta;
    List<Tarefa> tarefas;
    List<Material> materiais;
    public ConsultaControler(Projeto p, int semana){
        consulta = new ConsultaForm();
        this.projeto = p;
        this.semanaConsulta = semana;
        consulta.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        consulta.setTitle("Consulta do Projeto: "+this.projeto.getNome());
        consulta.nomeProjeto.setText(this.projeto.getNome());
        consulta.durProjeto.setText(Integer.toString(this.projeto.getDuracao()) + " Semana(s)");
        consulta.semanaConLabel.setText(Integer.toString(this.semanaConsulta) + "ª");
       
    }
    
    public void start(){
        
        listar();
        consulta.setVisible(true);
        consulta.voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consulta.dispose();
            }
        });
    }
     //Lista as Tarefas e Materiais do Projeto selecionado
    private void listar(){
       
        tarefas = TarefaDAO.getTarefasByNomeProjeto(projeto.getNome());
        String situacaoMat,situacaTar;
        DefaultTableModel tableModel = new DefaultTableModel(0, 4);
        tableModel.setColumnIdentifiers(new Object[]{"Material","Situação (Material)", "Tarefa", "Situação (Tarefa)"});
        
        for (Tarefa t:tarefas){
            materiais = MaterialDAO.getMateriaisByIdTarefa(t.getId());
            for (Material m:materiais){
                
                if(semanaConsulta < t.getSemanaInicio()){
                    situacaTar = "Tarefa Futura";
                    situacaoMat = "Disponivel";
                }
                else if (semanaConsulta >= t.getSemanaInicio() && semanaConsulta <= t.getSemanaInicio()+(t.getDuracao()-1)){
                    situacaTar = "Em andamento";
                    situacaoMat = "Em uso";
                }
                else {
                    situacaTar = "Tarefa Finalizada";
                    situacaoMat = "Usado";
                }
                
                tableModel.addRow(new Object[]{m.getNome(),situacaoMat,t.getDescricao(), situacaTar});
                consulta.tarefasTable.setModel(tableModel);
            }

        }

        consulta.voltarButton.setEnabled(true);
        
    }
}
