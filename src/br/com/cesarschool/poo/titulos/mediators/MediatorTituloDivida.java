package br.com.cesarschool.poo.titulos.mediators;

import java.time.LocalDate;

import br.com.cesarschool.poo.titulos.entidades.TituloDivida;
import br.com.cesarschool.poo.titulos.repositorios.RepositorioTituloDivida;

public class MediatorTituloDivida {
	
	/*
	 * Deve ser um singleton.
	 * 
	 * Deve ter um atributo repositorioTituloDivida, do tipo RepositorioTituloDivida, que deve 
	 * ser inicializado na sua declara��o. Este atributo ser� usado exclusivamente
	 * pela classe, n�o tendo, portanto, m�todos set e get.
	 * 
	 * M�todos: 
	 * 
	 * pivate String validar(TituloDivida titulo): deve validar os dados do objeto recebido nos seguintes termos: 
	 * identificador: deve ser maior que zero e menor que 100000 (1)
	 * nome: deve ser preenchido, diferente de branco e de null (2). deve ter entre 10 e 100 caracteres (3).
	 * data de validade: deve ser maior do que a data atual mais 180 dias (4). 
	 * valorUnitario: deve ser maior que zero (5). 
	 * O m�todo validar deve retornar null se o objeto estiver v�lido, e uma mensagem pertinente (ver abaixo)
	 * se algum valor de atributo estiver inv�lido.
	 * 
	 * (1) - Identificador deve estar entre 1 e 99999.
	 * (2) - Nome deve ser preenchido.
	 * (3) - Nome deve ter entre 10 e 100 caracteres.
	 * (4) - Data de validade deve ter pelo menos 180 dias na frente da data atual.
	 * (5) - Taxa de juros deve ser maior ou igual a zero.
	 *
	 * public String incluir(TituloDivida titulo): deve chamar o m�todo validar. Se ele 
	 * retornar null, deve incluir titulo no reposit�rio. Retornos poss�veis:
	 * (1) null, se o retorno do validar for null e o retorno do incluir do 
	 * reposit�rio for true.
	 * (2) a mensagem retornada pelo validar, se o retorno deste for diferente
	 * de null.
	 * (3) A mensagem "T�tulo j� existente", se o retorno do validar for null
	 * e o retorno do reposit�rio for false.
	 *
	 * public String alterar(TituloDivida titulo): deve chamar o m�todo validar. Se ele 
	 * retornar null, deve alterar titulo no reposit�rio. Retornos poss�veis:
	 * (1) null, se o retorno do validar for null e o retorno do alterar do 
	 * reposit�rio for true.
	 * (2) a mensagem retornada pelo validar, se o retorno deste for diferente
	 * de null.
	 * (3) A mensagem "T�tulo inexistente", se o retorno do validar for null
	 * e o retorno do reposit�rio for false.
	 * 
	 * public String excluir(int identificador): deve validar o identificador. 
	 * Se este for v�lido, deve chamar o excluir do reposit�rio. Retornos poss�veis:
	 * (1) null, se o retorno do excluir do reposit�rio for true.
	 * (2) A mensagem "T�tulo inexistente", se o retorno do reposit�rio for false
	 * ou se o identificador for inv�lido.
	 * 
	 * public TituloDivida buscar(int identificador): deve validar o identificador.
	 * Se este for v�lido, deve chamar o buscar do reposit�rio, retornando o 
	 * que ele retornar. Se o identificador for inv�lido, retornar null. 
	 */
	
	private static MediatorTituloDivida mediatorTituloDivida = new MediatorTituloDivida();
	private RepositorioTituloDivida repositorioTituloDivida = new RepositorioTituloDivida();
	
	private MediatorTituloDivida() { 
		
	}
    
    public static MediatorTituloDivida getInstanciaSingleton() {
        return mediatorTituloDivida;
    }
	
	private String validar(TituloDivida titulo) {
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataValidadePlus = dataAtual.plusDays(180);
		
		if(titulo.getIdentificador() > 0 && titulo.getIdentificador() < 100000) {
			if(titulo.getNome().length() > 0 && titulo.getNome() != null) {
				if(titulo.getNome().length() > 10 && titulo.getNome().length() < 100) {
					if(titulo.getDataValidade().isAfter(dataValidadePlus)) {
						if(titulo.getTaxaJuros() >= 0) {
							return null;
						}else {
							return "Taxa de juros deve ser maior ou igual a 0";
						}
					}else {
						return "Data de validade deve ter pelo menos 180 dias na frente da data atual.";
					}
				}else {
					return "Nome deve ter entre 10 e 100 caracteres.";
				}
			}else {
				return "Nome deve ser preenchido.";
			}
		}else {
			return "Identificador deve estar entre 1 e 99999.";
		}
	}
	
	public String incluir(TituloDivida titulo) {
		if(validar(titulo) == null && repositorioTituloDivida.incluir(titulo) == true) {
			return null;
		}else if(validar(titulo) != null) {
			return validar(titulo);
		}else {
			return "Titulo já existente";
		}
	}
	
	public String alterar(TituloDivida titulo) {
		if(validar(titulo) == null && repositorioTituloDivida.alterar(titulo) == true) {
			return null;
		}else if(validar(titulo) != null) {
			return validar(titulo);
		}else {
			return "Titulo inexistente";
		}
	}
	
	public String excluir(int identificador) {
		if(identificador > 0 && identificador < 100000) {
			if(repositorioTituloDivida.excluir(identificador) == true) {
				return null;
			}else {
				return "Titulo inexistente";
			}
		}else {
			return "Titulo inexistente";
		}
	}
	
	public TituloDivida buscar(int identificador) {
		if(identificador > 0 && identificador < 100000) {
			return repositorioTituloDivida.buscar(identificador);
		}else {
			return null;
		}
	}
}
