package pooguanabara_aula14_exfinal;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de Poo");
        v[1] = new Video("Aula 2 de Poo");
        v[2] = new Video("Aula 3 de Poo");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Pedro", "M", 20, "pedrogafa");
        g[1] = new Gafanhoto("Ana", "F", 28, "anagafa");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[2]);
        //vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0],v[1]);
        //vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());

        vis[2] = new Visualizacao(g[1],v[2]);
        //vis[2].avaliar(8);
        System.out.println(vis[0].toString());

        /* System.out.println("Videos: \n======================");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\n Gafanhotos: ======================");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
}
