public class Estagiario extends Funcionario{
  private int ID;
  private String nome;
  private double salario;
  private double vale_coxinha;
  public Estagiario(int ID, String nome, double salario, double vale_coxinha){
    super(ID, nome, salario);
    this.vale_coxinha = vale_coxinha;
  }
  public void setValeCoxinha( double vale_coxinha ){
    this.vale_coxinha = vale_coxinha;
  }
  public double getSalario(){
  // Calcula o salário líquido
    return(this.salario+this.vale_coxinha);
  }
}