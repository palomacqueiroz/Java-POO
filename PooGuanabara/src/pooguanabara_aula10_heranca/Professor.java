package pooguanabara_aula10_heranca;

public class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	
	//metodo
	
	public void receberAumento(float aumento) {
		this.setSalario(aumento);
	}
	
	// G e S
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

}
