<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  <script type="text/javascript">
     function check(){
      var errorStr="";
      var telephone=document.getElementById("t").value;
      var p=/^\d{8}$/;
      
      if(!p.test(telephone)){
         errorStr="至少8位数";
         alert(errorStr);
         
     }
     
      }
   </script>

  </head>
  
  <body>
           <form action="" method="post"   >
              姓名:<input type="text"  name="username"/><br>
              年龄:<input type="text" name="age" id="age"/><br>
              电话:<input type="text" name="telephone"   id="t"/><br>
              <input type="submit" value="提交"  onclick="check()" />
              
           </form>
  </body>
</html>
