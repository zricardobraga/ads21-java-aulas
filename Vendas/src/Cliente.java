public class Cliente {
	
	//O public escrito antes do class é um modificador de acesso. São usados (podem ser usados) para dar visibilidade ou não nas classes, nos atributos da classe e nos métodos
	private String nome;
	private String cpf;

		
	//Getters and Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
}