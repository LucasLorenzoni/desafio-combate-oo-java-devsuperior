package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

/*
	DESAFIO: Combate
	
Em um jogo de combate, cada jogador joga com um campeão. Cada campeão possui um nome, uma
quantidade de ataque, armadura e vida. O combate entre dois campeões é organizado em turnos, de modo
que em cada turno, os dois campeões se atacam. Você deve fazer um programa para instanciar dois
campeões, depois executar N turnos de combate, mostrando a cada turno o estado de cada campeão,
conforme exemplos. Se em um turno um dos campeões morrer (quantidade de vida igual a zero), o
combate deve terminar. Ao final do combate, mostrar na tela "FIM DO COMBATE".

A regra para um campeão A receber dano de outro campeão B é a seguinte:

1) A quantidade de vida do campeão A deve ser decrescida da quantidade de ataque do campeão B, descontada a
quantidade de armadura do campeão A. A quantidade de vida resultante não pode ser menor que zero.

2) Independente da quantidade de armadura do campeão A, pelo menos 1 de vida o campeão A deve perder.

Você deve criar uma classe para representar o campeão, conforme projeto abaixo.

O método takeDamage serve para fazer com que
o campeão receba dano advindo do ataque de
outro campeão, conforme regras acima.

O método status deve retornar o nome e a situação
de vida do campeão (inclusive com a palavra
"morreu" se a vida estiver igual a zero).
*/
public class DesafioCombate {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Champion firstChampion;
		Champion secondChampion;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String firstChampionName = scanner.nextLine();
		System.out.print("Vida inicial: ");
		int firstChampionLife = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Ataque: ");
		int firstChampionAttack = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Armadura: ");
		int firstChampionArmor = scanner.nextInt();
		scanner.nextLine();
		
		firstChampion = new Champion(firstChampionName, firstChampionLife, firstChampionAttack, firstChampionArmor);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		String secondChampionName = scanner.nextLine();
		System.out.print("Vida inicial: ");
		int secondChampionLife = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Ataque: ");
		int secondChampionAttack = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Armadura: ");
		int secondChampionArmor = scanner.nextInt();
		scanner.nextLine();
		
		secondChampion = new Champion(secondChampionName, secondChampionLife, secondChampionAttack, secondChampionArmor);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int turnsCounter = scanner.nextInt();
		scanner.nextLine();
		
		while (turnsCounter <= 0) {
			System.out.print("Número de turnos informado é inválido. Por gentileza, informe quantos turnos você deseja executar: ");
			turnsCounter = scanner.nextInt();
			scanner.nextLine();
		}
		
		for (int i = 0; i < turnsCounter; i++) {
			
			System.out.println();
			System.out.println("Resultado do turno " + (i + 1) + ":");
			
			firstChampion.takeDamage(secondChampion);
			secondChampion.takeDamage(firstChampion);
			
			System.out.println(firstChampion.status());
			System.out.println(secondChampion.status());
			
			if (firstChampion.getLife() == 0 || secondChampion.getLife() == 0) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		scanner.close();
	}
	
}
