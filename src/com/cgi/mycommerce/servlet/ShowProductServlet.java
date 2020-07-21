package com.cgi.mycommerce.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cgi.mycommerce.dao.DaoFactory;
import com.cgi.mycommerce.dao.ProductDao;
import com.cgi.mycommerce.entity.Product;
import com.mycommerce.app.bo.MyProduct;
import com.mycommerce.app.dao.MyProductDao;

@WebServlet("/showProduct")
public class ShowProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Long idCast = Long.valueOf(id);
		ProductDao productDao = DaoFactory.getProductDao();
		Product product = productDao.findProductById(idCast);
		req.setAttribute("product", product);
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/showProduct.jsp");
        rd.forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
