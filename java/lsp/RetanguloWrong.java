// package java.lsp;

public class RetanguloWrong {
  public int largura;
  public int altura;

  
  public RetanguloWrong() {}
  
  public RetanguloWrong(int largura, int altura) {
    this.largura = largura;
    this.altura = altura;
  }
  
  public double calculaArea() {
    return this.altura * this.largura;
  }

  public int getLargura() {
    return largura;
  }
  
  public void setLargura(int largura) {
    this.largura = largura;
  }
  
  public int getAltura() {
    return altura;
  }
  
  public void setAltura(int altura) {
    this.altura = altura;
  }
}
