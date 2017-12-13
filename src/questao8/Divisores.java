package questao8;
import java.util.Scanner;
public class Divisores {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		for(;;) {
			System.out.print("Informe um número ou 0 para parar: ");
			num = scan.nextInt();
			if (num == 0) {
				break;
			}
		}
	}
}
