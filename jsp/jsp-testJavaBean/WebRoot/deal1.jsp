<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'deal1.jsp' starting page</title>
    
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
    <jsp:useBean id="login" class="com.reUsers.Login"></jsp:useBean>
    <jsp:useBean id="logindeal" class="com.reUsers.LoginDeal"></jsp:useBean>
    <jsp:setProperty property="*" name="login"/>
    <%
         String name=login.getUsername();
         if(logindeal.check(login)){
             out.println("欢迎你,"+name);
         }
         else{
           response.sendRedirect("login1.jsp");
         }
     %>
    <
  </body>
</html>
