<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'welcome.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
       <%
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            String welcome="欢迎你,"+username+"同学";
            session.setAttribute("name", username);
        %>
        <h2><%=welcome%></h2>
        <form action="success.jsp" method="get">
          请选择一门课程:<br>
          <input type="radio" name="course" value="jsp程序设计">jsp程序设计<br>
          <input type="radio" name="course" value="数据库原理">数据库原理<br>
          <input type="radio" name="course" value="数据结构" >数据结构<br>
          <input type="radio" name="course" value="电子商务概论" >电子商务概论<br>
          <input type="submit" name="submit" value="提交">
          <input type="reset" name="reset" value="重置">
          
          
           
        </form>
  </body>
</html>
