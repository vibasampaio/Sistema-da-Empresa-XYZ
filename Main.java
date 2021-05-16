import java.util.Scanner;
import java.util.UUID;
class Main {
  
  public static void main(String[] args) {
    Funcionario funcionario;
    Empresa vns;
    vns = new Empresa("VNS LTDA");
    Utils utils = new Utils();
    Scanner opcaoInicio = new Scanner(System.in);
    Scanner opcaoCargo = new Scanner(System.in);
    System.out.println("Bem vindo ao sistema de gerenciamento de funcionários da empresa XYZ");
    System.out.println("Escolha uma das opções a seguir:");
    String[] opcoes = new String[]{"Adicionar um funcionário", "Calcular pagamento do funcionário", "Aumentar o adicional de todos os funcionários", "Relatório dos funcionários da empresa"};
    String[] cargos = new String[]{"Estagiário", "Gerente", "Presidente", "Secretária"};
    utils.mostrarOpcoes(opcoes);
    String opcaoMetodo = opcaoInicio.nextLine();
    switch (opcaoMetodo)
    {
        case "1":
        //Java code
        UUID uuid=UUID.randomUUID();
        mostrarOpcoes(cargos);
        String opcao = opcaoCargo.nextInt();
        funcionario = new Funcionario(uuid, "Vinicius", 1250.0, cargos[opcao]);
        vns.adicionarFuncionario(funcionario);
        ;
        case "2":
        //Java code
        ;
        case "3":
        // 
        ;
        case "4":
        // 
        ;
        default:
        //Java code
        ;
    }
     
    
    
    
    vns.listarFuncionarios();
  }
}