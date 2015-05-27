/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.dao;

import esII.entidades.Material;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import junit.framework.TestCase;

/**
 *
 * @author willian
 */
public class MaterialDAOTest extends TestCase {
    Material mat = new Material();
    Material mat2 = new Material();
    public MaterialDAOTest(String testName) {
        super(testName);   
        mat.setId_tarefa(0);
        mat.setNome("marial_teste3");
        mat.setQuantidade(2);
        mat2.setId_tarefa(0);
        mat2.setNome("marial_teste2");
        mat2.setQuantidade(3);
        MaterialDAO.criaMaterial(mat);
        MaterialDAO.criaMaterial(mat2);
    }

    /**
     * Teste de time out, verifica se um registro no banco demora mais que 100ms.
     */
    public void  testTimeoutCriaMaterial()throws InterruptedException,TimeoutException{
        Thread thread = new Thread(){
          public void run(){
              System.out.println("criaMaterial");
              //Material novo = null;
              MaterialDAO.criaMaterial(mat);
          }  
        };
        thread.start();
        Thread.sleep(10000);//depende de especificação do cliente
        thread.interrupt();
        if(thread.isInterrupted()){
            System.out.println("testTimeoutCriaMaterial() * falhou");
            fail("time out");
        }
    }
    /**
     * Test of getMaterialById method, of class MaterialDAO.
     */
    public void testGetMaterialById() {
        System.out.println("getMaterialById");
        long id = 2L;
        Material expResult = mat2;
        Material result = MaterialDAO.getMaterialById(id);
        assertEquals(expResult.getNome(), result.getNome());
    }

    /**
     * Test of getMateriaisByIdTarefa method, of class MaterialDAO.
     */
    public void testGetMateriaisByIdTarefa() {
        System.out.println("getMateriaisByIdTarefa");
        long id_tarefa = 0;
        List<Material> expResult = new ArrayList<Material>();
        expResult.add(mat);
        expResult.add(mat2);
        List<Material> result = MaterialDAO.getMateriaisByIdTarefa(id_tarefa);
        System.out.println(result.size()+"-"+expResult.size()+"**");
        for(int i = 0 ; i < expResult.size() ; i++){
            assertEquals(expResult.get(i).getNome(), result.get(i).getNome());
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of deletaMaterial method, of class MaterialDAO.
     **/
    public void testDeletaMaterial() {
        System.out.println("deletaMaterial");
        long id = 1L;
        int num = MaterialDAO.getMateriaisByIdTarefa(0L).size();
        MaterialDAO.deletaMaterial(id);
        assertEquals(num-1,MaterialDAO.getMateriaisByIdTarefa(0L).size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of updateMaterial method, of class MaterialDAO.
     */
    public void testUpdateMaterial() {
        System.out.println("updateMaterial");
        Material m;
        MaterialDAO.updateMaterial(mat);
        m = MaterialDAO.getMaterialById(2);
        System.out.println(m.getId());
    }
}