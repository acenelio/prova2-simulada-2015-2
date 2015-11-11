package aplicacao;

import java.math.BigDecimal;

import dominio.Banda;
import servico.BandaServico;
import servico.ServicoFactory;

public class Instanciacao {

	public static void main(String[] args) {

		Banda b1 = new Banda(null, "Calypso", new BigDecimal("10000.00"));
		Banda b2 = new Banda(null, "One Direction", new BigDecimal("30000.00"));
		Banda b3 = new Banda(null, "Restart", new BigDecimal("40000.00"));
		Banda b4 = new Banda(null, "Beatles", new BigDecimal("80000.00"));
		Banda b5 = new Banda(null, "Mr. Catra", new BigDecimal("15000.00"));
		
		BandaServico bs = ServicoFactory.criarBandaServico();
		
		bs.inserirAtualizar(b1);
		bs.inserirAtualizar(b2);
		bs.inserirAtualizar(b3);
		bs.inserirAtualizar(b4);
		bs.inserirAtualizar(b5);
		
		System.out.println("Pronto!");
	}

}
