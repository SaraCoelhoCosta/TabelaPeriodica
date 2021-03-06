package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.VisaoPanelTabelaPeriodica;

/**
 * @author Sara e Maile
 */

public class ControleTabelaPeriodica implements ActionListener {

	private VisaoPanelTabelaPeriodica panelTabelaPeriodica;

	public ControleTabelaPeriodica(VisaoPanelTabelaPeriodica panelTabelaPeriodica) {
		this.panelTabelaPeriodica = panelTabelaPeriodica;
		addEvento();
	}

	public void addEvento() {
		panelTabelaPeriodica.getBotaoActinio().addActionListener(this);
		panelTabelaPeriodica.getBotaoAluminio().addActionListener(this);
		panelTabelaPeriodica.getBotaoAmericio().addActionListener(this);
		panelTabelaPeriodica.getBotaoAntimonio().addActionListener(this);
		panelTabelaPeriodica.getBotaoArgon().addActionListener(this);
		panelTabelaPeriodica.getBotaoArsenio().addActionListener(this);
		panelTabelaPeriodica.getBotaoAstato().addActionListener(this);
		panelTabelaPeriodica.getBotaoBario().addActionListener(this);
		panelTabelaPeriodica.getBotaoBerilio().addActionListener(this);
		panelTabelaPeriodica.getBotaoBerquelio().addActionListener(this);
		panelTabelaPeriodica.getBotaoBismuto().addActionListener(this);
		panelTabelaPeriodica.getBotaoBohrio().addActionListener(this);
		panelTabelaPeriodica.getBotaoBoro().addActionListener(this);
		panelTabelaPeriodica.getBotaoBromo().addActionListener(this);
		panelTabelaPeriodica.getBotaoCadmio().addActionListener(this);
		panelTabelaPeriodica.getBotaoCalcio().addActionListener(this);
		panelTabelaPeriodica.getBotaoCalifornio().addActionListener(this);
		panelTabelaPeriodica.getBotaoCarbono().addActionListener(this);
		panelTabelaPeriodica.getBotaoCerio().addActionListener(this);
		panelTabelaPeriodica.getBotaoCesio().addActionListener(this);
		panelTabelaPeriodica.getBotaoChumbo().addActionListener(this);
		panelTabelaPeriodica.getBotaoCloro().addActionListener(this);
		panelTabelaPeriodica.getBotaoCobalto().addActionListener(this);
		panelTabelaPeriodica.getBotaoCobre().addActionListener(this);
		panelTabelaPeriodica.getBotaoCopernicio().addActionListener(this);
		panelTabelaPeriodica.getBotaoCripton().addActionListener(this);
		panelTabelaPeriodica.getBotaoCromo().addActionListener(this);
		panelTabelaPeriodica.getBotaoCurio().addActionListener(this);
		panelTabelaPeriodica.getBotaoDarmstadio().addActionListener(this);
		panelTabelaPeriodica.getBotaoDisprosio().addActionListener(this);
		panelTabelaPeriodica.getBotaoDubnio().addActionListener(this);
		panelTabelaPeriodica.getBotaoEinstenio().addActionListener(this);
		panelTabelaPeriodica.getBotaoEnxofre().addActionListener(this);
		panelTabelaPeriodica.getBotaoErbio().addActionListener(this);
		panelTabelaPeriodica.getBotaoEscandio().addActionListener(this);
		panelTabelaPeriodica.getBotaoEstanho().addActionListener(this);
		panelTabelaPeriodica.getBotaoEstroncio().addActionListener(this);
		panelTabelaPeriodica.getBotaoEuropio().addActionListener(this);
		panelTabelaPeriodica.getBotaoFermio().addActionListener(this);
		panelTabelaPeriodica.getBotaoFerro().addActionListener(this);
		panelTabelaPeriodica.getBotaoFlerovio().addActionListener(this);
		panelTabelaPeriodica.getBotaoFluor().addActionListener(this);
		panelTabelaPeriodica.getBotaoFosforo().addActionListener(this);
		panelTabelaPeriodica.getBotaoFrancio().addActionListener(this);
		panelTabelaPeriodica.getBotaoGadolinio().addActionListener(this);
		panelTabelaPeriodica.getBotaoGalio().addActionListener(this);
		panelTabelaPeriodica.getBotaoGermanio().addActionListener(this);
		panelTabelaPeriodica.getBotaoHafnio().addActionListener(this);
		panelTabelaPeriodica.getBotaoHassio().addActionListener(this);
		panelTabelaPeriodica.getBotaoHelio().addActionListener(this);
		panelTabelaPeriodica.getBotaoHidrogenio().addActionListener(this);
		panelTabelaPeriodica.getBotaoHolmio().addActionListener(this);
		panelTabelaPeriodica.getBotaoIndio().addActionListener(this);
		panelTabelaPeriodica.getBotaoIodo().addActionListener(this);
		panelTabelaPeriodica.getBotaoIridio().addActionListener(this);
		panelTabelaPeriodica.getBotaoIterbio().addActionListener(this);
		panelTabelaPeriodica.getBotaoItrio().addActionListener(this);
		panelTabelaPeriodica.getBotaoLantanio().addActionListener(this);
		panelTabelaPeriodica.getBotaoLaurencio().addActionListener(this);
		panelTabelaPeriodica.getBotaoLimpar().addActionListener(this);
		panelTabelaPeriodica.getBotaoLitio().addActionListener(this);
		panelTabelaPeriodica.getBotaoLivemorio().addActionListener(this);
		panelTabelaPeriodica.getBotaoLutecio().addActionListener(this);
		panelTabelaPeriodica.getBotaoMagnesio().addActionListener(this);
		panelTabelaPeriodica.getBotaoManganes().addActionListener(this);
		panelTabelaPeriodica.getBotaoMeitnerio().addActionListener(this);
		panelTabelaPeriodica.getBotaoMendelevio().addActionListener(this);
		panelTabelaPeriodica.getBotaoMercurio().addActionListener(this);
		panelTabelaPeriodica.getBotaoMolibdenio().addActionListener(this);
		panelTabelaPeriodica.getBotaoMoscovio().addActionListener(this);
		panelTabelaPeriodica.getBotaoNeodimio().addActionListener(this);
		panelTabelaPeriodica.getBotaoNeon().addActionListener(this);
		panelTabelaPeriodica.getBotaoNeptunio().addActionListener(this);
		panelTabelaPeriodica.getBotaoNihonium().addActionListener(this);
		panelTabelaPeriodica.getBotaoNiobio().addActionListener(this);
		panelTabelaPeriodica.getBotaoNiquel().addActionListener(this);
		panelTabelaPeriodica.getBotaoNitrogenio().addActionListener(this);
		panelTabelaPeriodica.getBotaoNobelio().addActionListener(this);
		panelTabelaPeriodica.getBotaoOganesson().addActionListener(this);
		panelTabelaPeriodica.getBotaoOsmio().addActionListener(this);
		panelTabelaPeriodica.getBotaoOuro().addActionListener(this);
		panelTabelaPeriodica.getBotaoOxigenio().addActionListener(this);
		panelTabelaPeriodica.getBotaoPaladio().addActionListener(this);
		panelTabelaPeriodica.getBotaoPlatina().addActionListener(this);
		panelTabelaPeriodica.getBotaoPlutonio().addActionListener(this);
		panelTabelaPeriodica.getBotaoPolonio().addActionListener(this);
		panelTabelaPeriodica.getBotaoPotassio().addActionListener(this);
		panelTabelaPeriodica.getBotaoPraseodimio().addActionListener(this);
		panelTabelaPeriodica.getBotaoPrata().addActionListener(this);
		panelTabelaPeriodica.getBotaoPromecio().addActionListener(this);
		panelTabelaPeriodica.getBotaoProtactinio().addActionListener(this);
		panelTabelaPeriodica.getBotaoRadio().addActionListener(this);
		panelTabelaPeriodica.getBotaoRadon().addActionListener(this);
		panelTabelaPeriodica.getBotaoRenio().addActionListener(this);
		panelTabelaPeriodica.getBotaoRodio().addActionListener(this);
		panelTabelaPeriodica.getBotaoRoentgenio().addActionListener(this);
		panelTabelaPeriodica.getBotaoRubidio().addActionListener(this);
		panelTabelaPeriodica.getBotaoRutenio().addActionListener(this);
		panelTabelaPeriodica.getBotaoRutherfordio().addActionListener(this);
		panelTabelaPeriodica.getBotaoSamario().addActionListener(this);
		panelTabelaPeriodica.getBotaoSeaborgio().addActionListener(this);
		panelTabelaPeriodica.getBotaoSelenio().addActionListener(this);
		panelTabelaPeriodica.getBotaoSilicio().addActionListener(this);
		panelTabelaPeriodica.getBotaoSodio().addActionListener(this);
		panelTabelaPeriodica.getBotaoTalio().addActionListener(this);
		panelTabelaPeriodica.getBotaoTantalo().addActionListener(this);
		panelTabelaPeriodica.getBotaoTecnecio().addActionListener(this);
		panelTabelaPeriodica.getBotaoTelurio().addActionListener(this);
		panelTabelaPeriodica.getBotaoTenessino().addActionListener(this);
		panelTabelaPeriodica.getBotaoTerbio().addActionListener(this);
		panelTabelaPeriodica.getBotaoTitanio().addActionListener(this);
		panelTabelaPeriodica.getBotaoTorio().addActionListener(this);
		panelTabelaPeriodica.getBotaoTulio().addActionListener(this);
		panelTabelaPeriodica.getBotaoTungstenio().addActionListener(this);
		panelTabelaPeriodica.getBotaoUranio().addActionListener(this);
		panelTabelaPeriodica.getBotaoVanadio().addActionListener(this);
		panelTabelaPeriodica.getBotaoXenonio().addActionListener(this);
		panelTabelaPeriodica.getBotaoZinco().addActionListener(this);
		panelTabelaPeriodica.getBotaoZirconio().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {

		if (evento.getSource() == panelTabelaPeriodica.getBotaoActinio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Act??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("89");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("227");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoAluminio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Alum??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Outros metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("13");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("26.982");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoAmericio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Amer??cio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("95");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("243");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoAntimonio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Antim??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Semimetais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("51");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("121.760");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoArgon()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Arg??nio (??rgon, ??rg??o ou Arg??o)");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Gases nobres");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("18");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("39.948");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoArsenio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Ars??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Semimetais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("33");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("74.922");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoAstato()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("??stato");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Halog??nios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("85");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("210");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoBario()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("B??rio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalino-terrosos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("56");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("137.327");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoBerilio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Ber??lio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalino-terrosos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("4");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("9.012");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoBerquelio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Berqu??lio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("97");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("247");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoBismuto()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Bismuto");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Outros metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("83");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("208.980");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoBohrio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("B??hrio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("107");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("264");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoBoro()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Boro");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Semimetais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("5");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("10.811");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoBromo()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Bromo");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Halog??nios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("35");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("79.904");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCadmio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("C??dmio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("48");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("112.411");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCalcio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("C??lcio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalino-terrosos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("20");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("40.078");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCalifornio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Calif??rnio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("98");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("251");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCarbono()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Carbono");
			panelTabelaPeriodica.getLabelValorFamilia().setText("N??o metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("6");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("12.011");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCerio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("C??rio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("58");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("140.116");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCesio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("C??sio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalinos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("55");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("132.905");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoChumbo()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Chumbo");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Outros metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("82");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("207.200");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCloro()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Cloro");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Halog??nios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("17");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("35.453");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCobalto()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Cobalto");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("27");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("58.933");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCobre()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Cobre");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("29");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("63.546");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCopernicio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Copern??cio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("112");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("277");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCripton()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Cript??nio (ou Cr??pton)");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Gases nobres");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("36");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("83.798");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCromo()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Cromo");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("24");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("51.996");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoCurio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("C??rio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("96");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("247");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoDarmstadio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Darmst??dio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("110");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("271");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoDisprosio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Dispr??sio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("66");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("162.500");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoDubnio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("D??bnio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("105");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("262");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoEinstenio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Einst??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("99");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("252");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoEnxofre()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Enxofre");
			panelTabelaPeriodica.getLabelValorFamilia().setText("N??o metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("16");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("32.065");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoErbio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("??rbio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("68");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("167.259");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoEscandio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Esc??ndio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("21");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("44.956");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoEstanho()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Estanho");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Outros metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("50");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("118.710");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoEstroncio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Estr??ncio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalino-terrosos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("38");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("87.620");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoEuropio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Eur??pio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("63");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("151.964");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoFermio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("F??rmio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("100");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("257");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoFerro()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Ferro");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("26");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("55.845");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoFlerovio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Fler??vio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Outros metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("114");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("289");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoFluor()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Fl??or");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Halog??nios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("9");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("18.998");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoFosforo()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("F??sforo");
			panelTabelaPeriodica.getLabelValorFamilia().setText("N??o metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("15");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("30.974");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoFrancio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Fr??ncio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalinos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("87");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("223");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoGadolinio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Gadol??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("64");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("157.250");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoGalio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("G??lio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Outros metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("31");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("69.723");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoGermanio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Germ??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Semimetais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("32");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("72.64");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoHafnio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("H??fnio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("72");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("178.490");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoHassio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("H??ssio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("108");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("277");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoHelio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("H??lio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Gases nobres");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("2");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("4.003");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoHidrogenio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Hidrog??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("N??o metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("1");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("1.008");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoHolmio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("H??lmio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("67");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("164.930");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoIndio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("??ndio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Outros metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("49");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("144.818");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoIodo()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Iodo");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Halog??nios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("53");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("126.905");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoIridio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Ir??dio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("77");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("192.217");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoIterbio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("It??rbio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("70");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("173.040");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoItrio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("??trio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("39");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("88.906");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoLantanio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Lant??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("57");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("138.905");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoLaurencio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Laur??ncio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("103");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("262");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoLitio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("L??tio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalinos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("3");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("6.941");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoLivemorio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Liverm??rio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Outros metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("116");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("293");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoLutecio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Lut??cio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("71");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("174.957");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoMagnesio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Magn??sio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalino-terrosos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("12");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("24.305");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoManganes()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Mangan??s");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("25");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("54.938");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoMeitnerio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Meitn??rio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("109");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("268");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoMendelevio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Mendel??vio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("101");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("258");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoMercurio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Merc??rio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("80");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("200.59");
			
		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoMolibdenio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Molibd??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("42");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("95.940");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoMoscovio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Mosc??vio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Outros metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("115");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("288");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoNeodimio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Neod??mio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("60");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("144.242");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoNeon()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Ne??nio (ou N??on)");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Gases nobres");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("10");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("20.180");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoNeptunio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Nept??nio (ou Net??nio)");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("93");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("237");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoNihonium()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Nih??nio (ou Nihonium)");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Outros metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("113");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("286");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoNiobio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Ni??bio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("41");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("92.906");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoNiquel()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("N??quel");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("28");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("58.693");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoNitrogenio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Nitrog??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("N??o metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("7");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("14.007");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoNobelio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Nob??lio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("102");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("259");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoOganesson()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Oganess??nio (ou Ogan??sson)");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Gases nobres");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("118");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("294");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoOsmio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("??smio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("76");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("190.230");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoOuro()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Ouro");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("79");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("196.967");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoOxigenio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Oxig??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("N??o metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("8");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("15.999");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoPaladio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Pal??dio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("46");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("106.420");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoPlatina()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Platina");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("78");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("195.084");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoPlutonio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Plut??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("94");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("244");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoPolonio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Pol??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Semimetais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("84");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("210");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoPotassio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Pot??ssio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalinos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("19");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("39.098");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoPraseodimio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Praseod??mio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("59");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("140.908");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoPrata()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Prata");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("47");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("107.868");
			
		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoPromecio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Prom??cio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("61");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("145");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoProtactinio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Protact??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("91");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("231.035");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoRadio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("R??dio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalino-terrosos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("88");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("226");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoRadon()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Rad??nio (R??don, Rad??o ou Rad??nio)");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Gases nobres");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("86");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("220");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoRenio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("R??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("75");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("186.207");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoRodio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("R??dio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("45");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("102.906");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoRoentgenio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Roentg??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("111");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("272");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoRubidio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Rub??dio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalinos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("37");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("85.468");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoRutenio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Rut??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("44");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("101.070");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoRutherfordio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Rutherf??rdio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("104");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("261");
			
		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoSamario()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Sam??rio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("62");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("150.360");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoSeaborgio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Seab??rgio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("106");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("266");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoSelenio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Sel??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("N??o metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("34");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("78.960");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoSilicio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Sil??cio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Semimetais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("14");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("28.086");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoSodio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("S??dio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais alcalinos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("11");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("22.990");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoTalio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("T??lio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Outros metais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("81");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("204.383");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoTantalo()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("T??ntalo");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("73");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("180.948");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoTecnecio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Tecn??cio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("43");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("98");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoTelurio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Tel??rio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Semimetais");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("52");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("128.600");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoTenessino()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Tenessino");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Halog??nios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("117");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("294");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoTerbio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("T??rbio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("65");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("158.925");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoTitanio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Tit??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("22");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("47.867");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoTorio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("T??rio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("90");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("232.038");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoTulio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("T??lio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Lantan??deos");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("69");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("168.934");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoTungstenio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Tungst??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("74");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("183.840");
			
		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoUranio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Ur??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Actin??dios");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("92");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("238.028");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoVanadio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Van??dio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("23");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("50.942");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoXenonio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Xen??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Gases nobres");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("54");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("131.293");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoZinco()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Zinco");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("30");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("65.409");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoZirconio()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("Zirc??nio");
			panelTabelaPeriodica.getLabelValorFamilia().setText("Metais de transi????o");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("40");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("91.224");

		} else if (evento.getSource() == panelTabelaPeriodica.getBotaoLimpar()) {
			panelTabelaPeriodica.getLabelValorElemento().setText("");
			panelTabelaPeriodica.getLabelValorFamilia().setText("");
			panelTabelaPeriodica.getLabelValorMassaAtomica().setText("");
			panelTabelaPeriodica.getLabelValorNumAtomico().setText("");
			
		}
	}
}
