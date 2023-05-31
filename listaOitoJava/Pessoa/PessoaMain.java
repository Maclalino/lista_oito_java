package Pessoa;

public class PessoaMain {
    public static void main(String[] args) {
        PessoaAtributos pessoa= new PessoaAtributos("Cleide", 19, 60, 1.80);
        pessoa.exibirDados();
        pessoa.envelhecer();
        pessoa.emagrecer(4);
        pessoa.engordar(2);
        pessoa.crescer(0.03);

        pessoa.exibirDados();
    }
}
