
class Main {

  //Define filas Principal e Idoso
  static TadFilaCircular principal;
  static TadFilaCircular idoso;
  
  public static void main(String[] args) {
    //Cria Filas
    principal = new TadFilaCircular();
    idoso = new TadFilaCircular();
    TadFilaCircular aux = new TadFilaCircular();
    //Cria fila de mulher
    TadFilaCircular mulher = new TadFilaCircular();
    
    //Cria Pessoas (Cada p é uma pessoa diferente)
    Pessoa p;
    for(int i = 0; i < 6;i++){
      aux.enfileira( new Pessoa(18, 'H', "Jovem "+ (i+1)));
    }
   

  
   aux.desenfileira();
    
    
   aux.enfileira(new Pessoa(18, 'H', "Jovem 6"));

    System.out.print("\n");
    System.out.println("Quantidade de pessoas na fila principal: "+aux.conta());
    aux.imprime();
    

    
  }
}
 /*
    //Imprime todas as filas e suas quantidades
   System.out.print("\n");
    System.out.println("Quantidade de pessoas na fila principal: "+principal.conta());
    principal.imprime();
    
    System.out.print("\n");
    System.out.println("Quantidade de pessoas na fila de idosos: "+idoso.conta());
    idoso.imprime();
    
    System.out.print("\n");
    System.out.println("Quantidade de pessoas na fila de Mulheres: "+mulher.conta());
    mulher.imprime();*/
