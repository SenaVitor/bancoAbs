public class ContaDeInvestimentos extends Conta{
  static final private double taxaJuros = 0.01;
  private int numDiasAposAbertura = 0;
  private double rendimento;

  ContaDeInvestimentos(int agencia, double saldo, Cliente cliente){
    super(agencia, saldo, cliente);
  }

  public double avancarTempo(int dias){
    numDiasAposAbertura += dias;
    rendimento = (getSaldo() * taxaJuros * numDiasAposAbertura);
    setSaldo(getSaldo() + rendimento);
    getExtrato().adicionarTransacao("Rendimento de " + rendimento + "\nSaldo: " + getSaldo());
    System.out.println("Rendimento de " + rendimento + " reais " + numDiasAposAbertura + " dias após a abertura da conta");
    return getSaldo();
  }

  public void exibirInformacoes(){
    System.out.println("Conta De Investimentos");
    super.exibirInformacoes();
  }

  public boolean sacar(double qtd){
    if(getSaldo() >= qtd){
      return super.sacar(qtd);
    }
    return false;
  }

  public boolean transferir(double valor, Conta conta){
    if(getSaldo() >= valor){
      super.transferir(valor, conta);
    }
    return false;
  }
}