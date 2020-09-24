package com.main;

public class CalculadorDeFrete {
	public double RealizaCalculo(Frete frete, ValorSemFrete valorSemFrete) {
		return frete.Calcula(valorSemFrete);
	}
}
