package contaBanco;
import java.util.Scanner;

public class ContaTerminal {

	public static void main (String[] args) {
		
		System.out.println("Ola Mundo1");
		
		int numero;
		int agencia;
		String nomeCli;
		double saldo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------Crie sua conta------");
		System.out.println("");
		
		System.out.println("Digite o Numero da conta");
		numero = scanner.nextInt();
		System.out.println("---------------------------------");
		
		System.out.println("Digite o Numero da agencia");
		agencia = scanner.nextInt();
		System.out.println("---------------------------------");
		
		// Consome a nova linha residual
		//Sem o "scanner.nextLine" abaixo,  estava dando erro no nomeCli
		//O mesmo estava pulando linha e não permetia digitar no nome soliciado. 
		scanner.nextLine();
		
		System.out.println("Digite Seu nome Completo");
		nomeCli = scanner.nextLine();
		System.out.println("---------------------------------");
		
		
		
		System.out.println("Será necessário um valor de Deposito");
		System.out.println("Digite o Valor do Deposito");
		saldo = scanner.nextDouble();
		System.out.println("---------------------------------");
		
		
		System.out.println("Ola " + nomeCli + ", obrigado por criar"
				+ " uma conta em nosso banco" + ", Sua agência é " +"("+agencia+")"+ 
				 ", seu numero da conta é " +"("+numero+")"+ " e seu saldo é " +"(R$ "+saldo+")");
		
		
	}
	
}
