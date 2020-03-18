package print;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;
import java.awt.print.*;
import java.awt.geom.*;
import netbeanjavaclinic.PatientVO;
//import dumps.Prescription;
//import dumps.Prescription1;
import netbeanjavaclinic.CasePaper;
import netbeanjavaclinic.Prescription;
import netbeanjavaclinic.Prescription2;
import org.jdesktop.application.Application.ExitListener;

public class PrintExample extends JFrame implements ActionListener {
	PatientVO pvo;
        JButton printButton;
       // Prescription2 drawingPanel; 
        JPanel drawingPanel;
        int ctr=0;
   /* public static void main(String[] args) {
		new PrintExample(pvo);
	}*/
        
        
        public PrintExample(PatientVO vo,CasePaper p2) {
                super("Printing Swing Components");
                 ctr=2;
                pvo=vo;
		WindowShow.setNativeLookAndFeel();
		//addWindowListener(new ExitListener());
		Container content = getContentPane();
		 printButton = new JButton("Print");
		printButton.addActionListener(this);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.white);
		buttonPanel.add(printButton);
		content.add(buttonPanel, BorderLayout.SOUTH);
                drawingPanel=p2;
                //Prescription2 drawingPanel=new Prescription2(pvo);
		//DrawingPane drawingPanel = new DrawingPane();
		content.add(drawingPanel, BorderLayout.CENTER);
		setSize(800,700);
		setVisible(true);
	}

	public PrintExample(PatientVO vo,Prescription2 p2) {
                super("Printing Swing Components");
                 ctr=1;
                pvo=vo;
		WindowShow.setNativeLookAndFeel();
		//addWindowListener(new ExitListener());
		Container content = getContentPane();
		 printButton = new JButton("Print");
		printButton.addActionListener(this);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.white);
		buttonPanel.add(printButton);
		content.add(buttonPanel, BorderLayout.EAST);
                drawingPanel=p2;
                //Prescription2 drawingPanel=new Prescription2(pvo);
		//DrawingPane drawingPanel = new DrawingPane();
		content.add(drawingPanel, BorderLayout.CENTER);
		setSize(800,700);
		setVisible(true);
	}
	
        public PrintExample(PatientVO vo,Prescription p2) {
                super("Printing Swing Components..r1");
                 ctr=1;
                pvo=vo;
		WindowShow.setNativeLookAndFeel();
		//addWindowListener(new ExitListener());
		Container content = getContentPane();
		 printButton = new JButton("Print");
		printButton.addActionListener(this);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.white);
		buttonPanel.add(printButton);
		content.add(buttonPanel, BorderLayout.EAST);
                drawingPanel=p2;
        try {
            p2.getJTable1().print();
        } catch (PrinterException ex) {
            Logger.getLogger(PrintExample.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                //Prescription2 drawingPanel=new Prescription2(pvo);
		//DrawingPane drawingPanel = new DrawingPane();
		content.add(drawingPanel, BorderLayout.CENTER);
		setSize(800,700);
		setVisible(true);
	}
        
        
        
        
        
        
        
        
	public void actionPerformed(ActionEvent event) {
           printButton.setVisible(false);
		//PrintableDocument.printComponent(this);
           
          /*  if(jLabel1.getText().equals("nil"))
                jLabel1.setVisible(false);
            if(jLabel5.getText().equals("nil"))
                jLabel5.setVisible(false);
            if(jLabel6.getText().equals("nil"))
                jLabel6.setVisible(false);
            if(jLabel10.getText().equals("nil"))
                jLabel10.setVisible(false);
            if(jLabel9.getText().equals("nil"))
                jLabel9.setVisible(false);
            if(jLabel11.getText().equals("nil"))
                jLabel11.setVisible(false);
            if(jLabel12.getText().equals("nil"))
                jLabel12.setVisible(false); */
           
           
           
           
           
           
                PrintableDocument.printComponent(this);
                
	}
	
	class DrawingPane extends JPanel {
		private int fontSize = 90;
		private String message = "Roseindia.net";
		private int messageWidth;
		
		public DrawingPane() {
			setBackground(Color.white);
			Font font = new Font("Serif", Font.PLAIN, fontSize);
			setFont(font);
			FontMetrics metrics = getFontMetrics(font);
			messageWidth = metrics.stringWidth(message);
			int width = messageWidth*5/3;
			int height = fontSize*3;
			setPreferredSize(new Dimension(width, height));
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D graph = (Graphics2D)g;
			int x = messageWidth/10;
			int y = fontSize*5/2;
			graph.translate(x, y);
			graph.setPaint(Color.lightGray);
			
			AffineTransform origTransform = graph.getTransform();
			graph.shear(-0.95, 0);
			graph.scale(1, 3);
			graph.drawString(message, 0, 0);
			graph.setTransform(origTransform);
			graph.setPaint(Color.black);
			graph.drawString(message, 0, 0); 
		}
	}
}

    
