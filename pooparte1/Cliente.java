package pooparte1;

public class Cliente {

	private String nome;
	private int idade;
	private int rg;
	private int telefone;
	private String endereco;

	public Cliente(String nome, int idade, int rg, int telefone, String endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void visualizar()  {
    	System.out.println("Nome: " + this.nome);
    	System.out.println("Idade: " + this.idade);
    	System.out.println("RG: " + this.rg);
    	System.out.println("Telefone: " + this.telefone);
    	System.out.println("Endereço: " + this.endereco);
    	System.out.println("\n****************************************");

	}

}
