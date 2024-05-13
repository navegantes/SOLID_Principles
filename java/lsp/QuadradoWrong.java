// package java.lsp;

public class QuadradoWrong extends RetanguloWrong {

  public QuadradoWrong() {}
  
  public QuadradoWrong(int tamanho) {
    super(tamanho, tamanho);
  }

  @Override
  public void setLargura(int largura) {
    super.setLargura(altura);
    super.setAltura(altura);
  }

  @Override
  public void setAltura(int altura) {
    super.setAltura(altura);
    super.setLargura(altura);
  }
  
}
