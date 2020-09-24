package Frete;

import com.main.Frete;
import com.main.ValorSemFrete;

public class Pac implements Frete {

	@Override
	public double Calcula(ValorSemFrete valorSemFrete) {
		return valorSemFrete.valor + 50;

	}

}
