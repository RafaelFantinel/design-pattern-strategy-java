package com.main;

import Frete.Pac;
import Frete.Sedex;

public class Main {
	public static void main(String[] args) {
		String tipoDeFrete = "Pac";
		ValorSemFrete valorSemFrete = new ValorSemFrete(500.0);
		Frete frete = null;

		if (tipoDeFrete == "Sedex") {
			frete = new Sedex();
		} else {
			frete = new Pac();
		}

		CalculadorDeFrete calculador = new CalculadorDeFrete();

		System.out.println("Valor com Frete : " + calculador.RealizaCalculo(frete, valorSemFrete));

	}
}
