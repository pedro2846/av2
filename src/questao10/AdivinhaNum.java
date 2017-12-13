package questao10;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AdivinhaNum {

	public static void main(String[] args) {
		Random ran = new Random();
		String num;
		int inum;
		try (Scanner scan = new Scanner(System.in)) {
			int x = ran.nextInt(101);

			JOptionPane.showMessageDialog(null, "****** Numero gerado com sucesso ******");
			for (;;) {
				num = JOptionPane.showInputDialog("Entre com a resposta: ");
				inum = Integer.parseInt(num);
				if (inum == x) {
					JOptionPane.showMessageDialog(null, "Parabéns você acertou o número é: " + x);
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Tente novamente o número está entre :" + (x - 5) + " e " + (x + 5));
				}
			}
		}
	}

}
