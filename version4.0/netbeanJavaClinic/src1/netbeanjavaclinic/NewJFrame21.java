/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on 26 Sep, 2011, 3:32:22 PM
 */
package netbeanjavaclinic;
import java.awt.event.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class NewJFrame21 extends javax.swing.JFrame implements ActionListener{
    PatientVO cvo;
    Appointment apt;
    /** Creates new form NewJFrame */
    public NewJFrame21() {
        
        initComponents();
        
       //  jTextField1.setVisible(false);
        // jLabel51.setVisible(false);
         System.out.println("in fr21"+jLabel45.getText());
         jButton1.addActionListener(this);
         jButton3.addActionListener(this);
         dg=new Dignosis();
          this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
       // cvo=new CustValuObj();
    }
    
    public void setCvo(PatientVO cvo)
    {
        
        String s="";
        this.cvo=cvo;
       //
        jTextField2.setText(cvo.pastfh);
       // jTextField3.setText(cvo.medh);
         jTextArea6.setText(cvo.pastfh);
       jTextArea7.setText(cvo.medh);
        jLabel25.setText(cvo.durill);
        jLabel26.setText(cvo.sleep);
        jLabel27.setText(cvo.aptit);
        jLabel28.setText(cvo.palpi);
        jLabel29.setText(cvo.trem);
        //jLabel30.setText(cvo.hallu);
       // jLabel31.setText(cvo.delu);
        jLabel54.setText(cvo.name);
        jTextArea8.setText(cvo.hallu);
       jTextArea9.setText(cvo.delu);
        
        jLabel32.setText(cvo.insight);
        jLabel33.setText(cvo.judg);
        jLabel34.setText(cvo.dreaming);
        jLabel35.setText(cvo.orien);
        jLabel36.setText(cvo.recentm);
        jLabel37.setText(cvo.remotm);
        jLabel38.setText(cvo.cstate);
        jLabel39.setText(cvo.mood);
      //  jLabel40.setText(cvo.others);
        
         jTextArea4.setText(cvo.others);
        
        jLabel19.setText(cvo.pers1);
        jLabel20.setText(cvo.pers2);
        jLabel21.setText(cvo.pers3);
        jLabel22.setText(cvo.pers4);
        jLabel23.setText(cvo.pers5);
        jLabel24.setText(cvo.pers6);
        
        jTextArea1.setText(cvo.digno);
       jTextArea2.setText(cvo.m1);
      // jTextArea3.setText(cvo.m2);
     //  jTextArea4.setText(cvo.m3);
      //  String s=cvo.followc+
       if(cvo!=null&&cvo.followdt!=null){
        s=    (""+(cvo.followc)+cvo.followdt.toString());
         jTextField1.setText(cvo.followdt.toString());
       }
      
       java.util.Date d=new java.util.Date();
       jTextArea5.setText(cvo.followc+"\nNewComment"+d+"\n");
     //  jTextArea5.setText("\nd\n");
        jLabel51.setText("Followup Due..");
      jTextField1.setText(cvo.followdt.toString());
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
     {
                 
         if(ae.getSource()==jButton3)
         {
             System.out.println("back");
           //  search=new NewJFrame1();
             search.setVisible(true);
         }
         else
         {
             System.out.println("in pf");
          String foll= this.jTextArea5.getText();
      String s=this.jTextField1.getText();
      System.out.println(s+"s");
      
      
           SimpleDateFormat d1=new SimpleDateFormat("yyyy-dd-mm");
          d1.setLenient(false);
          
   // JFormattedTextField jtff=    new JFormattedTextField(d1);
    //   String s=jTextField1.getText();
     //  System.out.println("dt"+s);
       try{
             d1.parse(s);
             
       }
       catch(ParseException pe){
           
           
           System.out.println("in catch");
        JOptionPane.showMessageDialog(jTextField1,"no dt format","Error Dialog",
              JOptionPane.ERROR_MESSAGE);
      
      
      
      
      
       }
      
      
      
    //  String[] s1=s.split("/");
      
     // java.util.Date ud=new java.util.Date(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]),Integer.parseInt(s1[2]));
      cvo.followdt=Date.valueOf(s) ;
      //cvo.followdt=new java.sql.Date(ud.getTime());
      //   cvo.followdt=new Date(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]),Integer.parseInt(s1[2]));
         System.out.println("dt"+cvo.followdt);
         PatientDao.updatePatient(cvo.reg,foll,cvo.followdt);
         //cvo.durill=duration.getSelectedItem();    
         System.out.println("updated");
       // this.cvo.durill=(String)jComboBox1.getSelectedItem(); 
       
         JOptionPane.showMessageDialog(this,"Record Updated");
        //cvo.setAdres(jTextField1.getText());
       // System.out.println("cvo"+cvo);    
        
           apt=new Appointment(cvo.reg);
               apt.setVisible (true);
               this.setVisible(false); 
         
         
         
         
         
      //  System.exit(0) ;
      //   int x=  CustDao.insertCust(cvo);
     //  System.out.println("x"+x);
        
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel52 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();

        jFrame1.setName("jFrame1"); // NOI18N

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jFrame2.setName("jFrame2"); // NOI18N

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(netbeanjavaclinic.NetbeanJavaClinicApp.class).getContext().getResourceMap(NewJFrame21.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setBounds(new java.awt.Rectangle(0, 0, 1200, 800));
        setName("Form"); // NOI18N
        getContentPane().setLayout(null);

        jTextField1.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        jTextField1.setForeground(resourceMap.getColor("jTextField1.foreground")); // NOI18N
        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(650, 590, 140, 30);

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setForeground(resourceMap.getColor("jButton1.foreground")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 620, 127, 77);

        jLabel18.setText(resourceMap.getString("jLabel18.text")); // NOI18N
        jLabel18.setName("jLabel18"); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(1210, 764, 41, 14);

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(1626, 1680, 73, 23);

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(1218, 1038, 96, 20);

        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
        jTextField3.setName("jTextField3"); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(1277, 989, 90, 20);

        jLabel30.setText(resourceMap.getString("jLabel30.text")); // NOI18N
        jLabel30.setName("jLabel30"); // NOI18N
        getContentPane().add(jLabel30);
        jLabel30.setBounds(262, 1092, 40, 27);

        jLabel31.setText(resourceMap.getString("jLabel31.text")); // NOI18N
        jLabel31.setName("jLabel31"); // NOI18N
        getContentPane().add(jLabel31);
        jLabel31.setBounds(1167, 1095, 40, 21);

        jLabel40.setText(resourceMap.getString("jLabel40.text")); // NOI18N
        jLabel40.setName("jLabel40"); // NOI18N
        getContentPane().add(jLabel40);
        jLabel40.setBounds(861, 965, 49, 18);

        jLabel43.setText(resourceMap.getString("jLabel43.text")); // NOI18N
        jLabel43.setName("jLabel43"); // NOI18N
        getContentPane().add(jLabel43);
        jLabel43.setBounds(1614, 401, 63, 29);

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setName("jTextArea3"); // NOI18N
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(1623, 436, 152, 96);

        jPanel1.setName("jPanel1"); // NOI18N

        jLabel45.setFont(resourceMap.getFont("jLabel49.font")); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 0, 102));
        jLabel45.setText("Schizoid"); // NOI18N
        jLabel45.setName("jLabel45"); // NOI18N

        jLabel46.setFont(resourceMap.getFont("jLabel49.font")); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 0, 102));
        jLabel46.setText("Paranoid"); // NOI18N
        jLabel46.setName("jLabel46"); // NOI18N

        jLabel47.setFont(resourceMap.getFont("jLabel49.font")); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 0, 102));
        jLabel47.setText("Histrioic"); // NOI18N
        jLabel47.setName("jLabel47"); // NOI18N

        jLabel48.setFont(resourceMap.getFont("jLabel49.font")); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 0, 102));
        jLabel48.setText("Obsessive"); // NOI18N
        jLabel48.setName("jLabel48"); // NOI18N

        jLabel49.setFont(resourceMap.getFont("jLabel49.font")); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 0, 102));
        jLabel49.setText("Schizotypal"); // NOI18N
        jLabel49.setName("jLabel49"); // NOI18N

        jLabel50.setFont(resourceMap.getFont("jLabel49.font")); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 0, 102));
        jLabel50.setText("Borderline"); // NOI18N
        jLabel50.setName("jLabel50"); // NOI18N

        jLabel24.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 102));
        jLabel24.setText(resourceMap.getString("jLabel24.text")); // NOI18N
        jLabel24.setName("jLabel24"); // NOI18N

        jLabel23.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 102));
        jLabel23.setText(resourceMap.getString("jLabel23.text")); // NOI18N
        jLabel23.setName("jLabel23"); // NOI18N

        jLabel22.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 102));
        jLabel22.setText(resourceMap.getString("jLabel22.text")); // NOI18N
        jLabel22.setName("jLabel22"); // NOI18N

        jLabel21.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 102));
        jLabel21.setText(resourceMap.getString("jLabel21.text")); // NOI18N
        jLabel21.setName("jLabel21"); // NOI18N

        jLabel20.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 102));
        jLabel20.setText(resourceMap.getString("jLabel20.text")); // NOI18N
        jLabel20.setName("jLabel20"); // NOI18N

        jLabel19.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 102));
        jLabel19.setText(resourceMap.getString("jLabel19.text")); // NOI18N
        jLabel19.setName("jLabel19"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel49))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24))
                .addGap(95, 95, 95))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel49, jLabel50});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel21, jLabel22, jLabel23, jLabel24});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel46, jLabel47, jLabel48, jLabel49, jLabel50});

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 340, 430, 260);

        jScrollPane10.setName("jScrollPane10"); // NOI18N

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jTextArea10.setName("jTextArea10"); // NOI18N
        jScrollPane10.setViewportView(jTextArea10);

        getContentPane().add(jScrollPane10);
        jScrollPane10.setBounds(1261, 752, 166, 96);

        jPanel2.setName("jPanel2"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel25.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText(resourceMap.getString("jLabel25.text")); // NOI18N
        jLabel25.setName("jLabel25"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(64, 14));

        jLabel5.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(64, 14));

        jLabel27.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 102));
        jLabel27.setText(resourceMap.getString("jLabel27.text")); // NOI18N
        jLabel27.setName("jLabel27"); // NOI18N

        jLabel6.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(64, 14));

        jLabel28.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 102));
        jLabel28.setText(resourceMap.getString("jLabel28.text")); // NOI18N
        jLabel28.setName("jLabel28"); // NOI18N

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel29.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 102));
        jLabel29.setText("jLabel29");
        jLabel29.setName("jLabel29"); // NOI18N

        jLabel10.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        jLabel32.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 102));
        jLabel32.setText(resourceMap.getString("jLabel32.text")); // NOI18N
        jLabel32.setName("jLabel32"); // NOI18N

        jLabel26.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 102));
        jLabel26.setText(resourceMap.getString("jLabel26.text")); // NOI18N
        jLabel26.setName("jLabel26"); // NOI18N

        jLabel11.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        jLabel33.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 102));
        jLabel33.setText(resourceMap.getString("jLabel33.text")); // NOI18N
        jLabel33.setName("jLabel33"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel29)
                    .addComponent(jLabel26))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel33))
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel32)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)))
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 160, 430, 180);

        jPanel3.setName("jPanel3"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        jLabel34.setFont(resourceMap.getFont("jLabel38.font")); // NOI18N
        jLabel34.setForeground(resourceMap.getColor("jLabel34.foreground")); // NOI18N
        jLabel34.setText("jLabel34"); // NOI18N
        jLabel34.setName("jLabel34"); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel13.setForeground(new java.awt.Color(102, 0, 102));
        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N

        jLabel35.setFont(resourceMap.getFont("jLabel38.font")); // NOI18N
        jLabel35.setForeground(resourceMap.getColor("jLabel34.foreground")); // NOI18N
        jLabel35.setText("jLabel35"); // NOI18N
        jLabel35.setName("jLabel35"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        jLabel36.setFont(resourceMap.getFont("jLabel38.font")); // NOI18N
        jLabel36.setForeground(resourceMap.getColor("jLabel34.foreground")); // NOI18N
        jLabel36.setText("jLabel36"); // NOI18N
        jLabel36.setName("jLabel36"); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel15.setForeground(new java.awt.Color(102, 0, 102));
        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N

        jLabel37.setFont(resourceMap.getFont("jLabel38.font")); // NOI18N
        jLabel37.setForeground(resourceMap.getColor("jLabel34.foreground")); // NOI18N
        jLabel37.setText("jLabel37"); // NOI18N
        jLabel37.setName("jLabel37"); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel16.setForeground(new java.awt.Color(102, 0, 102));
        jLabel16.setText("CState"); // NOI18N
        jLabel16.setName("jLabel16"); // NOI18N

        jLabel38.setFont(resourceMap.getFont("jLabel38.font")); // NOI18N
        jLabel38.setForeground(resourceMap.getColor("jLabel34.foreground")); // NOI18N
        jLabel38.setText(resourceMap.getString("jLabel38.text")); // NOI18N
        jLabel38.setName("jLabel38"); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel17.setText(resourceMap.getString("jLabel17.text")); // NOI18N
        jLabel17.setName("jLabel17"); // NOI18N

        jLabel39.setFont(resourceMap.getFont("jLabel38.font")); // NOI18N
        jLabel39.setForeground(resourceMap.getColor("jLabel34.foreground")); // NOI18N
        jLabel39.setText(resourceMap.getString("jLabel39.text")); // NOI18N
        jLabel39.setName("jLabel39"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12)
                    .addComponent(jLabel37)
                    .addComponent(jLabel34))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel36)
                    .addComponent(jLabel39)
                    .addComponent(jLabel17))
                .addGap(105, 105, 105))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel37)))
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 20, 440, 140);

        jPanel4.setName("jPanel4"); // NOI18N

        jScrollPane6.setName("jScrollPane6"); // NOI18N

        jTextArea6.setColumns(20);
        jTextArea6.setFont(resourceMap.getFont("jTextArea6.font")); // NOI18N
        jTextArea6.setForeground(resourceMap.getColor("jTextArea6.foreground")); // NOI18N
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(5);
        jTextArea6.setName("jTextArea6"); // NOI18N
        jScrollPane6.setViewportView(jTextArea6);

        jLabel2.setFont(resourceMap.getFont("jLabel42.font")); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel42.font")); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(64, 14));

        jScrollPane7.setName("jScrollPane7"); // NOI18N

        jTextArea7.setColumns(20);
        jTextArea7.setFont(resourceMap.getFont("jTextArea6.font")); // NOI18N
        jTextArea7.setForeground(resourceMap.getColor("jTextArea6.foreground")); // NOI18N
        jTextArea7.setLineWrap(true);
        jTextArea7.setRows(5);
        jTextArea7.setName("jTextArea7"); // NOI18N
        jScrollPane7.setViewportView(jTextArea7);

        jScrollPane8.setName("jScrollPane8"); // NOI18N

        jTextArea8.setColumns(20);
        jTextArea8.setFont(resourceMap.getFont("jTextArea6.font")); // NOI18N
        jTextArea8.setForeground(resourceMap.getColor("jTextArea6.foreground")); // NOI18N
        jTextArea8.setLineWrap(true);
        jTextArea8.setRows(5);
        jTextArea8.setName("jTextArea8"); // NOI18N
        jScrollPane8.setViewportView(jTextArea8);

        jLabel8.setFont(resourceMap.getFont("jLabel42.font")); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jScrollPane5.setName("jScrollPane5"); // NOI18N

        jTextArea5.setColumns(20);
        jTextArea5.setFont(resourceMap.getFont("jTextArea6.font")); // NOI18N
        jTextArea5.setForeground(resourceMap.getColor("jTextArea6.foreground")); // NOI18N
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setName("jTextArea5"); // NOI18N
        jScrollPane5.setViewportView(jTextArea5);

        jLabel9.setFont(resourceMap.getFont("jLabel42.font")); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        jScrollPane9.setName("jScrollPane9"); // NOI18N

        jTextArea9.setColumns(20);
        jTextArea9.setFont(resourceMap.getFont("jTextArea6.font")); // NOI18N
        jTextArea9.setForeground(resourceMap.getColor("jTextArea6.foreground")); // NOI18N
        jTextArea9.setLineWrap(true);
        jTextArea9.setRows(5);
        jTextArea9.setName("jTextArea9"); // NOI18N
        jScrollPane9.setViewportView(jTextArea9);

        jLabel52.setFont(resourceMap.getFont("jLabel42.font")); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 0, 102));
        jLabel52.setText(resourceMap.getString("jLabel52.text")); // NOI18N
        jLabel52.setName("jLabel52"); // NOI18N

        jLabel44.setFont(resourceMap.getFont("jLabel44.font")); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 0, 102));
        jLabel44.setText("Other"); // NOI18N
        jLabel44.setName("jLabel44"); // NOI18N

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        jTextArea4.setColumns(20);
        jTextArea4.setFont(resourceMap.getFont("jTextArea6.font")); // NOI18N
        jTextArea4.setForeground(resourceMap.getColor("jTextArea4.foreground")); // NOI18N
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setName("jTextArea4"); // NOI18N
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGap(30, 30, 30)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8))
                                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(407, 407, 407))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(460, 40, 490, 540);

        jPanel5.setName("jPanel5"); // NOI18N

        jLabel41.setFont(resourceMap.getFont("jLabel42.font")); // NOI18N
        jLabel41.setForeground(resourceMap.getColor("jLabel42.foreground")); // NOI18N
        jLabel41.setText(resourceMap.getString("jLabel41.text")); // NOI18N
        jLabel41.setName("jLabel41"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(resourceMap.getFont("jTextArea6.font")); // NOI18N
        jTextArea1.setForeground(resourceMap.getColor("jTextArea6.foreground")); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jLabel42.setFont(resourceMap.getFont("jLabel42.font")); // NOI18N
        jLabel42.setForeground(resourceMap.getColor("jLabel42.foreground")); // NOI18N
        jLabel42.setText(resourceMap.getString("jLabel42.text")); // NOI18N
        jLabel42.setName("jLabel42"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setFont(resourceMap.getFont("jTextArea6.font")); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 0, 102));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setName("jTextArea2"); // NOI18N
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(950, 10, 280, 560);

        jLabel51.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel51.setForeground(new java.awt.Color(102, 0, 102));
        jLabel51.setText(resourceMap.getString("jLabel51.text")); // NOI18N
        jLabel51.setName("jLabel51"); // NOI18N
        getContentPane().add(jLabel51);
        jLabel51.setBounds(650, 570, 140, 20);

        jButton3.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton3.setForeground(resourceMap.getColor("jButton1.foreground")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(160, 600, 90, 30);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel53.setForeground(new java.awt.Color(0, 0, 102));
        jLabel53.setText(resourceMap.getString("jLabel53.text")); // NOI18N
        jLabel53.setName("jLabel53"); // NOI18N
        getContentPane().add(jLabel53);
        jLabel53.setBounds(820, 590, 100, 30);

        jLabel54.setText(resourceMap.getString("jLabel54.text")); // NOI18N
        jLabel54.setName("jLabel54"); // NOI18N
        getContentPane().add(jLabel54);
        jLabel54.setBounds(130, 4, 220, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    Dignosis dg;
    NewJFrame1 search;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
