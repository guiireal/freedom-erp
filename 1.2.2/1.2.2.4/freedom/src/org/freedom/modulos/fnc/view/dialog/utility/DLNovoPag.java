/**
 * @version 14/07/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.std <BR>
 * Classe:
 * @(#)DLNovoPag.java <BR>
 * 
 * Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 * modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 * na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 * Este programa � distribuido na esperan�a que possa ser  util, mas SEM NENHUMA GARANTIA; <BR>
 * sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 * Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 * Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Tela para lan�amento de contas a pagar.
 */

package org.freedom.modulos.fnc.view.dialog.utility;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JScrollPane;

import org.freedom.acao.PostEvent;
import org.freedom.acao.PostListener;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.business.object.Historico;
import org.freedom.library.functions.Funcoes;
import org.freedom.library.persistence.GuardaCampo;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.component.JLabelPad;
import org.freedom.library.swing.component.JPanelPad;
import org.freedom.library.swing.component.JTablePad;
import org.freedom.library.swing.component.JTextFieldFK;
import org.freedom.library.swing.component.JTextFieldPad;
import org.freedom.library.swing.component.Navegador;
import org.freedom.library.swing.dialog.FFDialogo;
import org.freedom.library.swing.frame.Aplicativo;
import org.freedom.modulos.std.view.dialog.utility.DLFechaPag;


public class DLNovoPag extends FFDialogo implements PostListener, MouseListener {

	private static final long serialVersionUID = 1L;

	private JPanelPad pnPag = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private JPanelPad pinCab = new JPanelPad( 580, 170 );

	private JTextFieldPad txtCodFor = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private JTextFieldFK txtCNPJFor = new JTextFieldFK( JTextFieldPad.TP_STRING, 14, 0 );

	private JTextFieldFK txtDescFor = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTextFieldPad txtCodPlanoPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescPlanoPag = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private final JTextFieldPad txtCodTipoCob = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldFK txtDescTipoCob = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );
	
	private JTextFieldPad txtCodBanco = new JTextFieldPad( JTextFieldPad.TP_STRING, 3, 0 );

	private JTextFieldFK txtDescBanco = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private JTextFieldPad txtCodPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtNParcPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtVlrParcItPag = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, 2 );

	private JTextFieldPad txtDtVencItPag = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtVlrParcPag = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, 2 );

	private JTextFieldPad txtDtEmisPag = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtDocPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 10, 0 );

	private JTextFieldPad txtObs = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );
	
	private final JTextFieldPad txtCodTipoCobItPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldFK txtDescTipoCobItPag = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );
	
	private JTextFieldPad txtCodConta = new JTextFieldPad( JTextFieldPad.TP_STRING, 10, 0 );

	private JTextFieldFK txtDescConta = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private JTablePad tabPag = new JTablePad();

	private JScrollPane spnTab = new JScrollPane( tabPag );

	private ListaCampos lcPagar = new ListaCampos( this );

	private final ListaCampos lcTipoCob = new ListaCampos( this, "TC" );
	
	private ListaCampos lcItPagar = new ListaCampos( this );

	private ListaCampos lcFor = new ListaCampos( this, "FR" );

	private ListaCampos lcPlanoPag = new ListaCampos( this, "PG" );

	private ListaCampos lcBanco = new ListaCampos( this, "BO" );

	private Navegador navPagar = new Navegador( false );

	private Navegador navItPagar = new Navegador( false );
	
	private final ListaCampos lcTipoCobItPag = new ListaCampos( this, "TC" );
	
	private ListaCampos lcConta = new ListaCampos( this, "CA" );
	
	private static final String HISTORICO_PADRAO = "PAGAMENTO REF. A COMPRA: <DOCUMENTO>";	
	
	private Map<String, Integer> prefere = null;
	
	private Historico historico = null;
	
	private Component owner = null; 
	
	public DLNovoPag( Component cOrig ) {

		super( cOrig );
		this.owner = cOrig; 
		setTitulo( "Novo t�tulo para pagamento" );
		setAtribos( 600, 450 );

		montaListaCampos();
		montaTela();
		
		lcPagar.addPostListener( this );
		tabPag.addMouseListener( this );
	}

	private void montaListaCampos() {
		
		lcItPagar.setMaster( lcPagar );
		lcPagar.adicDetalhe( lcItPagar );
		lcItPagar.setTabela( tabPag );
		navPagar.setName( "Pagar" );
		lcPagar.setNavegador( navPagar );

		navItPagar.setName( "itpagar" );
		lcItPagar.setNavegador( navItPagar );

		lcFor.add( new GuardaCampo( txtCodFor, "CodFor", "C�d.for.", ListaCampos.DB_PK, false ) );
		lcFor.add( new GuardaCampo( txtDescFor, "RazFor", "Raz�o social do fornecedor", ListaCampos.DB_SI, false ) );
		lcFor.add( new GuardaCampo( txtCNPJFor, "CnpjFor", "CNPJ", ListaCampos.DB_SI, false ) );
		
		lcFor.montaSql( false, "FORNECED", "CP" );
		lcFor.setQueryCommit( false );
		lcFor.setReadOnly( true );
		txtCodFor.setTabelaExterna( lcFor, null );
		txtCodFor.setFK( true );
		txtCodFor.setNomeCampo( "CodFor" );

		lcPlanoPag.add( new GuardaCampo( txtCodPlanoPag, "CodPlanoPag", "C�d.p.pg.", ListaCampos.DB_PK, false ) );
		lcPlanoPag.add( new GuardaCampo( txtDescPlanoPag, "DescPlanoPag", "Descri��o do plano de pagamento", ListaCampos.DB_SI, false ) );
		lcPlanoPag.montaSql( false, "PLANOPAG", "FN" );
		lcPlanoPag.setQueryCommit( false );
		lcPlanoPag.setReadOnly( true );
		txtCodPlanoPag.setTabelaExterna( lcPlanoPag, null );
		txtCodPlanoPag.setFK( true );
		txtCodPlanoPag.setNomeCampo( "CodPlanoPag" );

		lcBanco.add( new GuardaCampo( txtCodBanco, "CodBanco", "C�d.banco", ListaCampos.DB_PK, false ) );
		lcBanco.add( new GuardaCampo( txtDescBanco, "NomeBanco", "Nome do banco", ListaCampos.DB_SI, false ) );
		lcBanco.montaSql( false, "BANCO", "FN" );
		lcBanco.setQueryCommit( false );
		lcBanco.setReadOnly( true );
		txtCodBanco.setTabelaExterna( lcBanco, null );
		txtCodBanco.setFK( true );
		txtCodBanco.setNomeCampo( "CodBanco" );
		
		/**********************
		 *  FNCONTA 		  *
		 **********************/
		lcConta.add( new GuardaCampo( txtCodConta, "NumConta", "N� Conta", ListaCampos.DB_PK, false ) );
		lcConta.add( new GuardaCampo( txtDescConta, "DescConta", "Descri��o da conta", ListaCampos.DB_SI, false ) );
		lcConta.montaSql( false, "CONTA", "FN" );
		lcConta.setQueryCommit( false );		
		lcConta.setReadOnly( true );		
		txtCodConta.setTabelaExterna( lcConta, null );		
		txtCodConta.setFK( true );		
		txtCodConta.setNomeCampo( "NumConta" );
		txtDescConta.setTabelaExterna( lcConta, null );
		txtDescConta.setLabel( "Descri��o da Conta" );		

		/***************
		 *  FNTIPOCOB  *
		 ***************/
		lcTipoCob.add( new GuardaCampo( txtCodTipoCob, "CodTipoCob", "C�d.Tip.Cob", ListaCampos.DB_PK, false ) );
		lcTipoCob.add( new GuardaCampo( txtDescTipoCob, "DescTipoCob", "Descri��o do tipo de cobran�a", ListaCampos.DB_SI, false ) );		
		lcTipoCob.montaSql( false, "TIPOCOB", "FN" );
		lcTipoCob.setQueryCommit( false );
		lcTipoCob.setReadOnly( true );
		txtCodTipoCob.setTabelaExterna( lcTipoCob, null );
		txtCodTipoCob.setFK( true );
		txtCodTipoCob.setNomeCampo( "CodTipoCob" );
		
	}
	
	private void montaTela() {			
		
		lcPagar.add( new GuardaCampo( txtCodPag, "CodPag", "C�d.pag.", ListaCampos.DB_PK, true ) );
		lcPagar.add( new GuardaCampo( txtCodFor, "CodFor", "C�d.for.", ListaCampos.DB_FK, true ) );
		lcPagar.add( new GuardaCampo( txtCodPlanoPag, "CodPlanoPag", "C�d.p.pg.", ListaCampos.DB_FK, true ) );
		lcPagar.add( new GuardaCampo( txtCodBanco, "CodBanco", "C�d.banco", ListaCampos.DB_FK, false ) );
		lcPagar.add( new GuardaCampo( txtCodTipoCob, "CodTipoCob", "C�d.tp.cob.", ListaCampos.DB_FK, false ) );
		lcPagar.add( new GuardaCampo( txtVlrParcPag, "VlrParcPag", "Valor da parc.", ListaCampos.DB_SI, false ) );
		lcPagar.add( new GuardaCampo( txtDtEmisPag, "DataPag", "Dt.emiss�o", ListaCampos.DB_SI, true ) );
		lcPagar.add( new GuardaCampo( txtDocPag, "DocPag", "N.documento", ListaCampos.DB_SI, true ) );
		lcPagar.add( new GuardaCampo( txtObs, "ObsPag", "Obs.", ListaCampos.DB_SI, false ) );		
		lcPagar.add( new GuardaCampo( txtCodConta, "NumConta", "C�d.Conta", ListaCampos.DB_FK, txtDescConta, false ) );
		
		lcPagar.montaSql( true, "PAGAR", "FN" );

		txtNParcPag.setNomeCampo( "NParcPag" );
		lcItPagar.add( new GuardaCampo( txtNParcPag, "NParcPag", "N.parc.", ListaCampos.DB_PK, false ) );
		lcItPagar.add( new GuardaCampo( txtVlrParcItPag, "VlrParcItPag", "Valor tot.", ListaCampos.DB_SI, false ) );
		lcItPagar.add( new GuardaCampo( txtDtVencItPag, "DtVencItPag", "Dt.vencto.", ListaCampos.DB_SI, false ) );
		lcItPagar.montaSql( false, "ITPAGAR", "FN" );
		lcItPagar.setQueryCommit( false );
		txtNParcPag.setListaCampos( lcItPagar );
		txtVlrParcItPag.setListaCampos( lcItPagar );
		txtDtVencItPag.setListaCampos( lcItPagar );	
		
		lcItPagar.montaTab();
//		tabPag.addMouseListener( new HandlerMouseListenerPagamento() );
		
		c.add( pnPag );

		pnPag.add( pinCab, BorderLayout.NORTH );
		pnPag.add( spnTab, BorderLayout.CENTER );

		setPainel( pinCab );
		
		adic( new JLabelPad( "C�d.for." ), 7, 0, 250, 20 );
		adic( txtCodFor, 7, 20, 80, 20 );
		adic( new JLabelPad( "Raz�o social do fornecedor" ), 90, 0, 250, 20 );
		adic( txtDescFor, 90, 20, 197, 20 );
		adic( new JLabelPad( "C�d.p.pag." ), 290, 0, 250, 20 );
		adic( txtCodPlanoPag, 290, 20, 80, 20 );
		adic( new JLabelPad( "Descri��o do plano de pagto." ), 373, 0, 250, 20 );
		adic( txtDescPlanoPag, 373, 20, 200, 20 );
		
		adic( new JLabelPad( "C�d.Tip.Cob." ), 7, 40, 250, 20 );
		adic( txtCodTipoCob, 7, 60, 80, 20 );
		adic( new JLabelPad( "Descri��o Tipo Cobran�a" ), 90, 40, 200, 20 );
		adic( txtDescTipoCob, 90, 60, 197, 20 );
		
		adic( new JLabelPad( "C�d.banco" ), 290, 40, 250, 20 );
		adic( txtCodBanco, 290, 60, 80, 20 );
		adic( txtDescBanco, 373, 60, 200, 20 );

		adic( new JLabelPad( "N� Conta" ), 7, 80, 250, 20 );
		adic( txtCodConta, 7, 100, 80, 20 );
		adic( new JLabelPad( "Descri��o da conta" ), 90, 80, 200, 20 );
		adic( txtDescConta, 90, 100, 197, 20 );
		
		adic( new JLabelPad( " Valor" ), 290, 80, 80, 20 );
		adic( txtVlrParcPag, 290, 100, 80, 20 );
		
		adic( new JLabelPad( "Dt.Emiss�o" ), 373, 80, 80, 20 );
		adic( txtDtEmisPag, 373, 100, 80, 20 );
		
		adic( new JLabelPad( "Doc." ), 456, 80, 117, 20 );
		adic( txtDocPag, 456, 100, 117, 20 );
		
		adic( new JLabelPad( "Observa��es" ), 7, 120, 300, 20 );
		adic( txtObs, 7, 140, 565, 20 );
	}
	
	public void setValues( Object[] values ) {

		txtCodFor.setVlrInteger( values[0] != null ? (Integer) values[0] : 0 );
		txtCodPlanoPag.setVlrInteger( values[1] != null ? (Integer) values[1] : 0 );
		txtCodBanco.setVlrString( values[2] != null ? (String) values[2] : "" );
		txtCodTipoCob.setVlrInteger( values[3] != null ? (Integer) values[3] : 0 );
		txtVlrParcPag.setVlrBigDecimal( values[4] != null ? (BigDecimal) values[4] : new BigDecimal( "0.00" ) );
		txtDtEmisPag.setVlrDate( values[5] != null ? (Date) values[5] : new Date() );
		txtDocPag.setVlrString( values[6] != null ? (String) values[6] : "" );
		txtObs.setVlrString( values[7] != null ? (String) values[7] : "" );

		lcTipoCob.carregaDados();
		lcBanco.carregaDados();
		lcPlanoPag.carregaDados();
		lcFor.carregaDados();
	}
	
	public int getCodigoPagamento() {
		
		return lcPagar.getStatus() == ListaCampos.LCS_SELECT ? txtCodPag.getVlrInteger() : 0;
	}

	private void testaCodPag() { 
		
		try {
			
			PreparedStatement ps = con.prepareStatement( "SELECT * FROM SPGERANUM(?,?,?)" );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "FNPAGAR" ) );
			ps.setString( 3, "PA" );
			
			ResultSet rs = ps.executeQuery();
			
			if ( rs.next() ) {
				txtCodPag.setVlrString( rs.getString( 1 ) );
			}
		
			rs.close();
			ps.close();
			
			con.commit();
		} catch ( SQLException err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao confirmar c�digo da venda!\n" + err.getMessage(), true, con, err );
		}
	}

	public void beforePost( PostEvent e ) {
		if ( e.getListaCampos().equals( lcPagar ) && lcPagar.getStatus() == ListaCampos.LCS_INSERT ) {			
			testaCodPag();
			
			
			// Gerando hist�rico din�mico

			Integer codhistpag = null;

			codhistpag = (Integer) prefere.get( "codhistpag" );

			if ( codhistpag != 0 ) {
				historico = new Historico( codhistpag, con );
			}
			else {
				historico = new Historico();
				historico.setHistoricocodificado( HISTORICO_PADRAO );
			}
			
			historico.setData( txtDtEmisPag.getVlrDate() );
			historico.setDocumento( txtDocPag.getVlrString() );
			historico.setPortador( txtDescFor.getVlrString() );
			historico.setValor( txtVlrParcPag.getVlrBigDecimal() );
			historico.setHistoricoant( txtObs.getVlrString() ) ;
			
			txtObs.setVlrString( historico.getHistoricodecodificado() );
			
		}
	}

	public void afterPost( PostEvent e ) {
		
	}

	public void actionPerformed( ActionEvent e ) {

		if ( e.getSource() == btOK ) {
			
			if ( txtDtEmisPag.getVlrString().length() < 10 ) {				
				Funcoes.mensagemInforma( this, "Data de emiss�o � requerido!" );
			}
			else {				
				if ( lcPagar.getStatus() == ListaCampos.LCS_INSERT ) {					
					lcPagar.post();
				}
				else {					
					super.actionPerformed( e );
				}
			}
		}
		else {			
			super.actionPerformed( e );
		}
	}

	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );
		lcFor.setConexao( cn );
		lcPlanoPag.setConexao( cn );
		lcConta.setConexao( cn );
		lcTipoCob.setConexao( cn );
		lcPagar.setConexao( cn );
		lcItPagar.setConexao( cn );
		lcBanco.setConexao( cn );
		lcPagar.insert( true );
		
		prefere = getPrefere();
		
		
	}
	
	private Map<String, Integer> getPrefere() {

		PreparedStatement ps = null;
		ResultSet rs = null;
		Integer anocc = null;
		Integer codhistpag = null;

		Map<String, Integer> retorno = new HashMap<String, Integer>();

		try {

			ps = con.prepareStatement( "SELECT ANOCENTROCUSTO,CODHISTPAG FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?" );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );

			rs = ps.executeQuery();

			if ( rs.next() ) {
				anocc = rs.getInt( "ANOCENTROCUSTO" );
				codhistpag = rs.getInt( "CODHISTPAG" );
			}

			retorno.put( "codhistpag", codhistpag );
			retorno.put( "anocc", anocc );

			rs.close();
			ps.close();

			con.commit();
		} 
		catch ( SQLException err ) {
			Funcoes.mensagemErro( this, "Erro ao buscar o ano-base para o centro de custo.\n" + err.getMessage(), true, con, err );
		} 
		finally {
			ps = null;
			rs = null;
		}
		return retorno;
	} 
	
	private void alteraPag() {
		
		lcItPagar.edit();
						
		DLFechaPag dl = new DLFechaPag( owner, txtVlrParcItPag.getVlrBigDecimal(), txtDtVencItPag.getVlrDate() );
		dl.setVisible( true );
		
		try {
		
			if ( dl.OK ) {
				
				txtVlrParcItPag.setVlrBigDecimal( (BigDecimal) dl.getValores()[ 0 ] );
				txtDtVencItPag.setVlrDate( (Date) dl.getValores()[ 1 ] );
				lcItPagar.post();								
				
				// Atualiza lcPagar
				
				if ( lcPagar.getStatus() == ListaCampos.LCS_EDIT ) {									
					lcPagar.post(); // Caso o lcPagar estaja como edit executa o post que atualiza
				}
				else {								
					lcPagar.carregaDados(); // Caso n�o, atualiza
				}
				dl.dispose(); 
			}
			else {								
				dl.dispose();
				lcItPagar.cancel( false );
			}							
			dl.dispose();
		}
		catch ( Exception e ) {
			e.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao atualizar parcelas.\n" + e.getMessage() );
			lcItPagar.cancel( true );
			lcPagar.cancel( true );
		}
		
	}

/*	
	private class HandlerMouseListenerPagamento extends MouseAdapter {
		
		public void mouseClicked( MouseEvent mevt ) {
			
			if ( mevt.getClickCount() == 2 && tabPag.getLinhaSel() >= 0 ) {	
				
				lcItPagar.edit();
				
//				DLFechaPag dl = new DLFechaPag( DLNovoPag.this, txtVlrParcItPag.getVlrBigDecimal(), txtDtVencItPag.getVlrDate() );							
				DLFechaPag dl = new DLFechaPag( owner, txtVlrParcItPag.getVlrBigDecimal(), txtDtVencItPag.getVlrDate() );
				dl.setVisible( true );
				
				if ( dl.OK ) {
					
					txtVlrParcItPag.setVlrBigDecimal( (BigDecimal) dl.getValores()[ 0 ] );
					txtDtVencItPag.setVlrDate( (Date) dl.getValores()[ 1 ] );
					lcItPagar.post();								
					
					// Atualiza lcPagar
					
					if ( lcPagar.getStatus() == ListaCampos.LCS_EDIT ) {									
						lcPagar.post(); // Caso o lcPagar estaja como edit executa o post que atualiza
					}
					else {								
						lcPagar.carregaDados(); // Caso n�o, atualiza
					}
					dl.dispose(); 
				}
				else {								
					dl.dispose();
					lcItPagar.cancel( false );
				}							
				dl.dispose();
			}
		}
	}

*/
	
	public void mouseClicked( MouseEvent mevt ) {

		if(mevt.getSource() == tabPag) {
			if ( ( mevt.getClickCount() == 2 ) & ( tabPag.getLinhaSel() >= 0 ) ) {					
				alteraPag();
			}
		}		
	}

	public void mouseEntered( MouseEvent e ) {

		// TODO Auto-generated method stub
		
	}

	public void mouseExited( MouseEvent e ) {

		// TODO Auto-generated method stub
		
	}

	public void mousePressed( MouseEvent e ) {

		// TODO Auto-generated method stub
		
	}

	public void mouseReleased( MouseEvent e ) {

		// TODO Auto-generated method stub
		
	}
}