package br.com.cesarschool.poo.titulos.entidades;

import java.time.LocalDate;

public class TituloDivida extends Ativo{
	
	/*
	 * Esta classe deve herdar de Ativo.
	 * E deve ter os seguintes atributos:
	 * taxaJuros, do tipo double.
	 * 
	 * Deve ter um construtor p�blico que inicializa os atributos, 
	 * e m�todos set/get p�blicos para os atributos.
	 * 
	 * Deve ter um m�todo p�blico double calcularPrecoTransacao(double montante): o pre�o 
	 * da transa��o � montante vezes (1 - taxaJuros/100.0).
	 */
	
	private double taxaJuros;
	
	public TituloDivida(int identificador, String nome, LocalDate dataValidade, double taxaJuros) {
		super(identificador, nome, dataValidade);
		this.taxaJuros = taxaJuros;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}
	
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public double calcularPrecoTransacao(double montante) {
		return montante*(1 - getTaxaJuros()/100);
	}
}
