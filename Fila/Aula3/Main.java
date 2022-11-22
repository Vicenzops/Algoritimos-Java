

class Main {
  public static void main(String[] args) {
    TadFila f = new TadFila();
    f.enfila(2);
    f.enfila(4);
    f.enfila(8);
    f.enfila(10);
    f.enfila(12);
    f.enfila(14);

    f.imprime();
    
    

    f.imprime();

    System.out.println(f.conta());
    
    f.desenfila();

  }
}
