package pooguanabara_aula12_polimorfismo;

public class Peixe extends Animal{
    protected String corEscama;

    //Metodo.
    public void soltaBolha(){

    }

    //Sobrescrever.
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Não emite som");
    }

    // Getters and Setters.
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
