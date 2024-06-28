package rough;

import javax.swing.JFrame;

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result r = new result();
		int cgpa = 4;
		r.getCGPA(cgpa);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(200,300);
		r.setVisible(true);


	}

}
