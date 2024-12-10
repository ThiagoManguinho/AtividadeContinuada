package br.com.cesarschool.poo.titulos.mediators;

import br.com.cesarschool.poo.titulos.entidades.EntidadeOperadora;
import br.com.cesarschool.poo.titulos.repositorios.RepositorioEntidadeOperadora;

public class MediatorEntidadeOperadora {
	
	/*
	 * Deve ser um singleton.
	 * 
	 * Deve ter um atributo repositorioEntidadeOperadora, do tipo RepositorioEntidadeOperadora, que deve 
	 * ser inicializado na sua declara��o. Este atributo ser� usado exclusivamente
	 * pela classe, n�o tendo, portanto, m�todos set e get.
	 * 
	 * M�todos: 
	 * 
	 * pivate String validar(EntidadeOperadora): deve validar os dados do objeto recebido nos seguintes termos: 
	 * identificador: deve ser maior que zero e menor que 100000 (1)
	 * nome: deve ser preenchido, diferente de branco e de null (2). deve ter entre 5 e 60 caracteres (3).
	 * data de validade: deve ser maior do que a data atual mais 180 dias (4). 
	 * valorUnitario: deve ser maior que zero (5). 
	 * O m�todo validar deve retornar null se o objeto estiver v�lido, e uma mensagem pertinente (ver abaixo)
	 * se algum valor de atributo estiver inv�lido.
	 * 
	 * (1) - Identificador deve estar entre 100 e 1000000.
	 * (2) - Nome deve ser preenchido.
	 * (3) - Nome deve ter entre 10 e 100 caracteres.
	 *
	 * public String incluir(EntidadeOperadora entidade): deve chamar o m�todo validar. Se ele 
	 * retornar null, deve incluir entidade no reposit�rio. Retornos poss�veis:
	 * (1) null, se o retorno do validar for null e o retorno do incluir do 
	 * reposit�rio for true.
	 * (2) a mensagem retornada pelo validar, se o retorno deste for diferente
	 * de null.
	 * (3) A mensagem "Entidade j� existente", se o retorno do validar for null
	 * e o retorno do reposit�rio for false. 
	 *
	 * public String alterar(EntidadeOperadora entidade): deve chamar o m�todo validar. Se ele 
	 * retornar null, deve alterar entidade no reposit�rio. Retornos poss�veis:
	 * (1) null, se o retorno do validar for null e o retorno do alterar do 
	 * reposit�rio for true.
	 * (2) a mensagem retornada pelo validar, se o retorno deste for diferente
	 * de null.
	 * (3) A mensagem "Entidade inexistente", se o retorno do validar for null
	 * e o retorno do reposit�rio for false.
	 * 
	 * public String excluir(int identificador): deve validar o identificador. 
	 * Se este for v�lido, deve chamar o excluir do reposit�rio. Retornos poss�veis:
	 * (1) null, se o retorno do excluir do reposit�rio for true.
	 * (2) A mensagem "Entidade inexistente", se o retorno do reposit�rio for false
	 * ou se o identificador for inv�lido.
	 * 
	 * public EntidadeOperadora buscar(int identificador): deve validar o identificador.
	 * Se este for v�lido, deve chamar o buscar do reposit�rio, retornando o 
	 * que ele retornar. Se o identificador for inv�lido, retornar null. 
	 */
	
	private static MediatorEntidadeOperadora instanciaSingleton = new MediatorEntidadeOperadora();
    private RepositorioEntidadeOperadora repositorioEntidadeOperadora = new RepositorioEntidadeOperadora();
    
    private MediatorEntidadeOperadora() { 
    	
    }
    
    public static MediatorEntidadeOperadora getInstanciaSingleton() {
        return instanciaSingleton;
    }
	
	private String validar(EntidadeOperadora entidade) {
		if(entidade.getIdentificador() > 10 && entidade.getIdentificador() < 100000) {
			if(entidade.getNome() != null && entidade.getNome().length() > 0) {
				if(entidade.getNome().length() > 5 && entidade.getNome().length() < 60) {
					return null;
				}else {
					return "Nome deve ter entre 5 e 60 caracteres.";
				}
			}else {
				return "Nome deve ser preenchido.";
			}
		}else {
			return "Identificador deve estar entre 100 e 1000000.";
		}
	}
	
	public String incluir(EntidadeOperadora entidade) {
		if(validar(entidade) == null && repositorioEntidadeOperadora.incluir(entidade) == true) {
			return null;
		}else if(validar(entidade) != null) {
			return validar(entidade);
		}else {
			return "Entidade já existente";
		}
	}
	
	public String alterar(EntidadeOperadora entidade) {
		if(validar(entidade) == null && repositorioEntidadeOperadora.alterar(entidade) == true) {
			return null;
		}else if(validar(entidade) != null){
			return validar(entidade);
		}else {
			return "Entidade já existente";
		}
	}
	
	public String excluir(long identificador) {
		if(identificador > 0 && identificador < 100000) {
			if(repositorioEntidadeOperadora.excluir(identificador) == true) {
				return null;
			}else {
				return "Entidade inexistente";
			}
		}else {
			return "Entidade inexistente";
		}
	}
	
	public EntidadeOperadora buscar(long identificador) {
		if(identificador > 0 && identificador < 100000) {
			return repositorioEntidadeOperadora.buscar(identificador);
		}else {
			return null;
		}
	}
}
