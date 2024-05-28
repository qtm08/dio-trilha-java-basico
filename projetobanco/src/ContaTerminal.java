public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner (System.in);
        
    System.out.printIn("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
    System.out.printIn("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();
        
    System.out.printIn("Por favor, digite seu nome: ");
        int nomeCliente = scanner.nextInt();
        scanner.nextLine();

    System.out.println("Por favor, digite o Saldo !");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
    }
}
