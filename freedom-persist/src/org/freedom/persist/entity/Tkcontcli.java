package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Tkcontcli generated by hbm2java
 */
@Entity
@Table(name = "TKCONTCLI")
public class Tkcontcli implements java.io.Serializable {

	private TkcontcliId id;
	private Tkcontato tkcontato;
	private Vdcliente vdcliente;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Tkcontcli() {
	}

	public Tkcontcli(TkcontcliId id, Tkcontato tkcontato, Vdcliente vdcliente,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.tkcontato = tkcontato;
		this.vdcliente = vdcliente;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkcontcli(TkcontcliId id, Tkcontato tkcontato, Vdcliente vdcliente,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.tkcontato = tkcontato;
		this.vdcliente = vdcliente;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcto", column = @Column(name = "CODCTO", nullable = false)),
			@AttributeOverride(name = "codfilialcto", column = @Column(name = "CODFILIALCTO", nullable = false)),
			@AttributeOverride(name = "codempcto", column = @Column(name = "CODEMPCTO", nullable = false)),
			@AttributeOverride(name = "codcli", column = @Column(name = "CODCLI", nullable = false)),
			@AttributeOverride(name = "codempcli", column = @Column(name = "CODEMPCLI", nullable = false)),
			@AttributeOverride(name = "codfilialcli", column = @Column(name = "CODFILIALCLI", nullable = false)) })
	public TkcontcliId getId() {
		return this.id;
	}

	public void setId(TkcontcliId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCTO", referencedColumnName = "CODCTO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALCTO", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPCTO", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Tkcontato getTkcontato() {
		return this.tkcontato;
	}

	public void setTkcontato(Tkcontato tkcontato) {
		this.tkcontato = tkcontato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALCLI", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPCLI", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
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