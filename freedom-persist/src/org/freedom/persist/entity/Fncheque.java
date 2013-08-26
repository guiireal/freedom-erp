package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Fncheque generated by hbm2java
 */
@Entity
@Table(name = "FNCHEQUE")
public class Fncheque implements java.io.Serializable {

	private FnchequeId id;
	private Fnbanco fnbanco;
	private String agenciacheq;
	private String contacheq;
	private int numcheq;
	private String nomeemitcheq;
	private String nomefavcheq;
	private Date dtemitcheq;
	private Date dtvenctocheq;
	private Date dtcompcheq;
	private String tipocheq;
	private Character predatcheq;
	private String sitcheq;
	private BigDecimal vlrcheq;
	private String histcheq;
	private String cnpjemitcheq;
	private String cpfemitcheq;
	private String cnpjfavcheq;
	private String cpffavcheq;
	private String dddfavcheq;
	private String dddemitcheq;
	private String foneemitcheq;
	private String fonefavcheq;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Fnpagcheq> fnpagcheqs = new HashSet<Fnpagcheq>(0);

	public Fncheque() {
	}

	public Fncheque(FnchequeId id, Fnbanco fnbanco, String agenciacheq,
			String contacheq, int numcheq, String nomeemitcheq,
			String nomefavcheq, Date dtemitcheq, Date dtvenctocheq,
			String tipocheq, String sitcheq, BigDecimal vlrcheq,
			String histcheq, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.fnbanco = fnbanco;
		this.agenciacheq = agenciacheq;
		this.contacheq = contacheq;
		this.numcheq = numcheq;
		this.nomeemitcheq = nomeemitcheq;
		this.nomefavcheq = nomefavcheq;
		this.dtemitcheq = dtemitcheq;
		this.dtvenctocheq = dtvenctocheq;
		this.tipocheq = tipocheq;
		this.sitcheq = sitcheq;
		this.vlrcheq = vlrcheq;
		this.histcheq = histcheq;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Fncheque(FnchequeId id, Fnbanco fnbanco, String agenciacheq,
			String contacheq, int numcheq, String nomeemitcheq,
			String nomefavcheq, Date dtemitcheq, Date dtvenctocheq,
			Date dtcompcheq, String tipocheq, Character predatcheq,
			String sitcheq, BigDecimal vlrcheq, String histcheq,
			String cnpjemitcheq, String cpfemitcheq, String cnpjfavcheq,
			String cpffavcheq, String dddfavcheq, String dddemitcheq,
			String foneemitcheq, String fonefavcheq, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Fnpagcheq> fnpagcheqs) {
		this.id = id;
		this.fnbanco = fnbanco;
		this.agenciacheq = agenciacheq;
		this.contacheq = contacheq;
		this.numcheq = numcheq;
		this.nomeemitcheq = nomeemitcheq;
		this.nomefavcheq = nomefavcheq;
		this.dtemitcheq = dtemitcheq;
		this.dtvenctocheq = dtvenctocheq;
		this.dtcompcheq = dtcompcheq;
		this.tipocheq = tipocheq;
		this.predatcheq = predatcheq;
		this.sitcheq = sitcheq;
		this.vlrcheq = vlrcheq;
		this.histcheq = histcheq;
		this.cnpjemitcheq = cnpjemitcheq;
		this.cpfemitcheq = cpfemitcheq;
		this.cnpjfavcheq = cnpjfavcheq;
		this.cpffavcheq = cpffavcheq;
		this.dddfavcheq = dddfavcheq;
		this.dddemitcheq = dddemitcheq;
		this.foneemitcheq = foneemitcheq;
		this.fonefavcheq = fonefavcheq;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnpagcheqs = fnpagcheqs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "seqcheq", column = @Column(name = "SEQCHEQ", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnchequeId getId() {
		return this.id;
	}

	public void setId(FnchequeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODBANC", referencedColumnName = "CODBANCO", nullable = false),
			@JoinColumn(name = "CODFILIALBO", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPBO", referencedColumnName = "CODEMP", nullable = false) })
	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	@Column(name = "AGENCIACHEQ", nullable = false, length = 7)
	public String getAgenciacheq() {
		return this.agenciacheq;
	}

	public void setAgenciacheq(String agenciacheq) {
		this.agenciacheq = agenciacheq;
	}

	@Column(name = "CONTACHEQ", nullable = false, length = 10)
	public String getContacheq() {
		return this.contacheq;
	}

	public void setContacheq(String contacheq) {
		this.contacheq = contacheq;
	}

	@Column(name = "NUMCHEQ", nullable = false)
	public int getNumcheq() {
		return this.numcheq;
	}

	public void setNumcheq(int numcheq) {
		this.numcheq = numcheq;
	}

	@Column(name = "NOMEEMITCHEQ", nullable = false, length = 50)
	public String getNomeemitcheq() {
		return this.nomeemitcheq;
	}

	public void setNomeemitcheq(String nomeemitcheq) {
		this.nomeemitcheq = nomeemitcheq;
	}

	@Column(name = "NOMEFAVCHEQ", nullable = false, length = 50)
	public String getNomefavcheq() {
		return this.nomefavcheq;
	}

	public void setNomefavcheq(String nomefavcheq) {
		this.nomefavcheq = nomefavcheq;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTEMITCHEQ", nullable = false, length = 10)
	public Date getDtemitcheq() {
		return this.dtemitcheq;
	}

	public void setDtemitcheq(Date dtemitcheq) {
		this.dtemitcheq = dtemitcheq;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTVENCTOCHEQ", nullable = false, length = 10)
	public Date getDtvenctocheq() {
		return this.dtvenctocheq;
	}

	public void setDtvenctocheq(Date dtvenctocheq) {
		this.dtvenctocheq = dtvenctocheq;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTCOMPCHEQ", length = 10)
	public Date getDtcompcheq() {
		return this.dtcompcheq;
	}

	public void setDtcompcheq(Date dtcompcheq) {
		this.dtcompcheq = dtcompcheq;
	}

	@Column(name = "TIPOCHEQ", nullable = false, length = 2)
	public String getTipocheq() {
		return this.tipocheq;
	}

	public void setTipocheq(String tipocheq) {
		this.tipocheq = tipocheq;
	}

	@Column(name = "PREDATCHEQ", length = 1)
	public Character getPredatcheq() {
		return this.predatcheq;
	}

	public void setPredatcheq(Character predatcheq) {
		this.predatcheq = predatcheq;
	}

	@Column(name = "SITCHEQ", nullable = false, length = 2)
	public String getSitcheq() {
		return this.sitcheq;
	}

	public void setSitcheq(String sitcheq) {
		this.sitcheq = sitcheq;
	}

	@Column(name = "VLRCHEQ", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrcheq() {
		return this.vlrcheq;
	}

	public void setVlrcheq(BigDecimal vlrcheq) {
		this.vlrcheq = vlrcheq;
	}

	@Column(name = "HISTCHEQ", nullable = false, length = 500)
	public String getHistcheq() {
		return this.histcheq;
	}

	public void setHistcheq(String histcheq) {
		this.histcheq = histcheq;
	}

	@Column(name = "CNPJEMITCHEQ", length = 14)
	public String getCnpjemitcheq() {
		return this.cnpjemitcheq;
	}

	public void setCnpjemitcheq(String cnpjemitcheq) {
		this.cnpjemitcheq = cnpjemitcheq;
	}

	@Column(name = "CPFEMITCHEQ", length = 11)
	public String getCpfemitcheq() {
		return this.cpfemitcheq;
	}

	public void setCpfemitcheq(String cpfemitcheq) {
		this.cpfemitcheq = cpfemitcheq;
	}

	@Column(name = "CNPJFAVCHEQ", length = 14)
	public String getCnpjfavcheq() {
		return this.cnpjfavcheq;
	}

	public void setCnpjfavcheq(String cnpjfavcheq) {
		this.cnpjfavcheq = cnpjfavcheq;
	}

	@Column(name = "CPFFAVCHEQ", length = 11)
	public String getCpffavcheq() {
		return this.cpffavcheq;
	}

	public void setCpffavcheq(String cpffavcheq) {
		this.cpffavcheq = cpffavcheq;
	}

	@Column(name = "DDDFAVCHEQ", length = 4)
	public String getDddfavcheq() {
		return this.dddfavcheq;
	}

	public void setDddfavcheq(String dddfavcheq) {
		this.dddfavcheq = dddfavcheq;
	}

	@Column(name = "DDDEMITCHEQ", length = 4)
	public String getDddemitcheq() {
		return this.dddemitcheq;
	}

	public void setDddemitcheq(String dddemitcheq) {
		this.dddemitcheq = dddemitcheq;
	}

	@Column(name = "FONEEMITCHEQ", length = 9)
	public String getFoneemitcheq() {
		return this.foneemitcheq;
	}

	public void setFoneemitcheq(String foneemitcheq) {
		this.foneemitcheq = foneemitcheq;
	}

	@Column(name = "FONEFAVCHEQ", length = 9)
	public String getFonefavcheq() {
		return this.fonefavcheq;
	}

	public void setFonefavcheq(String fonefavcheq) {
		this.fonefavcheq = fonefavcheq;
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
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 128)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fncheque")
	public Set<Fnpagcheq> getFnpagcheqs() {
		return this.fnpagcheqs;
	}

	public void setFnpagcheqs(Set<Fnpagcheq> fnpagcheqs) {
		this.fnpagcheqs = fnpagcheqs;
	}

}