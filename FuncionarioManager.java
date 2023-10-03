import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioManager {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void criarFuncionario(String nome, double salario) {
        Funcionario funcionario = new Funcionario(salario, nome);
        funcionarios.add(funcionario);
    }

    public Funcionario consultarFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                return funcionario;
            }
        }
        return null;
    }

    public void atualizarSalario(String nome, double novoSalario) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                funcionario.setSalario(novoSalario);
                return;
            }
        }
    }

    public void excluirFuncionario(String nome) {
        funcionarios.removeIf(funcionario -> funcionario.getNome().equalsIgnoreCase(nome));
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public static void main(String[] args) {
        FuncionarioManager manager = new FuncionarioManager();
        Scanner scanner = new Scanner(System.in);

     while (true) {
       System.out.println("Escolha uma opção:");
       System.out.println("1 - Criar funcionário");
       System.out.println("2 - Consultar funcionário");
       System.out.println("3 - Atualizar salário do funcionário");
       System.out.println("4 - Excluir funcionário");
       System.out.println("5 - Listar todos os funcionários");
       System.out.println("6 - Sair");

    int opcao = scanner.nextInt();
     scanner.nextLine(); // 

      switch (opcao) {
       case 1:
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); 
        manager.criarFuncionario(nome, salario);
        System.out.println("Funcionário criado com sucesso!");
        break;
        case 2:
        System.out.print("Digite o nome do funcionário para consultar: ");
        String nomeConsulta = scanner.nextLine();
        Funcionario funcionarioConsultado = manager.consultarFuncionario(nomeConsulta);
         if (funcionarioConsultado != null) {
            System.out.println("Funcionário encontrado:");
            System.out.println("Nome: " + funcionarioConsultado.getNome());
            System.out.println("Salário: " + funcionarioConsultado.getSalario());
      } else {
            System.out.println("Funcionário não encontrado.");
             }
        break;
         case 3:
          System.out.print("Digite o nome do funcionário para atualizar o salário: ");
           String nomeAtualizacao = scanner.nextLine();
           System.out.print("Digite o novo salário: ");
           double novoSalario = scanner.nextDouble();
           scanner.nextLine(); 
           manager.atualizarSalario(nomeAtualizacao, novoSalario);
           System.out.println("Salário do funcionário atualizado com sucesso!");
          break;
         case 4:
           System.out.print("Digite o nome do funcionário para excluir: ");
           String nomeExclusao = scanner.nextLine();
           manager.excluirFuncionario(nomeExclusao);
           System.out.println("Funcionário excluído com sucesso!");
           break;
         case 5:
           List<Funcionario> funcionarios = manager.listarFuncionarios();
             System.out.println("Lista de funcionários:");
             for (Funcionario funcionario : funcionarios) {
             System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.getSalario());
                  }
          break;
        case 6:
           System.out.println("Encerrando o programa.");
           System.exit(0);
        break;
       default:
          System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}