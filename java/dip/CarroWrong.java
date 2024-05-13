package java.dip;

public class CarroWrong {
  private EngineWrong engineWrong;

  public CarroWrong(EngineWrong engineWrong) {
    this.engineWrong = engineWrong;
  }
  public void start() {
    engineWrong.start();
  }
}

class EngineWrong {
  public void start() {
    System.out.println("Ligando o motor...");
  }
}
