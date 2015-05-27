/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.dao;

import esII.entidades.Projeto;
import java.util.List;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import junit.framework.TestCase;

/**
 *
 * @author Luiza Helena
 */
public class ProjetoDAOTest extends TestCase{
    Projeto proj1 = new Projeto();
    Projeto proj2 = new Projeto();
    Projeto proj3 = new Projeto();
    Projeto proj4 = new Projeto();
    
    public ProjetoDAOTest(String testProjeto) {
        super(testProjeto);
        proj1.setNome("proj1");
        proj1.setDuracao(20);
        proj2.setNome("proj2");
        proj2.setDuracao(30);
        proj3.setNome("proj3");
        proj3.setDuracao(40);
        proj4.setNome("proj4");
        proj4.setDuracao(50);
        ProjetoDAO.criarProjeto(proj2);
        ProjetoDAO.criarProjeto(proj3);
        ProjetoDAO.criarProjeto(proj4);
    }
    
    
    /**
     * Test of criarProjeto method, of class ProjetoDAO.
     */
 
    public void  testCriaProjeto (){
        ProjetoDAO.criarProjeto(proj3);
        Projeto aux = ProjetoDAO.getProjetoByNome("proj3");
        assertEquals(proj3.getNome(), aux.getNome());
    }

    /**
     * Test of deletaProjeto method, of class ProjetoDAO.
     */
    
    public void testDeletaProjeto() {
        String nome = "proj3";
        ProjetoDAO.deletaProjeto(nome);
        Projeto aux = ProjetoDAO.getProjetoByNome(nome);
        assertNull(aux);
    }

    /**
     * Test of updateProjeto method, of class ProjetoDAO.
     */
    
    public void testUpdateProjeto() {
        Projeto p = ProjetoDAO.getProjetoByNome("proj4");
        p.setDuracao(100);
        ProjetoDAO.updateProjeto(p);
        Projeto aux = ProjetoDAO.getProjetoByNome("proj4");
        assertEquals(100, aux.getDuracao());
    }

    /**
     * Test of getProjetoByNome method, of class ProjetoDAO.
     */
    
    public void testGetProjetoByNome() {
        System.out.println("getProjetoByNome");
        String nome = "proj2";
        Projeto expResult = proj2;
        Projeto result = ProjetoDAO.getProjetoByNome(nome);
        assertEquals(expResult.getNome(), result.getNome());
    }

    /**
     * Test of getAllProjetos method, of class ProjetoDAO.
     */
    
    public void testGetAllProjetos() {
        List<Projeto> lista = ProjetoDAO.getAllProjetos();
        assertTrue(lista != null && !lista.isEmpty());
    }

    /**
     * Test of existeProjeto method, of class ProjetoDAO.
     */
    
    public void testExisteProjeto() {
        String nome = "projetoNaoExistente";
        assertFalse(ProjetoDAO.existeProjeto(nome));
    }
    
}