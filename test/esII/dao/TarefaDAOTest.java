/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.dao;

import esII.entidades.Projeto;
import esII.entidades.Tarefa;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author willian
 */
public class TarefaDAOTest extends TestCase {
    Projeto projTar = new Projeto();
    Tarefa tar1 = new Tarefa();
    Tarefa tar2 = new Tarefa();
    Tarefa tar3 = new Tarefa();
    
    public TarefaDAOTest(String testName) {
        super(testName);
        
        projTar.setNome("projTar");
        projTar.setDuracao(1);
        ProjetoDAO.criarProjeto(projTar);
        
        tar1.setId(1L);
        tar1.setNome_projeto("projTar");
        tar1.setSemanaInicio(1);
        tar1.setDuracao(1);
        tar1.setDescricao("123");
        
        tar2.setId(2L);
        tar2.setNome_projeto("projTar");
        tar2.setSemanaInicio(1);
        tar2.setDuracao(1);
        tar2.setDescricao("123");
        
        tar3.setId(3L);
        tar3.setNome_projeto("projTar");
        tar3.setSemanaInicio(1);
        tar3.setDuracao(1);
        tar3.setDescricao("123");
        
        TarefaDAO.criaTarefa(tar1);
        TarefaDAO.criaTarefa(tar2);
    }

    /**
     * Test of criaTarefa method, of class TarefaDAO.
     */
    public void testCriaTarefa() {
        TarefaDAO.criaTarefa(tar3);
        assertNotNull(TarefaDAO.getTarefaById(3L));
    }

    /**
     * Test of deletaTarefa method, of class TarefaDAO.
     */
    public void testDeletaTarefa() {
        TarefaDAO.deletaTarefa(2L);
        assertNull(TarefaDAO.getTarefaById(2L));
    }

    /**
     * Test of updateTarefa method, of class TarefaDAO.
     */
    public void testUpdateTarefa() {
        Tarefa aux = TarefaDAO.getTarefaById(1L);
        aux.setDuracao(100);
        TarefaDAO.updateTarefa(aux);
        Tarefa result = TarefaDAO.getTarefaById(1L);
        assertEquals(aux.getDuracao(), result.getDuracao());
    }

    /**
     * Test of getTarefaById method, of class TarefaDAO.
     */
    public void testGetTarefaById() {
        assertNotNull(TarefaDAO.getTarefaById(1L));
    }

    /**
     * Test of getTarefasByNomeProjeto method, of class TarefaDAO.
     */
    public void testGetTarefasByNomeProjeto() {
        List<Tarefa> lista = TarefaDAO.getTarefasByNomeProjeto("projTar");
        assertTrue(lista != null && !lista.isEmpty());
    }
    
}