package mtohacker;

import javax.swing.JOptionPane;

public class jantounao {
	public static int soma(int x, int y) {
		return x + y;
	}
	public static int subtracao(int x, int y) {
		return x - y;
	}
	public static int multiplicacao(int x, int y) {
		return x * y;
	}
	public static double divisao(int x, int y) {
		return x / y;
	}
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 1: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 2: "));
		
		JOptionPane.showMessageDialog(null, "Total soma: " + soma(a,b) + "\nTotal subtra��o: " + subtracao(a,b) + "\nTotal multiplica��o: " + multiplicacao(a,b) + "\nTotal divis�o: " + divisao(a,b));
	}
	
}
