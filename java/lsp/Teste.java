import java.util.List;

public class Teste {
  public static void main(String[] args) {
    RetanguloWrong rw = new RetanguloWrong(2, 3);
    RetanguloWrong sw = new QuadradoWrong();
    sw.setAltura(3);

    System.out.println("Sem LSP");
    System.out.printf("Area Retangulo: %.2f", rw.calculaArea());
    System.out.println();

    System.out.printf("Area Quadrado: %.2f", sw.calculaArea());
    System.out.println();


    Retangulo ret = new Retangulo(2, 3);
    Quadrado quad = new Quadrado(3);

    System.out.println("Com LSP");
    
    List<Forma> formas = List.of(ret, quad);

    for (Forma forma : formas) {
      System.out.printf("Area: %.2f", forma.calculaArea());
      System.out.println();
    }
  }
}
