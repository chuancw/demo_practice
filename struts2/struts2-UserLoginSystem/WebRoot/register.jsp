<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Emind公司登录系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">  
        function T(obj) {  
              var currentTime= new Date().getTime();  
              obj.src = "checkCode.action?d=" + currentTime;  
    }  
</script>
	
  </head>
  
  <body bgcolor="#ccceee">
       <center>
           <h2>Emind公司用户注册</h2>
           
           <s:form action="register" method="post" >
           <s:textfield name="username" label="用户名"/>  
           <s:textfield name="password" label="密码"/>
           <s:textfield name="name"    label="真实姓名"/>
           <s:textfield name="nicname" label="昵称"/>
           <s:textfield name="sex" label="性别"/>
           <s:textfield name="age" label="年龄"/>
           <s:textfield name="email" label="邮箱"/>
           <s:textfield name="phone" label="手机号"/>
           <s:textarea name="selfshow" label="个人简介"/>
           <s:textfield name="validateCode" label="验证码"/> 
           <img src="checkCode.action" onclick="T(this)"> 看不清？点击图片换一个吧
           <s:submit value="注册"/>
           </s:form>
       </center>
  </body>
</html>
