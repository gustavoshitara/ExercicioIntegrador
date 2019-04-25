package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    List<Livro> lista = new ArrayList<>();
    private int x = 0,estoque;

    public void cadastrar(Livro novoLivro){
        lista.add(novoLivro);
    }

    public void consultar(int novoCodigo){
        for(Livro livro:lista){
            if(livro.getCodigo() == novoCodigo ){
                System.out.println("Código: " + livro.getCodigo());
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano de Lançamento: " + livro.getAno());
                System.out.println("Código ISBN: " + livro.getCodigoISBN());
                System.out.println("Quantidade em Estoque: " + livro.getQtde());
                System.out.println("Valor: " + livro.getPreco());

                x = 1;
            }
        }

        if(x == 0){
            System.out.println("Livro não encontrado");
        }
    }

    public void venda(int novoCodigo){

        for(Livro livro:lista) {
            if (livro.getCodigo() == novoCodigo) {
                if (livro.getQtde() > 0) {
                    estoque = livro.getQtde() - 1;
                    livro.setQtde(estoque);
                }else{
                    System.out.println("Estoque esgotado");
                }
            }
        }
    }
}
