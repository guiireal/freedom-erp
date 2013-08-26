package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FntalaocheqId generated by hbm2java
 */
@Embeddable
public class FntalaocheqId implements java.io.Serializable {

	private String numconta;
	private short seqtalao;
	private short codfilial;
	private int codemp;

	public FntalaocheqId() {
	}

	public FntalaocheqId(String numconta, short seqtalao, short codfilial,
			int codemp) {
		this.numconta = numconta;
		this.seqtalao = seqtalao;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "NUMCONTA", nullable = false, length = 10)
	public String getNumconta() {
		return this.numconta;
	}

	public void setNumconta(String numconta) {
		this.numconta = numconta;
	}

	@Column(name = "SEQTALAO", nullable = false)
	public short getSeqtalao() {
		return this.seqtalao;
	}

	public void setSeqtalao(short seqtalao) {
		this.seqtalao = seqtalao;
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
		if (!(other instanceof FntalaocheqId))
			return false;
		FntalaocheqId castOther = (FntalaocheqId) other;

		return ((this.getNumconta() == castOther.getNumconta()) || (this
				.getNumconta() != null && castOther.getNumconta() != null && this
				.getNumconta().equals(castOther.getNumconta())))
				&& (this.getSeqtalao() == castOther.getSeqtalao())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getNumconta() == null ? 0 : this.getNumconta().hashCode());
		result = 37 * result + this.getSeqtalao();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}