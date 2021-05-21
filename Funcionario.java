public class Funcionario{
  private int ID;
  private String nome;
  private double salario;
  private String cargo;
  
  public Funcionario(int ID, String nome, double salario, String cargo){
    this.ID = ID;
    this.nome = nome;
    this.salario = salario;
    this.cargo = cargo;
  }

  public double getSalarioFunc(){
    return(this.salario);
  }
  public double getSalario(){
    return(this.salario);
  }

  public String getCargo(){
    return(this.cargo);
  }

  public String getNome(){
    return(this.nome);
  }
  public int getId(){
    return(this.ID);
  }
  public void alteraAdicional(double novo_percentual){
    System.out.println("over");
  }
}