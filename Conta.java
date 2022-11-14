public abstract class Conta{
  private final int numero;
  private final int agencia;
  static private int cont = 0;
  private double saldo;
  private final Cliente cliente;
  private Extrato extrato = new Extrato();

  public Conta(int agencia, double saldo, Cliente cliente){
    cont++;
    numero = cont;
    this.agencia = agencia;
    this.saldo = saldo;
    this.cliente = cliente;
  }
  
  public boolean sacar(double qtd){
    saldo -= qtd;
    extrato.adicionarTransacao("Saque de " + qtd + "\nSaldo: " + saldo);
    return true;
  }
  
  public boolean depositar(double qtd){
    saldo += qtd;
    extrato.adicionarTransacao("Depósito de " + qtd + "\nSaldo: " + saldo);
    return true;
  }

  public boolean transferir(double valor, Conta conta){
    saldo -= valor;
    conta.setSaldo(conta.getSaldo() + valor);
    extrato.adicionarTransacao("Realizou transferência de " + valor + "\nSaldo: " + saldo);  
    conta.extrato.adicionarTransacao("Recebeu transferência de " + valor + "\nSaldo: " + conta.getSaldo());
    return true;
  }

  public void imprimirExtrato(){
    if(saldo >= Extrato.tarifa){
      System.out.println("\nImprimindo Extrato da conta de número " + numero + "\n");
      saldo -= Extrato.tarifa;
      extrato.imprimir();
    }else{
      System.out.println("Saldo insuficiente!");
    }
  } 

  public int getNumero(){
    return numero;
  }
  public int getAgencia(){
    return agencia;
  }
  public double getSaldo(){
    return saldo;
  }
  public void setSaldo(double saldo){
    this.saldo = saldo;
  }
  public Cliente getCliente(){
    return cliente;
  }
  public Extrato getExtrato(){
    return extrato;
  }
  public void exibirInformacoes(){
    cliente.listar();
    System.out.println("\nNúmero da Conta: " + numero + "\nAgência: " + agencia + "\nSaldo: " + saldo + "\n");  
  }
  
}