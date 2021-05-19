package br.ne.pi.the.palm.rh.service.reajuste;

import java.math.BigDecimal;

import br.ne.pi.the.palm.rh.model.Funcionario;

public interface ValidacaoReajuste {

	void validar(Funcionario funcionario, BigDecimal aumento);
	
}