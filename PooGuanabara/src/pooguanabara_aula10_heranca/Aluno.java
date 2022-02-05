package pooguanabara_aula10_heranca;

public class Aluno extends Pessoa {

	private  int matricula;
	private String curso;
	
	//metodo
	
	public void cancelarmatricula() {
		
		System.out.println("Cancelar matrícula?");
		// this.setMatricula(false);
		
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
