//Cria a Lista
class Lista{
  No inicio;
  No proximo;

  //Alimenta a Lista
  public Lista(){
    inicio = null;
  }

  public boolean vazia(){
    return (inicio == null);
  }

  public void imprime(){
      No atual;
      atual = inicio;
      while (atual.proximo != null){
        atual.imprime();
        atual = atual.proximo;
      }
  }

  public void insereNoFinal(No n){
    if(!vazia()){
      No atual;
      atual = inicio;
      while (atual.proximo != null){
        atual = atual.proximo;
      }
      atual.proximo = n; //conecta o auxiliar no ultimo
    }
    else { 
      inicio = n;
    }
  }
}
