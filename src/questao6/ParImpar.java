package questao6;

public class ParImpar {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		for(int i=1; i<=100 ;i++){
			System.out.print(i + "-");
			if(i%7==0) {
				System.out.print("(multiplo de 7)");
			}
		}
		for(int i = 1; i<= 100; i++) {
			if(i%2==0) {
				n1 = n1 + i;
			}
			else {
				n2 = n2 + i;
			}
		}
		System.out.println("\nA soma dos pares é: "+n1);
		System.out.println("A soma dos impares é: "+n2);
	}
}
