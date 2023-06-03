package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Marks_Dao;
import Dto.Marks_Dto;

@WebServlet("/insert")
public class InsertContoller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
	   String u1=req.getParameter("usn");
	   int usn=Integer.parseInt(u1);
	   
	   String sname=req.getParameter("sname");
	   
	   String dob=req.getParameter("dob");
	   
	   
	   String gen=req.getParameter("gender");
	   String fname=req.getParameter("fname");
	   
	   String k1=req.getParameter("kand");
	   int knd=Integer.parseInt(k1);
	   
	   String e1=req.getParameter("eng");
	   int eng=Integer.parseInt(e1);

	   String h1=req.getParameter("hind");
	   int hin=Integer.parseInt(h1);

	   String m1=req.getParameter("math");
	   int math=Integer.parseInt(m1);

	   String ss1= req.getParameter("ss");
	   int ss=Integer.parseInt(ss1);

	   String s1= req.getParameter("sci");
	   int sci=Integer.parseInt(s1);

	   String t1= req.getParameter("tm");
	   int tm=Integer.parseInt(t1);

	   String sm1= req.getParameter("sm");
	   int sm=Integer.parseInt(sm1);

	   String p1= req.getParameter("per");
	   
	     
	   Marks_Dto dto = new Marks_Dto();
	    dto.setUNIVERSITY_SEAT_NUMBER(usn);
	    dto.setStudent_name(sname);
	    dto.setDob(dob);
	    dto.setGender(gen);
	    dto.setFather_name(fname);
	    dto.setKannada(knd);
	    dto.setEnglish(eng);
	    dto.setHindi(hin);
	    dto.setMathmatics(math);
	    dto.setSocial_Science(ss);
	    dto.setScience(sci);
	    dto.setTotal_marks(tm);
	    dto.setSecured_marks(sm);
	    dto.setPercentage(p1);
	    
	   
	    Marks_Dao dao = new Marks_Dao();
	    String msg= dao.insert(dto);
	    resp.getWriter().print(msg);
	    
	    

	}

}
