package br.com.cesarschool.poo.titulos.entidades;

import br.gov.cesarschool.poo.daogenerico.Entidade;

public class EntidadeOperadora extends Entidade{
	
	/*
	 * Esta classe deve ter os seguintes atributos:
	 * identificador, do tipo long
	 * nome, do tipo String
	 * autorizadoAcao, do tipo double
	 * saldoAcao, do tipo double
	 * saldoTituloDivida, do tipo double
	 * 
	 * Deve ter um construtor p�blico que inicializa os atributos identificador, nome
	 * e autorizadoAcao. Deve ter m�todos set/get p�blicos para os atributos identificador, nome
	 * e autorizadoAcao. O atributo identificador � read-only fora da classe.
	 * 
	 * Os atributos saldoAcao e saldoTituloDivida devem ter apenas m�todos get p�blicos.
	 * 
	 * Outros m�todos p�blicos:
	 * 
	 *  void creditarSaldoAcao(double valor): deve adicionar valor ao saldoAcao
	 *  void debitarSaldoAcao(double valor): deve diminuir valor de saldoAcao
	 *  void creditarSaldoTituloDivida(double valor): deve adicionar valor ao saldoTituloDivida
	 *  void debitarSaldoTituloDivida(double valor): deve diminuir valor de saldoTituloDivida  
	 */
	
	private long identificador;
	private String nome;
	private boolean autorizacaoAcao;
	private double saldoAcao;
	private double saldoTituloDivida;
	
	public EntidadeOperadora(long identificador, String nome, boolean autorizacaoAcao, double saldoAcao, double saldoTituloDivida) {
		this.identificador = identificador;
		this.nome = nome;
		this.autorizacaoAcao = autorizacaoAcao;
		this.saldoAcao = saldoAcao;
		this.saldoTituloDivida = saldoTituloDivida;
	}
	
	public EntidadeOperadora(long identificador, String nome, double autorizadoAcao) {
        super();
        this.identificador = identificador;
        this.nome = nome;
    }
	
	public String getIdUnico() {
		return "" + identificador;
	}

	
	public long getIdentificador() {
		return identificador;
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean isAutorizacaoAcao() {
		return autorizacaoAcao;
	}
	
	public double getSaldoAcao() {
		return saldoAcao;
	}
	
	public double getSaldoTituloDivida() {
		return saldoTituloDivida;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAutorizacaoAcao(boolean autorizacaoAcao) {
		this.autorizacaoAcao = autorizacaoAcao;
	}
	
	public void creditarSaldoAcao(double valor) {
		saldoAcao = saldoAcao + valor;
	}
	
	public void debitarSaldoAcao(double valor) {
		saldoAcao = saldoAcao - valor;
	}
	
	public void creditarSaldoTituloDivida(double valor) {
		saldoTituloDivida = saldoTituloDivida + valor;
	}
	
	public void debitarSaldoTituloDivida(double valor) {
		saldoTituloDivida = saldoTituloDivida - valor;
	}
}
