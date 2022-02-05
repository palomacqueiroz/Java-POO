package pooguanabara_aula09_desafio;

public class Livro implements Publicacao {
	
	private String livro;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	public String detalhes() {
		return "Livro [livro=" + livro + ", autor=" + autor 
				+ " \n , totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
				+ " \n , aberto=" + aberto + ", leitor=" + leitor.getNome() + "]";
	}
	
	// Método Construtor
	
	public Livro(String livro, String autor, int totPaginas, Pessoa leitor) {
		this.livro = livro;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	//

	
	// G & S
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	//

	@Override
	public void abrir() {
		this.setAberto(true);
		
	}

	@Override
	public void fechar() {
		this.setAberto(false);
		
	}

	@Override
	public void folhear(int pagina) {
		if(pagina > this.totPaginas) {
			this.pagAtual = 0;
		} else {
			this.setPagAtual(pagina);
		}
		
		
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
		
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
		
	}
	
	

	

}
