package rough;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class result extends JFrame{
    private JLabel item1;
    public int cgpa;
    public void getCGPA(int cgpa) {
    	this.cgpa = cgpa;
    	System.out.println(cgpa);
    	
    }
  
	
	public result() {
		super("RESULT");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("Your cgpa is "+cgpa);
		item1.setToolTipText("hi");
		add(item1);

		
	}
	
}


