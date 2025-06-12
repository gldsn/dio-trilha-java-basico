import java.math.BigDecimal;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela classe scanner os valores digitados no terminal
        //Exibir a mensagem conta criada


       int numero;
       String agencia;
       String nomeCliente;
       BigDecimal saldo;
    


       
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Gledson Bank!");
        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        saldo = scanner.nextBigDecimal();

        System.out.println("Conta criada com sucesso! Seja Bem-vindo(a) " + nomeCliente + "!");
        System.out.println("Detalhes da conta:");
        System.out.println("Número da conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo: R$ " + saldo);

       
        scanner.close();






    }
}
