import java.util.Scanner;

public class MenuPrincipal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		int menu;
		
		do {
			
			System.out.println("MENU");
			System.out.println();
			
			System.out.println("1 ? Cadastrar de Cliente");
			System.out.println("2 ? Listar de Clientes");
			System.out.println("0 - Sair");
			
			System.out.println();
			System.out.println("Informe a op??o do MENU desejada: ");
			menu = sc.nextInt();
			
			switch (menu) {
			
			case 1:
				System.out.println("Op??o 1 - CADASTRAR CLIENTES");
				System.out.println();
				
				System.out.println("\nInforme o nome do cliente: ");
				cliente.setNome(sc.next());
				System.out.println("\nInforme o n?mero do CPF do cliente: ");
				cliente.setCpf(sc.next());
				System.out.println("Nome: " + cliente.getNome());
				System.out.println("CPF do cliente: " + cliente.getCpf());
				System.out.println();
				break;
				
			case 2:
				System.out.println("Op??o 2 - LISTAR CLIENTES");
				System.out.println("1 - " + cliente.getNome() + " - CPF: " + cliente.getCpf() + "\n");
				break;
				
			case 0: 
				System.out.println("Op??o 0 - VOC? SAIU DO PROGRAMA!");
				System.out.println();
				break;
	
			default:
				System.out.println("Op??o inv?lida");
				System.out.println();
				break;
			}
			
		} while (menu != 0);
		
		sc.close();
	}
}
