package com.cgi.mycommerce.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cgi.mycommerce.dao.CategoryDao;
import com.cgi.mycommerce.dao.DaoFactory;
import com.cgi.mycommerce.entity.Category;

@WebServlet("/auth/addCategory")
public class AddCategoryServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/addCategory.jsp");
        rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		Category category = new Category();
		String name = req.getParameter("name");
		category.setName(name);
		CategoryDao categoryDao = DaoFactory.getCategoryDao();
		categoryDao.createCategory(category);
		resp.sendRedirect("../listProducts");
	}

}
