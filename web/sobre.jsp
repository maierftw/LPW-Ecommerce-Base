<%--
    Document   : sobre
    Created on : 18/09/2019, 17:07:39
    Author     : Desenvolvimento
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <title>Sobre a Loja</title>
   </head>
   <body>
      <jsp:include page="menu.jsp">
          <jsp:param name="item" value="sobre" />
       </jsp:include>

      <h1>Hello World!</h1>
   </body>
</html>
