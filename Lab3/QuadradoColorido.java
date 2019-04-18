/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe concreta QuadradoColorido que é um quadrado mas colorido.
 */

public class QuadradoColorido extends Quadrado implements FiguraColorida{

    private String cor = "BRANCO";
    public QuadradoColorido(){
        super();
    }
    public QuadradoColorido(double dx, double dy){
        super(dx,dy);
    }
    public QuadradoColorido(double dx, double dy, double side){
        super(dx,dy,side);
    }
    public QuadradoColorido(double dx, double dy, double side, String cor){
        super(dx,dy,side);
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