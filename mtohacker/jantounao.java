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
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));
		
		JOptionPane.showMessageDialog(null, "Total soma: " + soma(a,b) + "\nTotal subtração: " + subtracao(a,b) + "\nTotal multiplicação: " + multiplicacao(a,b) + "\nTotal divisão: " + divisao(a,b));
	}
	
}
