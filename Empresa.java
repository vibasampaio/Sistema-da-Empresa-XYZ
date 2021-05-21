import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {
  String nomeEmpresa;
  ArrayList<Funcionario> funcionarios = new ArrayList();
  Funcionario funcionario;
  
  public Empresa(String nomeEmpresa){
    this.nomeEmpresa = nomeEmpresa;
  }
  public void adicionarFuncionario(Funcionario funcionario){
    this.funcionarios.add(funcionario);
  }
  
  public double calcularPagamento(int id){
    return this.funcionarios.get(id-1).getSalario();
  }

  public String toString(){
    Iterator<Funcionario> iterator = funcionarios.iterator();
    String stringSaida = "";
    while (iterator.hasNext()) {
      Funcionario funcionario = iterator.next();
      
      System.out.printf("\nID %d- Nome: %s - Salario: R$ %.2f\n",funcionario.getId(), funcionario.getNome(), funcionario.getSalario());
      stringSaida = stringSaida.concat(String.format("\nPosição %d- %s - %f\n", funcionario.getId(), funcionario.getNome(), funcionario.getSalario()));
      
    }
    return stringSaida;
  }

  public void adicionalFuncionarios(double valorAdicional){
    Iterator<Funcionario> iterator = funcionarios.iterator();
    
    while (iterator.hasNext()) {
      funcionario = iterator.next();
      System.out.printf("\n Funcionario %s - %s\n", funcionario.getNome(), funcionario.getCargo());
      if(funcionario.getCargo() == "Presidente" || funcionario.getCargo() == "Gerente"){
        funcionario.alteraAdicional(valorAdicional);
      }
    }
  }

  public void listarFuncionarios(){
    System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
    int i = 0;
    Iterator<Funcionario> iterator = funcionarios.iterator();
    while (iterator.hasNext()) {
      System.out.printf("Posição %d- %s\n", i, iterator.next().getNome());
      i++;
    }
  }
}