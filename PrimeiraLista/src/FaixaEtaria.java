import java.util.Scanner;

public class FaixaEtaria {
	public static void main(String[] args) {
	
		int idade;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a idade: ");
		idade = entrada.nextInt();
		
		System.out.println("Idade: " + idade);
		if (idade <= 13) {
			System.out.println("Crian�a");			
		} 
		
		else if (idade <= 18) {
			System.out.println("Adolescente");
		}
		
		else if (idade <= 60) {
			System.out.println("Adulto");
			
		} 
		
		else {
			System.out.println("Idoso");
		}
		
		entrada.close();
	}

}
