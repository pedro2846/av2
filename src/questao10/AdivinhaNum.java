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
					JOptionPane.showMessageDialog(null, "Parab�ns voc� acertou o n�mero �: " + x);
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Tente novamente o n�mero est� entre :" + (x - 5) + " e " + (x + 5));
				}
			}
		}
	}

}
