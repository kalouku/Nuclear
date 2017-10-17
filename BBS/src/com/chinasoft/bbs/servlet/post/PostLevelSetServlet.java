package com.chinasoft.bbs.servlet.post;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.bbs.dao.PostDAO;
import com.chinasoft.bbs.dao.impl.PostDAOImpl;

/**
 * Servlet implementation class PostLevelSetServlet
 */
public class PostLevelSetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostLevelSetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String level=request.getParameter("level");
		String pid=request.getParameter("pid");
		PostDAO postDAO=new PostDAOImpl();
	if(	postDAO.updatePost(Integer.parseInt(pid), new String[] {"level"}, new Object[] {Integer.parseInt(level)})) {
		request.getRequestDispatcher("PostsServletManager").forward(request, response);
	}else {
		System.out.println("操作失败");
	}
	
	}

}
