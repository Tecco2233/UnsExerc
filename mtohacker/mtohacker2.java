package mtohacker;

import javax.swing.JOptionPane;

public class mtohacker2 {
	
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 3: "));
		
		if(a >= b && a >= c) {
			if (b >= c) {
				JOptionPane.showMessageDialog(null, "A ordem crescente é " + c + ", " + b + " e " + a);
			}
				else {
					JOptionPane.showMessageDialog(null, "A ordem crescente é " + b + ", " + c + " e " + a);
					}
			
			}
			if (b >= a && b >= c) {
				if (a >= c) {
					JOptionPane.showMessageDialog(null, "A ordem crescente é " + c + ", " + a + " e " + b);
			}
				else {
					JOptionPane.showMessageDialog(null, "A ordem crescente é " + a + ", " + c + " e " + b);
				}}
				else if (c >= a && c >= b) {
				if (a >= b) {
					JOptionPane.showMessageDialog(null, "A ordem crescente é " + b + ", " + a + " e " + c);
				}
				else {
					JOptionPane.showMessageDialog(null, "A ordem crescente é " + a + ", " + b + " e " + c);
			}
		}

	}

}