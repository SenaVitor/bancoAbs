class Cliente{
  private String nome;
  final private String cpf;
  private int idade;
  final private String tipo = "Pessoa Física";
  private Foto foto;

  Cliente(String nome, String cpf, int idade, Foto foto){
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
    this.foto = foto;
  }

  void listar(){
    System.out.println("Cliente: " + nome + " Idade: " + idade + " Cpf: " + cpf + " Tipo: " + tipo);
  }
  
  String getNome(){
    return nome;
  }
  void setNome(String nome){
    this.nome = nome;
  }
  String getCpf(){
    return cpf;
  }
  int getIdade(){
    return idade;
  }
  void setIdade(int idade){
    this.idade = idade;
  }
  String getTipo(){
    return tipo;
  }
  Foto getFoto(){
    return foto;
  }
  void setFoto(Foto foto){
    this.foto = foto;
  }
}