package pooguanabara_aula09_desafio;

public class Main {

	public static void main(String[] args) {
		Pessoa [] p = new Pessoa[2];
		Livro [] l = new Livro [3];
		
		p[0] = new Pessoa("Ana", 48 ,"F" );
		p[1] = new Pessoa("Diego", 34 ,"M" );
		
		l[0] = new Livro("Hoje", "Jose da Silva", 300, p[0]);
		l[1] = new Livro("Amanhã", "Jose da Santos", 100, p[1]);
		l[2] = new Livro("Acabou", "Francisco da Silva", 150, p[0]);
		
		
		l[0].abrir();
		l[0].folhear(299);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		

	}

}
