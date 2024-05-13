package java.dip;

public class Carro {
  private Engine engine;

  public Carro(Engine engine) {
    this.engine = engine;
  }

  public void start() {
    engine.start();
  }
}

class PetroleoEngine implements Engine {
  public void start() {
    System.out.println("Ligando o motor a petroleo...");
  }
}

class DieselEngine implements Engine {
  public void start() {
    System.out.println("Ligando o motor a diesel...");
  }
}