package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioRevisaoSwitch1 {
	public static void main(String[] args) {
		// Crie uma variável chamada “fruta”. Esta variável deve receber uma string com
		// o nome de uma fruta. Após, crie uma estrutura condicional switch que receba
		// esta variável e que possua três casos: caso maçã, retorne no console: “Não
		// vendemos esta fruta aqui”.
		// Caso kiwi, retorne: “Estamos com escassez de kiwis” e
		// caso melancia, retorne: “Aqui está, são 3 reais o quilo”.
		Scanner ler = new Scanner(System.in);

		String fruta;
		String codigo;

		System.out.println("escolha uma fruta e digite o codigo correspondente: ");
		System.out.println("001 - kiwi");
		System.out.println("002 - maça");
		System.out.println("003 - melancia");
		System.out.println("---------------------------------");
		codigo = ler.nextLine();
		
		switch (codigo) {
		case "001":
			
			System.out.println("estamos com escassez de kiwis");
			break;
		case "002":
			System.out.println("Nao temos maça");
			break;
		case "003":
			System.out.println("Aqui está, são 3 reais o kg");
			break;
		}
		ler.close();
	}
}
