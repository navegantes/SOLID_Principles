package java.ocp;

import java.srp.Fatura;

public class PersistenciaFaturaWrong {
  Fatura fatura;

  public PersistenciaFaturaWrong(Fatura fatura) {
    this.fatura = fatura;
  }

  public void salvaParaArquivo(String nomeArquivo) {
    // Cria um arquivo com o nome especificado e salva a fatura.
  }

  public void salvaParaBancoDeDados() {
    // Salva dados da fatura no banco de dados
  }
}
