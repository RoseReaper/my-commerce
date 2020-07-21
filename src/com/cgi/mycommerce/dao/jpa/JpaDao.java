package com.cgi.mycommerce.dao.jpa;

import javax.persistence.EntityManagerFactory;

import com.cgi.mycommerce.util.PersistenceManager;

public abstract class JpaDao<T, ID> {
	
    protected EntityManagerFactory emf;

    public JpaDao() {
        this.emf = PersistenceManager.getEntityManagerFactory();
    }

}
