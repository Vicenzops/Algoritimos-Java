    public class TadPilha{
    
    int capacidade;
    int topo;
    int[] dados;

      
    public TadPilha(int capacidade){
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }
    
	  public void empilha (int d) {
	       if (!cheia()){
	           topo++;
	           dados[topo] = d;
	       }
	   }

    public int desempliha (){
      int ret = 0;
      if (!vazia()){
        topo--;
        return ret = dados[topo+1];
      }
      return ret;
    }

      public void imprime () {
	       for (int i=0; i<topo ; i++)
	         System.out.println(dados[i]+ "");
	   }
      
	   public void imprimeaocontrario () {
	       for (int i=topo; i>=0; i--)
	         System.out.println(dados[i]+ "");
	   }
  
	   public boolean cheia() {
	       return (topo == capacidade - 1);
	   }
      
     public boolean vazia(){
       return (topo == -1);
     }
	
}
