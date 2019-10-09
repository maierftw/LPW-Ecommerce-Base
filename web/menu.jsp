<%--
    Document   : menu
    Created on : 18/09/2019, 16:13:46
    Author     : Desenvolvimento
--%>
<%@page import="db.Mock"%>
<%
   //Populando
   Mock.makeMock();

   String item = request.getParameter("item");
   String active = "class=\"active\"";

   String c_ofertas = item.equals("ofertas")? active : "";
   String c_produtos = item.equals("produtos")? active:"";
   String c_usuarios = item.equals("usuarios")? active:"";
   String c_sobre = item.equals("sobre")? active:"";

%>
<nav class="navbar navbar-inverse">
          <div class="container-fluid">
            <div class="navbar-header">
              <a class="navbar-brand" href="index.jsp">Minha Loja</a>
            </div>
            <ul class="nav navbar-nav">
              <li <%=c_ofertas%>><a href="index.jsp">Ofertas</a></li>
              <li <%=c_produtos%>><a href="produtos.jsp">Produtos</a></li>
              <li <%=c_usuarios%>><a href="usuarios.jsp">Usuarios</a></li>
              <li <%=c_sobre%>><a href="sobre.jsp">Sobre</a></li>
            </ul>


            <ul class="nav navbar-nav navbar-right">
              <li><a href="login.jsp">Entrar</a></li>

            </ul>

          </div>

        </nav>