package pooguanabara_aula11_heranca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitante v1 = new Visitante ();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		Tecnico t1 = new Tecnico();
		v1.setNome("João");
		v1.setIdade(25);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		a1.setNome("Maria");
		a1.setMatricula(202020);
		a1.setIdade(20);
		a1.setSexo("F");
		a1.setCurso("Biologia");
		a1.pagarMensalidade();
		
		b1.setNome("Paloma");
		b1.setSexo("F");
		b1.setMatricula(1111);
		b1.setBolsa(12.5f);
		b1.pagarMensalidade();
		
		t1.setNome("Jonas");
		t1.setIdade(35);
		t1.setSexo("M");
		t1.setMatricula(2222);
		t1.setRegistroProfissional("sim");
		System.out.println(t1.toString());
		

	}

}
