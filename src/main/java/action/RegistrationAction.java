package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Product;
import bean.User;
import dao.DaoFactory;

/**
 * Servlet implementation class Registration
 */
@WebServlet(description = "RegistrationAction", urlPatterns = { "/RegistrationAction" })
public class RegistrationAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
  		String u1id,u1,u1p;
  		String u2id,u2,u2p;
  		String p2id,p2,p2p;
  		String p1id,p1,p1p;
   		String password;
   		String product,supplier;
   		RequestDispatcher rq;
   	     		
   		u1id = request.getParameter("u1id");
   		u1 = request.getParameter("u1");
   		u1p = request.getParameter("u1p");
   		
   		u2id = request.getParameter("u2id");
   		u2 = request.getParameter("u2");
   		u2p = request.getParameter("u2p");
   		
   		p1id = request.getParameter("p1id");
   		p1 = request.getParameter("p1");
   		p1p = request.getParameter("p1p");
   		
   		p2id = request.getParameter("p2id");
   		p2 = request.getParameter("p2");
   		p2p = request.getParameter("p2p");
   		
   		/*password = request.getParameter("password");
   		product = request.getParameter("product");
   		supplier = request.getParameter("supplier");
*/   		
 
   		User user = new User();
   		user.setEmail(u1);
   		user.setId(u1id);
   		user.setPassword(u1p);
   		
   		User user2 = new User();
   		user2.setEmail(u2);
   		user2.setId(u2id);
   		user2.setPassword(u2p);
   		
 
   		Product p = new Product();
   		p.setId(p1id);
   		p.setProduct1(p1);
   		p.setProduct2(p1p);
   		
   		Product pr2 = new Product();
   		pr2.setId(p2id);
   		pr2.setProduct1(p2);
   		pr2.setProduct2(p2p);
   		
      /*  p.getUser().add(user);
        p.getUser().add(user2);
   	   
        pr2.getUser().add(user);
        pr2.getUser().add(user2);
   	    
        user.getProduct().add(p);
        user.getProduct().add(pr2);
        
        user2.getProduct().add(p);
        user2.getProduct().add(pr2);*/
        
        /*user.setProduct(p);
   		p.setUser(user);*/
   		
   		DaoFactory dao = DaoFactory.getDao();
   		boolean b = dao.registration(user,user2,p,pr2);
   		
   		if(b == true) {   
   			rq = request.getRequestDispatcher("Welcome.jsp");
   			rq.include(request, response);
   		}
   		else {
   			 rq = request.getRequestDispatcher("NewFile.jsp");
   			 rq.forward(request, response);
   		}
       
  	}

  	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
