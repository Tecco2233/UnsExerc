package mtohacker;

import javax.swing.JOptionPane;

public class exerc1 {
	
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 1: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 2: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 3: "));
		
		if(a >= b && a >= c) {
			if (b >= c) {
				JOptionPane.showMessageDialog(null, "A ordem decrescente � " + a + ", " + b + " e " + c);
			}
				else {
					JOptionPane.showMessageDialog(null, "A ordem decrescente � " + a + ", " + c + " e " + b);
					}
			
			}
			if (b >= a && b >= c) {
				if (a >= c) {
					JOptionPane.showMessageDialog(null, "A ordem decrescente � " + b + ", " + a + " e " + c);
			}
				else {
					JOptionPane.showMessageDialog(null, "A ordem decrescente � " + b + ", " + c + " e " + a);
				}}
				else if (c >= a && c >= b) {
				if (a >= b) {
					JOptionPane.showMessageDialog(null, "A ordem decrescente � " + c + ", " + a + " e " + b);
				}
				else {
					JOptionPane.showMessageDialog(null, "A ordem decrescente � " + c + ", " + b + " e " + a);
			}
		}

	}

}

