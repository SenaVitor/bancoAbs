public class Extrato implements Imprimivel{
  private int numTransacoes = 0;
  private String transacoes[] = new String[20];
  final static public double tarifa = 3f;
  
  public void adicionarTransacao(String transacao){
    if(numTransacoes < 20){
      transacoes[numTransacoes] = transacao;
      numTransacoes++;
    }else{
      for(int i = 0; i < 19; i++){
        transacoes[i] = transacoes[i+1];
      }
      transacoes[numTransacoes-1] = transacao;
    }
  }
  
  public void imprimir(){
    int cont = 0;
    while(cont < numTransacoes){
      System.out.println(transacoes[cont]);
      cont++;
    }
  }
}