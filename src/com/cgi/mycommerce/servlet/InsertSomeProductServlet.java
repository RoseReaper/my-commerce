package com.cgi.mycommerce.servlet;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycommerce.app.bo.MyProduct;
import com.mycommerce.app.dao.MyProductDao;


@WebServlet("/auth/basicInsert")
public class InsertSomeProductServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MyProduct product = new MyProduct();
		product.setId(1L);
		product.setName("Tesla");
		product.setContent("Model S");
		product.setPrice(8390.2f);
		MyProductDao.addProduct(product);
	}

}
