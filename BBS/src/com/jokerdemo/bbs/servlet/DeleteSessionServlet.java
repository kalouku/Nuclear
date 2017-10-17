package com.jokerdemo.bbs.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.Cookie;

/**
 * Servlet implementation class DeleteSessionServlet
 */
public class DeleteSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		session.invalidate();
		javax.servlet.http.Cookie[] cookies=request.getCookies();
		 if(cookies!=null)   
		 {   
		     for(int   i=0;i<cookies.length;i++){
		     String sp = cookies[i].getName();
		     if(sp.equals("spreadN"))   
		      {   
		          cookies[i].setMaxAge(0);   
		          response.addCookie(cookies[i]);   
		      }   
		      if(sp.equals("spread"))   
		      {   
		          cookies[i].setMaxAge(0);   
		          response.addCookie(cookies[i]);     
		      } 
		    }    
		}
		 request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
