package pooguanabara_aula12_polimorfismo;

public class Ave extends Animal{
    private String corPena;

    //Sobrescrever.
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Frutas");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Ave");
    }

    //Metodo.
    public void fazerNinho(){
        System.out.println("Faz ninho.");
    }

    // Getters and Setters.
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
