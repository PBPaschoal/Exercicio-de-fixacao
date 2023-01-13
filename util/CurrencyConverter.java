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

package util;

public class CurrencyConverter {

	public double preco_dolar;
	public double comprar_dolar;
	
	public double cotacao_valor() {
		return (preco_dolar * comprar_dolar) * 6 / 100.0 + preco_dolar * comprar_dolar;
	}
}
