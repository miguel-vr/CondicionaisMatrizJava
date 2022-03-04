package br.com.exercicios.java3;

import java.util.Scanner;

public class Condicional04 {

	public static void main(String[] args) {
		int idade, sexo, caracPsicologica, entradas = 1, pessoaCalma = 0, outrosCalmo = 0, calmoMenor18 = 0,
				mulherNervosa = 0, nervosoMaior40 = 0, homemAgressivo = 0;

		Scanner leitor = new Scanner(System.in);

		while (entradas <= 3) {
			System.out.println("Informe a idade: ");
			idade = leitor.nextInt();

			System.out.println("Informe o sexo:\n 1 - FEMININO \n2-MASCULINO \n3-OUTROS");
			sexo = leitor.nextInt();

			switch (sexo) {
			case 1:
				break;

			case 2:
				break;

			case 3:
				break;
			default:
				break;
			}

			System.out.println("Em qual das opções a pessoa se encaixa: (Informe o número relacionado a opção!");
			System.out.println("\n1 - CALMA \n2 - NERVOSA \n3 - AGRESSIVA");
			caracPsicologica = leitor.nextInt();

			switch (caracPsicologica) {
			case 1:
				pessoaCalma++;
				if (idade < 18) {
					calmoMenor18++;
				}
				if (sexo == 3) {
					outrosCalmo++;
				}
				break;

			case 2:
				if (sexo == 1) {
					mulherNervosa++;
				}
				if (idade > 40) {
					nervosoMaior40++;
				}
				break;

			case 3:
				if (sexo == 2) {
					homemAgressivo++;
				}
				break;
			default:
				break;
			}
			entradas++;

		}

		leitor.close();

		System.out.println("PESSOAS CALMAS | QUANTIDADE: " + pessoaCalma + "\n" + "\nMULHERES NERVOSAS | QUANTIDADE: "
				+ mulherNervosa + "\n" + "\nHOMENS AGRESSIVOS | QUANTIDADE: " + homemAgressivo + "\n"
				+ "\nOUTROS CALMOS | QUANTIDADE: " + outrosCalmo + "\n"
				+ "\nPESSOAS NERVOSAS COM MAIS DE 40 ANOS | QUANTIDADE: " + nervosoMaior40 + "\n"
				+ "\nPESSOAS CALMAS COM MENOS DE 18 ANOS | QUANTIDADE: " + calmoMenor18);


	}

}
