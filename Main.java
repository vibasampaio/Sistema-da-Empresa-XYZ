import java.util.Scanner;
import java.util.UUID;
import java.util.ArrayList;

class Main {
  
  public static void main(String[] args) {
    Secretaria secretaria;
    Estagiario estag;
    Presidente presidente;
    Gerente gerente;
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
              System.out.println("\nNome Estagiário: ");
              nome = nomeScan.nextLine();
              System.out.println("\nSalário Estagiário: ");
              salario = salarioScan.nextDouble();
              estag = new Estagiario(ID, nome, salario, 50.0);
              vns.adicionarFuncionario(estag);
              
            break;
            case "Gerente":
              System.out.println("\nNome Gerente: ");
              nome = nomeScan.nextLine();
              System.out.println("\nSalário Gerente: ");
              salario = salarioScan.nextDouble();
              gerente = new Gerente(ID, nome, salario, 10.0);
              vns.adicionarFuncionario(gerente);
            
            break;
            case "Presidente":
              System.out.println("\nNome Presidente: ");
              nome = nomeScan.nextLine();
              System.out.println("\nSalário Presidente: ");
              salario = salarioScan.nextDouble();
              presidente = new Presidente(ID, nome, salario);
              vns.adicionarFuncionario(presidente);

            break;
            case "Secretária":
              System.out.println("\nNome Secretária: ");
              nome = nomeScan.nextLine();
              System.out.println("\nSalário Secretária: ");
              salario = salarioScan.nextDouble();
              secretaria = new Secretaria(ID, nome, salario);
              vns.adicionarFuncionario(secretaria);

            
            break;
          }
          
          System.out.printf("\nUsuário adicionado ID: %d\n", ID);
          vns.listarFuncionarios(); 
        break;
        case "2":
        System.out.println("\nDigite o id do funcionario que deseja calcular o pagamento");
        idFuncionario = IdFuncionarioScan.nextInt();
          totalPagamento = vns.calcularPagamento(idFuncionario);
          System.out.printf("\nSalário %.2f \n", totalPagamento);
        //Java code
        break;
        case "3":
        System.out.println("\nDigite um valor entre 0.0 e 1.0, que será usado como calculo da porcentagem do adicional do salário\n");
        double porcentagemAdicional;
        porcentagemAdicional = porcetagem.nextDouble();
        vns.adicionalFuncionarios(porcentagemAdicional);
               

        // 
        break;
        case "4":
        vns.toString();
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