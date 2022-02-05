package pooguanabara_aula11_heranca;

public class Aluno extends Pessoa{
	
	private  int matricula;
	private String curso;
	
	//metodo
	
	public void pagarMensalidade() {		
		System.out.println("Pagando mensalidade do(a) aluno." + this.getNome());
	}
	
	// G e S
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	
	

}
