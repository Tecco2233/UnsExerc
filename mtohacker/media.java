package mtohacker;
import javax.swing.JOptionPane;
public class media {
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 1: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 2: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 3: "));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 4: "));
		int e = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 5: "));
		
		double Re = (a + b + c + d + e)/5;
		
		JOptionPane.showMessageDialog(null, "A m�dia �: " + Re);
	}
}
