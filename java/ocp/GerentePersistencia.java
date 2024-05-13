package java.ocp;

import java.srp.Fatura;

public class GerentePersistencia {
  PersistenciaLivro persistenciaLivro;
  PersistenciaFatura persistenciaFatura;

  public GerentePersistencia(
    PersistenciaLivro persistenciaLivro,
    PersistenciaFatura persistenciaFatura
  ) {
    this.persistenciaLivro = persistenciaLivro;
    this.persistenciaFatura = persistenciaFatura;

  }
}

class PersistenciaLivro implements PersistenciaFatura {

  @Override
  public void salvar(Fatura fatura) {
    // Salvar em arquivo
  }
}