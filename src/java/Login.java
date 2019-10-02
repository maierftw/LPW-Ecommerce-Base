/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Usuario;

/**
 *
 * @author Desenvolvimento
 */
public class Login extends HttpServlet {

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      // obtendo os parametros de requisição
      String email = request.getParameter("email");
      String senha = request.getParameter("senha");

      //comparar com os dados de login default
      if (Usuario.login(email,senha)){
         //salvando sucesso do login na sessao
         request.getSession().setAttribute("logado", true);

         //redirecionar para a pagina de produtos
         response.sendRedirect("produtos.jsp");
      }else{
         //redirecionar para a tela de login
         response.sendRedirect("login.jsp");
    }

   }
}

