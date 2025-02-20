//importa o Scanner para permissão de leitura do terminal;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        double saldo = 0.0;
            
           
                System.out.println("Digite seu Nome: ");
                //Define que a variável de valor String consiga a ler a entrada de dados do usuário no terminal.
                String NomeCliente = in.next();
           
                System.out.println("Digite sua Agência: ");
                //Define que a variável de valor String consiga a ler a entrada de dados do usuário no terminal.
                String Agencia = in.next();

                System.out.println("Digite o número da sua Conta: ");
                //Define que a variável de valor int consiga a ler a entrada de dados do usuário no terminal.
                int numeroConta = in.nextInt();

                System.out.println("Olá Sr(a). " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua Conta é " + numeroConta +  ", Agência " + Agencia + " seu Saldo é de R$ " + saldo + " e já está disponível para saque.");

                in.close();
            }
    }


