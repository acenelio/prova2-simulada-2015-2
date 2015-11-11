package servico;

import servico.impl.BandaServicoImpl;
import servico.impl.ParticipacaoSevicoImpl;
import servico.impl.EspetaculoServicoImpl;

public class ServicoFactory {

	public static BandaServico criarBandaServico() {
		return new BandaServicoImpl();
	}
	
	public static ParticipacaoServico criarParticipacaoServico() {
		return new ParticipacaoSevicoImpl();
	}
	
	public static EspetaculoServico criarEspetaculoServico() {
		return new EspetaculoServicoImpl();
	}
	
}