package Aulajava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// aqui estou definindo todas as variaveis que vou utilizar.
		String nome;
float salario;
float abono;
float novoSalario;

Scanner leia = new Scanner(System.in);//aqui estou criando a leitura do meu usuário

System.out.println("\nQual é o seu nome?");//aqui eu adicionei a inclusão do nome.
nome=leia.next();

System.out.println("\nEntre com seu salario: ");// estou pedindo colocar o valor do salario.
salario= leia.nextFloat();//aqui eu estou pedindo para ler o valor colocado anteriormente.

System.out.println("\nEntre com seu abono: ");// estou pedindo para colocar o valor do abono.
abono=leia.nextFloat();//estou pedindo ler o valor colocado anteriormente.

novoSalario=(salario+abono);//aqui estou somando o valor do salario e o abono juntos.

System.out.println("\n "+nome+" Seu novo salario é: "+novoSalario);// aqui irá mostrar o resultado do abono e do salario.




	}

}
