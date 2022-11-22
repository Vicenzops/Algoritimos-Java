    public class TadFila{
    
    int fim;
    int inicio;
    int capacidade = 6;
    int dados[];

      
    public TadFila(){
        this.fim = -1;
        this.inicio = -1;
        this.dados = new int[capacidade];
    }
    
	  public void enfila (int d) {
      if(cheio()){
	      break;
      }
      else{
        fim++;
	      dados[fim] = d;
      }
	   }

    public int desenfila (){
      int ret = 0;
      if(vazia()){
        inicio++;
        ret = dados[inicio];
        }
      return ret;
    }

      public void imprime () {
	       for (int i= (inicio+1); i<fim ; i++){
	         System.out.print(dados[i]+ " ");
         }
        System.out.print("\n");
	   }
      
	  /*public void imprimeaocontrario () {
	       for (int i=inicio; i>=0; i--)
	         System.out.println(dados[i]+ "");
	   }*/
  
	   public boolean cheia() {
	       return (fim == capacidade - 1);
	   }
      
     public boolean vazia(){
       return (fim <= inicio);
     }

    public int conta(){
      return (fim - inicio);
    }
	
}
