package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/gettopost")
public class GetToPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetToPost() {
        super();
  
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       doPost(request,response);
         
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("application/json");
		 PrintWriter writer = response.getWriter();
		 String GetId = request.getParameter("id");
		 
		 try {
	            writer.println("{\"id_key\": \""+GetId+"\"}\"");
	        } finally {
	           writer.close();  
	        }	
	}

}
