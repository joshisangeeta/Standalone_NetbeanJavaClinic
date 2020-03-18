/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Prescription1.java
 *
 * Created on 7 Dec, 2011, 8:54:55 PM
 */
package netbeanjavaclinic;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author DELL
 */
public class CasePaper extends javax.swing.JPanel implements ActionListener {

    /** Creates new form Prescription1 */
    PatientVO pvo;
    HashMap hm;
    JFrame j1;
    static int c;
    // Vector v;

    public CasePaper(PatientVO vo) {
        initComponents();
        
      // ImageIcon im=new ImageIcon("f:\\img1.jpeg");
       // jLabel1.setIcon(im);
        jButton1.setVisible(false);
        jPanel3.setVisible(false);
        c++;
        pvo = vo;
        System.out.print("pr"+c);
        //jLabel2.setText("" + pvo.reg);
        //jLabel3.setText(pvo.name);
         jLabel5.setText("" + pvo.reg);
        jLabel6.setText(pvo.name);
        
        // ImageIcon imc=new ImageIcon("f:/img2.jpg");
 //   ImageIcon imc=new ImageIcon("/img2.jpg");
        //ImageIcon imc=new ImageIcon("/img3.bmp");
       // jLabel1.setIcon(imc);
        
        hm = new HashMap();
        hm.put("1", "nil");
        hm.put("2", "nil");
        hm.put("3", "nil");
        hm.put("4", "nil");
        hm.put("5", "nil");
        hm.put("6", "nil");
        hm.put("7", "nil");

        //  j1=j;

       // jLabel14.setVisible(false);
       // jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel18.setVisible(false);
      //  jLabel20.setVisible(false);
      //  jLabel22.setVisible(false);
        jLabel26.setVisible(false);
        
  


        // v=new Vector();

        //PatientVO vo
        // pvo=vo;
        jButton1.addActionListener(this);
       







        //  jLabel2.setText(""+pvo.reg);
        // jLabel3.setText(pvo.name);
      //  SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yy"); 
  java.util.Date date = new java.util.Date(); 
//  System.out.println("Current Date : " + dateFormat.format(date)); 
        java.sql.Date sd=new  java.sql.Date(date.getTime());
         jLabel7.setText(""+sd);
        //String d=new java.util.Date().
       // jLabel7.setText(dateFormat.format(date));
      //  jLabel4.setText(new java.util.Date().toString());
        this.setSize(500, 500);
        //  jComboBox8.setVisible(false);
        
        setCvo(pvo);
    }
    
    public void setCvo(PatientVO cvo)
    {
        
        String s="";
      //  this.cvo=cvo;
       //
      //  jTextField2.setText(cvo.pastfh);
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
         
          jLabel42.setText(cvo.pers1);
        jLabel20.setText(cvo.pers2);
        jLabel41.setText(cvo.pers3);
        jLabel22.setText(cvo.pers4);
        jLabel40.setText(cvo.pers5);
        jLabel31.setText(cvo.pers6);
         
        
       /* jLabel19.setText(cvo.pers1);
        jLabel20.setText(cvo.pers2);
        jLabel21.setText(cvo.pers3);
        jLabel22.setText(cvo.pers4);
        jLabel23.setText(cvo.pers5);
        jLabel24.setText(cvo.pers6);*/
        jLabel30.setText(cvo.sleep);
        jTextArea1.setText(cvo.digno);
       jTextArea2.setText(cvo.m1);
      // jTextArea3.setText(cvo.m2);
     //  jTextArea4.setText(cvo.m3);
      //  String s=cvo.followc+
       if(cvo!=null&&cvo.followdt!=null){
        s=    (""+(cvo.followc)+cvo.followdt.toString());
     //    jTextField1.setText(cvo.followdt.toString());
       }
      
       java.util.Date d=new java.util.Date();
       jTextArea5.setText(cvo.followc+"\nNewComment"+d+"\n");
     //  jTextArea5.setText("\nd\n");
        jLabel51.setText("Followup Due..");
    //  jTextField1.setText(cvo.followdt.toString());
        
        
    }
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) {
        /*  
        JFrame j=new JFrame();
        
        Prescription2 p1=new Prescription2(j);
        j.add(p1);
        j.setSize(600,600);
        j.setVisible(true);
        System.out.println("hi..");
         */
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setName("Form"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setName("jLabel2"); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(netbeanjavaclinic.NetbeanJavaClinicApp.class).getContext().getResourceMap(CasePaper.class);
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 57, 364, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setName("jLabel4"); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 57, -1, -1));

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setForeground(resourceMap.getColor("jSeparator3.foreground")); // NOI18N
        jSeparator3.setName("jSeparator3"); // NOI18N
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 1260, 0));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setName("jLabel21"); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 57, 364, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setName("jLabel13"); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 150, 20));

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, resourceMap.getColor("jPanel3.border.shadowInnerColor"))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 60, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 330, 20));

        jPanel4.setName("jPanel4"); // NOI18N

        jLabel12.setFont(resourceMap.getFont("jLabel12.font")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        jLabel34.setFont(resourceMap.getFont("jLabel34.font")); // NOI18N
        jLabel34.setForeground(resourceMap.getColor("jLabel34.foreground")); // NOI18N
        jLabel34.setText("jLabel34"); // NOI18N
        jLabel34.setName("jLabel34"); // NOI18N

        jLabel17.setFont(resourceMap.getFont("jLabel17.font")); // NOI18N
        jLabel17.setForeground(resourceMap.getColor("jLabel17.foreground")); // NOI18N
        jLabel17.setText(resourceMap.getString("jLabel17.text")); // NOI18N
        jLabel17.setName("jLabel17"); // NOI18N

        jLabel35.setFont(resourceMap.getFont("jLabel35.font")); // NOI18N
        jLabel35.setForeground(resourceMap.getColor("jLabel35.foreground")); // NOI18N
        jLabel35.setText("jLabel35"); // NOI18N
        jLabel35.setName("jLabel35"); // NOI18N

        jLabel19.setFont(resourceMap.getFont("jLabel19.font")); // NOI18N
        jLabel19.setForeground(resourceMap.getColor("jLabel19.foreground")); // NOI18N
        jLabel19.setText(resourceMap.getString("jLabel19.text")); // NOI18N
        jLabel19.setName("jLabel19"); // NOI18N

        jLabel36.setFont(resourceMap.getFont("jLabel36.font")); // NOI18N
        jLabel36.setForeground(resourceMap.getColor("jLabel36.foreground")); // NOI18N
        jLabel36.setText("jLabel36"); // NOI18N
        jLabel36.setName("jLabel36"); // NOI18N

        jLabel23.setFont(resourceMap.getFont("jLabel23.font")); // NOI18N
        jLabel23.setForeground(resourceMap.getColor("jLabel23.foreground")); // NOI18N
        jLabel23.setText(resourceMap.getString("jLabel23.text")); // NOI18N
        jLabel23.setName("jLabel23"); // NOI18N

        jLabel37.setFont(resourceMap.getFont("jLabel37.font")); // NOI18N
        jLabel37.setForeground(resourceMap.getColor("jLabel37.foreground")); // NOI18N
        jLabel37.setText("jLabel37"); // NOI18N
        jLabel37.setName("jLabel37"); // NOI18N

        jLabel24.setFont(resourceMap.getFont("jLabel24.font")); // NOI18N
        jLabel24.setForeground(resourceMap.getColor("jLabel24.foreground")); // NOI18N
        jLabel24.setText("CState"); // NOI18N
        jLabel24.setName("jLabel24"); // NOI18N

        jLabel38.setFont(resourceMap.getFont("jLabel38.font")); // NOI18N
        jLabel38.setForeground(resourceMap.getColor("jLabel38.foreground")); // NOI18N
        jLabel38.setText(resourceMap.getString("jLabel38.text")); // NOI18N
        jLabel38.setName("jLabel38"); // NOI18N

        jLabel25.setFont(resourceMap.getFont("jLabel25.font")); // NOI18N
        jLabel25.setText(resourceMap.getString("jLabel25.text")); // NOI18N
        jLabel25.setName("jLabel25"); // NOI18N

        jLabel39.setFont(resourceMap.getFont("jLabel39.font")); // NOI18N
        jLabel39.setForeground(resourceMap.getColor("jLabel39.foreground")); // NOI18N
        jLabel39.setText(resourceMap.getString("jLabel39.text")); // NOI18N
        jLabel39.setName("jLabel39"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel12)
                    .addComponent(jLabel37)
                    .addComponent(jLabel34))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel36)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(105, 105, 105))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel37)))
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, -1));

        jPanel5.setName("jPanel5"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel26.setFont(resourceMap.getFont("jLabel26.font")); // NOI18N
        jLabel26.setForeground(resourceMap.getColor("jLabel26.foreground")); // NOI18N
        jLabel26.setText(resourceMap.getString("jLabel26.text")); // NOI18N
        jLabel26.setName("jLabel26"); // NOI18N

        jLabel8.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel8.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(64, 14));

        jLabel9.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
        jLabel9.setForeground(resourceMap.getColor("jLabel9.foreground")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(64, 14));

        jLabel27.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel27.setForeground(resourceMap.getColor("jLabel27.foreground")); // NOI18N
        jLabel27.setText(resourceMap.getString("jLabel27.text")); // NOI18N
        jLabel27.setName("jLabel27"); // NOI18N

        jLabel10.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel10.setForeground(resourceMap.getColor("jLabel10.foreground")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(64, 14));

        jLabel28.setFont(resourceMap.getFont("jLabel28.font")); // NOI18N
        jLabel28.setForeground(resourceMap.getColor("jLabel28.foreground")); // NOI18N
        jLabel28.setText(resourceMap.getString("jLabel28.text")); // NOI18N
        jLabel28.setName("jLabel28"); // NOI18N

        jLabel11.setFont(resourceMap.getFont("jLabel11.font")); // NOI18N
        jLabel11.setForeground(resourceMap.getColor("jLabel11.foreground")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        jLabel29.setFont(resourceMap.getFont("jLabel29.font")); // NOI18N
        jLabel29.setForeground(resourceMap.getColor("jLabel29.foreground")); // NOI18N
        jLabel29.setText(resourceMap.getString("jLabel29.text")); // NOI18N
        jLabel29.setName("jLabel29"); // NOI18N

        jLabel14.setFont(resourceMap.getFont("jLabel14.font")); // NOI18N
        jLabel14.setForeground(resourceMap.getColor("jLabel14.foreground")); // NOI18N
        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        jLabel32.setFont(resourceMap.getFont("jLabel32.font")); // NOI18N
        jLabel32.setForeground(resourceMap.getColor("jLabel32.foreground")); // NOI18N
        jLabel32.setText(resourceMap.getString("jLabel32.text")); // NOI18N
        jLabel32.setName("jLabel32"); // NOI18N

        jLabel30.setFont(resourceMap.getFont("jLabel30.font")); // NOI18N
        jLabel30.setForeground(resourceMap.getColor("jLabel30.foreground")); // NOI18N
        jLabel30.setText(resourceMap.getString("jLabel30.text")); // NOI18N
        jLabel30.setName("jLabel30"); // NOI18N

        jLabel15.setFont(resourceMap.getFont("jLabel15.font")); // NOI18N
        jLabel15.setForeground(resourceMap.getColor("jLabel15.foreground")); // NOI18N
        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N

        jLabel33.setFont(resourceMap.getFont("jLabel33.font")); // NOI18N
        jLabel33.setForeground(resourceMap.getColor("jLabel33.foreground")); // NOI18N
        jLabel33.setText(resourceMap.getString("jLabel33.text")); // NOI18N
        jLabel33.setName("jLabel33"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel33))
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel32)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)))
                .addGap(29, 29, 29))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 470, -1));

        jPanel1.setName("jPanel1"); // NOI18N

        jLabel45.setFont(resourceMap.getFont("jLabel45.font")); // NOI18N
        jLabel45.setForeground(resourceMap.getColor("jLabel45.foreground")); // NOI18N
        jLabel45.setText("Schizoid"); // NOI18N
        jLabel45.setName("jLabel45"); // NOI18N

        jLabel46.setFont(resourceMap.getFont("jLabel46.font")); // NOI18N
        jLabel46.setForeground(resourceMap.getColor("jLabel46.foreground")); // NOI18N
        jLabel46.setText("Paranoid"); // NOI18N
        jLabel46.setName("jLabel46"); // NOI18N

        jLabel47.setFont(resourceMap.getFont("jLabel47.font")); // NOI18N
        jLabel47.setForeground(resourceMap.getColor("jLabel47.foreground")); // NOI18N
        jLabel47.setText("Histrioic"); // NOI18N
        jLabel47.setName("jLabel47"); // NOI18N

        jLabel48.setFont(resourceMap.getFont("jLabel48.font")); // NOI18N
        jLabel48.setForeground(resourceMap.getColor("jLabel48.foreground")); // NOI18N
        jLabel48.setText("Obsessive"); // NOI18N
        jLabel48.setName("jLabel48"); // NOI18N

        jLabel49.setFont(resourceMap.getFont("jLabel49.font")); // NOI18N
        jLabel49.setForeground(resourceMap.getColor("jLabel49.foreground")); // NOI18N
        jLabel49.setText("Schizotypal"); // NOI18N
        jLabel49.setName("jLabel49"); // NOI18N

        jLabel50.setFont(resourceMap.getFont("jLabel50.font")); // NOI18N
        jLabel50.setForeground(resourceMap.getColor("jLabel50.foreground")); // NOI18N
        jLabel50.setText("Borderline"); // NOI18N
        jLabel50.setName("jLabel50"); // NOI18N

        jLabel31.setFont(resourceMap.getFont("jLabel31.font")); // NOI18N
        jLabel31.setForeground(resourceMap.getColor("jLabel31.foreground")); // NOI18N
        jLabel31.setText(resourceMap.getString("jLabel31.text")); // NOI18N
        jLabel31.setName("jLabel31"); // NOI18N

        jLabel40.setFont(resourceMap.getFont("jLabel40.font")); // NOI18N
        jLabel40.setForeground(resourceMap.getColor("jLabel40.foreground")); // NOI18N
        jLabel40.setText(resourceMap.getString("jLabel40.text")); // NOI18N
        jLabel40.setName("jLabel40"); // NOI18N

        jLabel22.setFont(resourceMap.getFont("jLabel22.font")); // NOI18N
        jLabel22.setForeground(resourceMap.getColor("jLabel22.foreground")); // NOI18N
        jLabel22.setText(resourceMap.getString("jLabel22.text")); // NOI18N
        jLabel22.setName("jLabel22"); // NOI18N

        jLabel41.setFont(resourceMap.getFont("jLabel41.font")); // NOI18N
        jLabel41.setForeground(resourceMap.getColor("jLabel41.foreground")); // NOI18N
        jLabel41.setText(resourceMap.getString("jLabel41.text")); // NOI18N
        jLabel41.setName("jLabel41"); // NOI18N

        jLabel20.setFont(resourceMap.getFont("jLabel20.font")); // NOI18N
        jLabel20.setForeground(resourceMap.getColor("jLabel20.foreground")); // NOI18N
        jLabel20.setText(resourceMap.getString("jLabel20.text")); // NOI18N
        jLabel20.setName("jLabel20"); // NOI18N

        jLabel42.setFont(resourceMap.getFont("jLabel42.font")); // NOI18N
        jLabel42.setForeground(resourceMap.getColor("jLabel42.foreground")); // NOI18N
        jLabel42.setText(resourceMap.getString("jLabel42.text")); // NOI18N
        jLabel42.setName("jLabel42"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jLabel49)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(jLabel40)
                        .addGap(111, 111, 111)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel41))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel31)
                    .addComponent(jLabel22))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel22.getAccessibleContext().setAccessibleName(resourceMap.getString("jLabel22.AccessibleContext.accessibleName")); // NOI18N
        jLabel20.getAccessibleContext().setAccessibleName(resourceMap.getString("jLabel20.AccessibleContext.accessibleName")); // NOI18N

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 470, 210));

        jPanel6.setName("jPanel6"); // NOI18N

        jScrollPane6.setName("jScrollPane6"); // NOI18N

        jTextArea6.setColumns(20);
        jTextArea6.setFont(resourceMap.getFont("jTextArea6.font")); // NOI18N
        jTextArea6.setForeground(resourceMap.getColor("jTextArea6.foreground")); // NOI18N
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(5);
        jTextArea6.setName("jTextArea6"); // NOI18N
        jScrollPane6.setViewportView(jTextArea6);

        jLabel16.setFont(resourceMap.getFont("jLabel16.font")); // NOI18N
        jLabel16.setForeground(resourceMap.getColor("jLabel16.foreground")); // NOI18N
        jLabel16.setText(resourceMap.getString("jLabel16.text")); // NOI18N
        jLabel16.setName("jLabel16"); // NOI18N

        jLabel18.setFont(resourceMap.getFont("jLabel18.font")); // NOI18N
        jLabel18.setForeground(resourceMap.getColor("jLabel18.foreground")); // NOI18N
        jLabel18.setText(resourceMap.getString("jLabel18.text")); // NOI18N
        jLabel18.setName("jLabel18"); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(64, 14));

        jScrollPane7.setName("jScrollPane7"); // NOI18N

        jTextArea7.setColumns(20);
        jTextArea7.setFont(resourceMap.getFont("jTextArea7.font")); // NOI18N
        jTextArea7.setForeground(resourceMap.getColor("jTextArea7.foreground")); // NOI18N
        jTextArea7.setLineWrap(true);
        jTextArea7.setRows(5);
        jTextArea7.setName("jTextArea7"); // NOI18N
        jScrollPane7.setViewportView(jTextArea7);

        jScrollPane8.setName("jScrollPane8"); // NOI18N

        jTextArea8.setColumns(20);
        jTextArea8.setFont(resourceMap.getFont("jTextArea8.font")); // NOI18N
        jTextArea8.setForeground(resourceMap.getColor("jTextArea8.foreground")); // NOI18N
        jTextArea8.setLineWrap(true);
        jTextArea8.setRows(5);
        jTextArea8.setName("jTextArea8"); // NOI18N
        jScrollPane8.setViewportView(jTextArea8);

        jLabel43.setFont(resourceMap.getFont("jLabel43.font")); // NOI18N
        jLabel43.setForeground(resourceMap.getColor("jLabel43.foreground")); // NOI18N
        jLabel43.setText(resourceMap.getString("jLabel43.text")); // NOI18N
        jLabel43.setName("jLabel43"); // NOI18N

        jScrollPane5.setName("jScrollPane5"); // NOI18N

        jTextArea5.setColumns(20);
        jTextArea5.setFont(resourceMap.getFont("jTextArea5.font")); // NOI18N
        jTextArea5.setForeground(resourceMap.getColor("jTextArea5.foreground")); // NOI18N
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setName("jTextArea5"); // NOI18N
        jScrollPane5.setViewportView(jTextArea5);

        jLabel44.setFont(resourceMap.getFont("jLabel44.font")); // NOI18N
        jLabel44.setForeground(resourceMap.getColor("jLabel44.foreground")); // NOI18N
        jLabel44.setText(resourceMap.getString("jLabel44.text")); // NOI18N
        jLabel44.setName("jLabel44"); // NOI18N

        jScrollPane9.setName("jScrollPane9"); // NOI18N

        jTextArea9.setColumns(20);
        jTextArea9.setFont(resourceMap.getFont("jTextArea9.font")); // NOI18N
        jTextArea9.setForeground(resourceMap.getColor("jTextArea9.foreground")); // NOI18N
        jTextArea9.setLineWrap(true);
        jTextArea9.setRows(5);
        jTextArea9.setName("jTextArea9"); // NOI18N
        jScrollPane9.setViewportView(jTextArea9);

        jLabel51.setFont(resourceMap.getFont("jLabel51.font")); // NOI18N
        jLabel51.setForeground(resourceMap.getColor("jLabel51.foreground")); // NOI18N
        jLabel51.setText("Other"); // NOI18N
        jLabel51.setName("jLabel51"); // NOI18N

        jPanel7.setName("jPanel7"); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        jLabel53.setFont(resourceMap.getFont("jLabel53.font")); // NOI18N
        jLabel53.setForeground(resourceMap.getColor("jLabel53.foreground")); // NOI18N
        jLabel53.setText(resourceMap.getString("jLabel53.text")); // NOI18N
        jLabel53.setName("jLabel53"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(resourceMap.getFont("jTextArea1.font")); // NOI18N
        jTextArea1.setForeground(resourceMap.getColor("jTextArea1.foreground")); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jLabel54.setFont(resourceMap.getFont("jLabel54.font")); // NOI18N
        jLabel54.setForeground(resourceMap.getColor("jLabel54.foreground")); // NOI18N
        jLabel54.setText(resourceMap.getString("jLabel54.text")); // NOI18N
        jLabel54.setName("jLabel54"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setFont(resourceMap.getFont("jTextArea2.font")); // NOI18N
        jTextArea2.setForeground(resourceMap.getColor("jTextArea2.foreground")); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setName("jTextArea2"); // NOI18N
        jScrollPane2.setViewportView(jTextArea2);

        jLabel52.setFont(resourceMap.getFont("jLabel52.font")); // NOI18N
        jLabel52.setForeground(resourceMap.getColor("jLabel52.foreground")); // NOI18N
        jLabel52.setText(resourceMap.getString("jLabel52.text")); // NOI18N
        jLabel52.setName("jLabel52"); // NOI18N

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        jTextArea4.setColumns(20);
        jTextArea4.setFont(resourceMap.getFont("jTextArea4.font")); // NOI18N
        jTextArea4.setForeground(resourceMap.getColor("jTextArea4.foreground")); // NOI18N
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setName("jTextArea4"); // NOI18N
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(288, 288, 288)
                                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                        .addGap(59, 59, 59)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(297, 297, 297))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(500, 500, 500))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(646, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(880, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addComponent(jScrollPane9))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8, 0, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 1040, 910));

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 350, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, 980));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {

        System.out.println("called");
       
        
        
        
        
        
        
            //         }

            //  jComboBox4.setVisible(false);
            //throw new UnsupportedOperationException("Not supported yet.");
       


      System.out.println(hm);



        //  jLabel6.setText(  jComboBox4.getSelectedItem().toString());

        //         }
        //<editor-fold defaultstate="collapsed" desc="comment">
        if //</editor-fold>
                (e.getSource() == jButton1) {
            //Container c=getContentPane();
            //   j1.add(jLayeredPane1);
            //  jLayeredPane1.setVisible(true);
            //   
            //   jLabel12.setText(hm.get("1").toString());
            //   
           /* jLabel1.setText(jComboBox7.getSelectedItem().toString());
             jLabel5.setText(jComboBox29.getSelectedItem().toString()); 
             jLabel6.setText(jComboBox5.getSelectedItem().toString());
             jLabel10.setText(jComboBox8.getSelectedItem().toString());
              jLabel9.setText(jComboBox35.getSelectedItem().toString());
               jLabel11.setText(jComboBox3.getSelectedItem().toString());
                jLabel12.setText(jComboBox4.getSelectedItem().toString());
            
            */
            
            
            
            
            System.out.println("hm" + hm);
            

            /*jLabel1.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel10.setVisible(true);
            jLabel9.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);*/

         /*       
            jLabel1.setText(hm.get("1").toString());
            jLabel5.setText(hm.get("2").toString());
          //  if(hm.get("2").toString().equals("nil"))
           //     jLabel5.setVisible(false);
            jLabel6.setText(hm.get("3").toString());
           // if(hm.get("3").toString().equals("nil"))
           //     jLabel6.setVisible(false);
            jLabel10.setText(hm.get("4").toString());
          //  if(hm.get("4").toString().equals("nil"))
          //      jLabel10.setVisible(false);
            jLabel9.setText(hm.get("5").toString());
          //   if(hm.get("5").toString().equals("nil"))
          //      jLabel9.setVisible(false);
              jLabel11.setText(hm.get("6").toString());
         //     if(hm.get("6").toString().equals("nil"))
         //       jLabel1.setVisible(false);
            jLabel12.setText(hm.get("7").toString());
          //     if(hm.get("7").toString().equals("nil"))
          //      jLabel12.setVisible(false);
          * 
          */
               
        /* if(jLabel14.getText().equals("jLabel14"))
                jLabel14.setVisible(false);
            if(jLabel15.getText().equals("jLabel15"))
                jLabel15.setVisible(false);*/
            if(jLabel16.getText().equals("jLabel16"))
                jLabel16.setVisible(false);
            if(jLabel18.getText().equals("jLabel18"))
                jLabel18.setVisible(false);
            if(jLabel20.getText().equals("jLabel20"))
                jLabel20.setVisible(false);
            if(jLabel22.getText().equals("jLabel22"))
                jLabel22.setVisible(false);
            if(jLabel30.getText().equals("jLabel30"))
                jLabel30.setVisible(false); 
         
            
            this.jPanel2.setBackground(Color.white);
             this.jPanel3.setBackground(Color.white);
            this.setBackground(Color.white);
            
            // jLabel1.setText(hm.get("1").toString());
                  jSeparator3.setVisible(false);
              jButton1.setVisible(false);

        }

        //  jComboBox4.setVisible(false);
        //throw new UnsupportedOperationException("Not supported yet.");

    }
}
