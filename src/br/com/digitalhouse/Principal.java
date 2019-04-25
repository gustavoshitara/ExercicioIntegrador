package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro(1,"Java","Gustavo",2018,12345,2,10);
        Sistema sistema = new Sistema();

        sistema.cadastrar(livro1);

        sistema.consultar(1);

        sistema.venda(1);
        sistema.venda(1);
        sistema.venda(1);
    }
}
