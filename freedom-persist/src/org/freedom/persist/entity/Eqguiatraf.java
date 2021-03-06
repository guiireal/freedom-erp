package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eqguiatraf generated by hbm2java
 */
@Entity
@Table(name = "EQGUIATRAF")
public class Eqguiatraf implements java.io.Serializable {

	private EqguiatrafId id;
	private Cpcompra cpcompra;
	private Date dtemisguiatraf;
	private String nroguiatraf;
	private String nroseloguiatraf;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqguiatraf() {
	}

	public Eqguiatraf(EqguiatrafId id, Cpcompra cpcompra, Date dtemisguiatraf,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.cpcompra = cpcompra;
		this.dtemisguiatraf = dtemisguiatraf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqguiatraf(EqguiatrafId id, Cpcompra cpcompra, Date dtemisguiatraf,
			String nroguiatraf, String nroseloguiatraf, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.cpcompra = cpcompra;
		this.dtemisguiatraf = dtemisguiatraf;
		this.nroguiatraf = nroguiatraf;
		this.nroseloguiatraf = nroseloguiatraf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "coditcompra", column = @Column(name = "CODITCOMPRA", nullable = false)),
			@AttributeOverride(name = "codcompra", column = @Column(name = "CODCOMPRA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqguiatrafId getId() {
		return this.id;
	}

	public void setId(EqguiatrafId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCOMPRA", referencedColumnName = "CODCOMPRA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Cpcompra getCpcompra() {
		return this.cpcompra;
	}

	public void setCpcompra(Cpcompra cpcompra) {
		this.cpcompra = cpcompra;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTEMISGUIATRAF", nullable = false, length = 10)
	public Date getDtemisguiatraf() {
		return this.dtemisguiatraf;
	}

	public void setDtemisguiatraf(Date dtemisguiatraf) {
		this.dtemisguiatraf = dtemisguiatraf;
	}

	@Column(name = "NROGUIATRAF", length = 20)
	public String getNroguiatraf() {
		return this.nroguiatraf;
	}

	public void setNroguiatraf(String nroguiatraf) {
		this.nroguiatraf = nroguiatraf;
	}

	@Column(name = "NROSELOGUIATRAF", length = 15)
	public String getNroseloguiatraf() {
		return this.nroseloguiatraf;
	}

	public void setNroseloguiatraf(String nroseloguiatraf) {
		this.nroseloguiatraf = nroseloguiatraf;
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

	@Column(name = "IDUSUINS", nullable = false, length = 8)
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

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
