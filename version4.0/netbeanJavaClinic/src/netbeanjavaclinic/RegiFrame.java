/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RegiFrame.java
 *
 * Created on 26 Sep, 2011, 1:47:07 PM
 */
package netbeanjavaclinic;
import dumps.CustValuObj;
import dumps.CustDao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
/**
 *
 * @author DELL
 */
public class RegiFrame extends javax.swing.JFrame implements ActionListener{

    /** Creates new form RegiFrame */
    @SuppressWarnings("LeakingThisInConstructor")
    public RegiFrame() {
        initComponents();
        //n=1;
        j1=new NewJFrame();
        cvo=new PatientVO();
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton2.setVisible(false);
         this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
       int n= PatientDao.getLastCid();
            n++;
            System.out.println("n"+n);
            jTextField1.setText(""+n);
            
        // java.util.Date d=new java.util.Date();
        //    int dd= d.getDay();
        //    int mm=d.getMonth();
        //    int yy=d.getYear();
        //    Date today=new Date(dd,mm,yy);
          // String t1=today.getDateString();
          //  jTextField3.setText(""+today);
            
            java.util.Date ud=new java.util.Date();
            
            java.sql.Date sd=new  java.sql.Date(ud.getTime());
        System.out.println(sd);
            
             jTextField3.setText(""+sd);
            
              
        
        
        
        
    }
     public void actionPerformed(ActionEvent ae)
     {
       //con=  DBConnector.getInstance().getNewConnection();
      // System.out.println(con);
         if(ae.getSource()==jButton1)
         {
            int n= PatientDao.getLastCid();
            n++;
            System.out.println("n"+n);
            jTextField1.setText(""+n);
            
        // java.util.Date d=new java.util.Date();
        //    int dd= d.getDay();
        //    int mm=d.getMonth();
        //    int yy=d.getYear();
        //    Date today=new Date(dd,mm,yy);
          // String t1=today.getDateString();
          //  jTextField3.setText(""+today);
            
            java.util.Date ud=new java.util.Date();
            
            java.sql.Date sd=new  java.sql.Date(ud.getTime());
        System.out.println(sd);
            
             jTextField3.setText(""+sd);
            
            
            
        /** 
             * Setting values from from into VO
             
             */    
       String id=jTextField1.getText(); 
       String name=jTextField2.getText(); 
       String dt=jTextField3.getText(); 
       String addr=jTextField4.getText();
        if(addr.equals(""))
        addr="nil";
        String pf=jTextField5.getText(); 
        if(pf.equals(""))
        pf="0";
       String child=jTextField6.getText(); 
        if(child.equals(""))
        child="0";
       String age=jTextField7.getText(); 
        if(age.equals(""))
        age="0";
       String gender=(String)jComboBox1.getSelectedItem(); 
        String martSt=(String)jComboBox2.getSelectedItem(); 
      String edu=(String)jComboBox3.getSelectedItem(); 
      String occu=(String)jComboBox4.getSelectedItem(); 
      String refBy=(String)jComboBox5.getSelectedItem();  
       
       cvo.reg=Integer.parseInt(id);
       cvo.name=name;
       cvo.d1=sd;
       cvo.adr=addr;
       cvo.phone=pf;
       cvo.child=child;
        cvo.age=age;
        cvo.gender=gender;
        cvo.MarSt=martSt;
        cvo.educt=edu;
        cvo.occup=occu;
        cvo.refby=refBy;
        
       // j1.cvo=cvo;
        j1.setCvo(cvo);
        this.setVisible(false);
        System.out.println("xyz"+cvo.name);
       // j1.jLabel26.setText(cvo.name);
        j1.setVisible(true);
       //  String s2=jTextField2.getText();
        //  String s3=jTextField3.getText();
        //  cvo.setCid(n);
        //  cvo.setName(s2);
        //  j1.setCvo(cvo);
         // j1.setVisible(true);
          
      // CustValuObj cvo=new CustValuObj(n,s2,s3);
       //  int x=  CustDao.insertCust(cvo);
     //  System.out.println("x"+x);
         }
         if(ae.getSource()==jButton2)
         {
             
             CustValuObj cvo =CustDao.selectById(jTextField1.getText());
             System.out.println(cvo);
         }
         
         
     }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(netbeanjavaclinic.NetbeanJavaClinicApp.class).getContext().getResourceMap(RegiFrame.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(jLabel1.getFont().deriveFont((jLabel1.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jLabel1.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, -1, -1));

        jTextField1.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jTextField1.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 140, 20));

        jLabel2.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 22, 41, -1));

        jTextField2.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jTextField2.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 109, 20));

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setForeground(resourceMap.getColor("jButton1.foreground")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 312, 223, -1));

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 312, -1, -1));

        jLabel3.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 22, -1, -1));

        jTextField3.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jTextField3.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
        jTextField3.setName("jTextField3"); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 114, -1));

        jLabel4.setFont(jLabel4.getFont().deriveFont((jLabel4.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jLabel4.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, 60, -1));

        jLabel5.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 86, -1, -1));

        jLabel6.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 86, -1, -1));

        jTextField4.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jTextField4.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jTextField4.setText(resourceMap.getString("jTextField4.text")); // NOI18N
        jTextField4.setName("jTextField4"); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 141, -1));

        jTextField5.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jTextField5.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jTextField5.setText(resourceMap.getString("jTextField5.text")); // NOI18N
        jTextField5.setName("jTextField5"); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 114, 20));

        jComboBox1.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jComboBox1.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male" }));
        jComboBox1.setName("jComboBox1"); // NOI18N
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 109, 20));

        jLabel7.setFont(jLabel7.getFont().deriveFont((jLabel7.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jLabel7.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, -1));

        jLabel8.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 155, -1, -1));

        jLabel9.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 155, 41, -1));

        jComboBox2.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jComboBox2.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Married", "Unmarried", "Widow/er", "Divorcee", "Deserted", " " }));
        jComboBox2.setName("jComboBox2"); // NOI18N
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 124, -1));

        jTextField6.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jTextField6.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jTextField6.setText(resourceMap.getString("jTextField6.text")); // NOI18N
        jTextField6.setName("jTextField6"); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 114, -1));

        jTextField7.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jTextField7.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jTextField7.setText(resourceMap.getString("jTextField7.text")); // NOI18N
        jTextField7.setName("jTextField7"); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 109, 20));

        jLabel10.setFont(jLabel10.getFont().deriveFont((jLabel10.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jLabel10.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 236, -1, -1));

        jLabel11.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 236, -1, -1));

        jLabel12.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 236, -1, -1));

        jComboBox3.setEditable(true);
        jComboBox3.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jComboBox3.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BA", "BSc", "Bcom", "BE", "MBBS", "BAMS", "PG", "PHD", "CA", "Architect", "IT", "HSC", "SSC", "Primary", "Secondary", "Illiterate", "other", " ", " " }));
        jComboBox3.setName("jComboBox3"); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 110, 20));

        jComboBox4.setEditable(true);
        jComboBox4.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jComboBox4.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AutoRikshaw Driver", "Builder", "Business", "Carpenter", "Doctor", "Driver", "Farming", "House wife", "Labourer", "Lawyer", "Meson", "CGService", "MGService", "PvtService", "Student", "Teacher", "Unemployeed", " ", " " }));
        jComboBox4.setName("jComboBox4"); // NOI18N
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 114, 20));

        jComboBox5.setEditable(true);
        jComboBox5.setFont(resourceMap.getFont("jComboBox5.font")); // NOI18N
        jComboBox5.setForeground(resourceMap.getColor("jComboBox5.foreground")); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Self", "Dr.Bhave", "Dr.Abnave", "Dr.Bafna", "Dr.Bakare", "Dr.Belhe", "Dr.Bhambure", "Dr.Bhosale", "Dr.Bhujabal", "Dr.Chavan ", "Dr.Chavan Nilima", "Dr.Chavan Suren", "Dr.Dabake", "Dr.Devdhar", "Dr.Dole", "Dr.Dorge", "Dr.DubePatil", "Dr.Gandhi", "Dr.Gund", "Dr.Hambir", "Dr.Harphale", "Dr.Hegde", "Dr.Ingale", "Dr.Jagadale", "Dr.Jagatap", "Dr.Joshi Rasika", "Dr.Joshi Ravindra", "Dr.Kalbhor Rahul", "Dr.Karambelkar", "Dr.Karmarkar", "Dr.Katkar", "Dr.Kenjale", "Dr.Kothari", "dr.Kshirsagar", "Dr.Kulkarni Bahar", "Dr.kulkarni R.B.", "Dr.Kulkarni Rahul", "Dr.Kumbhar", "Dr.Kurtkoti", "Dr.Mane", "Dr.Momin", "Dr.Mundle", "Dr.Parbhane", "Dr.Paygude", "Dr.Penurkar", "Dr.Pimpre", "Dr.Pingale", "Dr.Pote", "Dr.Pujari ", "Dr.Ranade A", "Dr.Ranade", "Dr.Sambare", "Dr.Satav", "Dr.Satav R D", "Dr.Shah", "Dr.Shelar", "Dr.Shende", "Dr.Shikhare", "Dr.Shinde", "Dr.Salunke Deepak", "Dr.Salunke Sanjay", "Dr.Solunke", "Dr.Talathi", "Dr.Tamhane", "Dr.Tupe", "Dr.Vaidya", "Dr.Wanve", "Dr.Zende", "Dr.Zumbre", " ", " " }));
        jComboBox5.setName("jComboBox5"); // NOI18N
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 109, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public PatientVO cvo;
    private java.sql.Connection con;
    NewJFrame j1;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
   // java.sql.Date sd;
  //  int n;
    static int n=0;

}
