package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgsequenciaId generated by hbm2java
 */
@Embeddable
public class SgsequenciaId implements java.io.Serializable {

	private String sgtab;
	private short codfilial;
	private int codemp;

	public SgsequenciaId() {
	}

	public SgsequenciaId(String sgtab, short codfilial, int codemp) {
		this.sgtab = sgtab;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "SGTAB", nullable = false, length = 2)
	public String getSgtab() {
		return this.sgtab;
	}

	public void setSgtab(String sgtab) {
		this.sgtab = sgtab;
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
		if (!(other instanceof SgsequenciaId))
			return false;
		SgsequenciaId castOther = (SgsequenciaId) other;

		return ((this.getSgtab() == castOther.getSgtab()) || (this.getSgtab() != null
				&& castOther.getSgtab() != null && this.getSgtab().equals(
				castOther.getSgtab())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSgtab() == null ? 0 : this.getSgtab().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}