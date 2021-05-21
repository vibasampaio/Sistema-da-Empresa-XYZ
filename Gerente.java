public class Gerente extends Funcionario{
 private double previdencia, adicional;
 public Gerente(int ID, String nome, double salario, double adicional){
  super(ID, nome, salario, "Gerente");
  this.previdencia=0.07;
 // adicional caso o funcionário seja por exemplo chefe.
 this.adicional = adicional;
 }
 public void alteraAdicional(double novo_percentual){
 this.adicional = adicional*(1+novo_percentual);
 }
 public double getSalario(){
 // Calcula o salário líquido
 return(getSalarioFunc()*((1- this.previdencia)+ this.adicional));
 }
}