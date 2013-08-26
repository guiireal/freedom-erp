package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Eqitvargrade generated by hbm2java
 */
@Entity
@Table(name = "EQITVARGRADE")
public class Eqitvargrade implements java.io.Serializable {

	private EqitvargradeId id;
	private Eqvargrade eqvargrade;
	private String descitvarg;
	private String siglaitvarg;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg1 = new HashSet<Critfichaaval>(
			0);
	private Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg2 = new HashSet<Critfichaaval>(
			0);
	private Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg3 = new HashSet<Critfichaaval>(
			0);
	private Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg4 = new HashSet<Critfichaaval>(
			0);
	private Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg8 = new HashSet<Critfichaaval>(
			0);
	private Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg7 = new HashSet<Critfichaaval>(
			0);
	private Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg6 = new HashSet<Critfichaaval>(
			0);
	private Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg5 = new HashSet<Critfichaaval>(
			0);

	public Eqitvargrade() {
	}

	public Eqitvargrade(EqitvargradeId id, Eqvargrade eqvargrade,
			String descitvarg, String siglaitvarg, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.eqvargrade = eqvargrade;
		this.descitvarg = descitvarg;
		this.siglaitvarg = siglaitvarg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqitvargrade(EqitvargradeId id, Eqvargrade eqvargrade,
			String descitvarg, String siglaitvarg, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg1,
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg2,
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg3,
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg4,
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg8,
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg7,
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg6,
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg5) {
		this.id = id;
		this.eqvargrade = eqvargrade;
		this.descitvarg = descitvarg;
		this.siglaitvarg = siglaitvarg;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.critfichaavalsForCritfichaavalfkvg1 = critfichaavalsForCritfichaavalfkvg1;
		this.critfichaavalsForCritfichaavalfkvg2 = critfichaavalsForCritfichaavalfkvg2;
		this.critfichaavalsForCritfichaavalfkvg3 = critfichaavalsForCritfichaavalfkvg3;
		this.critfichaavalsForCritfichaavalfkvg4 = critfichaavalsForCritfichaavalfkvg4;
		this.critfichaavalsForCritfichaavalfkvg8 = critfichaavalsForCritfichaavalfkvg8;
		this.critfichaavalsForCritfichaavalfkvg7 = critfichaavalsForCritfichaavalfkvg7;
		this.critfichaavalsForCritfichaavalfkvg6 = critfichaavalsForCritfichaavalfkvg6;
		this.critfichaavalsForCritfichaavalfkvg5 = critfichaavalsForCritfichaavalfkvg5;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codvarg", column = @Column(name = "CODVARG", nullable = false)),
			@AttributeOverride(name = "seqitvarg", column = @Column(name = "SEQITVARG", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqitvargradeId getId() {
		return this.id;
	}

	public void setId(EqitvargradeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVARG", referencedColumnName = "CODVARG", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqvargrade getEqvargrade() {
		return this.eqvargrade;
	}

	public void setEqvargrade(Eqvargrade eqvargrade) {
		this.eqvargrade = eqvargrade;
	}

	@Column(name = "DESCITVARG", nullable = false, length = 50)
	public String getDescitvarg() {
		return this.descitvarg;
	}

	public void setDescitvarg(String descitvarg) {
		this.descitvarg = descitvarg;
	}

	@Column(name = "SIGLAITVARG", nullable = false, length = 10)
	public String getSiglaitvarg() {
		return this.siglaitvarg;
	}

	public void setSiglaitvarg(String siglaitvarg) {
		this.siglaitvarg = siglaitvarg;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitvargradeByCritfichaavalfkvg1")
	public Set<Critfichaaval> getCritfichaavalsForCritfichaavalfkvg1() {
		return this.critfichaavalsForCritfichaavalfkvg1;
	}

	public void setCritfichaavalsForCritfichaavalfkvg1(
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg1) {
		this.critfichaavalsForCritfichaavalfkvg1 = critfichaavalsForCritfichaavalfkvg1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitvargradeByCritfichaavalfkvg2")
	public Set<Critfichaaval> getCritfichaavalsForCritfichaavalfkvg2() {
		return this.critfichaavalsForCritfichaavalfkvg2;
	}

	public void setCritfichaavalsForCritfichaavalfkvg2(
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg2) {
		this.critfichaavalsForCritfichaavalfkvg2 = critfichaavalsForCritfichaavalfkvg2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitvargradeByCritfichaavalfkvg3")
	public Set<Critfichaaval> getCritfichaavalsForCritfichaavalfkvg3() {
		return this.critfichaavalsForCritfichaavalfkvg3;
	}

	public void setCritfichaavalsForCritfichaavalfkvg3(
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg3) {
		this.critfichaavalsForCritfichaavalfkvg3 = critfichaavalsForCritfichaavalfkvg3;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitvargradeByCritfichaavalfkvg4")
	public Set<Critfichaaval> getCritfichaavalsForCritfichaavalfkvg4() {
		return this.critfichaavalsForCritfichaavalfkvg4;
	}

	public void setCritfichaavalsForCritfichaavalfkvg4(
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg4) {
		this.critfichaavalsForCritfichaavalfkvg4 = critfichaavalsForCritfichaavalfkvg4;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitvargradeByCritfichaavalfkvg8")
	public Set<Critfichaaval> getCritfichaavalsForCritfichaavalfkvg8() {
		return this.critfichaavalsForCritfichaavalfkvg8;
	}

	public void setCritfichaavalsForCritfichaavalfkvg8(
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg8) {
		this.critfichaavalsForCritfichaavalfkvg8 = critfichaavalsForCritfichaavalfkvg8;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitvargradeByCritfichaavalfkvg7")
	public Set<Critfichaaval> getCritfichaavalsForCritfichaavalfkvg7() {
		return this.critfichaavalsForCritfichaavalfkvg7;
	}

	public void setCritfichaavalsForCritfichaavalfkvg7(
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg7) {
		this.critfichaavalsForCritfichaavalfkvg7 = critfichaavalsForCritfichaavalfkvg7;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitvargradeByCritfichaavalfkvg6")
	public Set<Critfichaaval> getCritfichaavalsForCritfichaavalfkvg6() {
		return this.critfichaavalsForCritfichaavalfkvg6;
	}

	public void setCritfichaavalsForCritfichaavalfkvg6(
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg6) {
		this.critfichaavalsForCritfichaavalfkvg6 = critfichaavalsForCritfichaavalfkvg6;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitvargradeByCritfichaavalfkvg5")
	public Set<Critfichaaval> getCritfichaavalsForCritfichaavalfkvg5() {
		return this.critfichaavalsForCritfichaavalfkvg5;
	}

	public void setCritfichaavalsForCritfichaavalfkvg5(
			Set<Critfichaaval> critfichaavalsForCritfichaavalfkvg5) {
		this.critfichaavalsForCritfichaavalfkvg5 = critfichaavalsForCritfichaavalfkvg5;
	}

}