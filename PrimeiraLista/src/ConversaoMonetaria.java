import java.util.Scanner;

public class ConversaoMonetaria {
	public static void main(String[] args) {
		
		final double VALOR_DOLAR = 5.55, VALOR_EURO = 6.64, VALOR_PESO = 0.06; //final tranforma a variável em constante. tem de ser escrita em MAIÚSCULA
		double dolar, euro, peso, real;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor em Reais R$: ");
		real = entrada.nextDouble();
		
		System.out.println("Real " + real);
		
		dolar = real/VALOR_DOLAR;
		System.out.println("Dólar " + dolar);
		
		euro = real/VALOR_EURO;
		System.out.println("Euro " + euro);
		
		peso = real/VALOR_PESO;
		System.out.println("Peso " + peso);
		
		entrada.close();
	}
}
