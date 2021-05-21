public class Estagiario extends Funcionario{
  private double vale_coxinha;
  public Estagiario(int ID, String nome, double salario, double vale_coxinha){
    super(ID, nome, salario, "Estagiario");
    this.vale_coxinha = vale_coxinha;
  }
  public void setValeCoxinha( double vale_coxinha ){
    this.vale_coxinha = vale_coxinha;
  }
}