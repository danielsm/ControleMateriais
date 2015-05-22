/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.forms;

import esII.entidades.*;
import java.util.List;


/**
 *
 * @author daniel
 */
public class Main {
    private Projeto tempProject;
    private List<Material> tempMateriais;
    private List<Tarefa> tempTarefas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProjectForm telainicial = new ProjectForm();
        telainicial.setVisible(true);
    }
    
    public void setTempProject(Projeto p){
        tempProject = p;
    }
    
    public void setTempMateriais(List<Material> l){
        tempMateriais = l;
    }
    
    public void setTempTarefas(List<Tarefa>  l){
        tempTarefas = l;
    }
    
}
