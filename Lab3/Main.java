/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe principal. Ela testa todo mundo.
 */

class Main{
    public static void main(String arg[]){
        Quadrado q = new Quadrado(10, 8.5, 3);
        QuadradoColorido qc = new QuadradoColorido(1, 3.5, 5);

        Circulo c = new Circulo(10, 8.5, 3);
        CirculoColorido cc = new CirculoColorido(1, 3.5, 5, "AZUL");

        q.desenhar();
        qc.desenhar();

        q.mover(1.2, 1.5);

        q.desenhar();
        qc.desenhar();

        c.desenhar();
        cc.desenhar();

        c.mover(100.2, 1.5);

        c.desenhar();
        cc.desenhar();
    }
}