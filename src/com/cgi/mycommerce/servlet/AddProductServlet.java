package com.cgi.mycommerce.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cgi.mycommerce.dao.DaoFactory;
import com.cgi.mycommerce.dao.ProductDao;
import com.cgi.mycommerce.entity.Product;

@WebServlet("/auth/addProduct")
public class AddProductServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/addProduct.jsp");
        rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Product product = new Product();
		String name = req.getParameter("name");
		String content = req.getParameter("content");
		String price = req.getParameter("price");
		product.setName(name);
		product.setContent(content);
		product.setPrice(Float.parseFloat(price));
		ProductDao productDao = DaoFactory.getProductDao();
		productDao.createProduct(product);
		resp.sendRedirect("../showProduct?id=" + product.getId());
	}

}
