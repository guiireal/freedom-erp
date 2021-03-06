package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Fntiporestr generated by hbm2java
 */
@Entity
@Table(name = "FNTIPORESTR")
public class Fntiporestr implements java.io.Serializable {

	private FntiporestrId id;
	private String desctprestr;
	private char bloqtprestr;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnrestricaos = new HashSet(0);

	public Fntiporestr() {
	}

	public Fntiporestr(FntiporestrId id, String desctprestr, char bloqtprestr,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.desctprestr = desctprestr;
		this.bloqtprestr = bloqtprestr;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fntiporestr(FntiporestrId id, String desctprestr, char bloqtprestr,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set fnrestricaos) {
		this.id = id;
		this.desctprestr = desctprestr;
		this.bloqtprestr = bloqtprestr;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnrestricaos = fnrestricaos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codtprestr", column = @Column(name = "CODTPRESTR", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FntiporestrId getId() {
		return this.id;
	}

	public void setId(FntiporestrId id) {
		this.id = id;
	}

	@Column(name = "DESCTPRESTR", nullable = false, length = 50)
	public String getDesctprestr() {
		return this.desctprestr;
	}

	public void setDesctprestr(String desctprestr) {
		this.desctprestr = desctprestr;
	}

	@Column(name = "BLOQTPRESTR", nullable = false, length = 1)
	public char getBloqtprestr() {
		return this.bloqtprestr;
	}

	public void setBloqtprestr(char bloqtprestr) {
		this.bloqtprestr = bloqtprestr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 128)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 128)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fntiporestr")
	public Set getFnrestricaos() {
		return this.fnrestricaos;
	}

	public void setFnrestricaos(Set fnrestricaos) {
		this.fnrestricaos = fnrestricaos;
	}
*/
}
