package com.ssafy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.model.Product;
import com.ssafy.model.ProductService;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String content = request.getParameter("content");
		Product product = ProductService.getInstance().addProduct(new Product(name,price,content));
		request.setAttribute("product", product);
		RequestDispatcher disp = request.getRequestDispatcher("product.jsp");
		disp.forward(request, response);
	}

}
