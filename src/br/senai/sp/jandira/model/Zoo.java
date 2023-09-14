package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    Scanner teclado = new Scanner(System.in);
    List<Zebra> listZebra = new ArrayList<>();
   public void menu(){

       boolean continuar= true;

       while(continuar) {


       Zebra objZebra = new Zebra();

       System.out.println("1- Cadatrar Zebra");
       System.out.println("2- Listar Zebras");
       System.out.println("3- Sair");
       System.out.print("Opção: ");

           int opcaoUsuario = teclado.nextInt();
           teclado.nextLine();

           switch (opcaoUsuario) {
               case 1:
                   objZebra.cadastrarZebra();
                   adicionarZebra(objZebra);
                   System.out.println(listZebra.size());
                   break;
               case 2:
                   listarZebras();
                   break;
               case 3:
                   continuar = false;
                   break;
           }
       }

   }
   public void adicionarZebra(Zebra zebra){
       listZebra.add(zebra);
   }
   public void listarZebras(){
       for (Zebra zebra : listZebra){
           System.out.println("Nome da zebra: " + zebra.nome);
           System.out.println("Apelido da zebra: " + zebra.apelido);
           System.out.println("Idade da zebra: " + zebra.idade);
       }
   }

}
