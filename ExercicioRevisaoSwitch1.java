package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioRevisaoSwitch1 {
	public static void main(String[] args) {
		// Crie uma vari�vel chamada �fruta�. Esta vari�vel deve receber uma string com
		// o nome de uma fruta. Ap�s, crie uma estrutura condicional switch que receba
		// esta vari�vel e que possua tr�s casos: caso ma��, retorne no console: �N�o
		// vendemos esta fruta aqui�.
		// Caso kiwi, retorne: �Estamos com escassez de kiwis� e
		// caso melancia, retorne: �Aqui est�, s�o 3 reais o quilo�.
		Scanner ler = new Scanner(System.in);

		String fruta;
		String codigo;

		System.out.println("escolha uma fruta e digite o codigo correspondente: ");
		System.out.println("001 - kiwi");
		System.out.println("002 - ma�a");
		System.out.println("003 - melancia");
		System.out.println("---------------------------------");
		codigo = ler.nextLine();
		
		switch (codigo) {
		case "001":
			
			System.out.println("estamos com escassez de kiwis");
			break;
		case "002":
			System.out.println("Nao temos ma�a");
			break;
		case "003":
			System.out.println("Aqui est�, s�o 3 reais o kg");
			break;
		}
		ler.close();
	}
}
