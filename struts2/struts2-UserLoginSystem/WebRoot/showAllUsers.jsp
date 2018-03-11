<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showAllUsers.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#ccceee">
 
  <center>
       <h1>查看所有用户</h1>
     <table border="1" align="center">  
    <tr>  
        
      <td>用户名</td>
      <td>昵称</td>  
      <td>姓名</td>  
     
    </tr>  
    <s:iterator value="list" >  
    <tr>  
     <td><s:property value="username"/></td>  
     <td><s:property value="nicname"/></td>  
     <td><s:property value="name"/></td>  
   </tr>
    </s:iterator>  
  </table>  
         
         
        
      
       
    
  </center>
  
  </body>
</html>
