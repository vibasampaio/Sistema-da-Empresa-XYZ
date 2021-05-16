public class Funcionario{
  private int ID;
  public String nome;
  private double salario;
  
  public Funcionario(int ID, String nome, double salario){
    this.ID = ID;
    this.nome = nome;
    this.salario = salario;
  }

  public double getSalario(){
    return(this.salario);
  }
}