package Quadrado;

public class QuadradoMain {
    public static void main(String[] args) {
        QuadradoAtributos quadradoAtributos= new QuadradoAtributos(10);
        System.out.println("Lado do quadrado é:"+ quadradoAtributos.retornarLado());
        quadradoAtributos.mudarLado(6);
        System.out.println("Novo valor do lado:"+ quadradoAtributos.retornarLado());
        System.out.println("Área do quadrado é"+ quadradoAtributos.calcularArea());
    }
}
