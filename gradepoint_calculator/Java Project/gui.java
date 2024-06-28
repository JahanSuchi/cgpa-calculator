package rough;
import javax.swing.JOptionPane;
public class gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("enter 2nd number");
		
		int n1 = Integer.parseInt(fn);
		int n2 = Integer.parseInt(sn);
		
		int sum = n1+n2;
		
		JOptionPane.showMessageDialog(null,"the ans in "+sum+ "the title");

	}

}
