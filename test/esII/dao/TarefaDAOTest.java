/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.dao;

import esII.entidades.Tarefa;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author willian
 */
public class TarefaDAOTest extends TestCase {
    Tarefa tar = new Tarefa();
    public TarefaDAOTest(String testName) {
        super(testName);
        tar.setNome_projeto("default");
        tar.setDuracao(2);
        tar.setSemanaInicio(0);
        tar.setDescricao("lalalala");  
        TarefaDAO.criaTarefa(tar);
    }

    /**
     * Test of criaTarefa method, of class TarefaDAO.
     */
    public void testCriaTarefa() {
        System.out.println("criaTarefa");
        TarefaDAO.criaTarefa(tar);
        List<Tarefa>result = TarefaDAO.getTarefasByNomeProjeto("default");
        ArrayList<Tarefa>tal = (ArrayList)result;
        for(int i = 0 ; i < tal.size() ; i++){
            System.out.println(tal.get(i).getDescricao()+" "+tal.get(i).getId());
        }
        assertEquals(tar.getId(), tal.get(tal.size()-1).getId());
    }

    /**
     * Test of deletaTarefa method, of class TarefaDAO.
     */
    public void testDeletaTarefa() {
        System.out.println("deletaTarefa");
        long id = 1L;
        System.out.println(TarefaDAO.getTarefaById(id).getNome_projeto());
        TarefaDAO.deletaTarefa(id);
        assertEquals(TarefaDAO.getTarefaById(id), null);
        TarefaDAO.criaTarefa(tar);
    }

    /**
     * Test of updateTarefa method, of class TarefaDAO.
     */
    public void testUpdateTarefa() {
        System.out.println("updateTarefa");
        tar.setNome_projeto("default2");
        TarefaDAO.updateTarefa(tar);
        ArrayList<Tarefa>tarefa = (ArrayList<Tarefa>)TarefaDAO.getTarefasByNomeProjeto("default2");
        for(int i = 0 ; i < tarefa.size() ;i++){
            assertEquals(tarefa.get(i).getNome_projeto(), "default2");
        }
    }

    /**
     * Test of getTarefaById method, of class TarefaDAO.
     */
    public void testGetTarefaById() {
        System.out.println("getTarefaById");
        long id = 2L;
        Tarefa result = TarefaDAO.getTarefaById(id);
        assertNotNull(result);
    }

    /**
     * Test of getTarefasByNomeProjeto method, of class TarefaDAO.
     */
    public void testGetTarefasByNomeProjeto() {
        System.out.println("getTarefasByNomeProjeto");
        String nome = "default";
        List<Tarefa> result = TarefaDAO.getTarefasByNomeProjeto(nome);
        for(int i = 0 ; i < result.size() ;i++){
            assertEquals(result.get(i).getNome_projeto(), nome);
        }
    }
    
}