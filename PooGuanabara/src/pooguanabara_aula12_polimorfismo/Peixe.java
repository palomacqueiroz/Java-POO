package pooguanabara_aula12_polimorfismo;

public class Peixe extends Animal{
    private String corEscama;

    
    //Sobrescrever.
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Substâncias");
    }
    @Override
    public void emitirSom(){
        System.out.println("Não emite som");
    }

    //Metodo.
    public void soltaBolha(){
        System.out.println("Soltando Bolha");
    }

    // Getters and Setters.
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
