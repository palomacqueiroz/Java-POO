package pooguanabara_aula14_exfinal;

public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade;
    protected float experiencia;

    
    //Construtor.
    public Pessoa(String nome, String sexo, int idade) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setExperiencia(0);
    }

    //método.
    public void ganharExperiencia(){

    }

    //Getters and Setters.
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa [experiencia=" + experiencia 
        + ", idade=" + idade + ", nome=" + nome 
        + ", sexo=" + sexo + "]";
    }

    
    
}
