package java.srp;

class Livro {
  String nome;
  String nomeAutor;
  int ano;
  int preco;
  String isbn;

  public Livro(
    String nome,
    String nomeAutor,
    int ano,
    int preco,
    String isbn
  ){
    this.nome = nome;
    this.nomeAutor = nomeAutor;
    this.ano = ano;
    this.preco = preco;
    this.isbn = isbn;
  }
}

public class FaturaWrong {
  private Livro livro;
  private int quantidade;
  private double porcDesconto;
  private double porcImposto;
  private double total;

  public FaturaWrong(
    Livro livro,
    int quantidade,
    double porcDesconto,
    double porcImposto
  ) {
    this.livro = livro;
    this.quantidade = quantidade;
    this.porcDesconto = porcDesconto;
    this.porcImposto = porcImposto;
    this.total = this.calculaTotal();
  }

  public double calculaTotal() {
    double preco = ((livro.preco - livro.preco * porcDesconto) * this.quantidade);

    return preco * (1 + porcImposto);
  }

  public void imprimiFatura() {
    System.out.println(quantidade + "x " + livro.nome + " " +          livro.preco + "$");
    System.out.println("Porcentagem de desconto: " + porcDesconto);
    System.out.println("Procentagem de imposto: " + porcImposto);
    System.out.println("Total: " + total);
  }

  public void salvarParaArquivo(String nomeArquivo) {
    // Cria um arquivo com o nome especificado e salva a fatura
    // Salva dados da fatura no banco de dados
  }
}


