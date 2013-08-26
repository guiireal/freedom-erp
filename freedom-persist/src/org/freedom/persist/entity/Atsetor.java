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
 * Atsetor generated by hbm2java
 */
@Entity
@Table(name = "ATSETOR")
public class Atsetor implements java.io.Serializable {

	private AtsetorId id;
	private Sgfilial sgfilial;
	private String descsetat;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Atsetoratendente> atsetoratendentes = new HashSet<Atsetoratendente>(
			0);
	private Set<Atatendimento> atatendimentos = new HashSet<Atatendimento>(0);
	private Set<Attipoatendosetor> attipoatendosetors = new HashSet<Attipoatendosetor>(
			0);
	private Set<Atmodatendo> atmodatendos = new HashSet<Atmodatendo>(0);

	public Atsetor() {
	}

	public Atsetor(AtsetorId id, Sgfilial sgfilial, String descsetat,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descsetat = descsetat;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Atsetor(AtsetorId id, Sgfilial sgfilial, String descsetat,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set<Atsetoratendente> atsetoratendentes,
			Set<Atatendimento> atatendimentos,
			Set<Attipoatendosetor> attipoatendosetors,
			Set<Atmodatendo> atmodatendos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descsetat = descsetat;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.atsetoratendentes = atsetoratendentes;
		this.atatendimentos = atatendimentos;
		this.attipoatendosetors = attipoatendosetors;
		this.atmodatendos = atmodatendos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codsetat", column = @Column(name = "CODSETAT", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public AtsetorId getId() {
		return this.id;
	}

	public void setId(AtsetorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@Column(name = "DESCSETAT", nullable = false, length = 50)
	public String getDescsetat() {
		return this.descsetat;
	}

	public void setDescsetat(String descsetat) {
		this.descsetat = descsetat;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atsetor")
	public Set<Atsetoratendente> getAtsetoratendentes() {
		return this.atsetoratendentes;
	}

	public void setAtsetoratendentes(Set<Atsetoratendente> atsetoratendentes) {
		this.atsetoratendentes = atsetoratendentes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atsetor")
	public Set<Atatendimento> getAtatendimentos() {
		return this.atatendimentos;
	}

	public void setAtatendimentos(Set<Atatendimento> atatendimentos) {
		this.atatendimentos = atatendimentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atsetor")
	public Set<Attipoatendosetor> getAttipoatendosetors() {
		return this.attipoatendosetors;
	}

	public void setAttipoatendosetors(Set<Attipoatendosetor> attipoatendosetors) {
		this.attipoatendosetors = attipoatendosetors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atsetor")
	public Set<Atmodatendo> getAtmodatendos() {
		return this.atmodatendos;
	}

	public void setAtmodatendos(Set<Atmodatendo> atmodatendos) {
		this.atmodatendos = atmodatendos;
	}

}