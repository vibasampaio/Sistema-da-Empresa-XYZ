public class Presidente extends Funcionario{
 private double previdencia, adicional_whisky, adicional_helicoptero,
 adicional_adicional;
 public Presidente( int ID, String nome, double salario){
 super(ID, nome, salario, "Presidente");
 this.previdencia=0.15;
 this.adicional_whisky=0.9;
 this.adicional_helicoptero=0.7;
 this.adicional_adicional=3.8;

 }
 public void alteraAdicional(double novo_percentual){
 this.adicional_whisky=0.9*(1+novo_percentual);
 this.adicional_helicoptero=0.7*(1+novo_percentual);
 this.adicional_adicional=3.8*(1+novo_percentual);
 }
 public double getSalario(){
 // Calcula o salário líquido
 return(getSalarioFunc()*((1-this.previdencia)+this.adicional_whisky+
 this.adicional_helicoptero+this.adicional_adicional));
 }
}