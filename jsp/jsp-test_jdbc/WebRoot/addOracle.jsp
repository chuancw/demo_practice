<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addOracle.jsp' starting page</title>
    
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
      
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:myoracle","scott","tiger");
                 Statement st=cn.createStatement();
                 String sql="insert into login values(3,'"+username+"','"+password+"')";
                 int i=st.executeUpdate(sql);
                 if(i==1){
                     out.println("记录添加成功");
                 }
                 else{
                     out.println("记录添加失败");
                 }
                     
                   st.close();
                   cn.close();
                
                 
         
          
        
           
      %> 
      <hr>
      <a href="login.jsp">返回</a>      
  </body>
</html>
