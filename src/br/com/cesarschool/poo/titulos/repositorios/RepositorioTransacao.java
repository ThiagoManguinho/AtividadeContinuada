package br.com.cesarschool.poo.titulos.repositorios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.cesarschool.poo.titulos.entidades.Acao;
import br.com.cesarschool.poo.titulos.entidades.EntidadeOperadora;
import br.com.cesarschool.poo.titulos.entidades.TituloDivida;
import br.com.cesarschool.poo.titulos.entidades.Transacao;
import br.gov.cesarschool.poo.daogenerico.DAOSerializadorObjetos;
import br.gov.cesarschool.poo.daogenerico.Entidade;


public class RepositorioTransacao extends RepositorioGeral{
	
	/*
	 * Deve gravar em e ler de um arquivo texto chamado Transacao.txt os dados dos objetos do tipo
	 * Transacao. Seguem abaixo exemplos de linhas 
	 * De entidadeCredito: identificador, nome, autorizadoAcao, saldoAcao, saldoTituloDivida.
	 * De entidadeDebito: identificador, nome, autorizadoAcao, saldoAcao, saldoTituloDivida.
	 * De acao: identificador, nome, dataValidade, valorUnitario OU null
	 * De tituloDivida: identificador, nome, dataValidade, taxaJuros OU null. 
	 * valorOperacao, dataHoraOperacao
	 * 
	 *   002192;BCB;true;0.00;1890220034.0;001112;BOFA;true;12900000210.00;3564234127.0;1;PETROBRAS;2024-12-12;30.33;null;100000.0;2024-01-01 12:22:21 
	 *   002192;BCB;false;0.00;1890220034.0;001112;BOFA;true;12900000210.00;3564234127.0;null;3;FRANCA;2027-11-11;2.5;100000.0;2024-01-01 12:22:21
	 *
	 * A inclus�o deve adicionar uma nova linha ao arquivo. 
	 * 
	 * A busca deve retornar um array de transa��es cuja entidadeCredito tenha identificador igual ao
	 * recebido como par�metro.  
	 */
	
	private final DAOSerializadorObjetos<Transacao> dao;

    public RepositorioTransacao() {
    	super(Transacao.class);
        this.dao = new DAOSerializadorObjetos<>(Transacao.class);
    }

    @Override
    public Class<?> getClasseEntidade() {
        return Transacao.class;
    }

    public void incluir(Transacao transacao) {
        boolean sucesso = dao.incluir(transacao);
        if (sucesso) {
            System.out.println("Transação incluída com sucesso!");
        } else {
            System.out.println("Erro: já existe uma transação com o mesmo identificador.");
        }
    }

    public Transacao buscarPorId(String idUnico) {
        return (Transacao) dao.buscar(idUnico);
    }

    public Transacao[] buscarTodos() {
        return Arrays.stream(dao.buscarTodos())
                .toArray(Transacao[]::new);
    }

    public Transacao[] buscarPorEntidadeCredora(long identificadorEntidadeCredito) {
		List<Transacao> resultado = new ArrayList<>();
		for (Transacao transacao : buscarTodos()) {
			if (transacao.getEntidadeCredito() != null
					&& transacao.getEntidadeCredito().getIdentificador() == identificadorEntidadeCredito) {
				resultado.add(transacao);
			}
		}
		return resultado.toArray(new Transacao[0]);
	}


    public Transacao[] buscarPorEntidadeDevedora(long identificadorEntidadeDebito) {
		List<Transacao> resultado = new ArrayList<>();
		for (Transacao transacao : buscarTodos()) {
			if (transacao.getEntidadeDebito() != null
					&& transacao.getEntidadeDebito().getIdentificador() == identificadorEntidadeDebito) {
				resultado.add(transacao);
			}
		}
		return resultado.toArray(new Transacao[0]);
	}
	
}
