import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {
  String nomeEmpresa;
  ArrayList<Funcionario> funcionarios = new ArrayList();
  Funcionario funcionario;
  Presidente presidente;
  Gerente gerente;
  public Empresa(String nomeEmpresa){
    this.nomeEmpresa = nomeEmpresa;
  }
  public void adicionarFuncionario(Funcionario funcionario){
    gerente = new Gerente(funcionario.getId(),funcionario.getNome(), funcionario.getSalario(), 0.0);
    this.funcionarios.add(funcionario);
  }
  
  public double calcularPagamento(int id){
    return this.funcionarios.get(id-1).getSalario();
  }

  public void adicionalFuncionarios(){
    Iterator<Funcionario> iterator = funcionarios.iterator();
    
    while (iterator.hasNext()) {
      funcionario = iterator.next();
      System.out.printf("\n Funcionario %s - %s\n", funcionario.getNome(), funcionario.getCargo());
      if(funcionario.getCargo() == "Presidente"){

      } if (funcionario.getCargo() == "Gerente"){

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