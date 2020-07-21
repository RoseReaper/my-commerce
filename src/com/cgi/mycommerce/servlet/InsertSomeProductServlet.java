package com.cgi.mycommerce.servlet;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cgi.mycommerce.dao.DaoFactory;
import com.cgi.mycommerce.dao.ProductDao;
import com.cgi.mycommerce.entity.Product;

@WebServlet("/auth/basicInsert")
public class InsertSomeProductServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Product product = new Product();
		product.setId(1L);
		product.setName("Tesla");
		product.setContent("Model S");
		product.setPrice(8390.2f);
		ProductDao productDao = DaoFactory.getProductDao();
		productDao.createProduct(product);
	}

}
