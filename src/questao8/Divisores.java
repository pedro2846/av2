package questao8;

import java.util.ArrayList;
import java.util.Scanner;

public class Divisores {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int num = 0;
			int var = 0;
			int div3 = 0;
			int div11 = 0;
			int div15 = 0;
			for (;;) {
				System.out.print("Informe um n�mero ou 0 para parar: ");
				num = scan.nextInt();
				if (num == 0) {
					break;
				}
				if (num >= 100 && num <= 2000) {
					var++;
				}
				if (num % 3 == 0) {
					div3++;
				}
				if (num % 11 == 0) {
					div11++;
				}
				if (num % 15 == 0) {
					div15++;
				}
			}
			System.out.println("Dos valores digitados: " + var + " deles est�o entre 100 e 2000");
			System.out.println("Dos valores digitados: " + div3 + " s�o divisiveis por 3");
			System.out.println("Dos valores digitados: " + div11 + " s�o divisiveis por 11");
			System.out.println("Dos valores digitados: " + div15 + " s�o divisiveis por 15");
		}
	}
}
