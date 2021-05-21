import java.util.Scanner;
import java.util.UUID;
class Main {
  
  public static void main(String[] args) {
    Funcionario funcionario;
    Empresa vns;
    int ID = 0;
    String opcaoMetodo = "";
    boolean controleWhile = true;
    double totalPagamento;
    int idFuncionario = 1;
    vns = new Empresa("VNS LTDA");
    Utils utils = new Utils();
    Scanner opcaoInicio = new Scanner(System.in);
    Scanner opcaoCargo = new Scanner(System.in);
    Scanner nomeScan = new Scanner(System.in);
    Scanner salarioScan = new Scanner(System.in);
    Scanner IdFuncionarioScan = new Scanner(System.in);
    Scanner porcetagem = new Scanner(System.in);
    System.out.println("Bem vindo ao sistema de gerenciamento de funcionários da empresa XYZ");
    String[] opcoes = new String[]{"Adicionar um funcionário", "Calcular pagamento do funcionário", "Aumentar o adicional de todos os funcionários", "Relatório dos funcionários da empresa","Sair"};
    String[] cargos = new String[]{"Estagiário", "Gerente", "Presidente", "Secretária"};
    while(controleWhile){
      System.out.println("Escolha uma das opções a seguir:");
      utils.mostrarOpcoes(opcoes);
      opcaoMetodo = opcaoInicio.nextLine();
      switch (opcaoMetodo)
      {
        case "1":
          //Java code
          ID++;
          System.out.println("Qual o cargo do funcionario: \n");
          utils.mostrarOpcoes(cargos);
          int opcao = opcaoCargo.nextInt();

          
          String nome = "";
          double salario = 0.0;
          switch(cargos[opcao-1])
          {
            case "Estagiário":
              System.out.println("Nome Estagiário: ");
              nome = nomeScan.nextLine();
              System.out.println("Salário Estagiário: ");
              salario = salarioScan.nextDouble();
              
            break;
            case "Gerente":
              System.out.println("Nome Gerente: ");
              nome = nomeScan.nextLine();
              System.out.println("Salário Gerente: ");
              salario = salarioScan.nextDouble();
            
            break;
            case "Presidente":
              System.out.println("Nome Presidente: ");
              nome = nomeScan.nextLine();
              System.out.println("Salário Presidente: ");
              salario = salarioScan.nextDouble();

            break;
            case "Secretária":
              System.out.println("Nome Secretária: ");
              nome = nomeScan.nextLine();
              System.out.println("Salário Secretária: ");
              salario = salarioScan.nextDouble();
            
            break;
          }
          funcionario = new Funcionario(ID, nome, salario, cargos[opcao-1]);
          vns.adicionarFuncionario(funcionario);
          System.out.printf("Usuário adicionado ID: %d\n", ID);
          vns.listarFuncionarios(); 
        break;
        case "2":
        System.out.println("Digite o id do funcionario que deseja calcular o pagamento");
        idFuncionario = IdFuncionarioScan.nextInt();
          totalPagamento = vns.calcularPagamento(idFuncionario);
          System.out.printf("Salário %f \n", totalPagamento);
        //Java code
        break;
        case "3":
        System.out.println("Digite um valor entre 0.0 e 1.0, que será usado como calculo da porcentagem do adicional do salário");
        double porcentagemAdicional;
        porcentagemAdicional = porcetagem.nextDouble();
        vns.adicionalFuncionarios();
               

        // 
        break;
        case "4":
        vns.listarFuncionarios();
        // 
        break;
        case "5":
          controleWhile = false;
        break;
        default:
        //Java code
        break;
      }

      
    }
    System.out.println("FIM");
  }
    
}