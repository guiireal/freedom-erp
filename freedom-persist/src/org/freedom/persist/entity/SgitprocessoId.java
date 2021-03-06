package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgitprocessoId generated by hbm2java
 */
@Embeddable
public class SgitprocessoId implements java.io.Serializable {

	private int codproc;
	private short seqitproc;
	private short codfilial;
	private int codemp;

	public SgitprocessoId() {
	}

	public SgitprocessoId(int codproc, short seqitproc, short codfilial,
			int codemp) {
		this.codproc = codproc;
		this.seqitproc = seqitproc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODPROC", nullable = false)
	public int getCodproc() {
		return this.codproc;
	}

	public void setCodproc(int codproc) {
		this.codproc = codproc;
	}

	@Column(name = "SEQITPROC", nullable = false)
	public short getSeqitproc() {
		return this.seqitproc;
	}

	public void setSeqitproc(short seqitproc) {
		this.seqitproc = seqitproc;
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
		if (!(other instanceof SgitprocessoId))
			return false;
		SgitprocessoId castOther = (SgitprocessoId) other;

		return (this.getCodproc() == castOther.getCodproc())
				&& (this.getSeqitproc() == castOther.getSeqitproc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodproc();
		result = 37 * result + this.getSeqitproc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
