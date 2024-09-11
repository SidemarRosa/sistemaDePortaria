import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Pessoa 
{
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

// Classe Funcionario que estende Pessoa
class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cargo) {
        super(nome);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cargo: " + cargo;
    }
}

// Classe Empresa
class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void registrarEntrada(Funcionario funcionario) {
        String horaEntrada = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("Registro de Entrada:");
        System.out.println("Funcionário: " + funcionario);
        System.out.println("Empresa: " + nome);
        System.out.println("Hora de Entrada: " + horaEntrada);
    }

    public String getNome() {
        return nome;
    }
}

// Classe principal
public class RegistroDeEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar empresa
        System.out.print("Digite o nome da empresa: ");
        String nomeEmpresa = scanner.nextLine();
        Empresa empresa = new Empresa(nomeEmpresa);

        // Criar funcionários
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();
        System.out.print("Digite o cargo do funcionário: ");
        String cargoFuncionario = scanner.nextLine();
        Funcionario funcionario = new Funcionario(nomeFuncionario, cargoFuncionario);

        // Adicionar funcionário à empresa
        empresa.adicionarFuncionario(funcionario);

        // Registrar entrada
        empresa.registrarEntrada(funcionario);
    }
}

