package com.cgi.mycommerce.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cgi.mycommerce.dao.CategoryDao;
import com.cgi.mycommerce.dao.DaoFactory;
import com.cgi.mycommerce.dao.ProductDao;
import com.cgi.mycommerce.entity.Category;
import com.cgi.mycommerce.entity.Product;

@WebServlet("/auth/addProduct")
public class AddProductServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CategoryDao categoryDao = DaoFactory.getCategoryDao();
		List<Category> categories = categoryDao.findAllCategories();
		req.setAttribute("categories", categories);
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/addProduct.jsp");
        rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		CategoryDao categoryDao = DaoFactory.getCategoryDao();
		Product product = new Product();
		String name = req.getParameter("name");
		String content = req.getParameter("content");
		String price = req.getParameter("price");
		String category = req.getParameter("categoryId");
		product.setName(name);
		product.setContent(content);
		product.setPrice(Float.parseFloat(price));
		product.setCategory(categoryDao.findCategoryById(Long.parseLong(category)));
		ProductDao productDao = DaoFactory.getProductDao();
		productDao.createProduct(product);
		resp.sendRedirect("../showProduct?id=" + product.getId());
	}

}
