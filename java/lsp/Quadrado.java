
public class Quadrado implements Forma {
  public int lado;

  public Quadrado(int lado) {
    this.lado = lado;
  }

  public double calculaArea() {
    return Math.pow(this.lado, 2);
  }
}
