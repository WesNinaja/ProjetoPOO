package ProjetoPOO;

public abstract class Pessoa {
	
	//ATRIBUTO
	private String nome;

	
	//MÉTODOS (POLIMORFISMO)
	public abstract void entrar();

	public abstract void status();
	
	//ENCAPSULAMENTO (GET E SET)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}