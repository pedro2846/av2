package questao5;

import java.util.Scanner;

public class Operacoes {
public static void main(String[] args) {
	Double valor;
	Scanner scan = new Scanner(System.in);
	System.out.print("Digite um numero");
	valor = scan.nextDouble();
	System.out.println("\nAdição");
	for(int i = 1; i<=10; i++) {
		System.out.println(valor+ " + " + i + " = " + (valor + i));	
	}
	System.out.println("\nSubtração");
	for(int i = 1; i<=10; i++) {
		System.out.println(valor+ " - " + i + " = " + (valor - i));	
	}
	System.out.println("\nMultiplicação");
	for(int i = 1; i<=10; i++) {
		System.out.println(valor+ " * " + i + " = " + (valor * i));	
	}
	System.out.println("\nDivisão");
	for(int i = 1; i<=10; i++) {
		System.out.println(valor+ " / " + i + " = " + (valor / i));	
	}
}
}
