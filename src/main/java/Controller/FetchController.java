package Controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.metamodel.SetAttribute;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Marks_Dao;
import Dto.Marks_Dto;

@WebServlet("/kseebfetchall")
public class FetchController extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
	
	Marks_Dao dao =new Marks_Dao();
  List<Marks_Dto> l1=dao.fetch();
  
          req.setAttribute("Marks_Dto", l1);
	
	    RequestDispatcher rd =req.getRequestDispatcher("kseebfetch.jsp");
	     rd.forward(req, resp);
          
       
	
}
	
	
	
	
}


