package br.ne.pi.the.palm.rh.service.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste {

	BigDecimal valorImpostoDeRenda();
	
}