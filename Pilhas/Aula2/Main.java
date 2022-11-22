class Main {
  public static void main(String[] args) {
    String f = "53+";
    TadPilha p = new TadPilha(f.length());
    char aux;
    int a, b, o = 0;

    for(int i=0; i<f.length(); i++){
      aux = f.charAt(i);
      if(aux >= '0' && aux <= '9'){
        p.empilha(Character.getNumericValue(aux));
      }
      else{
        a = p.desempliha();
        b = p.desempliha();
        
        if(aux == '+') o = a + b;
        if(aux == '-') o = a - b;
        if(aux == '*') o = a * b;
        if(aux == '/') o = a / b;
        if(aux == '%') o = a % b;

        p.empilha(o);
      }
    }
    int resultado = p.desempliha();
    System.out.println(resultado);
    //p.imprime();

  }
}
