package ProjetoPOO;

public class Funcionario extends Pessoa {
	// Atributos

	private int cargo;
	private double salario;
	private int cracha;

	// CONSTRUCTORS

	Funcionario() {

	}

	Funcionario(int cargo) {
		setCargo(cargo);
	}

	Funcionario(String nome, int cracha) {
		setNome(nome);
		setCracha(cracha);
	}

	// M�TODOS
	public void entrar() {
		if (this.cracha == 1) {
			System.out.println("Pode entrar. Bom Trabalho!");
		} else {
			System.out.println("Voc� n�o est� autorizado para entrar! Voc� precisa do cracha");
		}
	}

	public void Cargo() {
		// 1-Porteiro
		// 2-Seguran�a
		// 3-Manuten��o

		if (this.cargo == 1) {
			this.salario = 1300.00;
			System.out.println("Cargo: Porteiro \nSal�rio: " + this.salario);
		} else if (this.cargo == 2) {
			this.salario = 1600.00;
			System.out.println("Cargo: Seguran�a \nSal�rio: " + this.salario);
		} else if (this.cargo == 3) {
			this.salario = 1800.00;
			System.out.println("Cargo: Manuten��o \nSal�rio: " + this.salario);
		} else
			System.out.println("Cargo Inv�lido!Sem sal�rio");

	}

	public void status() {
		System.out.println("----------------------");
		System.out.println("� Funcion�rio");
		System.out.println("Nome: " + getNome());
		if (this.cracha == 1)
			System.out.println("Crach�: Sim");
		else
			System.out.println("Crach�: N�o");

	}

	// M�TODO PARA INSERIR FUNCION�RIOS DENTRO DA LISTA
	public void listar() {
		System.out.println("Nome: " + getNome());
		if (this.cracha == 1)
			System.out.println("Crach�: Sim\n");
		else
			System.out.println("Crach�: N�o\n");

	}

	// GETTERS E SETTERS - M�TODOS CONSULTOR E MODIFICADOR

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setCracha(int cracha) {
		this.cracha = cracha;
	}

	public int getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}

	public int getCracha() {
		return cracha;
	}
}