import java.util.Scanner; //importa??o da biblioteca para fazer a leitura do teclado 

public class AreaRetangulo {
	public static void main(String[] args) {
			
		double h, b, calc;

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a altura do ret?ngulo [cm]: ");
		h = entrada.nextDouble();
		
		System.out.print("Informe a largura do ret?ngulo [cm]: ");
		b = entrada.nextDouble();
			
		calc = h*b;
		
		if (calc >= 100) {
			double conversao = calc/100;
			System.out.println("A ?rea do ret?ngulo ?: " + conversao + " m2");
			
		} else {
			System.out.print("A ?rea do ret?ngulo ?: " + calc + " cm");
		}
		
		entrada.close(); //fecha o scanner
	}	
}
