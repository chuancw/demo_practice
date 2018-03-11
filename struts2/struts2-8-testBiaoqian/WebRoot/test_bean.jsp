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
    
    <title>My JSP 'test_bean.jsp' starting page</title>
    
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
       <s:bean name="bean.Person" var="p">
       <!-- 给bean类的各个属性赋值 -->
        <s:param  name="name" value="'王川'"></s:param>
        <s:param  name="age" value="18"/>
        <s:param name="sex" value="'男'"/>
        <s:param name="home" value="'新疆'"/>
        
       </s:bean>
       
       姓名：<s:property value="#p.name"/><br>
       年龄：<s:property value="#p.age"/><br>
       性别:<s:property value="#p.sex"/><br>
       籍贯:<s:property value="#p.home"/>
       
         </body>
</html>
