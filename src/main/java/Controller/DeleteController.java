package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Marks_Dao;
import Dto.Marks_Dto;
@WebServlet("/del")
public class DeleteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
	String u=req.getParameter("usn");
	int usn=Integer.parseInt(u);
	
      Marks_Dao dao = new Marks_Dao();
      Object  msg=dao.remove(usn);
	  resp.getWriter().print(msg);
	}

}
