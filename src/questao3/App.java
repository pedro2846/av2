package questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import questao3.Populacao;
import java.util.Collections;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		ArrayList<Integer> ano = new ArrayList<Integer>();
		int cont = 0;
		int idade;
		String cabelos;
		String olhos;
		String sexo;
		for(;;) {
			
			System.out.print("Digite a idade: ");
			idade = scan.nextInt();
			System.out.print("Cor dos cabelos:");
			cabelos = scan.nextLine();
			System.out.print("Cor dos olhos: ");
			olhos = scan.nextLine();
			System.out.println("Sexo: ");
			sexo = scan.nextLine();
			
			if(idade <= -1) {
				break;
			}else {
				ano.add(idade);
			}
			if((idade>= 18 && idade<= 30) && (olhos == "verdes") && (sexo == "Feminino")) {
				cont++;
			}
			Collections.sort (ano, Collections.reverseOrder());
		}
		System.out.print("A maior idade é : "+ ano.get(0) + " anos.");
		
	}
}
