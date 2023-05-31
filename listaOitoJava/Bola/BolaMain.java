package Bola;

public class BolaMain {
    public static void main(String[] args) {
        BolaAtributos bolaAtributos= new BolaAtributos("Verde","borracha",10.0);
   
   bolaAtributos.mostraCor();
   bolaAtributos.trocaCor("Azul");
   bolaAtributos.mostraCor();
    }
}
