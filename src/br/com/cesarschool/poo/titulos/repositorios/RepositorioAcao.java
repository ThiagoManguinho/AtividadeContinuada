package br.com.cesarschool.poo.titulos.repositorios;

import br.com.cesarschool.poo.titulos.entidades.Acao;
import br.com.cesarschool.poo.titulos.entidades.Transacao;
import br.gov.cesarschool.poo.daogenerico.DAOSerializadorObjetos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class RepositorioAcao extends RepositorioGeral{
	
	/*
	 * Deve gravar em e ler de um arquivo texto chamado Acao.txt os dados dos objetos do tipo
	 * Acao. Seguem abaixo exemplos de linhas (identificador, nome, dataValidade, valorUnitario)
	 * 
	    1;PETROBRAS;2024-12-12;30.33
	    2;BANCO DO BRASIL;2026-01-01;21.21
	    3;CORREIOS;2027-11-11;6.12
	 * 
	 * A inclus�o deve adicionar uma nova linha ao arquivo. N�o � permitido incluir 
	 * identificador repetido. Neste caso, o m�todo deve retornar false. Inclus�o com 
	 * sucesso, retorno true.
	 * 
	 * A altera��o deve substituir a linha atual por uma nova linha. A linha deve ser 
	 * localizada por identificador que, quando n�o encontrado, enseja retorno false. 
	 * Altera��o com sucesso, retorno true.  
	 *   
	 * A exclus�o deve apagar a linha atual do arquivo. A linha deve ser 
	 * localizada por identificador que, quando n�o encontrado, enseja retorno false. 
	 * Exclus�o com sucesso, retorno true.
	 * 
	 * A busca deve localizar uma linha por identificador, materializar e retornar um 
	 * objeto. Caso o identificador n�o seja encontrado no arquivo, retornar null.   
	 */
	
	private DAOSerializadorObjetos<Acao> dao;
	
	public RepositorioAcao() {
		super(Acao.class);
        this.dao = new DAOSerializadorObjetos<>(Acao.class);
    }
	
	public  Class<?> getClasseEntidade(){
		return Acao.class;
	}
	
	public boolean incluir(Acao acao) {
        return dao.incluir(acao);
    }

    public boolean alterar(Acao acao) {
        return dao.alterar(acao);
    }

    public boolean excluir(int idUnico) {
        return dao.excluir(String.valueOf(idUnico));
    }

    public Acao buscar(int idUnico) {
        return (Acao) dao.buscar(String.valueOf(idUnico));
    }

}
