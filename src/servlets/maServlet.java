package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.MyBean;


@WebServlet("/maServlet")
public class maServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
    public maServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		

		this.getServletContext().getRequestDispatcher("/WEB-INF/maJSP.jsp").forward(request, response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String nom = request.getParameter("nom");
		request.setAttribute("nom", nom);
		this.getServletContext().getRequestDispatcher("/WEB-INF/maJSP.jsp").forward(request, response);

		
	}

}
