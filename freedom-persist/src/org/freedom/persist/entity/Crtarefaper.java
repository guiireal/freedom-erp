package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * Crtarefaper generated by hbm2java
 */
@Entity
@Table(name = "CRTAREFAPER")
public class Crtarefaper implements java.io.Serializable {

	private CrtarefaperId id;
	private Crtarefa crtarefa;
	private Date dtiniper;
	private Date dtfimper;
	private String tempoesttarefa;
	private BigDecimal tempodectarefa;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Crtarefaper() {
	}

	public Crtarefaper(CrtarefaperId id, Crtarefa crtarefa, Date dtiniper,
			Date dtfimper, String tempoesttarefa, BigDecimal tempodectarefa,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.crtarefa = crtarefa;
		this.dtiniper = dtiniper;
		this.dtfimper = dtfimper;
		this.tempoesttarefa = tempoesttarefa;
		this.tempodectarefa = tempodectarefa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Crtarefaper(CrtarefaperId id, Crtarefa crtarefa, Date dtiniper,
			Date dtfimper, String tempoesttarefa, BigDecimal tempodectarefa,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.crtarefa = crtarefa;
		this.dtiniper = dtiniper;
		this.dtfimper = dtfimper;
		this.tempoesttarefa = tempoesttarefa;
		this.tempodectarefa = tempodectarefa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codtarefa", column = @Column(name = "CODTAREFA", nullable = false)),
			@AttributeOverride(name = "mestper", column = @Column(name = "MESTPER", nullable = false)),
			@AttributeOverride(name = "anotper", column = @Column(name = "ANOTPER", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public CrtarefaperId getId() {
		return this.id;
	}

	public void setId(CrtarefaperId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTAREFA", referencedColumnName = "CODTAREFA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Crtarefa getCrtarefa() {
		return this.crtarefa;
	}

	public void setCrtarefa(Crtarefa crtarefa) {
		this.crtarefa = crtarefa;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINIPER", nullable = false, length = 10)
	public Date getDtiniper() {
		return this.dtiniper;
	}

	public void setDtiniper(Date dtiniper) {
		this.dtiniper = dtiniper;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTFIMPER", nullable = false, length = 10)
	public Date getDtfimper() {
		return this.dtfimper;
	}

	public void setDtfimper(Date dtfimper) {
		this.dtfimper = dtfimper;
	}

	@Column(name = "TEMPOESTTAREFA", nullable = false, length = 10)
	public String getTempoesttarefa() {
		return this.tempoesttarefa;
	}

	public void setTempoesttarefa(String tempoesttarefa) {
		this.tempoesttarefa = tempoesttarefa;
	}

	@Column(name = "TEMPODECTAREFA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getTempodectarefa() {
		return this.tempodectarefa;
	}

	public void setTempodectarefa(BigDecimal tempodectarefa) {
		this.tempodectarefa = tempodectarefa;
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

}