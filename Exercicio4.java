/*
 Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e mostre a diferença do produto 
 entre o n1 e n2 pelo produto entre o n3 e o n4.
 */
package Aulajava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float n1;
float n2;
float n3;
float n4;
float diferenca;


Scanner leia = new Scanner(System.in);

System.out.println("\nDigite o primeiro numero : ");
n1=leia.nextFloat();

System.out.println("\n Digite o segundo numero : ");
n2=leia.nextFloat();

System.out.println("\n Digite o terceiro numero : ");
n3=leia.nextFloat();

System.out.println("\nDigite o quarto numero : ");
n4=leia.nextFloat();

diferenca= (n1*n2)-(n3*n4);

System.out.println("\n A Diferença é :"+diferenca );





		
		
		
		
	}
	
}
