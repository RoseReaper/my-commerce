package com.cgi.mycommerce.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycommerce.app.bo.MyProduct;
import com.mycommerce.app.dao.MyProductDao;

@WebServlet("/listProducts")
public class ListProductsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<MyProduct> products = MyProductDao.getAllProducts();
        req.setAttribute("products", products);
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/listProducts.jsp");
        rd.forward(req, resp);
    }

}
