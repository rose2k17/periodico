package basico;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.mysql.jdbc.Driver;

/**
 * Servlet implementation class Consultar
 */
@WebServlet("/Consultar")
public class Consultar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Consultar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//getServletConfig().getServletContext().getRequestDispatcher("/leer.jsp").forward(request, response);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/periodico","root","");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM noticias");
			PrintWriter out = response.getWriter();
			String res="";
			res+="<table class=\"striped\">" + 
					"        <thead>"+ 
					"          <tr>" +
					"              <th>ID</th>" +
					"              <th>Email</th>" + 
					"              <th>Categoria</th>" +
					"              <th>Titulo</th>" +
					"              <th>Contenido</th>" +
					"              <th>Fecha</th>" +
					"          </tr>\r\n" + 
					"        </thead>" + 
					"        <tbody>";
			while (rs.next()) {
				res+="<tr>";
				res+="<td>" + rs.getString(1) +"</td>";
				res+="<td>" + rs.getString(2) +"</td>";
				res+="<td>" + rs.getString(3) +"</td>";
				res+="<td>" + rs.getString(4) +"</td>";
				res+="<td>" + rs.getString(5) +"</td>";
				res+="<td>" + rs.getString(6) +"</td>";
				res+="</tr>";
			}
			res+="</tbody>" + "</table>";
			request.getSession().setAttribute("title", res);
			response.sendRedirect("leer.jsp");
			rs.close();
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("no se encuentra JDBC");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Tienes un error en mysql");
			e.printStackTrace();
		}
		
	}

}
