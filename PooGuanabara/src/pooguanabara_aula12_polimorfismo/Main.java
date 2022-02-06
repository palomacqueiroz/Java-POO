package pooguanabara_aula12_polimorfismo;

public class Main {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		m.setPeso(85.3f);
		m.setIdade(2);
		m.setMembros(4);
		m.locomover();
		m.alimentar();
		m.emitirSom();

		r.setPeso(2.59f);
		r.setIdade(6);
		r.setMembros(4);
		r.locomover();
		r.alimentar();
		r.emitirSom();

		p.setPeso(0.35f);
		p.setIdade(1);
		p.setMembros(0);
		p.soltaBolha();
		p.locomover();
		p.alimentar();
		p.emitirSom();

		a.setPeso(0.89f);
		a.setIdade(2);
		a.setMembros(2);
		a.fazerNinho();
		a.locomover();
		a.alimentar();
		a.emitirSom();

	}

}
