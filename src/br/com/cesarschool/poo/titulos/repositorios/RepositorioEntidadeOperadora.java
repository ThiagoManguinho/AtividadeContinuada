package br.com.cesarschool.poo.titulos.repositorios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.cesarschool.poo.titulos.entidades.Acao;
import br.com.cesarschool.poo.titulos.entidades.EntidadeOperadora;
import br.com.cesarschool.poo.titulos.entidades.Transacao;
import br.gov.cesarschool.poo.daogenerico.DAOSerializadorObjetos;

public class RepositorioEntidadeOperadora extends RepositorioGeral{
	
	/*
	 * Deve gravar em e ler de um arquivo texto chamado Acao.txt os dados dos objetos do tipo
	 * Acao. Seguem abaixo exemplos de linhas.
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
	
	private final DAOSerializadorObjetos<EntidadeOperadora> dao;
	
	 @Override
	 public Class<?> getClasseEntidade() {
	      return EntidadeOperadora.class;
	 }

    public RepositorioEntidadeOperadora() {
        super(EntidadeOperadora.class);
        this.dao = new DAOSerializadorObjetos<>(EntidadeOperadora.class);
    }
    
	public boolean incluir(EntidadeOperadora entidadeOp) {
        return dao.incluir(entidadeOp);
    }

    public boolean alterar(EntidadeOperadora entidadeOp) {
        return dao.alterar(entidadeOp);
    }

    public boolean excluir(long idUnico) {
        return dao.excluir(String.valueOf(idUnico));
    }

    public EntidadeOperadora buscar(long idUnico) {
        return (EntidadeOperadora) dao.buscar(String.valueOf(idUnico));
    }
		
}
