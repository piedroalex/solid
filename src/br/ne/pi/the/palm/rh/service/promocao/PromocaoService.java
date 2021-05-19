package br.ne.pi.the.palm.rh.service.promocao;

import br.ne.pi.the.palm.rh.ValidacaoException;
import br.ne.pi.the.palm.rh.model.Cargo;
import br.ne.pi.the.palm.rh.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if(cargoAtual == Cargo.GERENTE) {
			throw new ValidacaoException("Gerentes não podem ser promovidos!");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionário não bateu a meta!");
		}
	}
	
}