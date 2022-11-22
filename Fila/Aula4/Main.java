//Importa o Scanner
import java.util.Scanner;

class Main {

  //Define filas Principal e Idoso
  static TadFilaPessoa principal;
  static TadFilaPessoa idoso;
  
  public static void main(String[] args) {
    //Cria Filas
    principal = new TadFilaPessoa();
    idoso = new TadFilaPessoa();
    TadFilaPessoa aux = new TadFilaPessoa();
    //Cria fila de mulher
    TadFilaPessoa mulher = new TadFilaPessoa();
    
    //Cria Pessoas (Cada p é uma pessoa diferente)
    Pessoa p;
    p = new Pessoa(18, 'H', "Jovem1"); aux.enfila(p);
    p = new Pessoa(20, 'H', "Jovem2"); aux.enfila(p);
    p = new Pessoa(36, 'H', "Jovem3"); aux.enfila(p);
    p = new Pessoa(50, 'H', "Jovem4"); aux.enfila(p);
    p = new Pessoa(45, 'H', "Jovem5"); aux.enfila(p);  
    p = new Pessoa(72, 'H', "Idoso1"); aux.enfila(p);    
    p = new Pessoa(86, 'H', "Idoso2"); aux.enfila(p);    
    p = new Pessoa(91, 'H', "Idoso3"); aux.enfila(p);  
    p = new Pessoa(200, 'H', "Idoso4");aux.enfila(p);
    p = new Pessoa(95, 'H', "Idoso5"); aux.enfila(p);
    p = new Pessoa(84, 'H', "Idoso6"); aux.enfila(p);
    p = new Pessoa(99, 'H', "Idoso7"); aux.enfila(p);
    p = new Pessoa(120, 'H', "Idoso8");aux.enfila(p);
    p = new Pessoa(75, 'H', "Idoso9"); aux.enfila(p);
    p = new Pessoa(89, 'H', "Idoso10");aux.enfila(p);
    p = new Pessoa(18, 'H', "Jovem6"); aux.enfila(p);
    p = new Pessoa(18, 'H', "Jovem7"); aux.enfila(p);
    p = new Pessoa(18, 'H', "Jovem8"); aux.enfila(p);
    p = new Pessoa(18, 'H', "Jovem9"); aux.enfila(p);
    p = new Pessoa(18, 'H', "Jovem10");aux.enfila(p);
    
    //Desmembra todas as filas
    aux.desmembra(idoso,mulher,principal);
    
  //Cria Scanner
  Scanner scanner = new Scanner(System.in);

  //O usuario define a prioridade de Idosos/Não Idosos
  System.out.println("Defina a relação de chamada entre Idosos e Não Idosos");
  System.out.print("Defina a qtd de Idosos: ");
  int num1 = scanner.nextInt();
  
  System.out.print("Defina a qtd de Não Idosos: ");
  int num2 = scanner.nextInt();

  //Chama a Função publica Atende passando os parametros definidos
  //pelo usuario
  Atende(num1, num2);
  
  }
  public static void Atende(int a, int b){
  System.out.println("Ordem de atendimento: ");
  //Em quanto as filas estiverem com populadas
  while(principal.conta() > 0 || idoso.conta() > 0){
    if (idoso.conta()>0){
      for (int i = 0; i< a ;i++)
        {
          //Desenfila e depois imprime
          Pessoa q = idoso.desenfileira();
          if(q != null) q.imprime();
          else System.out.println(" ");
        } 
    }
    if(principal.conta()>0){
        
      for(int i = 0; i < b; i++)
      {
        //Desenfila e depois imprime
        Pessoa q = principal.desenfileira();
        if(q != null) q.imprime(); 
        else System.out.println(" ");
     }
           
      }
    }
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
