package controle;

import visao.VisaoFrameTabelaPeriodica;
import visao.VisaoPanelTabelaPeriodica;

/**
 * @author Sara e Maile
 */

public class ControleFrameTabelaPeriodica {

	static VisaoFrameTabelaPeriodica frameTabelaPeriodica = new VisaoFrameTabelaPeriodica();
	private VisaoPanelTabelaPeriodica panelTabelaPeriodica;

	public ControleFrameTabelaPeriodica() {
		panelTabelaPeriodica = new VisaoPanelTabelaPeriodica();
		
		@SuppressWarnings("unused")
		ControleTabelaPeriodica controleTabelaPeriodica = new ControleTabelaPeriodica(panelTabelaPeriodica); // Chama controle do JPanel
		frameTabelaPeriodica.setContentPane(panelTabelaPeriodica); // Abre JPanel
		frameTabelaPeriodica.repaint();
		frameTabelaPeriodica.validate();
	}
}
