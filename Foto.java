public class Foto implements Imprimivel{
  private String data;
  private String legenda;
  private String imagem;
  
  public Foto(String data, String legenda, String imagem){
    this.data = data;
    this.legenda = legenda;
    this.imagem = imagem;
  }
  public void imprimir(){
    System.out.println("Imprimindo foto:\n" + data + "\n" + legenda + "\n" + imagem);
  }

  public String getData(){
    return data;
  }
  public void setData(String data){
    this.data = data;
  }
  public String getLegenda(){
    return legenda;
  }
  public void setLegenda(String legenda){
    this.legenda = legenda;
  }
  public String getImagem(){
    return imagem;
  }
  public void setImagem(String imagem){
    this.imagem = imagem;
  }
}