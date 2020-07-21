package com.cgi.mycommerce.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycommerce.app.bo.MyProduct;
import com.mycommerce.app.dao.MyProductDao;

@WebServlet("/auth/removeProduct")
public class RemoveProductServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Long idCast = Long.valueOf(id);
		MyProductDao.removeProduct(idCast);
		resp.sendRedirect("../listProducts");
	}

}
