package Aulajava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double salarioBruto,salarioLiquido,horasExtras,descontos,adicionalNoturno;

Scanner leia = new Scanner(System.in);

System.out.println("\nEntre com Salario Bruto: ");
salarioBruto= leia.nextDouble();

System.out.println("\nEntre com Adicional Noturno: ");
adicionalNoturno= leia.nextDouble();

System.out.println("\nEntre com Horas Extras: ");
horasExtras= leia.nextDouble();

System.out.println("\nEntre com Descontos: ");
descontos=leia.nextDouble();

salarioLiquido=salarioBruto+adicionalNoturno+(horasExtras *5)-descontos;

System.out.println("\nTotal proventos:"+salarioLiquido);





		
		
		
		
	}

}
