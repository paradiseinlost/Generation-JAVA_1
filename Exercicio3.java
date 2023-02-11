/*
Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e 
os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o Salário Líquido
 */
package Aulajava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salarioBruto,salarioLiquido,horasExtras,descontos,adicionalNoturno;

Scanner leia = new Scanner(System.in);

System.out.println("\nEntre com Salario Bruto: ");
salarioBruto= leia.nextFloat();

System.out.println("\nEntre com Adicional Noturno: ");
adicionalNoturno= leia.nextFloat();

System.out.println("\nEntre com Horas Extras: ");
horasExtras= leia.nextFloat();

System.out.println("\nEntre com Descontos: ");
descontos=leia.nextFloat();

salarioLiquido=salarioBruto+adicionalNoturno+(horasExtras *5)-descontos;

System.out.println("\nTotal proventos:"+salarioLiquido);





		
		
		
		
	}

}
