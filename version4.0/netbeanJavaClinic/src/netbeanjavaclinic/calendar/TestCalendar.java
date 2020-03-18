package netbeanjavaclinic.calendar;

import billingdesktopapplication.MyJPane;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import utilities.FunctionDateTable1;




public class TestCalendar extends JFrame{
      // FunctionDateTable1 c;
    MyJPane mjp;
	/**
	 * @param args
	 */
	
	public TestCalendar() {
		// TODO Auto-generated constructor stub
		//c=new FunctionDateTable1();
		//Container cp=this.getContentPane() ;
		//cp.add(c);
         //   mjp=new MyJPane(new JPanel());
            
            Container cp=this.getContentPane() ;
		cp.add(mjp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    TestCalendar tc=new TestCalendar();
	
	      tc.setSize(400,400);
	      tc.setVisible(true);
	}
       

}
