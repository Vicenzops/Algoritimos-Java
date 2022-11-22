//Cria
public class TadFilaCircular{
    
    int fim;
    int inicio;
    int capacidade = 6;
    Pessoa dados[];

    //Alimenta  
    public TadFilaCircular(){
        this.fim = 0;
        this.inicio = 0;
        this.dados = new Pessoa[capacidade];
    }


    //enfileira retornando se True ou False
	  public boolean enfileira (Pessoa p) {
      if(cheia())  return false;
      
        fim = (fim+1) % capacidade;  
	      dados[fim] = p;
        return true;
	   }
    
    //desenfileira
    public Pessoa desenfileira(){
      if(vazia()) return null;
      
      Pessoa p = dados[inicio];
      inicio = (inicio + 1)%capacidade;
      return p;
    }

  
    //Imprime referenciando a impressão da pessoa
    public void imprime () {
	    if(vazia()) System.out.println("Fila Vazia!");
      else{
          for (int i= 1; i <= conta() ; i++){
          int aux = (inicio+i) % capacidade;
	        dados[aux].imprime();
        }
      }
	  }
      

    //Retorna se é True ou False
	   public boolean cheia() {
	       if (inicio == (fim + 1) % capacidade) return true;
       return false;
	   }

    //Retorna se é True ou False
     public boolean vazia(){
       if (fim == capacidade) return true;
       return false;
     }

    //Conta a quantidade de pessoas na fila 
    public int conta(){
      if(fim > inicio) return (fim - inicio);
      else {
        return (capacidade - (inicio+fim));
      }
    }



    //Retira toda as pessoas com mais de 60 anos da fila principal e 
    //move para uma fila preferencial
    public void desmembra(TadFilaCircular idoso,TadFilaCircular mulher,TadFilaCircular principal){
      for (int i= inicio+1; i<=fim ; i++){
	         if (dados[i].idade >= 60){
            idoso.enfileira(dados[i]);
          }
            //Move todas as mulheres para uma fila unica
            else if (dados[i].sexo == 'M'){
            mulher.enfileira(dados[i]);
             desenfileira();
          }
             
        else{
          principal.enfileira(dados[i]);
        }
        }
    }
	
}
