/**
 *
 * @author Ygor
 */
package Calculadora;    

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
      public static void main (String args[]){
       Scanner sc = new Scanner (System.in);
          try{
              Registry meuRegistro = LocateRegistry.getRegistry("localhost", 1099);
                      CalculadoraInterface c = (CalculadoraInterface)Naming.lookup("//localhost/calculadora");
                      float n1,n2;
                          System.out.println("  CALCULADORA RMI\n"+
                                  "ADIÇÃO          (1)\n"+
                                  "SUBTRAÇÃO       (2)\n"+
                                  "MULTIPLICAÇÃO   (3)\n"+
                                  "DIVISÃO         (4)\n"+
                                  "       SAIR     (5)\n");
                          System.out.println("DIGITE A OPÇÃO DESEJADA: \n");
                          int opcao = sc.nextInt();
                          while(opcao!=5){
                          switch(opcao){
                            case 1:
                                  System.out.println("Digite o primeiro digito para adição");
                                  n1 = sc.nextFloat();
                                  System.out.println("Digite o segundo digito para adição");
                                  n2 = sc.nextFloat();
                                  System.out.println("RESULTADO: "+c.somar(n1, n2));
                                  break;
                             case 2:
                                  System.out.println("Digite o primeiro digito para subtração");
                                   n1 = sc.nextFloat();
                                  System.out.println("Digite o segundo digito para subtração");
                                   n2 = sc.nextFloat();
                                  System.out.println("RESULTADO: "+c.subtrair(n1, n2));
                                  break;
                            case 3:
                                  System.out.println("Digite o primeiro digito para multiplicação");
                                   n1 = sc.nextFloat();
                                  System.out.println("Digite o segundo digito para multiplicação");
                                   n2 = sc.nextFloat();
                                  System.out.println("RESULTADO: "+c.multiplicar(n1, n2));
                                  break;
                            case 4:
                                  System.out.println("Digite o primeiro digito para divisão");
                                   n1 = sc.nextFloat();
                                  System.out.println("Digite o segundo digito para divisão");
                                   n2 = sc.nextFloat();
                                  System.out.println("RESULTADO: "+c.dividir(n1, n2));
                                  break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA");
                                break;
                          }
                break;
              }
          }catch(Exception ex){
              System.out.println ("Servidor calculadora falhou!! \n" + ex);
          }
          
      }
}