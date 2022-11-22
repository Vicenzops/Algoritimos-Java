//Cria a classe No
class No{
  int dado;
  No proximo;

  //Alimenta o No
  public No(int d){
    dado = d;
    proximo = null;
  }
  public void imprime(){
    System.out.println("Valor do nó: "+dado);
  }
}
