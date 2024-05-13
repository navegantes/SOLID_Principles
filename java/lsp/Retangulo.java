
public class Retangulo implements Forma{
  public int largura;
  public int altura;

  public Retangulo(int largura, int altura) {
    this.largura = largura;
    this.altura = altura;
  }

  @Override
  public double calculaArea() {
    return this.altura * this.largura;
  }
}
