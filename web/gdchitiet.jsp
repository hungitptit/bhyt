<%@page import="entity.Bill"%>
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
	String index = request.getParameter("index");
	Person pers = new Person();
	ArrayList<Bill> bill = new ArrayList<Bill>();
	if(index != null){
		pers = ((ArrayList<Person>)session.getAttribute("dsPerson")).get(Integer.parseInt(index));
		
		bill = (new PersonDAO()).getBill(pers.getPerson_id());
		if(bill == null){
			System.out.println("bill null");
		}
	}
//	String tk = request.getAttribute("tennguoi");
%>
<body>
    <div class="panel-body">
	<h1>Thông tin bệnh nhân</h1>
	Ten: <%=pers.getName() %><br>
	Ma BH: <%=pers.getBhyt().getId() %><br>
	Ngay sinh: <%=pers.getDob() %><br>
	SDT: <%=pers.getPhoneNumber() %><br>
	Dia chi: <%=pers.getAddress() %><br>
	Lich su su dung: <br>
	
	<%if(bill!= null){%>
         
	<table class="table table-bordered">
		<tr>
			<th>Tên bệnh</th>
			<th>Bệnh viện</th>
			<th>Khoa</th>
			<th>Ngày nhập viện</th>
			<th>Ngày thanh toán</th>
			<th>Tổng số tiền</th>
		</tr>
		<%
			for(int i = 0; i<bill.size(); i++){
		%>
		<tr>
		<td><%=bill.get(i).getDisease().getName() %></td>
		<td><%=bill.get(i).getHospital().getName() %></td>
		<td><%=bill.get(i).getDisease().getKhoa() %></td>
		<td><%=bill.get(i).getDateOfAdmission() %></td>
		<td><%=bill.get(i).getDateOfDischarge() %></td>
		<td><%=bill.get(i).getAmount() %></td>
		</tr>
		<%} }%>
	</table>
         <div class="panel-body">
  	<a type="button" class="btn-success btn-md"
        href="gdtimnguoi.jsp">Quay lại</a></td>
	<a type="button" class="btn-success btn-md"
        href="gdxuatbc.jsp">Xuất báo cáo</a></td>
        <div>
 
<script >
function openPage(page){
	window.location="http://localhost:8080/Insurance/baocao/"+page;
}
</script>
</body>
<div class="footer">
    
    <h2>
        
       
    </h2>
</div>
</html>