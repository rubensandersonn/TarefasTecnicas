/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe concreta CirculoColorido que é um circulo mas colorido.
 */

public class CirculoColorido extends Circulo implements FiguraColorida{

    private String cor = "BRANCO";
    public CirculoColorido(){
        super();
    }
    public CirculoColorido(double dx, double dy){
        super(dx,dy);
    }
    public CirculoColorido(double dx, double dy, double raio){
        super(dx,dy,raio);
    }
    public CirculoColorido(double dx, double dy, double raio, String cor){
        super(dx,dy,raio);
        this.cor = cor;
    }

    @Override
    public void desenhar(){
        desenharColorido();
    }
    
    // implementando...
    public void desenharColorido(){
        super.desenhar();
        System.out.println("\tCor: " + cor);        
    }
}