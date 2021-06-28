package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Sara e Maile
 */

public class VisaoPanelTabelaPeriodica extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton botaoHidrogenio;
	private JButton botaoLitio;
	private JButton botaoSodio;
	private JButton botaoPotassio;
	private JButton botaoRubidio;
	private JButton botaoCesio;
	private JButton botaoFrancio;
	private JButton botaoBerilio;
	private JButton botaoMagnesio;
	private JButton botaoCalcio;
	private JButton botaoEstroncio;
	private JButton botaoBario;
	private JButton botaoRadio;
	private JButton botaoEscandio;
	private JButton botaoItrio;
	private JButton botao57a71;
	private JButton botao89a103;
	private JButton botaoTitanio;
	private JButton botaoZirconio;
	private JButton botaoHafnio;
	private JButton botaoRutherfordio;
	private JButton botaoLantanio;
	private JButton botaoActinio;
	private JButton botaoVanadio;
	private JButton botaoNiobio;
	private JButton botaoTantalo;
	private JButton botaoDubnio;
	private JButton botaoCerio;
	private JButton botaoTorio;
	private JButton botaoCromo;
	private JButton botaoMolibdenio;
	private JButton botaoTungstenio;
	private JButton botaoSeaborgio;
	private JButton botaoPraseodimio;
	private JButton botaoProtactinio;
	private JButton botaoManganes;
	private JButton botaoTecnecio;
	private JButton botaoRenio;
	private JButton botaoBohrio;
	private JButton botaoNeodimio;
	private JButton botaoUranio;
	private JButton botaoFerro;
	private JButton botaoRutenio;
	private JButton botaoOsmio;
	private JButton botaoHassio;
	private JButton botaoPromecio;
	private JButton botaoNeptunio;
	private JButton botaoCobalto;
	private JButton botaoRodio;
	private JButton botaoIridio;
	private JButton botaoMeitnerio;
	private JButton botaoSamario;
	private JButton botaoPlutonio;
	private JButton botaoNiquel;
	private JButton botaoPaladio;
	private JButton botaoPlatina;
	private JButton botaoDarmstadio;
	private JButton botaoEuropio;
	private JButton botaoAmericio;
	private JButton botaoCobre;
	private JButton botaoPrata;
	private JButton botaoOuro;
	private JButton botaoRoentgenio;
	private JButton botaoGadolinio;
	private JButton botaoCurio;
	private JButton botaoZinco;
	private JButton botaoCadmio;
	private JButton botaoMercurio;
	private JButton botaoCopernicio;
	private JButton botaoTerbio;
	private JButton botaoBerquelio;
	private JButton botaoBoro;
	private JButton botaoAluminio;
	private JButton botaoGalio;
	private JButton botaoIndio;
	private JButton botaoTalio;
	private JButton botaoNihonium;
	private JButton botaoDisprosio;
	private JButton botaoCalifornio;
	private JButton botaoCarbono;
	private JButton botaoSilicio;
	private JButton botaoGermanio;
	private JButton botaoEstanho;
	private JButton botaoChumbo;
	private JButton botaoFlerovio;
	private JButton botaoHolmio;
	private JButton botaoEinstenio;
	private JButton botaoNitrogenio;
	private JButton botaoFosforo;
	private JButton botaoArsenio;
	private JButton botaoAntimonio;
	private JButton botaoBismuto;
	private JButton botaoMoscovio;
	private JButton botaoErbio;
	private JButton botaoFermio;
	private JButton botaoOxigenio;
	private JButton botaoEnxofre;
	private JButton botaoSelenio;
	private JButton botaoTelurio;
	private JButton botaoPolonio;
	private JButton botaoLivemorio;
	private JButton botaoTulio;
	private JButton botaoMendelevio;
	private JButton botaoFluor;
	private JButton botaoCloro;
	private JButton botaoBromo;
	private JButton botaoIodo;
	private JButton botaoAstato;
	private JButton botaoTenessino;
	private JButton botaoIterbio;
	private JButton botaoNobelio;
	private JButton botaoHelio;
	private JButton botaoNeon;
	private JButton botaoArgon;
	private JButton botaoCripton;
	private JButton botaoXenonio;
	private JButton botaoRadon;
	private JButton botaoOganesson;
	private JButton botaoLutecio;
	private JButton botaoLaurencio;
	private JLabel labelGrupo1;
	private JLabel labelGrupo2;
	private JLabel labelGrupo3;
	private JLabel labelGrupo4;
	private JLabel labelGrupo5;
	private JLabel labelGrupo6;
	private JLabel labelGrupo7;
	private JLabel labelGrupo8;
	private JLabel labelGrupo9;
	private JLabel labelGrupo10;
	private JLabel labelGrupo11;
	private JLabel labelGrupo12;
	private JLabel labelGrupo13;
	private JLabel labelGrupo14;
	private JLabel labelGrupo15;
	private JLabel labelGrupo16;
	private JLabel labelGrupo17;
	private JLabel labelGrupo18;
	private JLabel labelPeriodo1;
	private JLabel labelPeriodo2;
	private JLabel labelPeriodo3;
	private JLabel labelPeriodo4;
	private JLabel labelPeriodo5;
	private JLabel labelPeriodo6;
	private JLabel labelPeriodo7;
	private JLabel labelElemento;
	private JLabel labelFamilia;
	private JLabel labelNumeroAtomico;
	private JLabel labelMassaAtomica;
	private JLabel labelValorFamilia;
	private JLabel labelValorElemento;
	private JLabel labelValorNumAtomico;
	private JLabel labelValorMassaAtomica;
	private JButton botaoLimpar;

	public VisaoPanelTabelaPeriodica() {
		setBackground(new Color(204, 204, 255));
		setLayout(null);
		add(getBotaoHidrogenio());
		add(getBotaoLitio());
		add(getBotaoSodio());
		add(getBotaoPotassio());
		add(getBotaoRubidio());
		add(getBotaoCesio());
		add(getBotaoFrancio());
		add(getBotaoBerilio());
		add(getBotaoMagnesio());
		add(getBotaoCalcio());
		add(getBotaoEstroncio());
		add(getBotaoBario());
		add(getBotaoRadio());
		add(getBotaoEscandio());
		add(getBotaoItrio());
		add(getBotao57a71());
		add(getBotao89a103());
		add(getBotaoTitanio());
		add(getBotaoZirconio());
		add(getBotaoHafnio());
		add(getBotaoRutherfordio());
		add(getBotaoLantanio());
		add(getBotaoActinio());
		add(getBotaoVanadio());
		add(getBotaoNiobio());
		add(getBotaoTantalo());
		add(getBotaoDubnio());
		add(getBotaoCerio());
		add(getBotaoTorio());
		add(getBotaoCromo());
		add(getBotaoMolibdenio());
		add(getBotaoTungstenio());
		add(getBotaoSeaborgio());
		add(getBotaoPraseodimio());
		add(getBotaoProtactinio());
		add(getBotaoManganes());
		add(getBotaoTecnecio());
		add(getBotaoRenio());
		add(getBotaoBohrio());
		add(getBotaoNeodimio());
		add(getBotaoUranio());
		add(getBotaoFerro());
		add(getBotaoRutenio());
		add(getBotaoOsmio());
		add(getBotaoHassio());
		add(getBotaoPromecio());
		add(getBotaoNeptunio());
		add(getBotaoCobalto());
		add(getBotaoRodio());
		add(getBotaoIridio());
		add(getBotaoMeitnerio());
		add(getBotaoSamario());
		add(getBotaoPlutonio());
		add(getBotaoNiquel());
		add(getBotaoPaladio());
		add(getBotaoPlatina());
		add(getBotaoDarmstadio());
		add(getBotaoEuropio());
		add(getBotaoAmericio());
		add(getBotaoCobre());
		add(getBotaoPrata());
		add(getBotaoOuro());
		add(getBotaoRoentgenio());
		add(getBotaoGadolinio());
		add(getBotaoCurio());
		add(getBotaoZinco());
		add(getBotaoCadmio());
		add(getBotaoMercurio());
		add(getBotaoCopernicio());
		add(getBotaoTerbio());
		add(getBotaoBerquelio());
		add(getBotaoBoro());
		add(getBotaoAluminio());
		add(getBotaoGalio());
		add(getBotaoIndio());
		add(getBotaoTalio());
		add(getBotaoNihonium());
		add(getBotaoDisprosio());
		add(getBotaoCalifornio());
		add(getBotaoCarbono());
		add(getBotaoSilicio());
		add(getBotaoGermanio());
		add(getBotaoEstanho());
		add(getBotaoChumbo());
		add(getBotaoFlerovio());
		add(getBotaoHolmio());
		add(getBotaoEinstenio());
		add(getBotaoNitrogenio());
		add(getBotaoFosforo());
		add(getBotaoArsenio());
		add(getBotaoAntimonio());
		add(getBotaoBismuto());
		add(getBotaoMoscovio());
		add(getBotaoErbio());
		add(getBotaoFermio());
		add(getBotaoOxigenio());
		add(getBotaoEnxofre());
		add(getBotaoSelenio());
		add(getBotaoTelurio());
		add(getBotaoPolonio());
		add(getBotaoLivemorio());
		add(getBotaoTulio());
		add(getBotaoMendelevio());
		add(getBotaoFluor());
		add(getBotaoCloro());
		add(getBotaoBromo());
		add(getBotaoIodo());
		add(getBotaoAstato());
		add(getBotaoTenessino());
		add(getBotaoIterbio());
		add(getBotaoNobelio());
		add(getBotaoHelio());
		add(getBotaoNeon());
		add(getBotaoArgon());
		add(getBotaoCripton());
		add(getBotaoXenonio());
		add(getBotaoRadon());
		add(getBotaoOganesson());
		add(getBotaoLutecio());
		add(getBotaoLaurencio());
		add(getLabelGrupo1());
		add(getLabelGrupo2());
		add(getLabelGrupo3());
		add(getLabelGrupo4());
		add(getLabelGrupo5());
		add(getLabelGrupo6());
		add(getLabelGrupo7());
		add(getLabelGrupo8());
		add(getLabelGrupo9());
		add(getLabelGrupo10());
		add(getLabelGrupo11());
		add(getLabelGrupo12());
		add(getLabelGrupo13());
		add(getLabelGrupo14());
		add(getLabelGrupo15());
		add(getLabelGrupo16());
		add(getLabelGrupo17());
		add(getLabelGrupo18());
		add(getLabelPeriodo1());
		add(getLabelPeriodo2());
		add(getLabelPeriodo3());
		add(getLabelPeriodo4());
		add(getLabelPeriodo5());
		add(getLabelPeriodo6());
		add(getLabelPeriodo7());
		add(getLabelElemento());
		add(getLabelFamilia());
		add(getLabelNumeroAtomico());
		add(getLabelMassaAtomica());
		add(getLabelValorElemento());
		add(getLabelValorFamilia());
		add(getLabelValorNumAtomico());
		add(getLabelValorMassaAtomica());
		add(getBotaoLimpar());

	}

	public JButton getBotaoHidrogenio() {
		if (botaoHidrogenio == null) {
			botaoHidrogenio = new JButton();
			botaoHidrogenio.setToolTipText("Hidrogênio");
			botaoHidrogenio.setText("H");
			botaoHidrogenio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoHidrogenio.setBackground(new Color(153, 255, 153));
			botaoHidrogenio.setBounds(33, 65, 60, 60);
		}
		return botaoHidrogenio;
	}

	public JButton getBotaoLitio() {
		if (botaoLitio == null) {
			botaoLitio = new JButton();
			botaoLitio.setToolTipText("Lítio");
			botaoLitio.setText("Li");
			botaoLitio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoLitio.setBackground(new Color(255, 153, 51));
			botaoLitio.setBounds(33, 130, 60, 60);
		}
		return botaoLitio;
	}

	public JButton getBotaoSodio() {
		if (botaoSodio == null) {
			botaoSodio = new JButton();
			botaoSodio.setToolTipText("Sódio");
			botaoSodio.setText("Na");
			botaoSodio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoSodio.setBackground(new Color(255, 153, 51));
			botaoSodio.setBounds(33, 195, 60, 60);
		}
		return botaoSodio;
	}

	public JButton getBotaoPotassio() {
		if (botaoPotassio == null) {
			botaoPotassio = new JButton();
			botaoPotassio.setToolTipText("Potássio");
			botaoPotassio.setText("K");
			botaoPotassio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoPotassio.setBackground(new Color(255, 153, 51));
			botaoPotassio.setBounds(33, 260, 60, 60);
		}
		return botaoPotassio;
	}

	public JButton getBotaoRubidio() {
		if (botaoRubidio == null) {
			botaoRubidio = new JButton();
			botaoRubidio.setToolTipText("Rubídio");
			botaoRubidio.setText("Rb");
			botaoRubidio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoRubidio.setBackground(new Color(255, 153, 51));
			botaoRubidio.setBounds(33, 325, 60, 60);
		}
		return botaoRubidio;
	}

	public JButton getBotaoCesio() {
		if (botaoCesio == null) {
			botaoCesio = new JButton();
			botaoCesio.setToolTipText("Césio");
			botaoCesio.setText("Cs");
			botaoCesio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCesio.setBackground(new Color(255, 153, 51));
			botaoCesio.setBounds(33, 390, 60, 60);
		}
		return botaoCesio;
	}

	public JButton getBotaoFrancio() {
		if (botaoFrancio == null) {
			botaoFrancio = new JButton();
			botaoFrancio.setToolTipText("Frâncio");
			botaoFrancio.setText("Fr");
			botaoFrancio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoFrancio.setBackground(new Color(255, 153, 51));
			botaoFrancio.setBounds(33, 455, 60, 60);
		}
		return botaoFrancio;
	}

	public JButton getBotaoBerilio() {
		if (botaoBerilio == null) {
			botaoBerilio = new JButton();
			botaoBerilio.setToolTipText(" Berílio");
			botaoBerilio.setText("Be");
			botaoBerilio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoBerilio.setBackground(new Color(255, 255, 51));
			botaoBerilio.setBounds(98, 130, 60, 60);
		}
		return botaoBerilio;
	}

	public JButton getBotaoMagnesio() {
		if (botaoMagnesio == null) {
			botaoMagnesio = new JButton();
			botaoMagnesio.setToolTipText("Magnésio");
			botaoMagnesio.setText("Mg");
			botaoMagnesio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoMagnesio.setBackground(new Color(255, 255, 51));
			botaoMagnesio.setBounds(98, 195, 60, 60);
		}
		return botaoMagnesio;
	}

	public JButton getBotaoCalcio() {
		if (botaoCalcio == null) {
			botaoCalcio = new JButton();
			botaoCalcio.setToolTipText("Cálcio");
			botaoCalcio.setText("Ca");
			botaoCalcio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCalcio.setBackground(new Color(255, 255, 51));
			botaoCalcio.setBounds(98, 260, 60, 60);
		}
		return botaoCalcio;
	}

	public JButton getBotaoEstroncio() {
		if (botaoEstroncio == null) {
			botaoEstroncio = new JButton();
			botaoEstroncio.setToolTipText("Estrôncio");
			botaoEstroncio.setText("Sr");
			botaoEstroncio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoEstroncio.setBackground(new Color(255, 255, 51));
			botaoEstroncio.setBounds(98, 325, 60, 60);
		}
		return botaoEstroncio;
	}

	public JButton getBotaoBario() {
		if (botaoBario == null) {
			botaoBario = new JButton();
			botaoBario.setToolTipText("Bário");
			botaoBario.setText("Ba");
			botaoBario.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoBario.setBackground(new Color(255, 255, 51));
			botaoBario.setBounds(98, 390, 60, 60);
		}
		return botaoBario;
	}

	public JButton getBotaoRadio() {
		if (botaoRadio == null) {
			botaoRadio = new JButton();
			botaoRadio.setToolTipText("Rádio");
			botaoRadio.setText("Ra");
			botaoRadio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoRadio.setBackground(new Color(255, 255, 51));
			botaoRadio.setBounds(98, 455, 60, 60);
		}
		return botaoRadio;
	}
	public JButton getBotaoEscandio() {
		if (botaoEscandio == null) {
			botaoEscandio = new JButton();
			botaoEscandio.setToolTipText("Escândio");
			botaoEscandio.setText("Sc");
			botaoEscandio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoEscandio.setBackground(Color.PINK);
			botaoEscandio.setBounds(163, 260, 60, 60);
		}
		return botaoEscandio;
	}
	public JButton getBotaoItrio() {
		if (botaoItrio == null) {
			botaoItrio = new JButton();
			botaoItrio.setToolTipText("Ítrio");
			botaoItrio.setText("Y");
			botaoItrio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoItrio.setBackground(Color.PINK);
			botaoItrio.setBounds(163, 325, 60, 60);
		}
		return botaoItrio;
	}
	public JButton getBotao57a71() {
		if (botao57a71 == null) {
			botao57a71 = new JButton();
			botao57a71.setToolTipText("57-71");
			botao57a71.setText("57-71");
			botao57a71.setFont(new Font("Dialog", Font.PLAIN, 8));
			botao57a71.setBackground(new Color(255, 102, 102));
			botao57a71.setBounds(163, 390, 60, 60);
		}
		return botao57a71;
	}
	public JButton getBotao89a103() {
		if (botao89a103 == null) {
			botao89a103 = new JButton();
			botao89a103.setToolTipText("89-103");
			botao89a103.setText("89-103");
			botao89a103.setFont(new Font("Dialog", Font.PLAIN, 7));
			botao89a103.setBackground(new Color(153, 153, 255));
			botao89a103.setBounds(163, 455, 60, 60);
		}
		return botao89a103;
	}
	public JButton getBotaoTitanio() {
		if (botaoTitanio == null) {
			botaoTitanio = new JButton();
			botaoTitanio.setToolTipText("Titânio");
			botaoTitanio.setText("Ti");
			botaoTitanio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoTitanio.setBackground(Color.PINK);
			botaoTitanio.setBounds(228, 260, 60, 60);
		}
		return botaoTitanio;
	}
	public JButton getBotaoZirconio() {
		if (botaoZirconio == null) {
			botaoZirconio = new JButton();
			botaoZirconio.setToolTipText("Zircônio");
			botaoZirconio.setText("Zr");
			botaoZirconio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoZirconio.setBackground(Color.PINK);
			botaoZirconio.setBounds(228, 325, 60, 60);
		}
		return botaoZirconio;
	}
	public JButton getBotaoHafnio() {
		if (botaoHafnio == null) {
			botaoHafnio = new JButton();
			botaoHafnio.setToolTipText("Háfnio");
			botaoHafnio.setText("Hf");
			botaoHafnio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoHafnio.setBackground(Color.PINK);
			botaoHafnio.setBounds(228, 390, 60, 60);
		}
		return botaoHafnio;
	}
	public JButton getBotaoRutherfordio() {
		if (botaoRutherfordio == null) {
			botaoRutherfordio = new JButton();
			botaoRutherfordio.setToolTipText("Rutherfórdio");
			botaoRutherfordio.setText("Rf");
			botaoRutherfordio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoRutherfordio.setBackground(Color.PINK);
			botaoRutherfordio.setBounds(228, 455, 60, 60);
		}
		return botaoRutherfordio;
	}
	public JButton getBotaoLantanio() {
		if (botaoLantanio == null) {
			botaoLantanio = new JButton();
			botaoLantanio.setToolTipText("Lantânio");
			botaoLantanio.setText("La");
			botaoLantanio.setBackground(new Color(255, 102, 102));
			botaoLantanio.setBounds(228, 535, 60, 60);
		}
		return botaoLantanio;
	}
	public JButton getBotaoActinio() {
		if (botaoActinio == null) {
			botaoActinio = new JButton();
			botaoActinio.setToolTipText("Actínio");
			botaoActinio.setText("Ac");
			botaoActinio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoActinio.setBackground(new Color(153, 153, 255));
			botaoActinio.setBounds(228, 600, 60, 60);
		}
		return botaoActinio;
	}
	public JButton getBotaoVanadio() {
		if (botaoVanadio == null) {
			botaoVanadio = new JButton();
			botaoVanadio.setToolTipText("Vanádio");
			botaoVanadio.setText("V");
			botaoVanadio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoVanadio.setBackground(Color.PINK);
			botaoVanadio.setBounds(293, 260, 60, 60);
		}
		return botaoVanadio;
	}
	public JButton getBotaoNiobio() {
		if (botaoNiobio == null) {
			botaoNiobio = new JButton();
			botaoNiobio.setToolTipText("Nióbio");
			botaoNiobio.setText("Nb");
			botaoNiobio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoNiobio.setBackground(Color.PINK);
			botaoNiobio.setBounds(293, 325, 60, 60);
		}
		return botaoNiobio;
	}
	public JButton getBotaoTantalo() {
		if (botaoTantalo == null) {
			botaoTantalo = new JButton();
			botaoTantalo.setToolTipText("Tântalo");
			botaoTantalo.setText("Ta");
			botaoTantalo.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoTantalo.setBackground(Color.PINK);
			botaoTantalo.setBounds(293, 390, 60, 60);
		}
		return botaoTantalo;
	}
	public JButton getBotaoDubnio() {
		if (botaoDubnio == null) {
			botaoDubnio = new JButton();
			botaoDubnio.setToolTipText("Dúbnio");
			botaoDubnio.setText("Db");
			botaoDubnio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoDubnio.setBackground(Color.PINK);
			botaoDubnio.setBounds(293, 455, 60, 60);
		}
		return botaoDubnio;
	}
	public JButton getBotaoCerio() {
		if (botaoCerio == null) {
			botaoCerio = new JButton();
			botaoCerio.setToolTipText("Cério");
			botaoCerio.setText("Ce");
			botaoCerio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCerio.setBackground(new Color(255, 102, 102));
			botaoCerio.setBounds(293, 535, 60, 60);
		}
		return botaoCerio;
	}
	public JButton getBotaoTorio() {
		if (botaoTorio == null) {
			botaoTorio = new JButton();
			botaoTorio.setToolTipText("Tório");
			botaoTorio.setText("Th");
			botaoTorio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoTorio.setBackground(new Color(153, 153, 255));
			botaoTorio.setBounds(293, 600, 60, 60);
		}
		return botaoTorio;
	}
	public JButton getBotaoCromo() {
		if (botaoCromo == null) {
			botaoCromo = new JButton();
			botaoCromo.setToolTipText("Cromo");
			botaoCromo.setText("Cr");
			botaoCromo.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCromo.setBackground(Color.PINK);
			botaoCromo.setBounds(356, 260, 60, 60);
		}
		return botaoCromo;
	}
	public JButton getBotaoMolibdenio() {
		if (botaoMolibdenio == null) {
			botaoMolibdenio = new JButton();
			botaoMolibdenio.setToolTipText("Molibdênio");
			botaoMolibdenio.setText("Mo");
			botaoMolibdenio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoMolibdenio.setBackground(Color.PINK);
			botaoMolibdenio.setBounds(357, 325, 60, 60);
		}
		return botaoMolibdenio;
	}
	public JButton getBotaoTungstenio() {
		if (botaoTungstenio == null) {
			botaoTungstenio = new JButton();
			botaoTungstenio.setToolTipText("Tungstênio");
			botaoTungstenio.setText("W");
			botaoTungstenio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoTungstenio.setBackground(Color.PINK);
			botaoTungstenio.setBounds(357, 390, 60, 60);
		}
		return botaoTungstenio;
	}

	public JButton getBotaoSeaborgio() {
		if (botaoSeaborgio == null) {
			botaoSeaborgio = new JButton();
			botaoSeaborgio.setToolTipText("Seabórgio");
			botaoSeaborgio.setText("Sg");
			botaoSeaborgio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoSeaborgio.setBackground(Color.PINK);
			botaoSeaborgio.setBounds(357, 455, 60, 60);
		}
		return botaoSeaborgio;
	}
	public JButton getBotaoPraseodimio() {
		if (botaoPraseodimio == null) {
			botaoPraseodimio = new JButton();
			botaoPraseodimio.setToolTipText("Praseodímio");
			botaoPraseodimio.setText("Pr");
			botaoPraseodimio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoPraseodimio.setBackground(new Color(255, 102, 102));
			botaoPraseodimio.setBounds(357, 535, 60, 60);
		}
		return botaoPraseodimio;
	}
	
	public JButton getBotaoProtactinio() {
		if (botaoProtactinio == null) {
			botaoProtactinio = new JButton();
			botaoProtactinio.setToolTipText("Protactínio");
			botaoProtactinio.setText("Pa");
			botaoProtactinio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoProtactinio.setBackground(new Color(153, 153, 255));
			botaoProtactinio.setBounds(357, 600, 60, 60);
		}
		return botaoProtactinio;
	}
	public JButton getBotaoManganes() {
		if (botaoManganes == null) {
			botaoManganes = new JButton();
			botaoManganes.setToolTipText("Manganês");
			botaoManganes.setText("Mn");
			botaoManganes.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoManganes.setBackground(Color.PINK);
			botaoManganes.setBounds(421, 260, 60, 60);
		}
		return botaoManganes;
	}
	public JButton getBotaoTecnecio() {
		if (botaoTecnecio == null) {
			botaoTecnecio = new JButton();
			botaoTecnecio.setToolTipText("Tecnécio");
			botaoTecnecio.setText("Tc");
			botaoTecnecio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoTecnecio.setBackground(Color.PINK);
			botaoTecnecio.setBounds(421, 325, 60, 60);
		}
		return botaoTecnecio;
	}
	public JButton getBotaoRenio() {
		if (botaoRenio == null) {
			botaoRenio = new JButton();
			botaoRenio.setToolTipText("Rênio");
			botaoRenio.setText("Re");
			botaoRenio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoRenio.setBackground(Color.PINK);
			botaoRenio.setBounds(421, 390, 60, 60);
		}
		return botaoRenio;
	}
	public JButton getBotaoBohrio() {
		if (botaoBohrio == null) {
			botaoBohrio = new JButton();
			botaoBohrio.setToolTipText("Bóhrio");
			botaoBohrio.setText("Bh");
			botaoBohrio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoBohrio.setBackground(Color.PINK);
			botaoBohrio.setBounds(421, 455, 60, 60);
		}
		return botaoBohrio;
	}
	public JButton getBotaoNeodimio() {
		if (botaoNeodimio == null) {
			botaoNeodimio = new JButton();
			botaoNeodimio.setToolTipText("Neodímio");
			botaoNeodimio.setText("Nd");
			botaoNeodimio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoNeodimio.setBackground(new Color(255, 102, 102));
			botaoNeodimio.setBounds(421, 535, 60, 60);
		}
		return botaoNeodimio;
	}
	public JButton getBotaoUranio() {
		if (botaoUranio == null) {
			botaoUranio = new JButton();
			botaoUranio.setToolTipText("Urânio");
			botaoUranio.setText("U");
			botaoUranio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoUranio.setBackground(new Color(153, 153, 255));
			botaoUranio.setBounds(421, 600, 60, 60);
		}
		return botaoUranio;
	}
	public JButton getBotaoFerro() {
		if (botaoFerro == null) {
			botaoFerro = new JButton();
			botaoFerro.setToolTipText("Ferro");
			botaoFerro.setText("Fe");
			botaoFerro.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoFerro.setBackground(Color.PINK);
			botaoFerro.setBounds(486, 260, 60, 60);
		}
		return botaoFerro;
	}
	public JButton getBotaoRutenio() {
		if (botaoRutenio == null) {
			botaoRutenio = new JButton();
			botaoRutenio.setToolTipText("Rutênio");
			botaoRutenio.setText("Ru");
			botaoRutenio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoRutenio.setBackground(Color.PINK);
			botaoRutenio.setBounds(486, 325, 60, 60);
		}
		return botaoRutenio;
	}
	public JButton getBotaoOsmio() {
		if (botaoOsmio == null) {
			botaoOsmio = new JButton();
			botaoOsmio.setToolTipText("Ósmio");
			botaoOsmio.setText("Os");
			botaoOsmio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoOsmio.setBackground(Color.PINK);
			botaoOsmio.setBounds(486, 390, 60, 60);
		}
		return botaoOsmio;
	}
	public JButton getBotaoHassio() {
		if (botaoHassio == null) {
			botaoHassio = new JButton();
			botaoHassio.setToolTipText("Hássio");
			botaoHassio.setText("Hs");
			botaoHassio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoHassio.setBackground(Color.PINK);
			botaoHassio.setBounds(486, 455, 60, 60);
		}
		return botaoHassio;
	}
	public JButton getBotaoPromecio() {
		if (botaoPromecio == null) {
			botaoPromecio = new JButton();
			botaoPromecio.setToolTipText("Promécio");
			botaoPromecio.setText("Pm");
			botaoPromecio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoPromecio.setBackground(new Color(255, 102, 102));
			botaoPromecio.setBounds(486, 535, 60, 60);
		}
		return botaoPromecio;
	}
	public JButton getBotaoNeptunio() {
		if (botaoNeptunio == null) {
			botaoNeptunio = new JButton();
			botaoNeptunio.setToolTipText("Neptúnio");
			botaoNeptunio.setText("Np");
			botaoNeptunio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoNeptunio.setBackground(new Color(153, 153, 255));
			botaoNeptunio.setBounds(486, 600, 60, 60);
		}
		return botaoNeptunio;
	}
	public JButton getBotaoCobalto() {
		if (botaoCobalto == null) {
			botaoCobalto = new JButton();
			botaoCobalto.setToolTipText("Cobalto");
			botaoCobalto.setText("Co");
			botaoCobalto.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCobalto.setBackground(Color.PINK);
			botaoCobalto.setBounds(551, 260, 60, 60);
		}
		return botaoCobalto;
	}
	public JButton getBotaoRodio() {
		if (botaoRodio == null) {
			botaoRodio = new JButton();
			botaoRodio.setToolTipText("Ródio");
			botaoRodio.setText("Rh");
			botaoRodio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoRodio.setBackground(Color.PINK);
			botaoRodio.setBounds(551, 325, 60, 60);
		}
		return botaoRodio;
	}
	public JButton getBotaoIridio() {
		if (botaoIridio == null) {
			botaoIridio = new JButton();
			botaoIridio.setToolTipText("Irídio");
			botaoIridio.setText("Ir");
			botaoIridio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoIridio.setBackground(Color.PINK);
			botaoIridio.setBounds(551, 390, 60, 60);
		}
		return botaoIridio;
	}
	public JButton getBotaoMeitnerio() {
		if (botaoMeitnerio == null) {
			botaoMeitnerio = new JButton();
			botaoMeitnerio.setToolTipText("Meitnério");
			botaoMeitnerio.setText("Mt");
			botaoMeitnerio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoMeitnerio.setBackground(Color.PINK);
			botaoMeitnerio.setBounds(551, 455, 60, 60);
		}
		return botaoMeitnerio;
	}
	public JButton getBotaoSamario() {
		if (botaoSamario == null) {
			botaoSamario = new JButton();
			botaoSamario.setToolTipText("Samário");
			botaoSamario.setText("Sm");
			botaoSamario.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoSamario.setBackground(new Color(255, 102, 102));
			botaoSamario.setBounds(551, 535, 60, 60);
		}
		return botaoSamario;
	}
	public JButton getBotaoPlutonio() {
		if (botaoPlutonio == null) {
			botaoPlutonio = new JButton();
			botaoPlutonio.setToolTipText("Plutônio");
			botaoPlutonio.setText("Pu");
			botaoPlutonio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoPlutonio.setBackground(new Color(153, 153, 255));
			botaoPlutonio.setBounds(551, 600, 60, 60);
		}
		return botaoPlutonio;
	}
	public JButton getBotaoNiquel() {
		if (botaoNiquel == null) {
			botaoNiquel = new JButton();
			botaoNiquel.setToolTipText("Níquel");
			botaoNiquel.setText("Ni");
			botaoNiquel.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoNiquel.setBackground(Color.PINK);
			botaoNiquel.setBounds(616, 260, 60, 60);
		}
		return botaoNiquel;
	}
	public JButton getBotaoPaladio() {
		if (botaoPaladio == null) {
			botaoPaladio = new JButton();
			botaoPaladio.setToolTipText("Paládio");
			botaoPaladio.setText("Pd");
			botaoPaladio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoPaladio.setBackground(Color.PINK);
			botaoPaladio.setBounds(616, 325, 60, 60);
		}
		return botaoPaladio;
	}
	public JButton getBotaoPlatina() {
		if (botaoPlatina == null) {
			botaoPlatina = new JButton();
			botaoPlatina.setToolTipText("Platina");
			botaoPlatina.setText("Pt");
			botaoPlatina.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoPlatina.setBackground(Color.PINK);
			botaoPlatina.setBounds(616, 390, 60, 60);
		}
		return botaoPlatina;
	}
	public JButton getBotaoDarmstadio() {
		if (botaoDarmstadio == null) {
			botaoDarmstadio = new JButton();
			botaoDarmstadio.setToolTipText("Darmstádio");
			botaoDarmstadio.setText("Ds");
			botaoDarmstadio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoDarmstadio.setBackground(Color.PINK);
			botaoDarmstadio.setBounds(616, 455, 60, 60);
		}
		return botaoDarmstadio;
	}
	public JButton getBotaoEuropio() {
		if (botaoEuropio == null) {
			botaoEuropio = new JButton();
			botaoEuropio.setToolTipText("Európio");
			botaoEuropio.setText("Eu");
			botaoEuropio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoEuropio.setBackground(new Color(255, 102, 102));
			botaoEuropio.setBounds(616, 535, 60, 60);
		}
		return botaoEuropio;
	}
	public JButton getBotaoAmericio() {
		if (botaoAmericio == null) {
			botaoAmericio = new JButton();
			botaoAmericio.setToolTipText("Amerício");
			botaoAmericio.setText("Am");
			botaoAmericio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoAmericio.setBackground(new Color(153, 153, 255));
			botaoAmericio.setBounds(616, 600, 60, 60);
		}
		return botaoAmericio;
	}
	public JButton getBotaoCobre() {
		if (botaoCobre == null) {
			botaoCobre = new JButton();
			botaoCobre.setToolTipText("Cobre");
			botaoCobre.setText("Cu");
			botaoCobre.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCobre.setBackground(Color.PINK);
			botaoCobre.setBounds(681, 260, 60, 60);
		}
		return botaoCobre;
	}
	public JButton getBotaoPrata() {
		if (botaoPrata == null) {
			botaoPrata = new JButton();
			botaoPrata.setToolTipText("Prata");
			botaoPrata.setText("Ag");
			botaoPrata.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoPrata.setBackground(Color.PINK);
			botaoPrata.setBounds(681, 325, 60, 60);
		}
		return botaoPrata;
	}
	public JButton getBotaoOuro() {
		if (botaoOuro == null) {
			botaoOuro = new JButton();
			botaoOuro.setToolTipText("Ouro");
			botaoOuro.setText("Au");
			botaoOuro.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoOuro.setBackground(Color.PINK);
			botaoOuro.setBounds(681, 390, 60, 60);
		}
		return botaoOuro;
	}
	public JButton getBotaoRoentgenio() {
		if (botaoRoentgenio == null) {
			botaoRoentgenio = new JButton();
			botaoRoentgenio.setToolTipText("Roentgênio");
			botaoRoentgenio.setText("Rg");
			botaoRoentgenio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoRoentgenio.setBackground(Color.PINK);
			botaoRoentgenio.setBounds(681, 455, 60, 60);
		}
		return botaoRoentgenio;
	}
	public JButton getBotaoGadolinio() {
		if (botaoGadolinio == null) {
			botaoGadolinio = new JButton();
			botaoGadolinio.setToolTipText("Gadolínio");
			botaoGadolinio.setText("Gd");
			botaoGadolinio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoGadolinio.setBackground(new Color(255, 102, 102));
			botaoGadolinio.setBounds(681, 535, 60, 60);
		}
		return botaoGadolinio;
	}
	public JButton getBotaoCurio() {
		if (botaoCurio == null) {
			botaoCurio = new JButton();
			botaoCurio.setToolTipText("Cúrio");
			botaoCurio.setText("Cm");
			botaoCurio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCurio.setBackground(new Color(153, 153, 255));
			botaoCurio.setBounds(681, 600, 60, 60);
		}
		return botaoCurio;
	}
	public JButton getBotaoZinco() {
		if (botaoZinco == null) {
			botaoZinco = new JButton();
			botaoZinco.setToolTipText("Zinco");
			botaoZinco.setText("Zn");
			botaoZinco.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoZinco.setBackground(Color.PINK);
			botaoZinco.setBounds(746, 260, 60, 60);
		}
		return botaoZinco;
	}
	public JButton getBotaoCadmio() {
		if (botaoCadmio == null) {
			botaoCadmio = new JButton();
			botaoCadmio.setToolTipText("Cádmio");
			botaoCadmio.setText("Cd");
			botaoCadmio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCadmio.setBackground(Color.PINK);
			botaoCadmio.setBounds(746, 325, 60, 60);
		}
		return botaoCadmio;
	}
	public JButton getBotaoMercurio() {
		if (botaoMercurio == null) {
			botaoMercurio = new JButton();
			botaoMercurio.setToolTipText("Mercúrio");
			botaoMercurio.setText("Hg");
			botaoMercurio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoMercurio.setBackground(Color.PINK);
			botaoMercurio.setBounds(746, 390, 60, 60);
		}
		return botaoMercurio;
	}
	public JButton getBotaoCopernicio() {
		if (botaoCopernicio == null) {
			botaoCopernicio = new JButton();
			botaoCopernicio.setToolTipText("Copernício");
			botaoCopernicio.setText("Cn");
			botaoCopernicio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCopernicio.setBackground(Color.PINK);
			botaoCopernicio.setBounds(746, 455, 60, 60);
		}
		return botaoCopernicio;
	}
	public JButton getBotaoTerbio() {
		if (botaoTerbio == null) {
			botaoTerbio = new JButton();
			botaoTerbio.setToolTipText("Térbio");
			botaoTerbio.setText("Tb");
			botaoTerbio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoTerbio.setBackground(new Color(255, 102, 102));
			botaoTerbio.setBounds(746, 535, 60, 60);
		}
		return botaoTerbio;
	}
	public JButton getBotaoBerquelio() {
		if (botaoBerquelio == null) {
			botaoBerquelio = new JButton();
			botaoBerquelio.setToolTipText("Berquélio");
			botaoBerquelio.setText("Bk");			
			botaoBerquelio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoBerquelio.setBackground(new Color(153, 153, 255));
			botaoBerquelio.setBounds(746, 600, 60, 60);
		}
		return botaoBerquelio;
	}
	public JButton getBotaoBoro() {
		if (botaoBoro == null) {
			botaoBoro = new JButton();
			botaoBoro.setToolTipText("Boro");
			botaoBoro.setText("B");
			botaoBoro.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoBoro.setBackground(new Color(0, 255, 51));
			botaoBoro.setBounds(811, 130, 60, 60);
		}
		return botaoBoro;
	}
	public JButton getBotaoAluminio() {
		if (botaoAluminio == null) {
			botaoAluminio = new JButton();
			botaoAluminio.setToolTipText("Alumínio");
			botaoAluminio.setText("Al");
			botaoAluminio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoAluminio.setBackground(new Color(0, 153, 102));
			botaoAluminio.setBounds(811, 195, 60, 60);
		}
		return botaoAluminio;
	}
	public JButton getBotaoGalio() {
		if (botaoGalio == null) {
			botaoGalio = new JButton();
			botaoGalio.setToolTipText("Gálio");
			botaoGalio.setText("Ga");
			botaoGalio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoGalio.setBackground(new Color(0, 153, 102));
			botaoGalio.setBounds(811, 260, 60, 60);
		}
		return botaoGalio;
	}
	public JButton getBotaoIndio() {
		if (botaoIndio == null) {
			botaoIndio = new JButton();
			botaoIndio.setToolTipText("Índio");
			botaoIndio.setText("In");
			botaoIndio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoIndio.setBackground(new Color(0, 153, 102));
			botaoIndio.setBounds(811, 325, 60, 60);
		}
		return botaoIndio;
	}
	public JButton getBotaoTalio() {
		if (botaoTalio == null) {
			botaoTalio = new JButton();
			botaoTalio.setToolTipText("Tálio");
			botaoTalio.setText("Tl");
			botaoTalio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoTalio.setBackground(new Color(0, 153, 102));
			botaoTalio.setBounds(811, 390, 60, 60);
		}
		return botaoTalio;
	}
	public JButton getBotaoNihonium() {
		if (botaoNihonium == null) {
			botaoNihonium = new JButton();
			botaoNihonium.setToolTipText("Nihonium");
			botaoNihonium.setText("Nh");
			botaoNihonium.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoNihonium.setBackground(new Color(0, 153, 102));
			botaoNihonium.setBounds(811, 455, 60, 60);
		}
		return botaoNihonium;
	}
	public JButton getBotaoDisprosio() {
		if (botaoDisprosio == null) {
			botaoDisprosio = new JButton();
			botaoDisprosio.setToolTipText("Disprósio");
			botaoDisprosio.setText("Dy");
			botaoDisprosio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoDisprosio.setBackground(new Color(255, 102, 102));
			botaoDisprosio.setBounds(811, 535, 60, 60);
		}
		return botaoDisprosio;
	}
	public JButton getBotaoCalifornio() {
		if (botaoCalifornio == null) {
			botaoCalifornio = new JButton();
			botaoCalifornio.setToolTipText("Califórnio");
			botaoCalifornio.setText("Cf");
			botaoCalifornio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCalifornio.setBackground(new Color(153, 153, 255));
			botaoCalifornio.setBounds(811, 600, 60, 60);
		}
		return botaoCalifornio;
	}
	public JButton getBotaoCarbono() {
		if (botaoCarbono == null) {
			botaoCarbono = new JButton();
			botaoCarbono.setToolTipText("Carbono");
			botaoCarbono.setText("C");
			botaoCarbono.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCarbono.setBackground(new Color(153, 255, 153));
			botaoCarbono.setBounds(876, 130, 60, 60);
		}
		return botaoCarbono;
	}
	public JButton getBotaoSilicio() {
		if (botaoSilicio == null) {
			botaoSilicio = new JButton();
			botaoSilicio.setToolTipText("Silício");
			botaoSilicio.setText("Si");
			botaoSilicio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoSilicio.setBackground(new Color(0, 255, 51));
			botaoSilicio.setBounds(876, 195, 60, 60);
		}
		return botaoSilicio;
	}
	public JButton getBotaoGermanio() {
		if (botaoGermanio == null) {
			botaoGermanio = new JButton();
			botaoGermanio.setToolTipText("Germânio");
			botaoGermanio.setText("Ge");
			botaoGermanio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoGermanio.setBackground(new Color(0, 255, 51));
			botaoGermanio.setBounds(876, 260, 60, 60);
		}
		return botaoGermanio;
	}
	public JButton getBotaoEstanho() {
		if (botaoEstanho == null) {
			botaoEstanho = new JButton();
			botaoEstanho.setToolTipText("Estanho");
			botaoEstanho.setText("Sn");
			botaoEstanho.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoEstanho.setBackground(new Color(0, 153, 102));
			botaoEstanho.setBounds(876, 325, 60, 60);
		}
		return botaoEstanho;
	}
	public JButton getBotaoChumbo() {
		if (botaoChumbo == null) {
			botaoChumbo = new JButton();
			botaoChumbo.setToolTipText("Chumbo");
			botaoChumbo.setText("Pb");
			botaoChumbo.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoChumbo.setBackground(new Color(0, 153, 102));
			botaoChumbo.setBounds(876, 390, 60, 60);
		}
		return botaoChumbo;
	}
	public JButton getBotaoFlerovio() {
		if (botaoFlerovio == null) {
			botaoFlerovio = new JButton();
			botaoFlerovio.setToolTipText("Fleróvio");
			botaoFlerovio.setText("Fl");
			botaoFlerovio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoFlerovio.setBackground(new Color(0, 153, 102));
			botaoFlerovio.setBounds(876, 455, 60, 60);
		}
		return botaoFlerovio;
	}
	public JButton getBotaoHolmio() {
		if (botaoHolmio == null) {
			botaoHolmio = new JButton();
			botaoHolmio.setToolTipText("Hólmio");
			botaoHolmio.setText("Ho");
			botaoHolmio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoHolmio.setBackground(new Color(255, 102, 102));
			botaoHolmio.setBounds(876, 535, 60, 60);
		}
		return botaoHolmio;
	}
	public JButton getBotaoEinstenio() {
		if (botaoEinstenio == null) {
			botaoEinstenio = new JButton();
			botaoEinstenio.setToolTipText("Einsténio");
			botaoEinstenio.setText("Es");
			botaoEinstenio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoEinstenio.setBackground(new Color(153, 153, 255));
			botaoEinstenio.setBounds(876, 600, 60, 60);
		}
		return botaoEinstenio;
	}
	public JButton getBotaoNitrogenio() {
		if (botaoNitrogenio == null) {
			botaoNitrogenio = new JButton();
			botaoNitrogenio.setToolTipText("Nitrogênio");
			botaoNitrogenio.setText("N");
			botaoNitrogenio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoNitrogenio.setBackground(new Color(153, 255, 153));
			botaoNitrogenio.setBounds(941, 130, 60, 60);
		}
		return botaoNitrogenio;
	}
	public JButton getBotaoFosforo() {
		if (botaoFosforo == null) {
			botaoFosforo = new JButton();
			botaoFosforo.setToolTipText("Fósforo");
			botaoFosforo.setText("P");
			botaoFosforo.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoFosforo.setBackground(new Color(153, 255, 153));
			botaoFosforo.setBounds(941, 195, 60, 60);
		}
		return botaoFosforo;
	}
	public JButton getBotaoArsenio() {
		if (botaoArsenio == null) {
			botaoArsenio = new JButton();
			botaoArsenio.setToolTipText("Arsênio");
			botaoArsenio.setText("As");
			botaoArsenio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoArsenio.setBackground(new Color(0, 255, 51));
			botaoArsenio.setBounds(941, 260, 60, 60);
		}
		return botaoArsenio;
	}
	public JButton getBotaoAntimonio() {
		if (botaoAntimonio == null) {
			botaoAntimonio = new JButton();
			botaoAntimonio.setToolTipText("Antimônio");
			botaoAntimonio.setText("Sb");
			botaoAntimonio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoAntimonio.setBackground(new Color(0, 255, 51));
			botaoAntimonio.setBounds(941, 325, 60, 60);
		}
		return botaoAntimonio;
	}
	public JButton getBotaoBismuto() {
		if (botaoBismuto == null) {
			botaoBismuto = new JButton();
			botaoBismuto.setToolTipText("Bismuto");
			botaoBismuto.setText("Bi");
			botaoBismuto.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoBismuto.setBackground(new Color(0, 153, 102));
			botaoBismuto.setBounds(941, 390, 60, 60);
		}
		return botaoBismuto;
	}
	public JButton getBotaoMoscovio() {
		if (botaoMoscovio == null) {
			botaoMoscovio = new JButton();
			botaoMoscovio.setToolTipText("Moscóvio");
			botaoMoscovio.setText("Mc");
			botaoMoscovio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoMoscovio.setBackground(new Color(0, 153, 102));
			botaoMoscovio.setBounds(941, 455, 60, 60);
		}
		return botaoMoscovio;
	}
	public JButton getBotaoErbio() {
		if (botaoErbio == null) {
			botaoErbio = new JButton();
			botaoErbio.setToolTipText("Érbio");
			botaoErbio.setText("Er");
			botaoErbio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoErbio.setBackground(new Color(255, 102, 102));
			botaoErbio.setBounds(941, 535, 60, 60);
		}
		return botaoErbio;
	}
	public JButton getBotaoFermio() {
		if (botaoFermio == null) {
			botaoFermio = new JButton();
			botaoFermio.setToolTipText("Férmio");
			botaoFermio.setText("Fm");
			botaoFermio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoFermio.setBackground(new Color(153, 153, 255));
			botaoFermio.setBounds(941, 600, 60, 60);
		}
		return botaoFermio;
	}
	public JButton getBotaoOxigenio() {
		if (botaoOxigenio == null) {
			botaoOxigenio = new JButton();
			botaoOxigenio.setToolTipText("Oxigênio");
			botaoOxigenio.setText("O");
			botaoOxigenio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoOxigenio.setBackground(new Color(153, 255, 153));
			botaoOxigenio.setBounds(1006, 130, 60, 60);
		}
		return botaoOxigenio;
	}
	public JButton getBotaoEnxofre() {
		if (botaoEnxofre == null) {
			botaoEnxofre = new JButton();
			botaoEnxofre.setToolTipText("Enxofre");
			botaoEnxofre.setText("S");
			botaoEnxofre.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoEnxofre.setBackground(new Color(153, 255, 153));
			botaoEnxofre.setBounds(1006, 195, 60, 60);
		}
		return botaoEnxofre;
	}
	public JButton getBotaoSelenio() {
		if (botaoSelenio == null) {
			botaoSelenio = new JButton();
			botaoSelenio.setToolTipText("Selênio");
			botaoSelenio.setText("Se");
			botaoSelenio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoSelenio.setBackground(new Color(153, 255, 153));
			botaoSelenio.setBounds(1006, 260, 60, 60);
		}
		return botaoSelenio;
	}
	public JButton getBotaoTelurio() {
		if (botaoTelurio == null) {
			botaoTelurio = new JButton();
			botaoTelurio.setToolTipText("Telúrio");
			botaoTelurio.setText("Te");
			botaoTelurio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoTelurio.setBackground(new Color(0, 255, 51));
			botaoTelurio.setBounds(1006, 325, 60, 60);
		}
		return botaoTelurio;
	}
	public JButton getBotaoPolonio() {
		if (botaoPolonio == null) {
			botaoPolonio = new JButton();
			botaoPolonio.setToolTipText("Polônio");
			botaoPolonio.setText("Po");
			botaoPolonio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoPolonio.setBackground(new Color(0, 255, 51));
			botaoPolonio.setBounds(1006, 390, 60, 60);
		}
		return botaoPolonio;
	}
	public JButton getBotaoLivemorio() {
		if (botaoLivemorio == null) {
			botaoLivemorio = new JButton();
			botaoLivemorio.setToolTipText("Livemório");
			botaoLivemorio.setText("Lv");
			botaoLivemorio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoLivemorio.setBackground(new Color(0, 153, 102));
			botaoLivemorio.setBounds(1006, 455, 60, 60);
		}
		return botaoLivemorio;
	}
	public JButton getBotaoTulio() {
		if (botaoTulio == null) {
			botaoTulio = new JButton();
			botaoTulio.setToolTipText("Túlio");
			botaoTulio.setText("Tm");
			botaoTulio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoTulio.setBackground(new Color(255, 102, 102));
			botaoTulio.setBounds(1006, 535, 60, 60);
		}
		return botaoTulio;
	}
	public JButton getBotaoMendelevio() {
		if (botaoMendelevio == null) {
			botaoMendelevio = new JButton();
			botaoMendelevio.setToolTipText("Mendelévio");
			botaoMendelevio.setText("Md");
			botaoMendelevio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoMendelevio.setBackground(new Color(153, 153, 255));
			botaoMendelevio.setBounds(1006, 600, 60, 60);
		}
		return botaoMendelevio;
	}
	public JButton getBotaoFluor() {
		if (botaoFluor == null) {
			botaoFluor = new JButton();
			botaoFluor.setToolTipText("Flúor");
			botaoFluor.setText("F");
			botaoFluor.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoFluor.setBackground(new Color(0, 153, 153));
			botaoFluor.setBounds(1071, 130, 60, 60);
		}
		return botaoFluor;
	}
	public JButton getBotaoCloro() {
		if (botaoCloro == null) {
			botaoCloro = new JButton();
			botaoCloro.setToolTipText("Cloro");
			botaoCloro.setText("Cl");
			botaoCloro.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCloro.setBackground(new Color(0, 153, 153));
			botaoCloro.setBounds(1071, 195, 60, 60);
		}
		return botaoCloro;
	}
	public JButton getBotaoBromo() {
		if (botaoBromo == null) {
			botaoBromo = new JButton();
			botaoBromo.setToolTipText("Bromo");
			botaoBromo.setText("Br");
			botaoBromo.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoBromo.setBackground(new Color(0, 153, 153));
			botaoBromo.setBounds(1071, 260, 60, 60);
		}
		return botaoBromo;
	}
	public JButton getBotaoIodo() {
		if (botaoIodo == null) {
			botaoIodo = new JButton();
			botaoIodo.setToolTipText("Iodo");
			botaoIodo.setText("I");
			botaoIodo.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoIodo.setBackground(new Color(0, 153, 153));
			botaoIodo.setBounds(1071, 325, 60, 60);
		}
		return botaoIodo;
	}
	public JButton getBotaoAstato() {
		if (botaoAstato == null) {
			botaoAstato = new JButton();
			botaoAstato.setToolTipText("Ástato");
			botaoAstato.setText("At");
			botaoAstato.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoAstato.setBackground(new Color(0, 153, 153));
			botaoAstato.setBounds(1071, 390, 60, 60);
		}
		return botaoAstato;
	}
	public JButton getBotaoTenessino() {
		if (botaoTenessino == null) {
			botaoTenessino = new JButton();
			botaoTenessino.setToolTipText("Tenessino");
			botaoTenessino.setText("Ts");
			botaoTenessino.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoTenessino.setBackground(new Color(0, 153, 153));
			botaoTenessino.setBounds(1071, 455, 60, 60);
		}
		return botaoTenessino;
	}
	public JButton getBotaoIterbio() {
		if (botaoIterbio == null) {
			botaoIterbio = new JButton();
			botaoIterbio.setToolTipText("Itérbio");
			botaoIterbio.setText("Yb");
			botaoIterbio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoIterbio.setBackground(new Color(255, 102, 102));
			botaoIterbio.setBounds(1071, 535, 60, 60);
		}
		return botaoIterbio;
	}
	public JButton getBotaoNobelio() {
		if (botaoNobelio == null) {
			botaoNobelio = new JButton();
			botaoNobelio.setToolTipText("Nobélio");
			botaoNobelio.setText("No");
			botaoNobelio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoNobelio.setBackground(new Color(153, 153, 255));
			botaoNobelio.setBounds(1071, 600, 60, 60);
		}
		return botaoNobelio;
	}
	public JButton getBotaoHelio() {
		if (botaoHelio == null) {
			botaoHelio = new JButton();
			botaoHelio.setToolTipText("Hélio");
			botaoHelio.setText("He");
			botaoHelio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoHelio.setBackground(new Color(51, 153, 255));
			botaoHelio.setBounds(1136, 65, 60, 60);
		}
		return botaoHelio;
	}
	public JButton getBotaoNeon() {
		if (botaoNeon == null) {
			botaoNeon = new JButton();
			botaoNeon.setToolTipText("Néon");
			botaoNeon.setText("Ne");
			botaoNeon.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoNeon.setBackground(new Color(51, 153, 255));
			botaoNeon.setBounds(1136, 130, 60, 60);
		}
		return botaoNeon;
	}
	public JButton getBotaoArgon() {
		if (botaoArgon == null) {
			botaoArgon = new JButton();
			botaoArgon.setToolTipText("Árgon");
			botaoArgon.setText("Ar");
			botaoArgon.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoArgon.setBackground(new Color(51, 153, 255));
			botaoArgon.setBounds(1136, 195, 60, 60);
		}
		return botaoArgon;
	}
	public JButton getBotaoCripton() {
		if (botaoCripton == null) {
			botaoCripton = new JButton();
			botaoCripton.setToolTipText("Crípton");
			botaoCripton.setText("Kr");
			botaoCripton.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoCripton.setBackground(new Color(51, 153, 255));
			botaoCripton.setBounds(1136, 260, 60, 60);
		}
		return botaoCripton;
	}
	public JButton getBotaoXenonio() {
		if (botaoXenonio == null) {
			botaoXenonio = new JButton();
			botaoXenonio.setToolTipText("Xenônio");
			botaoXenonio.setText("Xe");
			botaoXenonio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoXenonio.setBackground(new Color(51, 153, 255));
			botaoXenonio.setBounds(1136, 325, 60, 60);
		}
		return botaoXenonio;
	}
	public JButton getBotaoRadon() {
		if (botaoRadon == null) {
			botaoRadon = new JButton();
			botaoRadon.setToolTipText("Rádon");
			botaoRadon.setText("Rn");
			botaoRadon.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoRadon.setBackground(new Color(51, 153, 255));
			botaoRadon.setBounds(1136, 390, 60, 60);
		}
		return botaoRadon;
	}
	public JButton getBotaoOganesson() {
		if (botaoOganesson == null) {
			botaoOganesson = new JButton();
			botaoOganesson.setToolTipText("Oganesson");
			botaoOganesson.setText("Og");
			botaoOganesson.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoOganesson.setBackground(new Color(51, 153, 255));
			botaoOganesson.setBounds(1136, 455, 60, 60);
		}
		return botaoOganesson;
	}
	public JButton getBotaoLutecio() {
		if (botaoLutecio == null) {
			botaoLutecio = new JButton();
			botaoLutecio.setToolTipText("Lutécio");
			botaoLutecio.setText("Lu");
			botaoLutecio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoLutecio.setBackground(new Color(255, 102, 102));
			botaoLutecio.setBounds(1136, 535, 60, 60);
		}
		return botaoLutecio;
	}
	public JButton getBotaoLaurencio() {
		if (botaoLaurencio == null) {
			botaoLaurencio = new JButton();
			botaoLaurencio.setToolTipText("Laurêncio");
			botaoLaurencio.setText("Lr");
			botaoLaurencio.setFont(new Font("Dialog", Font.BOLD, 12));
			botaoLaurencio.setBackground(new Color(153, 153, 255));
			botaoLaurencio.setBounds(1136, 600, 60, 60);
		}
		return botaoLaurencio;
	}
	public JLabel getLabelGrupo1() {
		if (labelGrupo1 == null) {
			labelGrupo1 = new JLabel();
			labelGrupo1.setText("1");
			labelGrupo1.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo1.setBounds(55, 45, 13, 22);
		}
		return labelGrupo1;
	}
	public JLabel getLabelGrupo2() {
		if (labelGrupo2 == null) {
			labelGrupo2 = new JLabel();
			labelGrupo2.setText("2");
			labelGrupo2.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo2.setBounds(120, 110, 13, 22);
		}
		return labelGrupo2;
	}
	public JLabel getLabelGrupo3() {
		if (labelGrupo3 == null) {
			labelGrupo3 = new JLabel();
			labelGrupo3.setText("3");
			labelGrupo3.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo3.setBounds(185, 240, 13, 22);
		}
		return labelGrupo3;
	}
	public JLabel getLabelGrupo4() {
		if (labelGrupo4 == null) {
			labelGrupo4 = new JLabel();
			labelGrupo4.setText("4");
			labelGrupo4.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo4.setBounds(250, 240, 13, 22);
		}
		return labelGrupo4;
	}
	public JLabel getLabelGrupo5() {
		if (labelGrupo5 == null) {
			labelGrupo5 = new JLabel();
			labelGrupo5.setText("5");
			labelGrupo5.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo5.setBounds(315, 240, 13, 22);
		}
		return labelGrupo5;
	}
	public JLabel getLabelGrupo6() {
		if (labelGrupo6 == null) {
			labelGrupo6 = new JLabel();
			labelGrupo6.setText("6");
			labelGrupo6.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo6.setBounds(380, 240, 13, 22);
		}
		return labelGrupo6;
	}
	public JLabel getLabelGrupo7() {
		if (labelGrupo7 == null) {
			labelGrupo7 = new JLabel();
			labelGrupo7.setText("7");
			labelGrupo7.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo7.setBounds(445, 240, 13, 22);
		}
		return labelGrupo7;
	}
	public JLabel getLabelGrupo8() {
		if (labelGrupo8 == null) {
			labelGrupo8 = new JLabel();
			labelGrupo8.setText("8");
			labelGrupo8.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo8.setBounds(510, 240, 13, 22);
		}
		return labelGrupo8;
	}
	public JLabel getLabelGrupo9() {
		if (labelGrupo9 == null) {
			labelGrupo9 = new JLabel();
			labelGrupo9.setText("9");
			labelGrupo9.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo9.setBounds(575, 240, 13, 22);
		}
		return labelGrupo9;
	}
	public JLabel getLabelGrupo10() {
		if (labelGrupo10 == null) {
			labelGrupo10 = new JLabel();
			labelGrupo10.setText("10");
			labelGrupo10.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo10.setBounds(632, 240, 26, 22);
		}
		return labelGrupo10;
	}
	public JLabel getLabelGrupo11() {
		if (labelGrupo11 == null) {
			labelGrupo11 = new JLabel();
			labelGrupo11.setText("11");
			labelGrupo11.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo11.setBounds(699, 240, 26, 22);
		}
		return labelGrupo11;
	}
	public JLabel getLabelGrupo12() {
		if (labelGrupo12 == null) {
			labelGrupo12 = new JLabel();
			labelGrupo12.setText("12");
			labelGrupo12.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo12.setBounds(764, 240, 26, 22);
		}
		return labelGrupo12;
	}
	public JLabel getLabelGrupo13() {
		if (labelGrupo13 == null) {
			labelGrupo13 = new JLabel();
			labelGrupo13.setText("13");
			labelGrupo13.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo13.setBounds(828, 110, 26, 22);
		}
		return labelGrupo13;
	}
	public JLabel getLabelGrupo14() {
		if (labelGrupo14 == null) {
			labelGrupo14 = new JLabel();
			labelGrupo14.setText("14");
			labelGrupo14.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo14.setBounds(893, 110, 26, 22);
		}
		return labelGrupo14;
	}
	public JLabel getLabelGrupo15() {
		if (labelGrupo15 == null) {
			labelGrupo15 = new JLabel();
			labelGrupo15.setText("15");
			labelGrupo15.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo15.setBounds(958, 110, 26, 22);
		}
		return labelGrupo15;
	}
	public JLabel getLabelGrupo16() {
		if (labelGrupo16 == null) {
			labelGrupo16 = new JLabel();
			labelGrupo16.setText("16");
			labelGrupo16.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo16.setBounds(1022, 110, 26, 22);
		}
		return labelGrupo16;
	}
	public JLabel getLabelGrupo17() {
		if (labelGrupo17 == null) {
			labelGrupo17 = new JLabel();
			labelGrupo17.setText("17");
			labelGrupo17.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo17.setBounds(1088, 110, 26, 22);
		}
		return labelGrupo17;
	}
	public JLabel getLabelGrupo18() {
		if (labelGrupo18 == null) {
			labelGrupo18 = new JLabel();
			labelGrupo18.setText("18");
			labelGrupo18.setFont(new Font("Dialog", Font.BOLD, 18));
			labelGrupo18.setBounds(1153, 45, 26, 22);
		}
		return labelGrupo18;
	}
	public JLabel getLabelPeriodo1() {
		if (labelPeriodo1 == null) {
			labelPeriodo1 = new JLabel();
			labelPeriodo1.setText("1");
			labelPeriodo1.setFont(new Font("Dialog", Font.BOLD, 18));
			labelPeriodo1.setBounds(12, 85, 13, 22);
		}
		return labelPeriodo1;
	}
	public JLabel getLabelPeriodo2() {
		if (labelPeriodo2 == null) {
			labelPeriodo2 = new JLabel();
			labelPeriodo2.setText("2");
			labelPeriodo2.setFont(new Font("Dialog", Font.BOLD, 18));
			labelPeriodo2.setBounds(12, 150, 13, 22);
		}
		return labelPeriodo2;
	}
	public JLabel getLabelPeriodo3() {
		if (labelPeriodo3 == null) {
			labelPeriodo3 = new JLabel();
			labelPeriodo3.setText("3");
			labelPeriodo3.setFont(new Font("Dialog", Font.BOLD, 18));
			labelPeriodo3.setBounds(12, 215, 13, 22);
		}
		return labelPeriodo3;
	}
	public JLabel getLabelPeriodo4() {
		if (labelPeriodo4 == null) {
			labelPeriodo4 = new JLabel();
			labelPeriodo4.setText("4");
			labelPeriodo4.setFont(new Font("Dialog", Font.BOLD, 18));
			labelPeriodo4.setBounds(12, 280, 13, 22);
		}
		return labelPeriodo4;
	}
	public JLabel getLabelPeriodo5() {
		if (labelPeriodo5 == null) {
			labelPeriodo5 = new JLabel();
			labelPeriodo5.setText("5");
			labelPeriodo5.setFont(new Font("Dialog", Font.BOLD, 18));
			labelPeriodo5.setBounds(12, 345, 13, 22);
		}
		return labelPeriodo5;
	}
	public JLabel getLabelPeriodo6() {
		if (labelPeriodo6 == null) {
			labelPeriodo6 = new JLabel();
			labelPeriodo6.setText("6");
			labelPeriodo6.setFont(new Font("Dialog", Font.BOLD, 18));
			labelPeriodo6.setBounds(12, 410, 13, 22);
		}
		return labelPeriodo6;
	}
	public JLabel getLabelPeriodo7() {
		if (labelPeriodo7 == null) {
			labelPeriodo7 = new JLabel();
			labelPeriodo7.setText("7");
			labelPeriodo7.setFont(new Font("Dialog", Font.BOLD, 18));
			labelPeriodo7.setBounds(12, 475, 13, 22);
		}
		return labelPeriodo7;
	}
	public JLabel getLabelElemento() {
		if (labelElemento == null) {
			labelElemento = new JLabel();
			labelElemento.setText("Elemento:");
			labelElemento.setFont(new Font("Dialog", Font.BOLD, 15));
			labelElemento.setBounds(286, 50, 157, 17);
		}
		return labelElemento;
	}
	public JLabel getLabelFamilia() {
		if (labelFamilia == null) {
			labelFamilia = new JLabel();
			labelFamilia.setText("Família:");
			labelFamilia.setFont(new Font("Dialog", Font.BOLD, 15));
			labelFamilia.setBounds(286, 81, 157, 17);
		}
		return labelFamilia;
	}
	public JLabel getLabelNumeroAtomico() {
		if (labelNumeroAtomico == null) {
			labelNumeroAtomico = new JLabel();
			labelNumeroAtomico.setText("Número Atômico:");
			labelNumeroAtomico.setFont(new Font("Dialog", Font.BOLD, 15));
			labelNumeroAtomico.setBounds(286, 112, 157, 17);
		}
		return labelNumeroAtomico;
	}
	public JLabel getLabelMassaAtomica() {
		if (labelMassaAtomica == null) {
			labelMassaAtomica = new JLabel();
			labelMassaAtomica.setText("Massa Atômica:");
			labelMassaAtomica.setFont(new Font("Dialog", Font.BOLD, 15));
			labelMassaAtomica.setBounds(286, 141, 157, 17);
		}
		return labelMassaAtomica;
	}
	public JLabel getLabelValorFamilia() {
		if (labelValorFamilia == null) {
			labelValorFamilia = new JLabel();
			labelValorFamilia.setFont(new Font("Dialog", Font.BOLD, 15));
			labelValorFamilia.setBounds(455, 73, 201, 27);
		}
		return labelValorFamilia;
	}
	public JLabel getLabelValorElemento() {
		if (labelValorElemento == null) {
			labelValorElemento = new JLabel();
			labelValorElemento.setFont(new Font("Dialog", Font.BOLD, 15));
			labelValorElemento.setBounds(455, 45, 338, 27);
		}
		return labelValorElemento;
	}
	public JLabel getLabelValorNumAtomico() {
		if (labelValorNumAtomico == null) {
			labelValorNumAtomico = new JLabel();
			labelValorNumAtomico.setFont(new Font("Dialog", Font.BOLD, 15));
			labelValorNumAtomico.setBounds(455, 107, 201, 27);
		}
		return labelValorNumAtomico;
	}
	public JLabel getLabelValorMassaAtomica() {
		if (labelValorMassaAtomica == null) {
			labelValorMassaAtomica = new JLabel();
			labelValorMassaAtomica.setFont(new Font("Dialog", Font.BOLD, 15));
			labelValorMassaAtomica.setBounds(455, 138, 201, 27);
		}
		return labelValorMassaAtomica;
	}
	public JButton getBotaoLimpar() {
		if (botaoLimpar == null) {
			botaoLimpar = new JButton();
			botaoLimpar.setText("Limpar");
			botaoLimpar.setFont(new Font("Dialog", Font.BOLD, 15));
			botaoLimpar.setBackground(Color.WHITE);
			botaoLimpar.setBounds(483, 168, 121, 27);
		}
		return botaoLimpar;
	}
}
