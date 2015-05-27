/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.dao;

import esII.entidades.Tarefa;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author E3371
 */
public class TarefaDAO {
    private static Session session;
    private static Transaction tx;
    
    public TarefaDAO(){}
    
    public static void criaTarefa(Tarefa nova){
        session = DAO.getSession();
    	tx = session.beginTransaction();
        session.saveOrUpdate(nova);
        tx.commit();
    }
    
    public static void deletaTarefa(long id){
        session = DAO.getSession();
    	tx = session.beginTransaction();
        Tarefa t = (Tarefa)session.get(Tarefa.class, id);
        session.delete(t);
        tx.commit();
    }
    
    public static void updateTarefa(Tarefa t){
        session = DAO.getSession();
    	tx = session.beginTransaction();
        session.update(t);
        tx.commit();
    }
    
    public static Tarefa getTarefaById(long id){
        session = DAO.getSession();
    	tx = session.beginTransaction();
        Tarefa t = (Tarefa)session.get(Tarefa.class, id);
        tx.commit();
        return t;
    }
   
    public static List<Tarefa> getTarefasByNomeProjeto(String nome){
        session = DAO.getSession();
    	tx = session.beginTransaction();
        Criteria crit = session.createCriteria(Tarefa.class);
        crit.add(Restrictions.eq("nome_projeto", nome));
        List<Tarefa>lista = crit.list();
        tx.commit();
        return lista;
    }
}
