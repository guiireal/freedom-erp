package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgpais generated by hbm2java
 */
@Entity
@Table(name = "SGPAIS")
public class Sgpais implements java.io.Serializable {

	private short codpais;
	private String nomepais;
	private String sigla3cpais;
	private Short ddipais;
	private String sigla2cpais;
	private Integer codbacenpais;
	private String codeanpais;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Sguf> sgufs = new HashSet<Sguf>(0);

	public Sgpais() {
	}

	public Sgpais(short codpais, String nomepais, String sigla3cpais,
			String sigla2cpais, Date dtins, Date hins, String idusuins) {
		this.codpais = codpais;
		this.nomepais = nomepais;
		this.sigla3cpais = sigla3cpais;
		this.sigla2cpais = sigla2cpais;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgpais(short codpais, String nomepais, String sigla3cpais,
			Short ddipais, String sigla2cpais, Integer codbacenpais,
			String codeanpais, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set<Sguf> sgufs) {
		this.codpais = codpais;
		this.nomepais = nomepais;
		this.sigla3cpais = sigla3cpais;
		this.ddipais = ddipais;
		this.sigla2cpais = sigla2cpais;
		this.codbacenpais = codbacenpais;
		this.codeanpais = codeanpais;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgufs = sgufs;
	}

	@Id
	@Column(name = "CODPAIS", unique = true, nullable = false)
	public short getCodpais() {
		return this.codpais;
	}

	public void setCodpais(short codpais) {
		this.codpais = codpais;
	}

	@Column(name = "NOMEPAIS", nullable = false, length = 50)
	public String getNomepais() {
		return this.nomepais;
	}

	public void setNomepais(String nomepais) {
		this.nomepais = nomepais;
	}

	@Column(name = "SIGLA3CPAIS", nullable = false, length = 3)
	public String getSigla3cpais() {
		return this.sigla3cpais;
	}

	public void setSigla3cpais(String sigla3cpais) {
		this.sigla3cpais = sigla3cpais;
	}

	@Column(name = "DDIPAIS")
	public Short getDdipais() {
		return this.ddipais;
	}

	public void setDdipais(Short ddipais) {
		this.ddipais = ddipais;
	}

	@Column(name = "SIGLA2CPAIS", nullable = false, length = 2)
	public String getSigla2cpais() {
		return this.sigla2cpais;
	}

	public void setSigla2cpais(String sigla2cpais) {
		this.sigla2cpais = sigla2cpais;
	}

	@Column(name = "CODBACENPAIS")
	public Integer getCodbacenpais() {
		return this.codbacenpais;
	}

	public void setCodbacenpais(Integer codbacenpais) {
		this.codbacenpais = codbacenpais;
	}

	@Column(name = "CODEANPAIS", length = 3)
	public String getCodeanpais() {
		return this.codeanpais;
	}

	public void setCodeanpais(String codeanpais) {
		this.codeanpais = codeanpais;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgpais")
	public Set<Sguf> getSgufs() {
		return this.sgufs;
	}

	public void setSgufs(Set<Sguf> sgufs) {
		this.sgufs = sgufs;
	}

}