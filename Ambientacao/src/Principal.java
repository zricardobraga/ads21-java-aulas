import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int soma;
				
		System.out.print("Informe o primeiro número? ");
		num1 = input.nextInt();
		
		System.out.print("Informe o primeiro número? ");
		num2 = input.nextInt();
		
		soma = num1+num2;
		
		System.out.println();
		System.out.println("A soma do primeiro e do segundo número é: " + soma);
	}
}
