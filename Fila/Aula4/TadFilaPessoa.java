//Cria
public class TadFilaPessoa{
    
    int fim;
    int inicio;
    int capacidade = 100;
    Pessoa dados[];

    //Alimenta  
    public TadFilaPessoa(){
        this.fim = -1;
        this.inicio = -1;
        this.dados = new Pessoa[capacidade];
    }

  //Enfila retornando se True ou False
	  public boolean enfila (Pessoa p) {
      if(!cheia()){
        fim++;
	      dados[fim] = p;
        return true;
      }
      return false;
	   }

    //Retira toda as pessoas com mais de 60 anos da fila principal e 
    //move para uma fila preferencial
    public void desmembra(TadFilaPessoa idoso,TadFilaPessoa mulher,TadFilaPessoa principal){
      for (int i= inicio+1; i<=fim ; i++){
	         if (dados[i].idade >= 60){
            idoso.enfila(dados[i]);
          }
            //Move todas as mulheres para uma fila unica
            else if (dados[i].sexo == 'M'){
            mulher.enfila(dados[i]);
             desenfileira();
          }
             
        else{
          principal.enfila(dados[i]);
        }
        }
    }

    
    //desenfileira
    public Pessoa desenfileira(){
      Pessoa p = null;
      if(!vazia()){
        inicio++;
        p = dados[inicio];
        }
      return p;
    }

    //Imprime referenciando a impressão da pessoa
    public void imprime () {
	      for (int i= inicio+1; i<=fim ; i++){
	        dados[i].imprime();
        }
	  }
      
	  /*public void imprimeaocontrario () {
	       for (int i=inicio; i>=0; i--)
	         System.out.println(dados[i]+ "");
	   }*/

    //Retorna se é True ou False
	   public boolean cheia() {
	       return (fim == capacidade);
	   }

    //Retorna se é True ou False
     public boolean vazia(){
       return (fim <= inicio);
     }

    //Conta a quantidade de pessoas na fila
    public int conta(){
      return (fim - inicio);
    }
	
}
