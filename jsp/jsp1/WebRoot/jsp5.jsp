<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jsp5.jsp' starting page</title>
    
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

  <%!
       //定义一个函数
       public int add(int a,int b)
       {
            return a+b;
        }
   %>
  
  <%! int i=90; %>
    <%
        int j=90;
        out.println("i="+(++i)+" j="+(++j)+" a+b="+add(10,20));
        //第一次访问输出：i=91,j=91
        //第二次访问输出：i=92,j=91
        //第三次访问输出：i=93,j=91
     %>
  </body>
</html>
