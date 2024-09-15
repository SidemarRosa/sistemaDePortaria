public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    public void criarEmpresa(){
        System.out.println("Digite o nome da empresa");
        String nome = scanner.nextLine();
        System.out.println("Digite o cnpj da empresa");
        String cnpj = scanner.nextLine();
        System.out.println("Digite o ramo da empresa");
        String ramo = scanner.nextLine();
        System.out.println("Empresa criada com sucesso!");
        String empresas[] = nome+cnpj+ramo;
    }
}
