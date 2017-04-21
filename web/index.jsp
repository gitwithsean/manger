<%@ page import="manger.main.HelloWorld" %><%--
  Created by IntelliJ IDEA.
  User: sean.ryan
  Date: 4/21/17
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple jsp page</title>
  </head>
  <body>
  <h3 class="message"><%=HelloWorld.getMessage()%></h3>
  </body>
</html>
