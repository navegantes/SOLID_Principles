class TesteWrong {

   static void getAreaTeste(RetanguloWrong r) {
      int largura = r.getLargura();
      r.setAltura(10);
      System.out.println("Área esperada de " + (largura * 10) + ", obteve " + r.calculaArea());
   }

   public static void main(String[] args) {
      RetanguloWrong rc = new RetanguloWrong(2, 3);
      getAreaTeste(rc);

      QuadradoWrong sq = new QuadradoWrong();
      sq.setLargura(5);
      getAreaTeste(sq);
   }
}
