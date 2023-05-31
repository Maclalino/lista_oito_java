package Tv;
import java.util.Scanner;
public class TvMain{
    public static void main(String[] args) {
        TvAtributos tvAtributos= new TvAtributos();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Você tem 50 opçoes de canais disponíveis!!! Digite o canal desejado:");
        tvAtributos.setNumeroCanal(scanner.nextInt());
        System.out.println("Digite o volume:");
        tvAtributos.setVolume(scanner.nextInt());
        int opcao=0;
        while(opcao !=4){
            System.out.println("Digite 1 caso queira aumentar o volume.");
            System.out.println("Digite 2 caso queira diminuir o volume.");
            System.out.println("Digite 3 caso queira mudar de canal.");
            System.out.println("Digite 4 caso queira sair do programa.");
            opcao= scanner.nextInt();

        switch(opcao){
            case 1: System.out.println("Informe o valor de aumento do volume:");
            tvAtributos.aumentarVolume(scanner.nextInt());
            break;
            case 2: System.out.println("Informe o valor de diminuição do volume:");
            tvAtributos.diminuirVolume(scanner.nextInt());
            break;
            case 3: System.out.println("Informe o canal:");
            tvAtributos.mudarCanal(scanner.nextInt());
            break;
            case 4: System.out.println("Desligando");
            break;
            default:
            System.out.println("Opção inválida");
        }
    }
scanner.close();
    }
}

