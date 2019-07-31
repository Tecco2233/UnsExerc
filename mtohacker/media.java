package mtohacker;
import javax.swing.JOptionPane;
public class media {
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 3: "));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 4: "));
		int e = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 5: "));
		
		double Re = (a + b + c + d + e)/5;
		
		JOptionPane.showMessageDialog(null, "A média é: " + Re);
	}
}
