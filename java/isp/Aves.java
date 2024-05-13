package java.isp;

interface Aves {
  public void setLocalizacao(float longitude, float latitude);
  public void renderizar();
}

interface AvesQueVoam extends Aves {
  public void setAltitude(float altitude);
}
