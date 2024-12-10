package br.com.cesarschool.poo.titulos.utils;

import br.com.cesarschool.poo.titulos.entidades.Transacao;

public class ComparadorTransacaoPorNomeCredora extends ComparadorPadrao implements Comparador{
	
	public int comparar(Comparavel c1, Comparavel c2) {
        try {
        	
            if (c1 instanceof Transacao && c2 instanceof Transacao) {
                Transacao t1 = (Transacao) c1;
                Transacao t2 = (Transacao) c2;

                return t1.getEntidadeCredito().getNome().compareToIgnoreCase(t2.getEntidadeCredito().getNome());
            } else {
                throw new IllegalArgumentException("Os objetos comparados devem ser do tipo Transacao.");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao comparar as transações: " + e.getMessage(), e);
        }
    }
	
}
