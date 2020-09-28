package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioRevisaoSwitch2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String modelo;
		
		System.out.println("Olá bem-vindo ao Isidoro, escolha o modelo de carro que você deseja: ");
		System.out.println("Hatch");
		System.out.println("Sedan");
		System.out.println("Motocicleta");
		System.out.println("caminhonete");
		modelo = ler.nextLine();
		
		switch (modelo) {
		case "Hatch":
			System.out.println("Compra efetuada com sucesso!");
			break;
		case "Sedan":
			System.out.println("Tem certeza que não prefere outro modelo?");
			break;
		case "Motocicleta":
			System.out.println("Tem certeza que não prefere outro modelo?");
			break;
		case "Caminhonete":
			System.out.println("Tem certeza que não prefere outro modelo?");
			break;
		}
		ler.close();
	}
}
