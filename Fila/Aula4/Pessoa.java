//Cria
class Pessoa{
  int idade;
  char sexo;
  String nome;

  //Alimenta
  public Pessoa(int i, char s, String n){
      idade = i;
      sexo = s;
      nome= n;
    }
  //Imprime, referenciado na pilha
  void imprime(){
    System.out.print("Nome: "+nome+", idade: "+idade+", Sexo: "+sexo);
    System.out.print("\n");
  }
}
