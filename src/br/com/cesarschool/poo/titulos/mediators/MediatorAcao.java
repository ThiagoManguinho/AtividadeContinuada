package br.com.cesarschool.poo.titulos.mediators;

import java.time.LocalDate;

import br.com.cesarschool.poo.titulos.entidades.Acao;
import br.com.cesarschool.poo.titulos.repositorios.RepositorioAcao;

public class MediatorAcao {
	
	/*
	 * Deve ser um singleton.
	 * 
	 * Deve ter um atributo repositorioAcao, do tipo RepositorioAcao, que deve 
	 * ser inicializado na sua declara��o. Este atributo ser� usado exclusivamente
	 * pela classe, n�o tendo, portanto, m�todos set e get.
	 * 
	 * M�todos: 
	 * 
	 * pivate String validar(Acao acao): deve validar os dados do objeto recebido nos seguintes termos: 
	 * identificador: deve ser maior que zero e menor que 100000 (1)
	 * nome: deve ser preenchido, diferente de branco e de null (2). deve ter entre 10 e 100 caracteres (3).
	 * data de validade: deve ser maior do que a data atual mais 30 dias (4). 
	 * valorUnitario: deve ser maior que zero (5). 
	 * O m�todo validar deve retornar null se o objeto estiver v�lido, e uma mensagem pertinente (ver abaixo)
	 * se algum valor de atributo estiver inv�lido.
	 * 
	 * (1) - Identificador deve estar entre 1 e 99999.
	 * (2) - Nome deve ser preenchido.
	 * (3) - Nome deve ter entre 10 e 100 caracteres.
	 * (4) - Data de validade deve ter pelo menos 30 dias na frente da data atual.
	 * (5) - Valor unit�rio deve ser maior que zero.
	 *
	 * public String incluir(Acao acao): deve chamar o m�todo validar. Se ele 
	 * retornar null, deve incluir acao no reposit�rio. Retornos poss�veis:
	 * (1) null, se o retorno do validar for null e o retorno do incluir do 
	 * reposit�rio for true.
	 * (2) a mensagem retornada pelo validar, se o retorno deste for diferente
	 * de null.
	 * (3) A mensagem "A��o j� existente", se o retorno do validar for null
	 * e o retorno do reposit�rio for false.
	 *
	 * public String alterar(Acao acao): deve chamar o m�todo validar. Se ele 
	 * retornar null, deve alterar acao no reposit�rio. Retornos poss�veis:
	 * (1) null, se o retorno do validar for null e o retorno do alterar do 
	 * reposit�rio for true.
	 * (2) a mensagem retornada pelo validar, se o retorno deste for diferente
	 * de null.
	 * (3) A mensagem "A��o inexistente", se o retorno do validar for null
	 * e o retorno do reposit�rio for false.
	 * 
	 * public String excluir(int identificador): deve validar o identificador. 
	 * Se este for v�lido, deve chamar o excluir do reposit�rio. Retornos poss�veis:
	 * (1) null, se o retorno do excluir do reposit�rio for true.
	 * (2) A mensagem "A��o inexistente", se o retorno do reposit�rio for false
	 * ou se o identificador for inv�lido.
	 * 
	 * public Acao buscar(int identificador): deve validar o identificador.
	 * Se este for v�lido, deve chamar o buscar do reposit�rio, retornando o 
	 * que ele retornar. Se o identificador for inv�lido, retornar null. 
	 */
	
	private static MediatorAcao instanciaSingleton = new MediatorAcao();
    private RepositorioAcao repositorioAcao = new RepositorioAcao();

    private MediatorAcao() { 
    	
    }
    
    public static MediatorAcao getInstanciaSingleton() {
        return instanciaSingleton;
    }
	
	private String validar(Acao acao) {
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataValidadePlus = dataAtual.plusDays(30);
		
		if(acao.getIdentificador() > 0 && acao.getIdentificador() < 100000) {
			if(acao.getNome() != null && acao.getNome().length() > 0){
				if(acao.getNome().length() > 10 && acao.getNome().length() < 100) {
					if(acao.getDataValidade().isAfter(dataValidadePlus)) {
						if(acao.getValorUnitario() > 0) {
							return null;
						}
						else {
							return "Valor unitário deve ser maior que zero.";
						}
					}
					else {
						return "Data de validade deve ter pelo menos 30 dias na frente da data atual.";
					}
				}
				else {
					return "Nome deve ter entre 10 e 100 caracteres.";
				}
			}
			else {
				return "Nome deve ser preenchido.";
			}
		}else {
			return "Identificador deve estar entre 1 e 99999.";
		}
		
	}
	
	public String incluir(Acao acao) {
		if(validar(acao) == null) {
			if(repositorioAcao.incluir(acao) == true) {
				return null;
			}
		}
		if(validar(acao) != null){
			return validar(acao);
		}else {
			return "Ação inexistente";
		}
	}
	
	public String alterar(Acao acao) {
		if(validar(acao) == null) {
			if(repositorioAcao.alterar(acao) == true) {
				return null;
			}
		}if(validar(acao) != null) {
			return validar(acao);
		}else {
			return "Ação inexistente";
		}
	}
	
	public String excluir(int identificador) {
		if(identificador > 0 && identificador < 100000) {
			if(repositorioAcao.excluir(identificador) == true) {
				return null;
			}
			else {
				return "Ação inexistente";
			} 
		}else {
			return "Ação inexistente";
		}	
	}
	
	public Acao buscar(int identificador) {
		if(identificador > 0 && identificador < 100000) {
			return repositorioAcao.buscar(identificador);
		}else {
			return null;
		}
	}
}
