package br.gov.cesarschool.poo.daogenerico;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class Entidade implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private LocalDateTime dataHoraInclusao = LocalDateTime.now();
	private LocalDateTime dataHoraUltimaAlteracao = LocalDateTime.now();
	private String usuarioInclusao;
	private String usuarioUltimaAlteracao;
	
	public Entidade() {
		
	}

	public LocalDateTime getDataHoraInclusao() {
		return dataHoraInclusao;
	} 

	public void setDataHoraInclusao(LocalDateTime dataHoraInclusao) {
		this.dataHoraInclusao = dataHoraInclusao;
	}

	public LocalDateTime getDataHoraUltimaAlteracao() {
		return dataHoraUltimaAlteracao;
	}

	public void setDataHoraUltimaAlteracao(LocalDateTime dataHoraUltimaAlteracao) {
		this.dataHoraUltimaAlteracao = dataHoraUltimaAlteracao;
	}

	public String getUsuarioInclusao() {
		return usuarioInclusao;
	}

	public void setUsuarioInclusao(String usuarioInclusao) {
		this.usuarioInclusao = usuarioInclusao;
	}

	public String getUsuarioUltimaAlteracao() {
		return usuarioUltimaAlteracao;
	}

	public void setUsuarioUltimaAlteracao(String usuarioUltimaAlteracao) {
		this.usuarioUltimaAlteracao = usuarioUltimaAlteracao;
	}
	
	public abstract String getIdUnico();
}