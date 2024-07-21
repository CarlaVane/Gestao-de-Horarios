/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
    private static final String PERSISTENCE_UNIT_NAME = "MeuSistema-jpa";
    private static final String DATABASE_URL = "jdbc:mysql://localhost/timemanagementsystem?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    
    private static final EntityManagerFactory FACTORY = createEntityManagerFactory();

    private static EntityManagerFactory createEntityManagerFactory() {
     
        java.util.Properties properties = new java.util.Properties();
        properties.put("javax.persistence.jdbc.url", DATABASE_URL);

        return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, properties);
    }

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }

    public static void close() {
        Connection.getEntityManager().close();
        FACTORY.close();
    }
}

