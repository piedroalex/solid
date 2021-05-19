package br.ne.pi.the.palm.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.ne.pi.the.palm.rh.ValidacaoException;
import br.ne.pi.the.palm.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

	public void validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if(mesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre os reajustes deve ser de no mínimo 6 meses!");
		}
	}
	
}