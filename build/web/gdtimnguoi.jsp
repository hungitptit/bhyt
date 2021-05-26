<%@page import="entity.Person"%>
<%@page import="DAO.PersonDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
btn{
   width: 60px;
  }
  .th_btn{
  width:60px;
  }
  #th_password{
  width:60%;
  }
  body {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
  padding-bottom: 70px;
}
	
</style>
<%
	String tenN = request.getParameter("timkiem");
	ArrayList<Person> listP = null;
	if(tenN != null){
//		session.setAttribute("tennguoi", tenN);
		listP = (new PersonDAO()).searchPerson(tenN);
		session.setAttribute("dsPerson", listP);
	}
%>
<body>
	<form name="timnguoi" method="get" action="gdtimnguoi.jsp" >
		<table>
			<tr>
				<td>Tên</td>
				<td><input  type="text" name = "timkiem" <%if(tenN!= null){ %>
														value = "<%=tenN%>"<%} %>></td>
				<td><input class= "btn-success btn-md" type = "submit" value = "Tìm kiếm">
				</td>	
			</tr>										
		</table>
	</form>
	

	<%
		if(listP!= null){
	%>			
         <div class="panel-body">
	<table class="table table-bordered" name = "kqPerson" >
		<tr><th>TT</th>
		<th>Mã </th>
		<th>Tên </th>
		<th>SDT </th>
		<th>Ngày sinh</th>
		<th>Email</th>
		<th>CMT</th>
		<th>So thẻ bh</th>
		<th>Mua bh</th>
		<th>Dịa chỉ</th>
		</tr>
		<%
			for(int i = 0; i< listP.size(); i++){ 	
		%>
		<tr>
		<td><%= (i+1)%></td>
		<td><%= listP.get(i).getPerson_id()%></td>
		<td><a href="gdchitiet.jsp?index=<%=i%>">
		<%= listP.get(i).getName() %></a></td>
		<td><%= listP.get(i).getPhoneNumber() %></td>
		<td><%= listP.get(i).getDob() %></td>
		<td><%= listP.get(i).getEmail() %></td>
		<td><%= listP.get(i).getCmt()%></td>
		<td><%= listP.get(i).getSothebaohiem()%></td>
		<td><%= listP.get(i).getMuabaohiem()%></td>
		<td><%= listP.get(i).getAddress()%></td>
		</tr>
		<%} }%>			
	</table>
         </div>
</body>
<div class="footer">
    
    <h2>
        
       
    </h2>
</div>

</html>