import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Classe principal
public class RegistroDeEntrada {
    private Scanner scanner = new Scanner(System.in); // Inicializando o Scanner
    public static void main(String[] args) {
        cadastrarEmpresa();
    }

    // Método para criar empresa
    public static void cadastrarEmpresa() {
        System.out.print("Digite o nome da empresa: ");
        String empresa = scanner.nextLine();
        System.out.println("Empresa '" + empresa + "' criada com sucesso");
    }

    public static void cadastrarFuncionario(){
        System.out.print("Digite o nome do funcionario: ");
        String funcionario = scanner.nextLine();
        System.out.println("Funcionario '" + funcionario + "' criada com sucesso");
    }
    public void registrarEntrada() {
        String horaEntrada = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("Registro de Entrada:");
        System.out.println("Funcionário: " + funcionario);
        System.out.println("Empresa: " + empresa);
        System.out.println("Hora de Entrada: " + horaEntrada);
    }

}