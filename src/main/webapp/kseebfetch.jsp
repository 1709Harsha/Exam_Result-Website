<%@page import="java.util.List"%>
<%@page import="Dto.Marks_Dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">                    
<table border>
<title>FETCHING ALL RECORDS FROM KSEEB</title>
</head>
<body style="background-color:aqua;">
 <nav style="height: 100px; background-color: rgb(224, 208, 106); font-family:Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif; display: flex; align-items: center; justify-content: center;">
            <img src="https://i.pinimg.com/736x/1b/85/9c/1b859c78d3f3d6b7ae375a29a761a217.jpg" width="95px"> <br>
            <nav style="width: 30px;"></nav>
            Karnataka Secondary Education Examination Board, 2023</nav>
    </nav>
<% List<Marks_Dto> list=(List<Marks_Dto>)request.getAttribute("Marks_Dto"); %>
<table border="5px">
<tr>
<th>UNIVERSITY SEAT NUMBER</th>
<th>STUDENT NAME</th>            
<th>DATE OF BIRTH</th>
<th>GENDER</th>
<th>FATHER NAME</th>
<th>KANNADA</th>
<th>ENGLISH</th>
<th>HINDI</th>
<th>MATHEMATICS</th>
<th>SOCIALSCIENCE</th>
<th>SCIENCE</th>
<th>TOTAL MARKS</th>
<th>PERCENTAGE</th>
</tr>
<%for(Marks_Dto d1:list) {%>
<tr>
<td><%=d1.getUNIVERSITY_SEAT_NUMBER() %></td>
<td><%=d1.getStudent_name() %></td>
<td><%=d1.getDob() %></td>
<td><%=d1.getGender() %></td>
<td><%=d1.getFather_name() %></td>
<td><%=d1.getKannada() %></td>
<td><%=d1.getEnglish() %></td>
<td><%=d1.getHindi() %></td>
<td><%=d1.getMathmatics() %></td>
<td><%=d1.getSocial_Science() %></td>
<td><%=d1.getScience() %></td>
<td><%=d1.getTotal_marks() %></td>
<td><%=d1.getPercentage() %></td>
</tr>
<%} %>
</table>

<nav style="background-color: rgb(212, 229, 247);display: flex; align-items: center; justify-content: center; height: 60px"> <a href="insert.html">Go Back</a></nav>
    

    <nav style="height: 100px; background-color: rgb(199, 224, 249); display: flex; align-items: center;justify-content: center;">
        <img src="data:image/png;base64,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" width="110px">
        <nav style="display: flex; align-items: center;justify-content: center; width: 185px; font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; font-weight: bold; font-size: smaller;"> All Rights Reserved �, 2023</nav>
    </nav>

</body>
</html>