package Aulajava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double nota1,nota2,nota3,nota4,media;

Scanner leia = new Scanner(System.in);

System.out.println("\nEntre com a nota 1: ");
nota1=leia.nextDouble();

System.out.println("\nEntre com a nota 2: ");
nota2=leia.nextDouble();

System.out.println("\nEntre com a nota 3: ");
nota3=leia.nextDouble();

System.out.println("\nEntre com a nota 4: ");
nota4=leia.nextDouble();

media = (nota1+nota2+nota3+nota4) /4;

System.out.println("\nSua media final �: "+media);



	}

}
