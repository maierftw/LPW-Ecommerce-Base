/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;
import modelos.Usuario;

/**
 *
 * @author Desenvolvimento
 */
public class Mock {

   private static ArrayList<Produto> lista;

   public static void makeMock(){
      createUsers();
      createProducts();
   }

   private static void createUsers(){
      ArrayList<Usuario> lista;

      if(Usuario.getLista().isEmpty()){
         lista = Usuario.getLista();

         Usuario admin = new Usuario();
         admin.setEmail("admin@ifpr.edu.br");
         admin.setSenha("admin");
         admin.setNome("Administrador");
         lista.add(admin);

         Usuario gerente = new Usuario();
         gerente.setEmail("gerente@ifpr.edu.br");
         gerente.setSenha("123456");
         gerente.setNome("Gerente");
         lista.add(gerente);

         Usuario joao = new Usuario();
         joao.setEmail("joao@ifpr.edu.br");
         joao.setSenha("1234");
         joao.setNome("João");
         lista.add(joao);

      }
   }

   private static void createProducts() {
      ArrayList<Produto> lista;


      if(Produto.getLista().isEmpty()){
         lista = Produto.getLista();

         Produto caneta = new Produto();
         caneta.setDescricao("Caneta BIC");
         caneta.setPreco(1.5f);
         caneta.setOferta(true);
         lista.add(caneta);

         Produto caderno = new Produto();
         caderno.setDescricao("Caderno Minions Star Wars");
         caderno.setPreco(6f);
         caderno.setOferta(true);
         lista.add(caderno);

         Produto foice = new Produto();
         foice.setDescricao("Foice");
         foice.setPreco(10f);
         foice.setOferta(false);
         lista.add(foice);

         Produto cd = new Produto();
         cd.setDescricao("CD Seu Jorge");
         cd.setPreco(5f);
         cd.setOferta(true);
         lista.add(cd);

      }

   }
}
