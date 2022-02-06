package pooguanabara_aula12_polimorfismo;

public abstract class Animal {
	
	protected float peso;
	protected int idade;
	protected int membros;

	//Métodos

	public abstract void locomover();

	public abstract void alimentar();

	public abstract void emitirSom();


	// G e Setters
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}	

}
