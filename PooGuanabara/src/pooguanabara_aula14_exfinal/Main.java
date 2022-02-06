package pooguanabara_aula14_exfinal;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];

        v[0] = new Video("Aula 1 de Poo");
        v[1] = new Video("Aula 2 de Poo");
        v[2] = new Video("Aula 3 de Poo");

        System.out.println(v[0].toString());

        g[0] = new Gafanhoto("Pedro", "M", 20, "pedrogafa");
        g[1] = new Gafanhoto("Ana", "F", 28, "anagafa");
        System.out.println(g[1].toString());
    }
}
