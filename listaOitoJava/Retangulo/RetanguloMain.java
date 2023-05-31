package Retangulo;
import java.util.Scanner;
public class RetanguloMain {
    public static void main(String[] args) {
        RetanguloMetodos retanguloMetodos= new RetanguloMetodos();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Informe um Lado do local:");
        retanguloMetodos.setLadoA(scanner.nextDouble());
        System.out.println("Informe o outro Lado do local:");
        retanguloMetodos.setLadoB(scanner.nextDouble());

        retanguloMetodos.calcularArea();
        retanguloMetodos.calcularPerimetro();
        
        System.out.println("A quantidade de pisos é:"+ retanguloMetodos.calcularArea());
        System.out.println("A quantidade de rodapés é:"+ retanguloMetodos.calcularPerimetro());
        
        scanner.close();
    }
}
