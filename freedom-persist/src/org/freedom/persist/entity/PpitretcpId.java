package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PpitretcpId generated by hbm2java
 */
@Embeddable
public class PpitretcpId implements java.io.Serializable {

	private short coditretcp;
	private int codop;
	private short seqop;
	private short codfilial;
	private int codemp;

	public PpitretcpId() {
	}

	public PpitretcpId(short coditretcp, int codop, short seqop,
			short codfilial, int codemp) {
		this.coditretcp = coditretcp;
		this.codop = codop;
		this.seqop = seqop;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODITRETCP", nullable = false)
	public short getCoditretcp() {
		return this.coditretcp;
	}

	public void setCoditretcp(short coditretcp) {
		this.coditretcp = coditretcp;
	}

	@Column(name = "CODOP", nullable = false)
	public int getCodop() {
		return this.codop;
	}

	public void setCodop(int codop) {
		this.codop = codop;
	}

	@Column(name = "SEQOP", nullable = false)
	public short getSeqop() {
		return this.seqop;
	}

	public void setSeqop(short seqop) {
		this.seqop = seqop;
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
		if (!(other instanceof PpitretcpId))
			return false;
		PpitretcpId castOther = (PpitretcpId) other;

		return (this.getCoditretcp() == castOther.getCoditretcp())
				&& (this.getCodop() == castOther.getCodop())
				&& (this.getSeqop() == castOther.getSeqop())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCoditretcp();
		result = 37 * result + this.getCodop();
		result = 37 * result + this.getSeqop();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}