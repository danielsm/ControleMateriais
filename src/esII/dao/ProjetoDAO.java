/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.dao;

import esII.entidades.Projeto;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Juliano Ramos
 */
public class ProjetoDAO {
    
    private static Session session;
    private static Transaction tx;
    
    public ProjetoDAO(){}
    
    public static void criarProjeto(Projeto novo){
        session = DAO.getSession();
    	tx = session.beginTransaction();
    	session.save(novo);
    	tx.commit();
    }
    
    public static void deletaProjeto(String nome){
        session = DAO.getSession();
    	tx = session.beginTransaction();
        Projeto p = (Projeto) session.get(Projeto.class, nome);
        session.delete(p);
        tx.commit();
    }
    
    public static void updateProjeto(Projeto p){
        session = DAO.getSession();
    	tx = session.beginTransaction();
        session.update(p);
        tx.commit();
    }
    
    public static Projeto getProjetoByNome(String nome){
        session = DAO.getSession();
    	tx = session.beginTransaction();
        Projeto p = (Projeto) session.get(Projeto.class, nome);
        tx.commit();
        return p;
    }
    
    public static List<Projeto> getAllProjetos(){
        session = DAO.getSession();
    	tx = session.beginTransaction();
        List<Projeto> lista = session.createCriteria(Projeto.class).list();
        tx.commit();
        return lista;
    }
    
    public static boolean existeProjeto(String nome){
        session = DAO.getSession();
    	tx = session.beginTransaction();
        Projeto p = (Projeto)session.get(Projeto.class, nome);
        tx.commit();
        return p != null;
    }
}
