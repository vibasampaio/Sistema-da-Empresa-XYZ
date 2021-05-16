import java.util.Scanner;
import java.util.UUID;
class Main {
  
  public static void main(String[] args) {
    Funcionario funcionario;
    Empresa vns;
    int ID = 0;
    vns = new Empresa("VNS LTDA");
    Utils utils = new Utils();
    Scanner opcaoInicio = new Scanner(System.in);
    Scanner opcaoCargo = new Scanner(System.in);
    Scanner nomeScan = new Scanner(System.in);
    Scanner salarioScan = new Scanner(System.in);
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
          ID++;
          utils.mostrarOpcoes(cargos);
          int opcao = opcaoCargo.nextInt();
          System.out.println(cargos[opcao]);
          switch(cargos[opcao])
          {
            case "Estagiário":
              Estagiario estag;
              System.out.println("Nome Estagiário: ");
              String nome = nomeScan.nextLine();
              System.out.println("Salário Estagiário: "):
              double salario = salarioScan.nextDouble();
              estag = new Estagiario(ID, nome, salario);
            
            // 
            ;
            case "Gerente":
            // 
            ;
            case "Presidente":
            // 
            ;
            case "Secretária":
            // 
            ;
          }
        funcionario = new Funcionario(ID, "Vinicius", 1250.0);
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