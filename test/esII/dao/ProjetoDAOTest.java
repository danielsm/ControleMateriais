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
    
    public ProjetoDAOTest(String testProjeto) {
        super(testProjeto);
        proj1.setNome("proj1");
        proj1.setDuracao(20);
        proj2.setNome("proj2");
        proj2.setDuracao(30);
        proj3.setNome("proj3");
        proj3.setDuracao(40);
    }
    
    
    /**
     * Test of criarProjeto method, of class ProjetoDAO.
     */
 
    public void  testTimeoutCriaProjeto () throws InterruptedException,TimeoutException{
        Thread thread = new Thread(){
          public void run(){
              System.out.println("criaProjeto");
              //Material novo = null;
              ProjetoDAO.criarProjeto(proj1);
              ProjetoDAO.criarProjeto(proj2);
              ProjetoDAO.criarProjeto(proj3);
          }  
        };
        thread.start();
        Thread.sleep(10000);//depende de especificação do cliente
        thread.interrupt();
        if(thread.isInterrupted()){
            System.out.println("testTimeoutCriaProjeto() * falhou");
            fail("time out");
        }
    }

    /**
     * Test of deletaProjeto method, of class ProjetoDAO.
     */
    
    public void testDeletaProjeto() {
        System.out.println("deletaProjeto");
        String nome = "proj3";
        ProjetoDAO.deletaProjeto(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateProjeto method, of class ProjetoDAO.
     */
    
    public void testUpdateProjeto() {
        System.out.println("updateProjeto");
        Projeto p = ProjetoDAO.getProjetoByNome("proj1");
        ProjetoDAO.updateProjeto(p);
        p.setNome("proj5");
        System.out.println(p.getNome());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllProjetos method, of class ProjetoDAO.
     */
    
    public void testGetAllProjetos() {
        System.out.println("getAllProjetos");
        List<Projeto> expResult = new ArrayList<>();
        expResult.add(proj1);
        expResult.add(proj2);
        expResult.add(proj3);
        List<Projeto> result = ProjetoDAO.getAllProjetos();
        for(int i = 0 ; i < result.size() ; i++){
            assertEquals(expResult.get(i).getNome(), result.get(i).getNome());
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of existeProjeto method, of class ProjetoDAO.
     */
    
    public void testExisteProjeto() {
        System.out.println("existeProjeto");
        String nome = "proj4";
        boolean expResult = false;
        boolean result = ProjetoDAO.existeProjeto(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}