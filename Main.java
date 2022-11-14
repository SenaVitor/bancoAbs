class Main {
  public static void main(String[] args) {
    Foto foto = new Foto("09/11/2022", "foto 3x4", "imagem");
    Cliente c1 = new Cliente("Vitor", "07898776545", 20, foto);
    c1.getFoto().imprimir();
    ContaCorrente cc = new ContaCorrente(0001, 3000, c1);
    ContaDeInvestimentos ci = new ContaDeInvestimentos(0001, 3000, c1);
    cc.exibirInformacoes();
    System.out.println(cc.sacar(3000));   
    System.out.println(cc.sacar(2000));
    System.out.println(cc.depositar(2000));
    System.out.println(cc.transferir(2000, ci));
    System.out.println(ci.depositar(4000));
    System.out.println(ci.avancarTempo(2));
    ci.exibirInformacoes();
    cc.exibirInformacoes();
    for(int i = 0; i < 20; i++){
      cc.depositar(1);
      ci.depositar(2);   
    }
    System.out.println(ci.avancarTempo(10));
    ci.imprimirExtrato();
    cc.imprimirExtrato();
    ci.exibirInformacoes();
    cc.exibirInformacoes();
  }
}