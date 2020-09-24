package Frete;

import com.main.Frete;
import com.main.ValorSemFrete;

public class Sedex implements Frete {

	@Override
	public double Calcula(ValorSemFrete valorSemFrete) {
		return valorSemFrete.valor + 100 ;
	}

}
