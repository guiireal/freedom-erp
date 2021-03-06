package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Rhcodgps generated by hbm2java
 */
@Entity
@Table(name = "RHCODGPS")
public class Rhcodgps implements java.io.Serializable {

	private String codgps;
	private String descgps;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdtransps = new HashSet(0);

	public Rhcodgps() {
	}

	public Rhcodgps(String codgps, Date dtins, Date hins, String idusuins) {
		this.codgps = codgps;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhcodgps(String codgps, String descgps, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdtransps) {
		this.codgps = codgps;
		this.descgps = descgps;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdtransps = vdtransps;
	}

	@Id
	@Column(name = "CODGPS", unique = true, nullable = false, length = 4)
	public String getCodgps() {
		return this.codgps;
	}

	public void setCodgps(String codgps) {
		this.codgps = codgps;
	}

	@Column(name = "DESCGPS", length = 80)
	public String getDescgps() {
		return this.descgps;
	}

	public void setDescgps(String descgps) {
		this.descgps = descgps;
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

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhcodgps")
	public Set getVdtransps() {
		return this.vdtransps;
	}

	public void setVdtransps(Set vdtransps) {
		this.vdtransps = vdtransps;
	}
*/
}
