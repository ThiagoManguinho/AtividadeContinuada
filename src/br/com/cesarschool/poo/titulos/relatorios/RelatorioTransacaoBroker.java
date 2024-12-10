package br.com.cesarschool.poo.titulos.relatorios;

import java.util.Arrays;

import br.com.cesarschool.poo.titulos.entidades.Transacao;
import br.com.cesarschool.poo.titulos.repositorios.RepositorioTransacao;
import br.com.cesarschool.poo.titulos.utils.ComparadorTransacaoPorNomeCredora;
import br.com.cesarschool.poo.titulos.utils.Ordenador;

public class RelatorioTransacaoBroker {
	
	private RepositorioTransacao repositorioTransacao;
	
	public RelatorioTransacaoBroker() {
        this.repositorioTransacao = new RepositorioTransacao();
    }
	
	public Transacao[] relatorioTransacaoPorNomeEntidadeCredora() {
        Transacao[] transacoes = repositorioTransacao.buscarTodos(); 
        Ordenador.ordenar(transacoes, new ComparadorTransacaoPorNomeCredora());
        return transacoes;
    }
	
	public Transacao[] relatorioTransacaoPorDataHora() {
        Transacao[] transacoes = repositorioTransacao.buscarTodos();
        Arrays.sort(transacoes, (t1, t2) -> t2.getDataHoraOperacao().compareTo(t1.getDataHoraOperacao()));
        return transacoes;
    }
}
