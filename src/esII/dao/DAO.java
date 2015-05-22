/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Juliano Ramos
 */
public class DAO {
    private static final SessionFactory factory;  
  
    static {  
        Configuration cfg = new Configuration().configure();
          
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).build(); 
        factory = cfg.buildSessionFactory(serviceRegistry);  
  
    }  
      
    public static Session getSession() {  
        return factory.openSession();  
    }  
}
