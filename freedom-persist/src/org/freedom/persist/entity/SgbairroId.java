package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgbairroId generated by hbm2java
 */
@Embeddable
public class SgbairroId implements java.io.Serializable {

	private int codbairro;
	private String codmunic;
	private String siglauf;
	private short codpais;

	public SgbairroId() {
	}

	public SgbairroId(int codbairro, String codmunic, String siglauf,
			short codpais) {
		this.codbairro = codbairro;
		this.codmunic = codmunic;
		this.siglauf = siglauf;
		this.codpais = codpais;
	}

	@Column(name = "CODBAIRRO", nullable = false)
	public int getCodbairro() {
		return this.codbairro;
	}

	public void setCodbairro(int codbairro) {
		this.codbairro = codbairro;
	}

	@Column(name = "CODMUNIC", nullable = false, length = 7)
	public String getCodmunic() {
		return this.codmunic;
	}

	public void setCodmunic(String codmunic) {
		this.codmunic = codmunic;
	}

	@Column(name = "SIGLAUF", nullable = false, length = 2)
	public String getSiglauf() {
		return this.siglauf;
	}

	public void setSiglauf(String siglauf) {
		this.siglauf = siglauf;
	}

	@Column(name = "CODPAIS", nullable = false)
	public short getCodpais() {
		return this.codpais;
	}

	public void setCodpais(short codpais) {
		this.codpais = codpais;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SgbairroId))
			return false;
		SgbairroId castOther = (SgbairroId) other;

		return (this.getCodbairro() == castOther.getCodbairro())
				&& ((this.getCodmunic() == castOther.getCodmunic()) || (this
						.getCodmunic() != null
						&& castOther.getCodmunic() != null && this
						.getCodmunic().equals(castOther.getCodmunic())))
				&& ((this.getSiglauf() == castOther.getSiglauf()) || (this
						.getSiglauf() != null && castOther.getSiglauf() != null && this
						.getSiglauf().equals(castOther.getSiglauf())))
				&& (this.getCodpais() == castOther.getCodpais());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodbairro();
		result = 37 * result
				+ (getCodmunic() == null ? 0 : this.getCodmunic().hashCode());
		result = 37 * result
				+ (getSiglauf() == null ? 0 : this.getSiglauf().hashCode());
		result = 37 * result + this.getCodpais();
		return result;
	}

}