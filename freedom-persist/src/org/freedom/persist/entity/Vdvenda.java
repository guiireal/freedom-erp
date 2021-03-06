package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vdvenda generated by hbm2java
 */
@Entity
@Table(name = "VDVENDA")
public class Vdvenda implements java.io.Serializable {

	private VdvendaId id;
	private Ppop ppop;
	private Pvcaixa pvcaixa;
	private Fnbanco fnbanco;
	private Eqrecmerc eqrecmerc;
	private Sgfilial sgfilial;
	private Fnconta fnconta;
	private Fntipocob fntipocob;
	private Vdcliente vdcliente;
	private Fnplanopag fnplanopag;
	private Lfserie lfserie;
	private Eqtipomov eqtipomov;
	private Vdclcomis vdclcomis;
	private Vdvendedor vdvendedor;
	private Fncartcob fncartcob;
	private String subtipovenda;
	private int docvenda;
	private Date dtsaidavenda;
	private Date dtemitvenda;
	private Date dtcompvenda;
	private BigDecimal vlrprodvenda;
	private BigDecimal percdescvenda;
	private BigDecimal vlrdescvenda;
	private BigDecimal vlrdescitvenda;
	private BigDecimal vlrvenda;
	private BigDecimal vlrbaseicmsvenda;
	private BigDecimal vlricmsvenda;
	private Character calcicmsvenda;
	private Character impicmsvenda;
	private BigDecimal vlrisentasvenda;
	private BigDecimal vlroutrasvenda;
	private BigDecimal vlrbaseipivenda;
	private BigDecimal vlrliqvenda;
	private BigDecimal perccomisvenda;
	private BigDecimal vlrcomisvenda;
	private String statusvenda;
	private BigDecimal vlrfretevenda;
	private BigDecimal vlradicvenda;
	private BigDecimal vlripivenda;
	private Character calcipivenda;
	private Character impipivenda;
	private String obsvenda;
	private BigDecimal vlrbaseissvenda;
	private BigDecimal vlrissvenda;
	private Character calcissvenda;
	private Character impiissvenda;
	private String impnotavenda;
	private Character flag;
	private Character codclascomis;
	private BigDecimal vlrpisvenda;
	private Character calcpisvenda;
	private Character imppisvenda;
	private BigDecimal vlrcofinsvenda;
	private Character calccofinsvenda;
	private Character impcofinsvenda;
	private BigDecimal vlrirvenda;
	private Character calcirvenda;
	private Character impirvenda;
	private BigDecimal vlrcsocialvenda;
	private Character calccsocialvenda;
	private Character impcsocialvenda;
	private BigDecimal percmcomisvenda;
	private String pedclivenda;
	private BigDecimal vlricmsstvenda;
	private BigDecimal vlrbaseicmsstvenda;
	private Character emmanut;
	private char bloqvenda;
	private BigDecimal vlricmssimples;
	private BigDecimal percicmssimples;
	private BigDecimal vlrbasepisvenda;
	private BigDecimal vlrbasecofinsvenda;
	private BigDecimal vlrbasecomis;
	private String chavenfevenda;
	private String obsrec;
	private String infcompl;
	private String sitdoc;
	private String obsnfe;
	private Character descipivenda;
	private char localserv;
	private char nroatualizado;
	private Long cnf;
	private char sitcomplvenda;
	private String motivocancvenda;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vditromaneios = new HashSet(0);
	private Vdfretevd vdfretevd;
	private Set lffretevendas = new HashSet(0);
	private Set vdvendacomises = new HashSet(0);
	private Set vdauxvendas = new HashSet(0);
	private Vdvendaentrega vdvendaentrega;
	private Set vditvendas = new HashSet(0);
	private Set vdcomissaos = new HashSet(0);
	private Set ppitops = new HashSet(0);
	private Set fnrecebers = new HashSet(0);
	private Set fnlibcreds = new HashSet(0);
	private Set vdtefs = new HashSet(0);

	public Vdvenda() {
	}

	public Vdvenda(VdvendaId id, Sgfilial sgfilial, Vdcliente vdcliente,
			Fnplanopag fnplanopag, Lfserie lfserie, Eqtipomov eqtipomov,
			String subtipovenda, int docvenda, Date dtsaidavenda,
			Date dtemitvenda, Date dtcompvenda, String statusvenda,
			char bloqvenda, char localserv, char nroatualizado,
			char sitcomplvenda, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.vdcliente = vdcliente;
		this.fnplanopag = fnplanopag;
		this.lfserie = lfserie;
		this.eqtipomov = eqtipomov;
		this.subtipovenda = subtipovenda;
		this.docvenda = docvenda;
		this.dtsaidavenda = dtsaidavenda;
		this.dtemitvenda = dtemitvenda;
		this.dtcompvenda = dtcompvenda;
		this.statusvenda = statusvenda;
		this.bloqvenda = bloqvenda;
		this.localserv = localserv;
		this.nroatualizado = nroatualizado;
		this.sitcomplvenda = sitcomplvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdvenda(VdvendaId id, Ppop ppop, Pvcaixa pvcaixa, Fnbanco fnbanco,
			Eqrecmerc eqrecmerc, Sgfilial sgfilial, Fnconta fnconta,
			Fntipocob fntipocob, Vdcliente vdcliente, Fnplanopag fnplanopag,
			Lfserie lfserie, Eqtipomov eqtipomov, Vdclcomis vdclcomis,
			Vdvendedor vdvendedor, Fncartcob fncartcob, String subtipovenda,
			int docvenda, Date dtsaidavenda, Date dtemitvenda,
			Date dtcompvenda, BigDecimal vlrprodvenda,
			BigDecimal percdescvenda, BigDecimal vlrdescvenda,
			BigDecimal vlrdescitvenda, BigDecimal vlrvenda,
			BigDecimal vlrbaseicmsvenda, BigDecimal vlricmsvenda,
			Character calcicmsvenda, Character impicmsvenda,
			BigDecimal vlrisentasvenda, BigDecimal vlroutrasvenda,
			BigDecimal vlrbaseipivenda, BigDecimal vlrliqvenda,
			BigDecimal perccomisvenda, BigDecimal vlrcomisvenda,
			String statusvenda, BigDecimal vlrfretevenda,
			BigDecimal vlradicvenda, BigDecimal vlripivenda,
			Character calcipivenda, Character impipivenda, String obsvenda,
			BigDecimal vlrbaseissvenda, BigDecimal vlrissvenda,
			Character calcissvenda, Character impiissvenda,
			String impnotavenda, Character flag, Character codclascomis,
			BigDecimal vlrpisvenda, Character calcpisvenda,
			Character imppisvenda, BigDecimal vlrcofinsvenda,
			Character calccofinsvenda, Character impcofinsvenda,
			BigDecimal vlrirvenda, Character calcirvenda, Character impirvenda,
			BigDecimal vlrcsocialvenda, Character calccsocialvenda,
			Character impcsocialvenda, BigDecimal percmcomisvenda,
			String pedclivenda, BigDecimal vlricmsstvenda,
			BigDecimal vlrbaseicmsstvenda, Character emmanut, char bloqvenda,
			BigDecimal vlricmssimples, BigDecimal percicmssimples,
			BigDecimal vlrbasepisvenda, BigDecimal vlrbasecofinsvenda,
			BigDecimal vlrbasecomis, String chavenfevenda, String obsrec,
			String infcompl, String sitdoc, String obsnfe,
			Character descipivenda, char localserv, char nroatualizado,
			Long cnf, char sitcomplvenda, String motivocancvenda, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set vditromaneios, Vdfretevd vdfretevd, Set lffretevendas,
			Set vdvendacomises, Set vdauxvendas, Vdvendaentrega vdvendaentrega,
			Set vditvendas, Set vdcomissaos, Set ppitops, Set fnrecebers,
			Set fnlibcreds, Set vdtefs) {
		this.id = id;
		this.ppop = ppop;
		this.pvcaixa = pvcaixa;
		this.fnbanco = fnbanco;
		this.eqrecmerc = eqrecmerc;
		this.sgfilial = sgfilial;
		this.fnconta = fnconta;
		this.fntipocob = fntipocob;
		this.vdcliente = vdcliente;
		this.fnplanopag = fnplanopag;
		this.lfserie = lfserie;
		this.eqtipomov = eqtipomov;
		this.vdclcomis = vdclcomis;
		this.vdvendedor = vdvendedor;
		this.fncartcob = fncartcob;
		this.subtipovenda = subtipovenda;
		this.docvenda = docvenda;
		this.dtsaidavenda = dtsaidavenda;
		this.dtemitvenda = dtemitvenda;
		this.dtcompvenda = dtcompvenda;
		this.vlrprodvenda = vlrprodvenda;
		this.percdescvenda = percdescvenda;
		this.vlrdescvenda = vlrdescvenda;
		this.vlrdescitvenda = vlrdescitvenda;
		this.vlrvenda = vlrvenda;
		this.vlrbaseicmsvenda = vlrbaseicmsvenda;
		this.vlricmsvenda = vlricmsvenda;
		this.calcicmsvenda = calcicmsvenda;
		this.impicmsvenda = impicmsvenda;
		this.vlrisentasvenda = vlrisentasvenda;
		this.vlroutrasvenda = vlroutrasvenda;
		this.vlrbaseipivenda = vlrbaseipivenda;
		this.vlrliqvenda = vlrliqvenda;
		this.perccomisvenda = perccomisvenda;
		this.vlrcomisvenda = vlrcomisvenda;
		this.statusvenda = statusvenda;
		this.vlrfretevenda = vlrfretevenda;
		this.vlradicvenda = vlradicvenda;
		this.vlripivenda = vlripivenda;
		this.calcipivenda = calcipivenda;
		this.impipivenda = impipivenda;
		this.obsvenda = obsvenda;
		this.vlrbaseissvenda = vlrbaseissvenda;
		this.vlrissvenda = vlrissvenda;
		this.calcissvenda = calcissvenda;
		this.impiissvenda = impiissvenda;
		this.impnotavenda = impnotavenda;
		this.flag = flag;
		this.codclascomis = codclascomis;
		this.vlrpisvenda = vlrpisvenda;
		this.calcpisvenda = calcpisvenda;
		this.imppisvenda = imppisvenda;
		this.vlrcofinsvenda = vlrcofinsvenda;
		this.calccofinsvenda = calccofinsvenda;
		this.impcofinsvenda = impcofinsvenda;
		this.vlrirvenda = vlrirvenda;
		this.calcirvenda = calcirvenda;
		this.impirvenda = impirvenda;
		this.vlrcsocialvenda = vlrcsocialvenda;
		this.calccsocialvenda = calccsocialvenda;
		this.impcsocialvenda = impcsocialvenda;
		this.percmcomisvenda = percmcomisvenda;
		this.pedclivenda = pedclivenda;
		this.vlricmsstvenda = vlricmsstvenda;
		this.vlrbaseicmsstvenda = vlrbaseicmsstvenda;
		this.emmanut = emmanut;
		this.bloqvenda = bloqvenda;
		this.vlricmssimples = vlricmssimples;
		this.percicmssimples = percicmssimples;
		this.vlrbasepisvenda = vlrbasepisvenda;
		this.vlrbasecofinsvenda = vlrbasecofinsvenda;
		this.vlrbasecomis = vlrbasecomis;
		this.chavenfevenda = chavenfevenda;
		this.obsrec = obsrec;
		this.infcompl = infcompl;
		this.sitdoc = sitdoc;
		this.obsnfe = obsnfe;
		this.descipivenda = descipivenda;
		this.localserv = localserv;
		this.nroatualizado = nroatualizado;
		this.cnf = cnf;
		this.sitcomplvenda = sitcomplvenda;
		this.motivocancvenda = motivocancvenda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vditromaneios = vditromaneios;
		this.vdfretevd = vdfretevd;
		this.lffretevendas = lffretevendas;
		this.vdvendacomises = vdvendacomises;
		this.vdauxvendas = vdauxvendas;
		this.vdvendaentrega = vdvendaentrega;
		this.vditvendas = vditvendas;
		this.vdcomissaos = vdcomissaos;
		this.ppitops = ppitops;
		this.fnrecebers = fnrecebers;
		this.fnlibcreds = fnlibcreds;
		this.vdtefs = vdtefs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codvenda", column = @Column(name = "CODVENDA", nullable = false)),
			@AttributeOverride(name = "tipovenda", column = @Column(name = "TIPOVENDA", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdvendaId getId() {
		return this.id;
	}

	public void setId(VdvendaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODOP", referencedColumnName = "CODOP"),
			@JoinColumn(name = "SEQOP", referencedColumnName = "SEQOP"),
			@JoinColumn(name = "CODFILIALOP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPOP", referencedColumnName = "CODEMP") })
	public Ppop getPpop() {
		return this.ppop;
	}

	public void setPpop(Ppop ppop) {
		this.ppop = ppop;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCAIXA", referencedColumnName = "CODCAIXA"),
			@JoinColumn(name = "CODFILIALCX", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCX", referencedColumnName = "CODEMP") })
	public Pvcaixa getPvcaixa() {
		return this.pvcaixa;
	}

	public void setPvcaixa(Pvcaixa pvcaixa) {
		this.pvcaixa = pvcaixa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODBANCO", referencedColumnName = "CODBANCO"),
			@JoinColumn(name = "CODFILIALBO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPBO", referencedColumnName = "CODEMP") })
	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "TICKET", referencedColumnName = "TICKET"),
			@JoinColumn(name = "CODFILIALRM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPRM", referencedColumnName = "CODEMP") })
	public Eqrecmerc getEqrecmerc() {
		return this.eqrecmerc;
	}

	public void setEqrecmerc(Eqrecmerc eqrecmerc) {
		this.eqrecmerc = eqrecmerc;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NUMCONTA", referencedColumnName = "NUMCONTA"),
			@JoinColumn(name = "CODFILIALCA", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCA", referencedColumnName = "CODEMP") })
	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOCOB", referencedColumnName = "CODTIPOCOB"),
			@JoinColumn(name = "CODFILIALTC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTC", referencedColumnName = "CODEMP") })
	public Fntipocob getFntipocob() {
		return this.fntipocob;
	}

	public void setFntipocob(Fntipocob fntipocob) {
		this.fntipocob = fntipocob;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI", nullable = false),
			@JoinColumn(name = "CODFILIALCL", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPCL", referencedColumnName = "CODEMP", nullable = false) })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLANOPAG", referencedColumnName = "CODPLANOPAG", nullable = false),
			@JoinColumn(name = "CODFILIALPG", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPG", referencedColumnName = "CODEMP", nullable = false) })
	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SERIE", referencedColumnName = "SERIE", nullable = false),
			@JoinColumn(name = "CODFILIALSE", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPSE", referencedColumnName = "CODEMP", nullable = false) })
	public Lfserie getLfserie() {
		return this.lfserie;
	}

	public void setLfserie(Lfserie lfserie) {
		this.lfserie = lfserie;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOV", referencedColumnName = "CODTIPOMOV", nullable = false),
			@JoinColumn(name = "CODFILIALTM", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTM", referencedColumnName = "CODEMP", nullable = false) })
	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLCOMIS", referencedColumnName = "CODCLCOMIS"),
			@JoinColumn(name = "CODFILIALCM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCM", referencedColumnName = "CODEMP") })
	public Vdclcomis getVdclcomis() {
		return this.vdclcomis;
	}

	public void setVdclcomis(Vdclcomis vdclcomis) {
		this.vdclcomis = vdclcomis;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVEND", referencedColumnName = "CODVEND"),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP") })
	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCARTCOB", referencedColumnName = "CODCARTCOB", insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALCB", referencedColumnName = "CODFILIAL", insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPCB", referencedColumnName = "CODEMP", insertable = false, updatable = false),
			@JoinColumn(name = "CODBANCO", referencedColumnName = "CODBANCO", insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALBO", referencedColumnName = "CODFILIALBO", insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPBO", referencedColumnName = "CODEMPBO", insertable = false, updatable = false) })
	public Fncartcob getFncartcob() {
		return this.fncartcob;
	}

	public void setFncartcob(Fncartcob fncartcob) {
		this.fncartcob = fncartcob;
	}

	@Column(name = "SUBTIPOVENDA", nullable = false, length = 2)
	public String getSubtipovenda() {
		return this.subtipovenda;
	}

	public void setSubtipovenda(String subtipovenda) {
		this.subtipovenda = subtipovenda;
	}

	@Column(name = "DOCVENDA", nullable = false)
	public int getDocvenda() {
		return this.docvenda;
	}

	public void setDocvenda(int docvenda) {
		this.docvenda = docvenda;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTSAIDAVENDA", nullable = false, length = 10)
	public Date getDtsaidavenda() {
		return this.dtsaidavenda;
	}

	public void setDtsaidavenda(Date dtsaidavenda) {
		this.dtsaidavenda = dtsaidavenda;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTEMITVENDA", nullable = false, length = 10)
	public Date getDtemitvenda() {
		return this.dtemitvenda;
	}

	public void setDtemitvenda(Date dtemitvenda) {
		this.dtemitvenda = dtemitvenda;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTCOMPVENDA", nullable = false, length = 10)
	public Date getDtcompvenda() {
		return this.dtcompvenda;
	}

	public void setDtcompvenda(Date dtcompvenda) {
		this.dtcompvenda = dtcompvenda;
	}

	@Column(name = "VLRPRODVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrprodvenda() {
		return this.vlrprodvenda;
	}

	public void setVlrprodvenda(BigDecimal vlrprodvenda) {
		this.vlrprodvenda = vlrprodvenda;
	}

	@Column(name = "PERCDESCVENDA", precision = 15, scale = 5)
	public BigDecimal getPercdescvenda() {
		return this.percdescvenda;
	}

	public void setPercdescvenda(BigDecimal percdescvenda) {
		this.percdescvenda = percdescvenda;
	}

	@Column(name = "VLRDESCVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrdescvenda() {
		return this.vlrdescvenda;
	}

	public void setVlrdescvenda(BigDecimal vlrdescvenda) {
		this.vlrdescvenda = vlrdescvenda;
	}

	@Column(name = "VLRDESCITVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrdescitvenda() {
		return this.vlrdescitvenda;
	}

	public void setVlrdescitvenda(BigDecimal vlrdescitvenda) {
		this.vlrdescitvenda = vlrdescitvenda;
	}

	@Column(name = "VLRVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrvenda() {
		return this.vlrvenda;
	}

	public void setVlrvenda(BigDecimal vlrvenda) {
		this.vlrvenda = vlrvenda;
	}

	@Column(name = "VLRBASEICMSVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseicmsvenda() {
		return this.vlrbaseicmsvenda;
	}

	public void setVlrbaseicmsvenda(BigDecimal vlrbaseicmsvenda) {
		this.vlrbaseicmsvenda = vlrbaseicmsvenda;
	}

	@Column(name = "VLRICMSVENDA", precision = 15, scale = 5)
	public BigDecimal getVlricmsvenda() {
		return this.vlricmsvenda;
	}

	public void setVlricmsvenda(BigDecimal vlricmsvenda) {
		this.vlricmsvenda = vlricmsvenda;
	}

	@Column(name = "CALCICMSVENDA", length = 1)
	public Character getCalcicmsvenda() {
		return this.calcicmsvenda;
	}

	public void setCalcicmsvenda(Character calcicmsvenda) {
		this.calcicmsvenda = calcicmsvenda;
	}

	@Column(name = "IMPICMSVENDA", length = 1)
	public Character getImpicmsvenda() {
		return this.impicmsvenda;
	}

	public void setImpicmsvenda(Character impicmsvenda) {
		this.impicmsvenda = impicmsvenda;
	}

	@Column(name = "VLRISENTASVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrisentasvenda() {
		return this.vlrisentasvenda;
	}

	public void setVlrisentasvenda(BigDecimal vlrisentasvenda) {
		this.vlrisentasvenda = vlrisentasvenda;
	}

	@Column(name = "VLROUTRASVENDA", precision = 15, scale = 5)
	public BigDecimal getVlroutrasvenda() {
		return this.vlroutrasvenda;
	}

	public void setVlroutrasvenda(BigDecimal vlroutrasvenda) {
		this.vlroutrasvenda = vlroutrasvenda;
	}

	@Column(name = "VLRBASEIPIVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseipivenda() {
		return this.vlrbaseipivenda;
	}

	public void setVlrbaseipivenda(BigDecimal vlrbaseipivenda) {
		this.vlrbaseipivenda = vlrbaseipivenda;
	}

	@Column(name = "VLRLIQVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrliqvenda() {
		return this.vlrliqvenda;
	}

	public void setVlrliqvenda(BigDecimal vlrliqvenda) {
		this.vlrliqvenda = vlrliqvenda;
	}

	@Column(name = "PERCCOMISVENDA", precision = 9)
	public BigDecimal getPerccomisvenda() {
		return this.perccomisvenda;
	}

	public void setPerccomisvenda(BigDecimal perccomisvenda) {
		this.perccomisvenda = perccomisvenda;
	}

	@Column(name = "VLRCOMISVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrcomisvenda() {
		return this.vlrcomisvenda;
	}

	public void setVlrcomisvenda(BigDecimal vlrcomisvenda) {
		this.vlrcomisvenda = vlrcomisvenda;
	}

	@Column(name = "STATUSVENDA", nullable = false, length = 2)
	public String getStatusvenda() {
		return this.statusvenda;
	}

	public void setStatusvenda(String statusvenda) {
		this.statusvenda = statusvenda;
	}

	@Column(name = "VLRFRETEVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrfretevenda() {
		return this.vlrfretevenda;
	}

	public void setVlrfretevenda(BigDecimal vlrfretevenda) {
		this.vlrfretevenda = vlrfretevenda;
	}

	@Column(name = "VLRADICVENDA", precision = 15, scale = 5)
	public BigDecimal getVlradicvenda() {
		return this.vlradicvenda;
	}

	public void setVlradicvenda(BigDecimal vlradicvenda) {
		this.vlradicvenda = vlradicvenda;
	}

	@Column(name = "VLRIPIVENDA", precision = 15, scale = 5)
	public BigDecimal getVlripivenda() {
		return this.vlripivenda;
	}

	public void setVlripivenda(BigDecimal vlripivenda) {
		this.vlripivenda = vlripivenda;
	}

	@Column(name = "CALCIPIVENDA", length = 1)
	public Character getCalcipivenda() {
		return this.calcipivenda;
	}

	public void setCalcipivenda(Character calcipivenda) {
		this.calcipivenda = calcipivenda;
	}

	@Column(name = "IMPIPIVENDA", length = 1)
	public Character getImpipivenda() {
		return this.impipivenda;
	}

	public void setImpipivenda(Character impipivenda) {
		this.impipivenda = impipivenda;
	}

	@Column(name = "OBSVENDA", length = 10000)
	public String getObsvenda() {
		return this.obsvenda;
	}

	public void setObsvenda(String obsvenda) {
		this.obsvenda = obsvenda;
	}

	@Column(name = "VLRBASEISSVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseissvenda() {
		return this.vlrbaseissvenda;
	}

	public void setVlrbaseissvenda(BigDecimal vlrbaseissvenda) {
		this.vlrbaseissvenda = vlrbaseissvenda;
	}

	@Column(name = "VLRISSVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrissvenda() {
		return this.vlrissvenda;
	}

	public void setVlrissvenda(BigDecimal vlrissvenda) {
		this.vlrissvenda = vlrissvenda;
	}

	@Column(name = "CALCISSVENDA", length = 1)
	public Character getCalcissvenda() {
		return this.calcissvenda;
	}

	public void setCalcissvenda(Character calcissvenda) {
		this.calcissvenda = calcissvenda;
	}

	@Column(name = "IMPIISSVENDA", length = 1)
	public Character getImpiissvenda() {
		return this.impiissvenda;
	}

	public void setImpiissvenda(Character impiissvenda) {
		this.impiissvenda = impiissvenda;
	}

	@Column(name = "IMPNOTAVENDA", length = 10000)
	public String getImpnotavenda() {
		return this.impnotavenda;
	}

	public void setImpnotavenda(String impnotavenda) {
		this.impnotavenda = impnotavenda;
	}

	@Column(name = "FLAG", length = 1)
	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	@Column(name = "CODCLASCOMIS", length = 1)
	public Character getCodclascomis() {
		return this.codclascomis;
	}

	public void setCodclascomis(Character codclascomis) {
		this.codclascomis = codclascomis;
	}

	@Column(name = "VLRPISVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrpisvenda() {
		return this.vlrpisvenda;
	}

	public void setVlrpisvenda(BigDecimal vlrpisvenda) {
		this.vlrpisvenda = vlrpisvenda;
	}

	@Column(name = "CALCPISVENDA", length = 1)
	public Character getCalcpisvenda() {
		return this.calcpisvenda;
	}

	public void setCalcpisvenda(Character calcpisvenda) {
		this.calcpisvenda = calcpisvenda;
	}

	@Column(name = "IMPPISVENDA", length = 1)
	public Character getImppisvenda() {
		return this.imppisvenda;
	}

	public void setImppisvenda(Character imppisvenda) {
		this.imppisvenda = imppisvenda;
	}

	@Column(name = "VLRCOFINSVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrcofinsvenda() {
		return this.vlrcofinsvenda;
	}

	public void setVlrcofinsvenda(BigDecimal vlrcofinsvenda) {
		this.vlrcofinsvenda = vlrcofinsvenda;
	}

	@Column(name = "CALCCOFINSVENDA", length = 1)
	public Character getCalccofinsvenda() {
		return this.calccofinsvenda;
	}

	public void setCalccofinsvenda(Character calccofinsvenda) {
		this.calccofinsvenda = calccofinsvenda;
	}

	@Column(name = "IMPCOFINSVENDA", length = 1)
	public Character getImpcofinsvenda() {
		return this.impcofinsvenda;
	}

	public void setImpcofinsvenda(Character impcofinsvenda) {
		this.impcofinsvenda = impcofinsvenda;
	}

	@Column(name = "VLRIRVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrirvenda() {
		return this.vlrirvenda;
	}

	public void setVlrirvenda(BigDecimal vlrirvenda) {
		this.vlrirvenda = vlrirvenda;
	}

	@Column(name = "CALCIRVENDA", length = 1)
	public Character getCalcirvenda() {
		return this.calcirvenda;
	}

	public void setCalcirvenda(Character calcirvenda) {
		this.calcirvenda = calcirvenda;
	}

	@Column(name = "IMPIRVENDA", length = 1)
	public Character getImpirvenda() {
		return this.impirvenda;
	}

	public void setImpirvenda(Character impirvenda) {
		this.impirvenda = impirvenda;
	}

	@Column(name = "VLRCSOCIALVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrcsocialvenda() {
		return this.vlrcsocialvenda;
	}

	public void setVlrcsocialvenda(BigDecimal vlrcsocialvenda) {
		this.vlrcsocialvenda = vlrcsocialvenda;
	}

	@Column(name = "CALCCSOCIALVENDA", length = 1)
	public Character getCalccsocialvenda() {
		return this.calccsocialvenda;
	}

	public void setCalccsocialvenda(Character calccsocialvenda) {
		this.calccsocialvenda = calccsocialvenda;
	}

	@Column(name = "IMPCSOCIALVENDA", length = 1)
	public Character getImpcsocialvenda() {
		return this.impcsocialvenda;
	}

	public void setImpcsocialvenda(Character impcsocialvenda) {
		this.impcsocialvenda = impcsocialvenda;
	}

	@Column(name = "PERCMCOMISVENDA", precision = 7, scale = 3)
	public BigDecimal getPercmcomisvenda() {
		return this.percmcomisvenda;
	}

	public void setPercmcomisvenda(BigDecimal percmcomisvenda) {
		this.percmcomisvenda = percmcomisvenda;
	}

	@Column(name = "PEDCLIVENDA", length = 10)
	public String getPedclivenda() {
		return this.pedclivenda;
	}

	public void setPedclivenda(String pedclivenda) {
		this.pedclivenda = pedclivenda;
	}

	@Column(name = "VLRICMSSTVENDA", precision = 15, scale = 5)
	public BigDecimal getVlricmsstvenda() {
		return this.vlricmsstvenda;
	}

	public void setVlricmsstvenda(BigDecimal vlricmsstvenda) {
		this.vlricmsstvenda = vlricmsstvenda;
	}

	@Column(name = "VLRBASEICMSSTVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseicmsstvenda() {
		return this.vlrbaseicmsstvenda;
	}

	public void setVlrbaseicmsstvenda(BigDecimal vlrbaseicmsstvenda) {
		this.vlrbaseicmsstvenda = vlrbaseicmsstvenda;
	}

	@Column(name = "EMMANUT", length = 1)
	public Character getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(Character emmanut) {
		this.emmanut = emmanut;
	}

	@Column(name = "BLOQVENDA", nullable = false, length = 1)
	public char getBloqvenda() {
		return this.bloqvenda;
	}

	public void setBloqvenda(char bloqvenda) {
		this.bloqvenda = bloqvenda;
	}

	@Column(name = "VLRICMSSIMPLES", precision = 15, scale = 5)
	public BigDecimal getVlricmssimples() {
		return this.vlricmssimples;
	}

	public void setVlricmssimples(BigDecimal vlricmssimples) {
		this.vlricmssimples = vlricmssimples;
	}

	@Column(name = "PERCICMSSIMPLES", precision = 5)
	public BigDecimal getPercicmssimples() {
		return this.percicmssimples;
	}

	public void setPercicmssimples(BigDecimal percicmssimples) {
		this.percicmssimples = percicmssimples;
	}

	@Column(name = "VLRBASEPISVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbasepisvenda() {
		return this.vlrbasepisvenda;
	}

	public void setVlrbasepisvenda(BigDecimal vlrbasepisvenda) {
		this.vlrbasepisvenda = vlrbasepisvenda;
	}

	@Column(name = "VLRBASECOFINSVENDA", precision = 15, scale = 5)
	public BigDecimal getVlrbasecofinsvenda() {
		return this.vlrbasecofinsvenda;
	}

	public void setVlrbasecofinsvenda(BigDecimal vlrbasecofinsvenda) {
		this.vlrbasecofinsvenda = vlrbasecofinsvenda;
	}

	@Column(name = "VLRBASECOMIS", precision = 15, scale = 5)
	public BigDecimal getVlrbasecomis() {
		return this.vlrbasecomis;
	}

	public void setVlrbasecomis(BigDecimal vlrbasecomis) {
		this.vlrbasecomis = vlrbasecomis;
	}

	@Column(name = "CHAVENFEVENDA", length = 44)
	public String getChavenfevenda() {
		return this.chavenfevenda;
	}

	public void setChavenfevenda(String chavenfevenda) {
		this.chavenfevenda = chavenfevenda;
	}

	@Column(name = "OBSREC", length = 250)
	public String getObsrec() {
		return this.obsrec;
	}

	public void setObsrec(String obsrec) {
		this.obsrec = obsrec;
	}

	@Column(name = "INFCOMPL", length = 10000)
	public String getInfcompl() {
		return this.infcompl;
	}

	public void setInfcompl(String infcompl) {
		this.infcompl = infcompl;
	}

	@Column(name = "SITDOC", length = 2)
	public String getSitdoc() {
		return this.sitdoc;
	}

	public void setSitdoc(String sitdoc) {
		this.sitdoc = sitdoc;
	}

	@Column(name = "OBSNFE", length = 10000)
	public String getObsnfe() {
		return this.obsnfe;
	}

	public void setObsnfe(String obsnfe) {
		this.obsnfe = obsnfe;
	}

	@Column(name = "DESCIPIVENDA", length = 1)
	public Character getDescipivenda() {
		return this.descipivenda;
	}

	public void setDescipivenda(Character descipivenda) {
		this.descipivenda = descipivenda;
	}

	@Column(name = "LOCALSERV", nullable = false, length = 1)
	public char getLocalserv() {
		return this.localserv;
	}

	public void setLocalserv(char localserv) {
		this.localserv = localserv;
	}

	@Column(name = "NROATUALIZADO", nullable = false, length = 1)
	public char getNroatualizado() {
		return this.nroatualizado;
	}

	public void setNroatualizado(char nroatualizado) {
		this.nroatualizado = nroatualizado;
	}

	@Column(name = "CNF")
	public Long getCnf() {
		return this.cnf;
	}

	public void setCnf(Long cnf) {
		this.cnf = cnf;
	}

	@Column(name = "SITCOMPLVENDA", nullable = false, length = 1)
	public char getSitcomplvenda() {
		return this.sitcomplvenda;
	}

	public void setSitcomplvenda(char sitcomplvenda) {
		this.sitcomplvenda = sitcomplvenda;
	}

	@Column(name = "MOTIVOCANCVENDA")
	public String getMotivocancvenda() {
		return this.motivocancvenda;
	}

	public void setMotivocancvenda(String motivocancvenda) {
		this.motivocancvenda = motivocancvenda;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Set getVditromaneios() {
		return this.vditromaneios;
	}

	public void setVditromaneios(Set vditromaneios) {
		this.vditromaneios = vditromaneios;
	}
*/
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Vdfretevd getVdfretevd() {
		return this.vdfretevd;
	}

	public void setVdfretevd(Vdfretevd vdfretevd) {
		this.vdfretevd = vdfretevd;
	}

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Set getLffretevendas() {
		return this.lffretevendas;
	}

	public void setLffretevendas(Set lffretevendas) {
		this.lffretevendas = lffretevendas;
	}
*/
/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Set getVdvendacomises() {
		return this.vdvendacomises;
	}

	public void setVdvendacomises(Set vdvendacomises) {
		this.vdvendacomises = vdvendacomises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Set getVdauxvendas() {
		return this.vdauxvendas;
	}

	public void setVdauxvendas(Set vdauxvendas) {
		this.vdauxvendas = vdauxvendas;
	}
*/
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Vdvendaentrega getVdvendaentrega() {
		return this.vdvendaentrega;
	}

	public void setVdvendaentrega(Vdvendaentrega vdvendaentrega) {
		this.vdvendaentrega = vdvendaentrega;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Set getVditvendas() {
		return this.vditvendas;
	}

	public void setVditvendas(Set vditvendas) {
		this.vditvendas = vditvendas;
	}
*/
	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Set getVdcomissaos() {
		return this.vdcomissaos;
	}

	public void setVdcomissaos(Set vdcomissaos) {
		this.vdcomissaos = vdcomissaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Set getPpitops() {
		return this.ppitops;
	}

	public void setPpitops(Set ppitops) {
		this.ppitops = ppitops;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Set getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Set getFnlibcreds() {
		return this.fnlibcreds;
	}

	public void setFnlibcreds(Set fnlibcreds) {
		this.fnlibcreds = fnlibcreds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdvenda")
	public Set getVdtefs() {
		return this.vdtefs;
	}

	public void setVdtefs(Set vdtefs) {
		this.vdtefs = vdtefs;
	}
*/
}
