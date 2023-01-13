/* Rio de Janeiro, Dia 12/01/2023
 Exercício de fixação - Aula 72:

Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
Criar uma classe CurrencyConverter para ser responsável pelo cálculos.

Exemplo:
What is the dollar price? 3.10
How many dollars will be bought? 200.00
Amount to be paid in reais = 657.20 
 */
package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		CurrencyConverter currencyconverter = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		currencyconverter.preco_dolar = teclado.nextDouble();
		System.out.print("How many dollars will be bought? ");
		currencyconverter.comprar_dolar = teclado.nextDouble();
		System.out.printf("Amount to be paid in reais %.2f%n", currencyconverter.cotacao_valor());
		
		teclado.close();
		
	}

}
