package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Marks_Dao;
import Dto.Marks_Dto;

@WebServlet("/resulting")
public class MarksCardController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String u1= req.getParameter("usn");
	    int usn=	Integer.parseInt(u1);
	    
	    String db=req.getParameter("dob");
		
	    Marks_Dao dao =new Marks_Dao();
	   Marks_Dto dto  =  dao.fetchbyid(usn);
		
	   if(dto!=null)
	   {
				if(dto.getUNIVERSITY_SEAT_NUMBER()==usn && db.equals(dto.getDob())) {
					req.setAttribute("markscard", dto);
					
					
					RequestDispatcher rd=req.getRequestDispatcher("resulting.jsp");
					rd.forward(req, resp);
				}
				else {
					resp.getWriter().print("<h1>INVALID USN OR DOB MISMATCH PLEASE CHECK AND RE-ENTER PROPERLY</h1>");
					RequestDispatcher rd1=req.getRequestDispatcher("fetchbyusn.html");
					rd1.include(req, resp);
			}
		}

	   }
	}
	

