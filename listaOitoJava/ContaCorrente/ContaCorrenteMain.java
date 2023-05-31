package ContaCorrente;

public class ContaCorrenteMain {
    public static void main(String[] args) {
        ContaCorrenteAtributos contaCorrenteAtributos= new ContaCorrenteAtributos(989, "Ana");
        System.out.println("O seu nome é: "+ contaCorrenteAtributos.getNome()+"\nO numero da sua conta é: "+ contaCorrenteAtributos.getNumeroConta()+"\nO seu saldo é: "+ contaCorrenteAtributos.getSaldo());
        
        contaCorrenteAtributos.alterarNome("Vic");
        contaCorrenteAtributos.depositar(200);
        contaCorrenteAtributos.sacar(50);
        System.out.println("_____________________________________________________________");
        System.out.println("O seu novo nome é: "+ contaCorrenteAtributos.getNome()+ "\nO numero da sua conta é: "+ contaCorrenteAtributos.getNumeroConta()+"\nO seu Saldo atualizado é: "+ contaCorrenteAtributos.getSaldo());
    }
}
