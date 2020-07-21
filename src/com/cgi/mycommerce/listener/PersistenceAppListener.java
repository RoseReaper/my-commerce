package com.cgi.mycommerce.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.cgi.mycommerce.util.PersistenceManager;

@WebListener
public class PersistenceAppListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent evt) {
	}

	public void contextDestroyed(ServletContextEvent evt) {
		PersistenceManager.closeEntityManagerFactory();
	}

}
