
public class JogoEletronico {
	private String titulo;
	private String genero;
	private String plataforma;
	private String dataLancamento;
	private String estudio;
	private double preco;
	
	
	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public String getEstudio() {
		return estudio;
	}
	
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//M?todo para comparar se os objetos s?o iguais
	@Override
	public boolean equals(Object obj) {
		
		JogoEletronico outroObjeto = (JogoEletronico) obj;
		return outroObjeto.getTitulo() == getTitulo() && outroObjeto.getPreco() == getPreco();
	}
	
	//M?todo para mostrar todas os atributos armazenados no objeto
	@Override
	public String toString() {
		return "Titulo: " + getTitulo() + "\nGenero: " + getGenero() + "\nPlataforma " + getPlataforma() + "\nEstudio: " + getEstudio() + "\nPre?o: " + getPreco();
	}
}




