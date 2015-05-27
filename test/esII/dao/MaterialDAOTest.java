/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.dao;

import esII.entidades.Material;
import esII.entidades.Projeto;
import esII.entidades.Tarefa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import junit.framework.TestCase;

/**
 *
 * @author willian
 */
public class MaterialDAOTest extends TestCase {
    
    Projeto projMat = new Projeto();
    
    Tarefa tarMat = new Tarefa();
    
    Material mat1 = new Material();
    Material mat2 = new Material();
    Material mat3 = new Material();
    
    
    public MaterialDAOTest(String testName) {
        super(testName);   
        
        projMat.setNome("projMat");
        projMat.setDuracao(1);
        ProjetoDAO.criarProjeto(projMat);
        
        tarMat.setId(4L);
        tarMat.setDescricao("123");
        tarMat.setDuracao(1);
        tarMat.setNome_projeto("projMat");
        tarMat.setSemanaInicio(1);
        TarefaDAO.criaTarefa(tarMat);
        
        mat1.setId(1L);
        mat1.setId_tarefa(4L);
        mat1.setNome("mat1");
        mat1.setQuantidade(1);
        MaterialDAO.criaMaterial(mat1);
        
        mat2.setId(2L);
        mat2.setId_tarefa(4L);
        mat2.setNome("mat1");
        mat2.setQuantidade(1);
        MaterialDAO.criaMaterial(mat2);
        
        mat3.setId(3L);
        mat3.setId_tarefa(4L);
        mat3.setNome("mat1");
        mat3.setQuantidade(1);
        
    }

    public void  testCriaMaterial(){
        MaterialDAO.criaMaterial(mat3);
        assertNotNull(MaterialDAO.getMaterialById(3L));
    }
    /**
     * Test of getMaterialById method, of class MaterialDAO.
     */
    public void testGetMaterialById() {
        assertNotNull(MaterialDAO.getMaterialById(1L));
    }

    /**
     * Test of getMateriaisByIdTarefa method, of class MaterialDAO.
     */
    public void testGetMateriaisByIdTarefa() {
        List<Material> lista = MaterialDAO.getMateriaisByIdTarefa(4L);
        assertTrue(!lista.isEmpty());
    }
    /**
     * Test of deletaMaterial method, of class MaterialDAO.
     **/
    public void testDeletaMaterial() {
        MaterialDAO.criaMaterial(mat2);
        MaterialDAO.deletaMaterial(2L);
        assertNull(MaterialDAO.getMaterialById(2L));
    }
    /**
     * Test of updateMaterial method, of class MaterialDAO.
     */
    public void testUpdateMaterial() {
        Material aux = MaterialDAO.getMaterialById(1L);
        aux.setNome("mat11");
        MaterialDAO.updateMaterial(aux);
        Material result = MaterialDAO.getMaterialById(1L);
        assertEquals(aux.getNome(), result.getNome());
    }
}