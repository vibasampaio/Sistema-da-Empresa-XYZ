import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {
  String nomeEmpresa;
  ArrayList<Funcionario> funcionarios = new ArrayList();
  String[] cargos = new String[]{"Estagiário", "Gerente", "Presidente", "Secretária"};
  public Empresa(String nomeEmpresa){
    this.nomeEmpresa = nomeEmpresa;
  }
  public void adicionarFuncionario(Funcionario funcionario){
    this.funcionarios.add(funcionario);
  }
  

  public void listarFuncionarios(){
    System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
    int i = 0;
    Iterator<Funcionario> iterator = funcionarios.iterator();
    while (iterator.hasNext()) {
      System.out.printf("Posição %d- %s\n", i, iterator.next().nome);
      i++;
    }
  }
}