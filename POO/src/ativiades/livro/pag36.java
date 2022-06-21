package ativiades.livro;

import java.util.Scanner; //programa utiliza oa classe Scanner

public class pag36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cria um Scanner para obter entrada apartir da janela de comndo
		Scanner input = new Scanner(System.in);
		
		int number1; //primeiro número a somar
		int number2; // segundo número a somar
		int sum; // soma de numbr1 e number2
		
		System.out.print("enter first : "); //prompt
	    number1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário 		
	    
	    System.out.print("Enter second integer: "); // prompt
	    number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
	
	    sum = number1 + number2; // soma os números, depois armazena o total em sum
	    System.out.printf("Sum is %d%n", sum); // exibe a soma 
	}  // fim do método main

} // fim da classe Addition



