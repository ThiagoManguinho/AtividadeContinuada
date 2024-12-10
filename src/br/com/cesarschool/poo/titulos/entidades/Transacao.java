package br.com.cesarschool.poo.titulos.entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.com.cesarschool.poo.titulos.utils.Comparavel;
import br.gov.cesarschool.poo.daogenerico.Entidade;

public class Transacao extends Entidade implements Comparavel{
	
	/*
	 * Esta classe deve ter os seguintes atributos:
	 * entidadeCredito, do tipo EntidadeOperadora
	 * entidadeDebito, do tipo EntidadeOperadora
	 * acao, do tipo Acao
	 * tituloDivida, do tipo TituloDivida
	 * valorOperacao, do tipo double
	 * dataHoraOperacao, do tipo LocalDateTime
	 *  
	 * Deve ter um construtor p�blico que inicializa os atributos.
	 * Deve ter m�todos get/set p�blicos para todos os atributos, que 
	 * s�o read-only fora da classe.
	 * 
	 *  
	 */ 
	
	private EntidadeOperadora entidadeCredito;
	private EntidadeOperadora entidadeDebito;
	private Acao acao;
	private TituloDivida tituloDivida;
	private double valorOperacao;
	private LocalDateTime dataHoraOperacao;
	
	public Transacao(EntidadeOperadora entidadeCredito, EntidadeOperadora entidadeDebito, Acao acao, TituloDivida tituloDivida, double valorOperacao, LocalDateTime dataHoraOperacao) {
		this.entidadeCredito = entidadeCredito;
		this.entidadeDebito = entidadeDebito;
		this.acao = acao;
		this.tituloDivida = tituloDivida;
		this.valorOperacao = valorOperacao;
		this.dataHoraOperacao = dataHoraOperacao;
	}
	
	public int comparar(Comparavel c1) {
		
        try {
            if (c1 instanceof Transacao) {
                Transacao t1 = (Transacao) c1;

                return t1.getDataHoraOperacao().compareTo(this.dataHoraOperacao);
            } else {
                throw new IllegalArgumentException("Os objetos comparados devem ser do tipo Transacao.");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao comparar as transações: " + e.getMessage(), e);
        }
        
    }
	
	public String getIdUnico() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		String dataHoraFormatada = dataHoraOperacao.format(formatter);
		
		if(acao == null) {
			return "" + entidadeCredito.getIdentificador() + "_" + entidadeDebito.getIdentificador() + "_" + tituloDivida.getIdentificador() + "_" + dataHoraFormatada;
		}else {
			return "" + entidadeCredito.getIdentificador() + "_" + entidadeDebito.getIdentificador() + "_" + acao.getIdentificador() + "_" + dataHoraFormatada;
		}
	}

	public EntidadeOperadora getEntidadeCredito() {
		return entidadeCredito;
	}

	public EntidadeOperadora getEntidadeDebito() {
		return entidadeDebito;
	}

	public Acao getAcao() {
		return acao;
	}

	public TituloDivida getTituloDivida() {
		return tituloDivida;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public LocalDateTime getDataHoraOperacao() {
		return dataHoraOperacao;
	}
}
