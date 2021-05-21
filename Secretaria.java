public class Secretaria extends Funcionario{
 private double previdencia;
 public Secretaria(int ID, String nome, double salario){
  super(ID, nome, salario, "Secretaria");
 // Desconto fixo de um sistema de previdência da empresa
 this.previdencia=0.05;
 }
 public double getSalario (){
 // Calcula o salário líquido
 return(getSalarioFunc()*(1-previdencia));
 }
}