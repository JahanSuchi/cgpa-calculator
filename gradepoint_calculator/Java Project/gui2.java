package rough;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gui2 extends JFrame {
	private JLabel item1;
	
	public gui2() {
		super("error");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("Error occured");
		item1.setToolTipText("hi");
		add(item1);
		
	}
		
	

}
