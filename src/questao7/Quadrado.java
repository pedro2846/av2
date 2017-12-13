package questao7;
import java.util.Scanner;
public class Quadrado {
	public static void main(String[] args) {
		Integer lado1;
		Integer lado2;
		Integer lado3;
		Integer lado4;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro lado do quadrado:");
		lado1 = scan.nextInt();
		System.out.println("Digite o valor do segundo lado do quadrado:");
		lado2=scan.nextInt();
		System.out.println("Digite o valor do terceiro lado do quadrado:");
		lado3=scan.nextInt();
		System.out.println("Digite o valor do quarto lado do quadrado:");
		lado4=scan.nextInt();
		
		if(lado1 == lado2 && lado1 == lado3 && lado1 == lado4) {
			System.out.println("É  um Quadrado Perfeito");

		}
	}
}
