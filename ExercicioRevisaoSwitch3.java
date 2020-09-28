package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioRevisaoSwitch3 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int soma, subtracao, multiplicacao, divisao;
		int valor1;
		int valor2;
		String operacao;

		System.out.println("Escolha a operação desejada");
		System.out.println("soma");
		System.out.println("subtracao");
		System.out.println("multiplicacao");
		System.out.println("divisao");
		System.out.println("___________________________");
		operacao = ler.nextLine();

		switch (operacao) {
		case "soma":
			System.out.println("digite um valor: ");
			valor1 = ler.nextInt();
			System.out.println("digitre outro valor: ");
			valor2 = ler.nextInt();
			soma = valor1 + valor2;
			System.out.println("A soma dos numeros é: " + soma);
			break;

		case "subtracao":
			System.out.println("digite um valor: ");
			valor1 = ler.nextInt();
			System.out.println("digitre outro valor: ");
			valor2 = ler.nextInt();
			subtracao = valor1 - valor2;
			System.out.println("A subtração dos numeros é: " + subtracao);
			break;

		case "divisao":
			System.out.println("digite um valor: ");
			valor1 = ler.nextInt();
			System.out.println("digitre outro valor: ");
			valor2 = ler.nextInt();
			divisao = valor1 / valor2;
			System.out.println("A subtração dos numeros é: " + divisao);
			break;

		case "multiplicacao":
			System.out.println("digite um valor: ");
			valor1 = ler.nextInt();
			System.out.println("digitre outro valor: ");
			valor2 = ler.nextInt();
			multiplicacao = valor1 * valor2;
			System.out.println("A subtração dos numeros é: " + multiplicacao);
			break;
		}

		ler.close();
	}
}
