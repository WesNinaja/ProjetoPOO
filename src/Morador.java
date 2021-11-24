package ProjetoPOO;

public class Morador extends Pessoa {

	// Atributos

	private int cadastro;
	

	// Construtores
	public Morador() {

	}

	public Morador(String nome, int cadastro) {
		setNome(nome);
		setCadastro(cadastro);

	}

	// M�todos

	@Override
	public void entrar() {
		if (this.cadastro == 1) {
			System.out.println("Pode entrar senhor");
		} else {
			System.out.println("N�o pode entrar");
		}

	}

	@Override
	public void status() {
		System.out.println("----------------------");
		System.out.println("� Morador");
		System.out.println("Nome: " + getNome());
		if (this.cadastro == 1)
			System.out.println("Cadastro: Sim");
		else
			System.out.println("Cadastro: N�o");

	}

	// M�TODO COLLECTION PARA INSERIR MORADORES DENTRO DA LISTA
	public void listar() {
		System.out.println("Nome: " + getNome());
		if (this.cadastro == 1)
			System.out.println("Cadastro: Sim\n");
		else
			System.out.println("Cadastro: N�o\n");

	}

	// GETTERS E SETTERS - M�TODOS CONSULTOR E MODIFICADOR

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	

}