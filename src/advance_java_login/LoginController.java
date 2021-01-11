package advance_java_login;

import javax.servlet.http.HttpServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LoginController extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		String requestAction=request.getParameter("requestAction");
		
		if(requestAction.equals("login"))
		{
			boolean output;
			 String userName=request.getParameter("UserName");
				String password=request.getParameter("Password");
				System.out.println("Password from jsp"+password);
				
				LoginRepository repo=new LoginRepository();
				output=repo.viewEmployee(userName, password);
				System.out.println(output);
				if(output)
				{
					RequestDispatcher rd=request.getRequestDispatcher("firstPage.jsp");
					try {
						rd.forward(request, response);
					} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					System.out.println("Login Failed");
					
					request.setAttribute("message","Invalid Credentials..");
					RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
					try {
						rd.forward(request,response);
					} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		}
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		doGet(request,response);
	}
}
