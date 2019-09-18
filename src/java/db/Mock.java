/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;

/**
 *
 * @author Desenvolvimento
 */
public class Mock {

   private static ArrayList<Produto> lista;


   public static void makeMock() {

      if(lista == null){
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
