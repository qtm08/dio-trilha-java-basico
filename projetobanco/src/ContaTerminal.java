import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ContaTerminal {

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("Por favor, digite o número da Conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Por favor, digite o número da Agência: ");
            String agencia = scanner.nextLine();
            scanner.nextLine();
            
            System.out.println("Por favor, digite seu nome: ");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor, digite o Saldo !");
            double saldo = scanner.nextDouble();
            scanner.nextLine();
            
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    .concat(agencia)
                    .concat(", conta ")
                    .concat(Integer.toString(numero))
                    .concat(" e seu saldo ")
                    .concat(Double.toString(saldo))
                    .concat(" já está disponível para saque.");
            System.out.println(mensagem);
        }
    }

}