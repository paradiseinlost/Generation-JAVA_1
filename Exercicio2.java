/*
 Elabore um algoritmo em Java que leia 4 notas de um participante, em variáveis do tipo float e 
 exiba na tela a média final do participante.
 */
package Aulajava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float nota1,nota2,nota3,nota4,media;

Scanner leia = new Scanner(System.in);

System.out.println("\nEntre com a nota 1: ");
nota1=leia.nextFloat();

System.out.println("\nEntre com a nota 2: ");
nota2=leia.nextFloat();

System.out.println("\nEntre com a nota 3: ");
nota3=leia.nextFloat();

System.out.println("\nEntre com a nota 4: ");
nota4=leia.nextFloat();

media = (nota1+nota2+nota3+nota4) /4;

System.out.println("\nSua media final é: "+media);



	}

}
