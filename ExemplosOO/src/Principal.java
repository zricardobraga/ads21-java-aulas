public class Principal {
	
	public static void main(String[] args) {
	
		JogoEletronico jogo1 = new JogoEletronico();
		jogo1.setTitulo("Final Fantasy");
		jogo1.setEstudio("Square Enix");
		jogo1.setGenero("J-RPG");
		jogo1.setPlataforma("PS4");
		jogo1.setPreco(100.00);
		
		JogoEletronico jogo2 = new JogoEletronico();
		jogo2.setTitulo("God of War");
		jogo2.setEstudio("Santa Monica");
		jogo2.setGenero("A��o");
		jogo2.setPlataforma("PS4");
		jogo2.setPreco(200.00);
				
//		System.out.println(jogo1.equals(jogo2));
//		System.out.println();
		System.out.println(jogo1.toString());
		System.out.println();
		System.out.println(jogo2.toString());
		
	}

}
