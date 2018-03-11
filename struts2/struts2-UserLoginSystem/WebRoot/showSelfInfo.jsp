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
    
    <title>My JSP 'showSelfInfo.jsp' starting page</title>
    
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
         <center><h1>您的个人信息如下</h1>
          
           <s:form action="update" method="post">
           <s:textfield name="username" label="用户名" value="" readonly="true"/>
           <s:textfield name="name" label="姓名" value=""/>
           <s:textfield name="nicname" label="昵称" value=""/>
           <s:textfield name="sex" label="性别" value=""/>
           <s:textfield name="age" label="年龄" value=""/>
           <s:textfield name="email" label="邮箱" value=""/>
           <s:textfield name="phone" label="手机号" value=""/>
           <s:textarea name="selfshow" label="个人简介" value=""/>
           <s:hidden name="id" value=""></s:hidden>
           <s:submit value="修改"/>
          </s:form>
         
         
         
         
         </center>
                
  </body>
</html>
