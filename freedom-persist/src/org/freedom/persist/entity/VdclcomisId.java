package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdclcomisId generated by hbm2java
 */
@Embeddable
public class VdclcomisId implements java.io.Serializable {

	private int codclcomis;
	private int codfilial;
	private int codemp;

	public VdclcomisId() {
	}

	public VdclcomisId(int codclcomis, int codfilial, int codemp) {
		this.codclcomis = codclcomis;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCLCOMIS", nullable = false)
	public int getCodclcomis() {
		return this.codclcomis;
	}

	public void setCodclcomis(int codclcomis) {
		this.codclcomis = codclcomis;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
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
		if (!(other instanceof VdclcomisId))
			return false;
		VdclcomisId castOther = (VdclcomisId) other;

		return (this.getCodclcomis() == castOther.getCodclcomis())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodclcomis();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
