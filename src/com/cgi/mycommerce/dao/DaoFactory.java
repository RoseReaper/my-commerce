package com.cgi.mycommerce.dao;

import com.cgi.mycommerce.dao.jpa.JpaCategoryDao;
import com.cgi.mycommerce.dao.jpa.JpaProductDao;

public class DaoFactory {
	
	private DaoFactory() {
    }
	
    public static ProductDao getProductDao() {
        return new JpaProductDao();
    }

    public static CategoryDao getCategoryDao() {
        return new JpaCategoryDao();
    }

}
