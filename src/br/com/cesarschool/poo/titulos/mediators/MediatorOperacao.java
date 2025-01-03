package br.com.cesarschool.poo.titulos.mediators;

import java.time.LocalDateTime;

import br.com.cesarschool.poo.titulos.entidades.Acao;
import br.com.cesarschool.poo.titulos.entidades.EntidadeOperadora;
import br.com.cesarschool.poo.titulos.entidades.TituloDivida;
import br.com.cesarschool.poo.titulos.entidades.Transacao;
import br.com.cesarschool.poo.titulos.repositorios.RepositorioTransacao;

public class MediatorOperacao {
	
	/*
	 * Deve ser um singleton.
	 * 
	 * Deve ter os seguites atributos: 
	 * 
	 * mediatorAcao, do tipo MediatorAcao
	 * mediatorTituloDivida, do tipo MediatorTituloDivida
	 * mediatorEntidadeOperadora, do tipo MediatorEntidadeOperadora
	 * repositorioTransacao, do tipo RepositorioTransacao
	 * 
	 * Estes atributos devem ser inicializados nas suas declara��es.
	 * 
	 * Estes atributos ser�o usados exclusivamente pela classe, n�o tendo, portanto, m�todos set e get.
	 * 
	 * M�todos: 
	 * 
	 * public String realizarOperacao(boolean ehAcao, int entidadeCredito, 
	 * int idEntidadeDebito, int idAcaoOuTitulo, double valor): segue o 
	 * passo a passo deste m�todo.
	 * 
	 * 1- Validar o valor, que deve ser maior que zero. Se o valor for inv�lido,
	 * retornar a mensagem "Valor inv�lido".
	 * 
	 * 2- Buscar a entidade de cr�dito no mediator de entidade operadora. 
	 * Se n�o encontrar, retornar a mensagem "Entidade cr�dito inexistente".
	 * 
	 * 3- Buscar a entidade de d�bito no mediator de entidade operadora. 
	 * Se n�o encontrar, retornar a mensagem "Entidade d�bito inexistente".
	 * 
	 * 4- Se ehAcao for true e a entidade de cr�dito n�o for autorizada para 
	 * a��o, retornar a mensagem "Entidade de cr�dito n�o autorizada para a��o"
	 *
	 * 5- Se ehAcao for true e a entidade de d�bito n�o for autorizada para 
	 * a��o, retornar a mensagem "Entidade de d�bito n�o autorizada para a��o"
	 *
	 * 6- Buscar a a��o (se ehAcao for true) ou o t�tulo (se ehAcao for false)
	 * no mediator de a��o ou de t�tulo. 
	 *
	 * 7- A depender de ehAcao, validar o saldoAcao ou o saldoTituloDivida da 
	 * entidade de d�bito. O saldo deve ser maior ou igual a valor. Se n�o for,
	 * retornar a mensagem "Saldo da entidade d�bito insuficiente".
	 * 
	 * 8- Se ehAcao for true, verificar se valorUnitario da a��o � maior do que
	 * valor. Se for, retornar a mensagem 
	 * "Valor da opera��o e menor do que o valor unit�rio da a��o"
	 * 
	 * 9- Calcular o valor da opera��o. Se ehAcao for true, o valor da opera��o
	 * � igual a valor. Se ehAcao for false, o valor da opera��o � igual ao 
	 * retorno do m�todo calcularPrecoTransacao, invocado a partir do t�tulo da 
	 * d�vida buscado. valor deve ser passado como par�metro na invoca��o deste
	 * m�todo.
	 * 
	 *  10- Invocar o m�todo creditarSaldoAcao ou creditarSaldoTituloDivida da 
	 *  entidade de cr�dito, passando o valor da opera��o.
	 *  
	 *  11- Invocar o m�todo debitarSaldoAcao ou debitarSaldoTituloDivida da 
	 *  entidade de d�bito, passando o valor da opera��o.
	 *  
	 *  12- Alterar entidade de cr�dito no mediator de entidade operadora. Se
	 *  o retorno do alterar for uma mensagem diferente de null, retornar a 
	 *  mensagem. 
	 *  
	 *  13- Alterar entidade de d�bito no mediator de entidade operadora. Se
	 *  o retorno do alterar for uma mensagem diferente de null, retornar a 
	 *  mensagem. 
	 *  
	 *  14- Criar um objeto do tipo Transacao, com os seguintes valores de atributos:
	 *  
	 * entidadeCredito - a entidade de cr�dito buscada
	 * entidadeDebito - a entidade de d�bito buscada
	 * acao - se ehAcao for true, a a��o buscada, caso contr�rio, null
	 * tituloDivida - se ehAcao for false, o t�tulo buscado, caso contr�rio, null
	 * valorOperacao - o valor da opera��o calculado no item 9
	 * dataHoraOperacao - a data e a hora atuais
	 * 
	 * 15- Incluir a transa��o criada no reposit�rio de transa��o.
	 * 
	 * public Transacao gerarExtrato(int entidade): 
	 * 
	 * 1- para este m�todo funcionar, deve-se acrescentar no reposit�rio de 
	 * transa��o o m�todo  
	 * public Transacao[] buscarPorEntidadeCredora(int identificadorEntidadeDebito)
	 * A busca deve retornar um array de transa��es cuja entidadeDebito tenha identificador igual ao
	 * recebido como par�metro. 
	 *  
	 * 2- Buscar as transa��es onde entidade � credora.
	 * 
	 * 3- Buscar as transa��es onde entidade � devedora.
	 * 
	 * 4- Colocar as transa��es buscadas nos itens 2 e 3 em um �nico novo array.
	 * 
	 * 5- Ordenar este novo array por dataHoraOperacao decrescente.
	 * 
	 * 6- Retornar o novo array.
	 **/
	
	private final MediatorAcao mediatorAcao = MediatorAcao.getInstanciaSingleton();
    private final MediatorTituloDivida mediatorTituloDivida = MediatorTituloDivida.getInstanciaSingleton();
    private final MediatorEntidadeOperadora mediatorEntidadeOperadora = MediatorEntidadeOperadora.getInstanciaSingleton();
    private final RepositorioTransacao repositorioTransacao = new RepositorioTransacao();
    private static MediatorOperacao instancia;

    private MediatorOperacao() { 
    	
    }

    public static MediatorOperacao getInstancia() {
        if (instancia == null) {
            synchronized (MediatorOperacao.class) {
                if (instancia == null) {
                    instancia = new MediatorOperacao();
                }
            }
        }
        return instancia;
    }
	
	public String realizarOperacao(boolean ehAcao, int idEntidadeCredito, int idEntidadeDebito, int idAcaoOuTitulo, double valor) {
		
		EntidadeOperadora entidadeCredito = mediatorEntidadeOperadora.buscar(idEntidadeCredito);
		EntidadeOperadora entidadeDebito = mediatorEntidadeOperadora.buscar(idEntidadeDebito);
		TituloDivida titulo = null;
		Acao acao = null;
		LocalDateTime dataHoraOperacao = LocalDateTime.now();
		
		if(valor <= 0) {
			return "Valor inválido";
		}
		
		if(entidadeCredito == null) {
			return "Entidade crédito inexistente";
		}
		
		if(entidadeDebito == null) {
			return "Entidade débito inexistente";
		}
		
		if(ehAcao == true) {
			if(entidadeCredito.isAutorizacaoAcao() == false){
				return "Entidade de crédito não autorizada para ação";
			}
		}
		
		if(ehAcao == true) {
			if(entidadeDebito.isAutorizacaoAcao() == false){
				return "Entidade de dédito não autorizada para ação";
			}
		}
		
		if(ehAcao == true) {
			acao = mediatorAcao.buscar(idAcaoOuTitulo);
			if(mediatorAcao.buscar(idAcaoOuTitulo) == null) {
				return "Ação inexistente";
			}
		}else {
			titulo = mediatorTituloDivida.buscar(idAcaoOuTitulo);
			if(mediatorTituloDivida.buscar(idAcaoOuTitulo) == null) {
				return "Título de dívida inexistente";
			}
		}
		
		if(ehAcao == true) {
			if(entidadeDebito.getSaldoAcao() < valor) {
				return "Saldo da entidade débito insuficiente";
			}
		}else {
			if(entidadeDebito.getSaldoTituloDivida() < valor) {
				return "Saldo da entidade débito insuficiente";
			}
		}
		
		if(ehAcao == true) {
			if(acao.getValorUnitario() > valor) {
				return "Valor da operação é menor do que o valor unitário da ação";
			}
		}
		
		double valorOperacao;
		if(ehAcao == true) {
			valorOperacao = valor;
		}else {
			valorOperacao = titulo.calcularPrecoTransacao(valor);
		}
		
		if(ehAcao == true) {
			entidadeCredito.creditarSaldoAcao(valorOperacao);
		}else {
			entidadeCredito.creditarSaldoTituloDivida(valorOperacao);
		}
		
		if(ehAcao == true) {
			entidadeDebito.debitarSaldoAcao(valorOperacao);
		}else {
			entidadeDebito.debitarSaldoTituloDivida(valorOperacao);
		}
		
		if(mediatorEntidadeOperadora.alterar(entidadeCredito) != null) {
			return mediatorEntidadeOperadora.alterar(entidadeCredito);
		}
		
		if(mediatorEntidadeOperadora.alterar(entidadeDebito) != null) {
			return mediatorEntidadeOperadora.alterar(entidadeDebito);
		}
		
		Transacao novaTransacao = new Transacao(entidadeCredito, entidadeDebito, acao, titulo, valorOperacao, dataHoraOperacao);
		
		repositorioTransacao.incluir(novaTransacao);
		
		return "Transação adicionada com sucesso!";
	}
	
	public Transacao[] gerarExtrato(int entidade) {
		
		Transacao[] transacoesCredoras = repositorioTransacao.buscarPorEntidadeCredora(entidade);
		Transacao[] transacoesDevedoras = repositorioTransacao.buscarPorEntidadeDevedora(entidade);
		
		int lenCred = transacoesCredoras.length;
		int lenDeb = transacoesDevedoras.length;
		int lenTotais = lenCred + lenDeb;
		
		Transacao[] transacoesGerais = new Transacao[lenTotais];
		
		for(int i=0; i<lenCred; i++) {
			transacoesGerais[i] = transacoesCredoras[i];
		}
		
		int j = 0;
		for(int i=lenCred; i<lenTotais; i++) {
			transacoesGerais[i] = transacoesDevedoras[lenTotais-(lenTotais - j)];
			j++;
		}
		
		for(int i=0; i<lenTotais; i++) {
			for(int k=0; k<lenTotais-1; k++) {
				if (transacoesGerais[k].getDataHoraOperacao().isBefore(transacoesGerais[k + 1].getDataHoraOperacao())) {
	                Transacao temp = transacoesGerais[k];
	                transacoesGerais[k] = transacoesGerais[k + 1];
	                transacoesGerais[k + 1] = temp;
	            }
			}
		}
		
		return transacoesGerais;
	}
	
}
