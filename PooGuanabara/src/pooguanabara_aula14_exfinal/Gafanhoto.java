package pooguanabara_aula14_exfinal;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssitido;

    //Construtor.
    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.setLogin(login);
        this.setTotAssitido(0);
    }

    //método.
    public void viuMaisUm(){
        this.setTotAssitido(this.getTotAssitido() + 1);
    }

    //Getters and Setters.
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssitido() {
        return totAssitido;
    }
    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }

    @Override
    public String toString() {
        return "Gafanhoto [login=" + login 
        + ", totAssitido= " + totAssitido + super.toString() +"]";
    }

    
    
}
