package ativiades.livro;

import java.util.Scanner; //programa utiliza oa classe Scanner

public class pag36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cria um Scanner para obter entrada apartir da janela de comndo
		Scanner input = new Scanner(System.in);
		
		int number1; //primeiro n?mero a somar
		int number2; // segundo n?mero a somar
		int sum; // soma de numbr1 e number2
		
		System.out.print("enter first : "); //prompt
	    number1 = input.nextInt(); // l? primeiro o n?mero fornecido pelo usu?rio 		
	    
	    System.out.print("Enter second integer: "); // prompt
	    number2 = input.nextInt(); // l? o segundo n?mero fornecido pelo usu?rio
	
	    sum = number1 + number2; // soma os n?meros, depois armazena o total em sum
	    System.out.printf("Sum is %d%n", sum); // exibe a soma 
	}  // fim do m?todo main

} // fim da classe Addition



