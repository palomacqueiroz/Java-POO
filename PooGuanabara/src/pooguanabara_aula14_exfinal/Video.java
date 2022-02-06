package pooguanabara_aula14_exfinal;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //Construtor.
    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(0);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    //Getters and Setters.
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        /* int nova;
        nova = (int) (((this.avaliacao + avaliacao)/(this.views)));
        this.avaliacao = nova; */
        this.avaliacao = avaliacao;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //métodos abstratos
    @Override
    public void play() {
       this.reproduzindo = true;         
    }
    @Override
    public void pause() {
       this.reproduzindo = false;         
    }
    @Override
    public void like() {
        this.curtidas ++;        
    }
    @Override
    public String toString() {
        return "Video [avaliacao=" + avaliacao + ", curtidas=" + curtidas 
        + ", reproduzindo=" + reproduzindo
        + ", titulo=" + titulo + ", views=" + views + "]";
    }



}
