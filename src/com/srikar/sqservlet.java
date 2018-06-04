package com.srikar;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/square")
public class sqservlet extends HttpServlet {
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{


//		*******************Using requestDispatcher******************
//int k= Integer.parseInt( req.getParameter("k"));
	
//	*********************Using sessions***********************
//		HttpSession session= req.getSession();
//		int k= (int) session.getAttribute("k");
		
	int k=0;
	
	Cookie cookies[]=req.getCookies();
	
	for(Cookie c :cookies) {
		if(c.getName().equals("k")) {
			k=Integer.parseInt(c.getValue());
		}
	}
		
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("<html><body bgcolor='red'>");
		out.println("Result is "+k);
		out.println("</body></html>");
		
	}


}
