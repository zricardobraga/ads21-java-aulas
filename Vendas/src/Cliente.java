public class Cliente {
	
	//O public escrito antes do class � um modificador de acesso. S�o usados (podem ser usados) para dar visibilidade ou n�o nas classes, nos atributos da classe e nos m�todos
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