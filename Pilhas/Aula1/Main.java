/*

Vicenzo 12/08/2022 Primeiro Programa Java

*/

public class Main {
  
  public static void main(String[] args) {
  int a=4, b=2;
    calculadora(a, b);
  }
  public static void calculadora(int a, int b){
    System.out.println("A = "+a+" B = "+b); // Printf
    System.out.println("A+B = "+(a+b)); // Soma
    System.out.println("A-B = "+(a-b)); // Subtração
    System.out.println("A*B = "+(a*b)); // Mutiplicação
    System.out.println("A/B = "+(a/b)); // Divisão
    System.out.println("A%B = "+(a%b)); // Resto
  }
}
