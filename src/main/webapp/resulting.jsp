<%@page import="Dto.Marks_Dto"%>
<%@page import="java.util.List"%>
<%@page import="Dao.Marks_Dao"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>               
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resulting.css">
</head>
<body>
	<%
	 Marks_Dto l1 = (Marks_Dto) request.getAttribute("markscard");
	%>

		
       <img  src="https://kseeb.karnataka.gov.in/kosresult/Images/kseeb-header...png" alt="" width="100%" height="150px" >
		 
		
	<div class="name">Name :  <%=l1.getStudent_name()%></div>
	<div class="regNo">Reg No :  <%=l1.getUNIVERSITY_SEAT_NUMBER()%></div>
	<div class="grid--container">
		<div class="container">
			<div class="cells header">Part A</div>
			<div class="cells table--head">Subject</div>
			<div class="cells table--head">Obtained Marks</div>
			<div class="cells table--head">Total Marks</div>
			<div class="cells table--head">Result</div>
			
			<div class="cells subjects">Kannada</div>
			<div class="cells marks"><%=l1.getKannada()%></div>
			<div class="cells marks">100</div>
			<%double x1=(double)l1.getKannada();
                String msg1="";
                if(x1>35)
                {
                    msg1="Pass";
                }
                else
                {
                    msg1="Fail"; 
                }
                %>
			<div class="cells marks"><%=msg1%></div>
			
			
			<div class="cells subjects">English</div>
			<div class="cells marks"><%=l1.getEnglish()%></div>
			<div class="cells marks">100</div>
			  <%double x2=(double)l1.getEnglish();
                String msg2="";
                if(x2>35)
                {
                    msg2="Pass";
                }
                else
                {
                    msg2="Fail"; 
                }
                %>
                <div class="cells marks"><%=msg2%></div>
			
			
			<div class="cells subjects">Hindi</div>
			<div class="cells marks"><%=l1.getHindi()%></div>
			<div class="cells marks">100</div>
			  <%double x3=(double)l1.getHindi();
                String msg3="";
                if(x3>35)
                {
                    msg3="Pass";
                }
                else
                {
                    msg3="Fail"; 
                }
                %>
			<div class="cells marks"><%=msg3%></div>
			
			
			<div class="cells subjects">Mathematics</div>
			<div class="cells marks"><%=l1.getMathmatics()%></div>
			<div class="cells marks">100</div>
			 <%double x5=(double)l1.getMathmatics();
                String msg5="";
                if(x5>35)
                {
                    msg5="Pass";
                }
                else
                {
                    msg5="Fail"; 
                }
                %>
			<div class="cells marks"><%=msg5%></div>
			
				<div class="cells subjects">Science</div>
			<div class="cells marks"><%=l1.getScience()%></div>
			<div class="cells marks">100</div>
			 <%double x4=(double)l1.getScience();
                String msg4="";
                if(x4>35)
                {
                    msg4="Pass";
                }
                else
                {
                    msg4="Fail"; 
                }
                %>
			<div class="cells marks"><%=msg4%></div>
			
			<div class="cells subjects">Social Science</div>
			<div class="cells marks"><%=l1.getSocial_Science()%></div>
			<div class="cells marks">100</div>
			<%double x6=(double)l1.getSocial_Science();
                String msg6="";
                if(x6>35)
                {
                    msg6="Pass";
                }
                else
                {
                    msg6="Fail"; 
                }
                %>
			<div class="cells marks"><%=msg6%></div>
		</div>


		<div class="overall--result--container">
			<div class="item item1">Total Marks</div>
			<div class="item item2">Total Marks Obtained</div>
			<div class="item item3">Percentage</div>
			<div class="item item4">500</div>
			 <%double x=x1+x2+x3+x4+x5+x6;%>
			<div class="item item5"><%=x%></div>
			<div class="item item6"><%=x*0.2+"%"%></div>
		</div>
	</div>

</body>
</html>