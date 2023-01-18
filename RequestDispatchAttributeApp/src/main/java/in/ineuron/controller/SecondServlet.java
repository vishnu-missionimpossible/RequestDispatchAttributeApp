package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		PrintWriter out = response.getWriter();
		
		Enumeration<String> attributeNames =request.getAttributeNames();
		out.println("<table border=1>");
		out.println("<th>Name</th><th>Value</th>");
	    while(attributeNames.hasMoreElements()) {
	    	out.println("<tr>");
	    	String name = attributeNames.nextElement();
	    	Object value = request.getAttribute(name);
	    	out.println("<td>"+name+"</td><td>"+value+"</td>");
	    	out.println("</tr>");
	    }
	    
	    out.println("</table>");
		
		out.close();
		
	}

}
