package questao4;
import java.util.Scanner;

import java.util.ArrayList;
public class App {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
		ArrayList<Integer> equi = new ArrayList<Integer>();
		ArrayList<Integer> iso = new ArrayList<Integer>();
		ArrayList<Integer> esc = new ArrayList<Integer>();
		int lado1;
		int lado2;
		int lado3;
		
		for (;;) {

			System.out.println("Informe o primeiro lado do triangulo");
			lado1 = scan.nextInt();
			System.out.println("Informe o segundo lado do triangulo");
			lado2 = scan.nextInt();
			System.out.println("Informe o Terceiro lado do triangulo");
			lado3 = scan.nextInt();
			if(lado1 == 0 || lado2 == 0 || lado3 == 0) {
				break;
			}
			
		if ((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)){
			equi.add(lado1);
			equi.add(lado2);
			equi.add(lado3);
		}
		if ((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)){
			esc.add(lado1);
			esc.add(lado2);
			esc.add(lado3);
		}
		if((lado1 == lado2) && (lado1 != lado3) || (lado2 == lado3) && (lado2 != lado1) || (lado3 == lado1) &&(lado3 != lado2)) {
			iso.add(lado1);
			iso.add(lado2);
			iso.add(lado3);
		}

		}
		System.out.println("Existem :"+ equi.size()/3 + " triangulos equilateros.");
		System.out.println("Existem :"+ iso.size()/3 + " triangulos isósceles.");
		System.out.println("Existem :"+ esc.size()/3 + " triangulos escaleno.");
	}
	}
}
