package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CrchamadoId generated by hbm2java
 */
@Embeddable
public class CrchamadoId implements java.io.Serializable {

	private int codchamado;
	private short codfilial;
	private int codemp;

	public CrchamadoId() {
	}

	public CrchamadoId(int codchamado, short codfilial, int codemp) {
		this.codchamado = codchamado;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCHAMADO", nullable = false)
	public int getCodchamado() {
		return this.codchamado;
	}

	public void setCodchamado(int codchamado) {
		this.codchamado = codchamado;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CrchamadoId))
			return false;
		CrchamadoId castOther = (CrchamadoId) other;

		return (this.getCodchamado() == castOther.getCodchamado())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodchamado();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}