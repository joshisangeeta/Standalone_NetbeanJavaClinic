/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FunctionDatesCalendarJPanel.java
 *
 * Created on Jun 3, 2011, 1:59:15 PM
 */
package billingdesktopapplication;

import java.awt.Container;
import netbeanjavaclinic.Appointment;
import utilities.DBConnection;
import utilities.FunctionDateTable;
import utilities.FunctionDateTable1;

import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import netbeanjavaclinic.Contacts;
import netbeanjavaclinic.Dignosis;

/**
 *
 * @author Admin
 */
public class MyJPane extends javax.swing.JPanel {

    private JPanel desktopPane;
    Dignosis dg;
    Appointment ap;
    Contacts ap1;
    int flag;
    String formname;
  //  StoreJInternalFrame storeFrame = new StoreJInternalFrame();
  //  CancellJInternalFrame cancelFrame = new CancellJInternalFrame();
 //   UpdatelJInternalFrame updateFrame = new UpdatelJInternalFrame();
 //   ViewJInternalFrame viewAllBills = new ViewJInternalFrame();
    public static void main(String[] args)
    {  
    	//MyJPane mj=new MyJPane(new JPanel());
    	//mj.setVisible(true);
    	//JPanel jp=getDesktopPane();
    	
    }
    public MyJPane(JPanel jPanel, Appointment aThis) {
        this.ap=aThis;
        formname="apponit";
        flag=1;
        this.desktopPane = desktopPane;
        this.setSize(400,500);
        initComponents();
           GregorianCalendar cal = new GregorianCalendar(); //Create calendar
      
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
        realMonth = cal.get(GregorianCalendar.MONTH); //Get month
        realYear = cal.get(GregorianCalendar.YEAR); //Get year
        currentMonth = realMonth; //Match month and year
        currentYear = realYear;
    //Populate table
        for (int i=realYear-100; i<=realYear+100; i++){
                cmbYear.addItem(String.valueOf(i));
                System.out.println(String.valueOf(i));
        }
       
        cmbYear.setSelectedItem(String.valueOf(realYear));
        lblMonth.setText(months[realMonth]);
        
    }
    

    public MyJPane(JPanel jPanel, Contacts aThis) {
        this.ap1=aThis;
        formname="contact";
        this.desktopPane = desktopPane;
        this.setSize(400,500);
        initComponents();
           GregorianCalendar cal = new GregorianCalendar(); //Create calendar
      
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
        realMonth = cal.get(GregorianCalendar.MONTH); //Get month
        realYear = cal.get(GregorianCalendar.YEAR); //Get year
        currentMonth = realMonth; //Match month and year
        currentYear = realYear;
    //Populate table
        for (int i=realYear-100; i<=realYear+100; i++){
                cmbYear.addItem(String.valueOf(i));
                System.out.println(String.valueOf(i));
        }
       
        cmbYear.setSelectedItem(String.valueOf(realYear));
        lblMonth.setText(months[realMonth]);
        
    }
    
    public JPanel getDesktopPane()
    {
        return desktopPane;
    }
      
    private PreparedStatement searchStatement;
    static int realYear, realMonth, realDay, currentYear, currentMonth;
    String[] months =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    /** Creates new form FunctionDatesCalendarJPanel */
    public MyJPane(JPanel desktopPane,Dignosis dg) {
        this.dg=dg;
        this.desktopPane = desktopPane;
        this.setSize(400,600);
        initComponents();
        
         btnBookFunctionDate.setFont(new Font("courrier",Font.BOLD,24));
         btnBookFunctionDate.setText("Select");
      //  btnBookFunctionDate.repaint();
        // btnBookFunctionDate.s
        
         /* try {
           
            Connection connection = DBConnection.get();
            String selectQuery = "select * from functiondetails where functiondate=?";
            searchStatement = connection.prepareStatement(selectQuery);
           
          
        } catch (SQLException ex) {
            Logger.getLogger(ConfirmFunctionDateJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
         //Get real month/year
        GregorianCalendar cal = new GregorianCalendar(); //Create calendar
      
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
        realMonth = cal.get(GregorianCalendar.MONTH); //Get month
        realYear = cal.get(GregorianCalendar.YEAR); //Get year
        currentMonth = realMonth; //Match month and year
        currentYear = realYear;
    //Populate table
        for (int i=realYear-100; i<=realYear+100; i++){
                cmbYear.addItem(String.valueOf(i));
                System.out.println(String.valueOf(i));
        }
       
        cmbYear.setSelectedItem(String.valueOf(realYear));
        lblMonth.setText(months[realMonth]);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPrev = new javax.swing.JButton();
        lblMonth = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCalendar = utilities.FunctionDateTable1.getTblCalendar();
        cmbYear = new javax.swing.JComboBox();
        btnBookFunctionDate = new javax.swing.JButton();
        btnCancelFunctionDate = new javax.swing.JButton();
        btnUpdateDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnViewAllBills = new javax.swing.JButton();

        setName("Form"); // NOI18N
        btnNext.setText("Next");
         btnPrev.setText("Prev");
          btnBookFunctionDate.setText("Select");
        //org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(billingdesktopapplication.BillingDesktopApplication.class).getContext().getResourceMap(MyJPane.class);
       // btnPrev.setFont(resourceMap.getFont("btnPrev.font")); // NOI18N
      //  btnPrev.setText(resourceMap.getString("btnPrev.text")); // NOI18N
        btnPrev.setName("btnPrev"); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

       // lblMonth.setFont(resourceMap.getFont("lblMonth.font")); // NOI18N
       // lblMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonth.setName("lblMonth"); // NOI18N

      //  btnNext.setFont(resourceMap.getFont("btnNext.font")); // NOI18N
      //  btnNext.setText(resourceMap.getString("btnNext.text")); // NOI18N
        btnNext.setName("btnNext"); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

       // tblCalendar.setFont(resourceMap.getFont("tblCalendar.font")); // NOI18N
        tblCalendar.setModel(utilities.FunctionDateTable1.mtblCalendar);
        tblCalendar.setName("tblCalendar"); // NOI18N
        jScrollPane1.setViewportView(tblCalendar);

        cmbYear.setName("cmbYear"); // NOI18N
        cmbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYearActionPerformed(evt);
            }
        });

      //  btnBookFunctionDate.setFont(resourceMap.getFont("btnBookFunctionDate.font")); // NOI18N
      //  btnBookFunctionDate.setText(resourceMap.getString("btnBookFunctionDate.text")); // NOI18N
         btnBookFunctionDate.setText("Select");
        btnBookFunctionDate.setName("btnBookFunctionDate"); // NOI18N
        btnBookFunctionDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFunctionDateActionPerformed(evt);
            }
        });

      //  btnCancelFunctionDate.setFont(resourceMap.getFont("btnCancelFunctionDate.font")); // NOI18N
       // btnCancelFunctionDate.setText(resourceMap.getString("btnCancelFunctionDate.text")); // NOI18N
        btnCancelFunctionDate.setName("btnCancelFunctionDate"); // NOI18N
        btnCancelFunctionDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelFunctionDateActionPerformed(evt);
            }
        });
        btnCancelFunctionDate.setVisible(false);
         btnUpdateDetails.setVisible(false);
         btnViewAllBills.setVisible(false);
       // btnUpdateDetails.setFont(resourceMap.getFont("btnUpdateDetails.font")); // NOI18N
       // btnUpdateDetails.setText(resourceMap.getString("btnUpdateDetails.text")); // NOI18N
        btnUpdateDetails.setName("btnUpdateDetails"); // NOI18N
        btnUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsActionPerformed(evt);
            }
        });

       // jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
       // jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

      //  lblMessage.setFont(resourceMap.getFont("lblMessage.font")); // NOI18N
     //   lblMessage.setForeground(resourceMap.getColor("lblMessage.foreground")); // NOI18N
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      //  lblMessage.setText(resourceMap.getString("lblMessage.text")); // NOI18N
        lblMessage.setName("lblMessage"); // NOI18N

      //  btnViewAllBills.setFont(resourceMap.getFont("btnViewAllBills.font")); // NOI18N
      //  btnViewAllBills.setText(resourceMap.getString("btnViewAllBills.text")); // NOI18N
        btnViewAllBills.setName("btnViewAllBills"); // NOI18N
        btnViewAllBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllBillsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdateDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelFunctionDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBookFunctionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(lblMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(btnViewAllBills, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                .addGap(544, 544, 544))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btnPrev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookFunctionDate, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btnCancelFunctionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnViewAllBills, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(494, 494, 494))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        if (currentMonth == 0){ //Back one year
            currentMonth = 11;
            currentYear -= 1;
        } else{ //Back one month
            currentMonth -= 1;
        }
        
        //Allow/disallow buttons
        btnPrev.setEnabled(true);
        btnNext.setEnabled(true);
        if (currentMonth == 0 && currentYear <= realYear-10){btnPrev.setEnabled(false);} //Too early
        if (currentMonth == 11 && currentYear >= realYear+100){btnNext.setEnabled(false);} //Too late
        lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
        lblMonth.setText(months[currentMonth]); //Refresh the month label (at the top)
        //		lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 25, 180, 25); //Re-align label with calendar
        cmbYear.setSelectedItem(String.valueOf(currentYear)); //Select the correct year in the combo box
        FunctionDateTable1.refreshCalendar(currentMonth, currentYear);
}//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if (currentMonth == 11){ //Foward one year
            currentMonth = 0;
            currentYear += 1;
        } else{ //Foward one month
            currentMonth += 1;
        }
        
        //Allow/disallow buttons
        btnPrev.setEnabled(true);
        btnNext.setEnabled(true);
        if (currentMonth == 0 && currentYear <= realYear-10){btnPrev.setEnabled(false);} //Too early
        if (currentMonth == 11 && currentYear >= realYear+100){btnNext.setEnabled(false);} //Too late
        lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
        lblMonth.setText(months[currentMonth]); //Refresh the month label (at the top)
        //		lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 25, 180, 25); //Re-align label with calendar
        cmbYear.setSelectedItem(String.valueOf(currentYear)); //Select the correct year in the combo box
        
        FunctionDateTable1.refreshCalendar(currentMonth, currentYear);
}//GEN-LAST:event_btnNextActionPerformed

    private void btnBookFunctionDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFunctionDateActionPerformed
        // TODO add your handling code here:
        if(formname.equals("contact")){
        
          btnBookFunctionDate.setText("Select");
      //if( flag==0)
      //    flag=1;
          flag ++;
       // lblMessage.setText("select");
        System.out.println("FunctionDateTable1.getFunctionDate(): "+FunctionDateTable1.getFunctionDate());
        
        String selFunctionDate = FunctionDateTable1.getFunctionDate();
        
        if( selFunctionDate.trim().length() <= 0) {
            lblMessage.setText("Please, select function date");
            return;
        }
        
       //Container c= this.getParent();
     //  dg.setText(selFunctionDate);
        if(flag==1){
       ap1.setText(selFunctionDate,flag);
          
           
        }
        if(flag>1)
        {
           ap1.setText(selFunctionDate,flag);
           
            System.out.println("flag 1-2");
        }
        
       System.out.println("date fit");
        StringTokenizer tokenizer = new StringTokenizer(selFunctionDate, "-");
        int day = Integer.parseInt(tokenizer.nextToken());
        System.out.println("day"+day);
        
      /* if(FunctionDateTable1.getFunctionDates().contains(day)) {
           lblMessage.setText("Already, booked this date");
            return;
        }*/
        
//        this.setVisible(false);
      // viewAllBills.setVisible(false);
      //  updateFrame.setVisible(false);
      //  cancelFrame.setVisible(false);
        
        JPanel desktopPane = this.getDesktopPane();    
        }
        
        else
        {
          
             btnBookFunctionDate.setText("Select");
      //if( flag==0)
       //   flag=1;
          
       // lblMessage.setText("select");
        System.out.println("FunctionDateTable1.getFunctionDate(): "+FunctionDateTable1.getFunctionDate());
        
        String selFunctionDate = FunctionDateTable1.getFunctionDate();
        
        if( selFunctionDate.trim().length() <= 0) {
            lblMessage.setText("Please, select function date");
            return;
        }
        
       //Container c= this.getParent();
     //  dg.setText(selFunctionDate);
        
       ap.setText(selFunctionDate);
          
       
        
       System.out.println("date fit");
        StringTokenizer tokenizer = new StringTokenizer(selFunctionDate, "-");
        int day = Integer.parseInt(tokenizer.nextToken());
        System.out.println("day"+day);
        
      /* if(FunctionDateTable1.getFunctionDates().contains(day)) {
           lblMessage.setText("Already, booked this date");
            return;
        }*/
        
//        this.setVisible(false);
      // viewAllBills.setVisible(false);
      //  updateFrame.setVisible(false);
      //  cancelFrame.setVisible(false);
        
        JPanel desktopPane = this.getDesktopPane();  
            
            
            
            
            
        }   
            
      //  storeFrame.setFunctionDate();;
       // storeFrame.setSize(600,1000);
      //  desktopPane.add(storeFrame);
//        internalFrame.setLocation(300,600);
       // storeFrame.setVisible(true);
    }//GEN-LAST:event_btnBookFunctionDateActionPerformed
        
        
        

    private void btnCancelFunctionDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelFunctionDateActionPerformed
        // TODO add your handling code here:
         lblMessage.setText("");
        boolean flag = false;
        
        DateFormat formatter;
        java.util.Date date;
        formatter = new SimpleDateFormat("dd-MM-yy");
        String selFunctionDate = FunctionDateTable.getFunctionDate().trim();
        try {
            
            date = (java.util.Date) formatter.parse(selFunctionDate);
            System.out.println("selFunctionDate " + selFunctionDate);
            System.out.println("Today is " + date);
            
            
            Date utilDate = new Date(date.getTime());
            java.sql.Date functionDate = new java.sql.Date(utilDate.getTime());
            
            searchStatement.setDate(1, functionDate);
            java.sql.ResultSet result = searchStatement.executeQuery();
            
            if(result.next()) {
                System.out.println("result: "+result.getInt(1));
                int functionID = result.getInt("functionID");
                int customerID = result.getInt("customerID");
                int typeID = result.getInt("typeID");
                int charges = result.getInt("charges");
                int aID = result.getInt("aID");
                
                
             //   viewAllBills.setVisible(false);
             //   updateFrame.setVisible(false);
             //   storeFrame.setVisible(false);
                
             //   cancelFrame.setFunctionID(functionID,customerID,functionDate,typeID,charges,aID);
            //    cancelFrame.setPreferredSize(new Dimension(800,600));
            //    cancelFrame.update();
               JPanel desktopPane = this.getDesktopPane();
                
              //  desktopPane.add(cancelFrame);
              //  cancelFrame.setVisible(true);
                
            } else {
                //                JOptionPane.showMessageDialog(this,"No Record  found");
                lblMessage.setText("No record found");
            }
            
            
            
            
        } catch (ParseException ex) {
           // Logger.getLogger(UpdtdBillMDIApplication.class.getName()).log(Level.SEVERE, null, ex);
            //            JOptionPane.showMessageDialog(this,ex.getMessage());
            lblMessage.setText("Enter date in correct format");
        } catch (SQLException ex) {
           // Logger.getLogger(UpdtdBillMDIApplication.class.getName()).log(Level.SEVERE, null, ex);
            //            JOptionPane.showMessageDialog(this,ex.getMessage());
            lblMessage.setText("Database error");
        }
}//GEN-LAST:event_btnCancelFunctionDateActionPerformed

    private void btnUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
         lblMessage.setText("");
        DateFormat formatter;
        java.util.Date date;
        formatter = new SimpleDateFormat("dd-MM-yy");
        String selFunctionDate = FunctionDateTable.getFunctionDate().trim();
        try {
            
            date = (java.util.Date) formatter.parse(selFunctionDate);
            System.out.println("selFunctionDate " + selFunctionDate);
            System.out.println("Today is " + date);
            
            
            Date utilDate = new Date(date.getTime());
            java.sql.Date functionDate = new java.sql.Date(utilDate.getTime());
            
            searchStatement.setDate(1, functionDate);
            java.sql.ResultSet result = searchStatement.executeQuery();
            
            if(result.next()) {
                System.out.println("result: "+result.getInt(1));
                int functionID = result.getInt("functionID");
                int customerID = result.getInt("customerID");
                int typeID = result.getInt("typeID");
                int charges = result.getInt("charges");
                int aID = result.getInt("aID");
                
                
              //  cancelFrame.setVisible(false);
              //  storeFrame.setVisible(false);
              //  viewAllBills.setVisible(false);
              //  updateFrame.setFunctionID(functionID,customerID,functionDate,typeID,charges,aID);
             //   updateFrame.setPreferredSize(new Dimension(800,600));
             //   updateFrame.update();
                JPanel desktopPane = this.getDesktopPane();
                
               // desktopPane.add(updateFrame);
              //  updateFrame.setVisible(true);
                
            } else {
                //                JOptionPane.showMessageDialog(this,"No Record  found");
                lblMessage.setText("No record found");
            }
            
            
            
            
        } catch (ParseException ex) {
          //  Logger.getLogger(UpdtdBillMDIApplication.class.getName()).log(Level.SEVERE, null, ex);
            //            JOptionPane.showMessageDialog(this,ex.getMessage());
            lblMessage.setText("Enter date in correct format");
        } catch (SQLException ex) {
         //   Logger.getLogger(UpdtdBillMDIApplication.class.getName()).log(Level.SEVERE, null, ex);
            //            JOptionPane.showMessageDialog(this,ex.getMessage());
            lblMessage.setText("Database error");
        }
        
    }//GEN-LAST:event_btnUpdateDetailsActionPerformed

    private void cmbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYearActionPerformed
        // TODO add your handling code here:
          if (cmbYear.getSelectedItem() != null){
            String b = cmbYear.getSelectedItem().toString();
            currentYear = Integer.parseInt(b);
            
            FunctionDateTable1.refreshCalendar(currentMonth, currentYear);
        }
        
        //Allow/disallow buttons
        btnPrev.setEnabled(true);
        btnNext.setEnabled(true);
        if (currentMonth == 0 && currentYear <= realYear-10){btnPrev.setEnabled(false);} //Too early
        if (currentMonth == 11 && currentYear >= realYear+100){btnNext.setEnabled(false);} //Too late
        lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
        lblMonth.setText(months[currentMonth]); //Refresh the month label (at the top)
        //		lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 25, 180, 25); //Re-align label with calendar
        cmbYear.setSelectedItem(String.valueOf(currentYear)); //Select the correct year in the combo box
    }//GEN-LAST:event_cmbYearActionPerformed

    private void btnViewAllBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllBillsActionPerformed
        // TODO add your handling code here:
        
//         try {
//            
//            String selectQuery = "select * from functiondetails where functionid=1";
//            PreparedStatement searchStatement = DBConnection.get().prepareStatement(selectQuery);
//            
//            
//            java.sql.ResultSet result = searchStatement.executeQuery();
//            
//            if(result.next()) {
//                System.out.println("result: "+result.getInt(1));
//                int functionID = result.getInt("functionID");
//                int customerID = result.getInt("customerID");
//                int typeID = result.getInt("typeID");
//                int charges = result.getInt("charges");
//                int aID = result.getInt("aID");
//                java.sql.Date functionDate = result.getDate("functionDate");
//                
//                viewAllBills.setFunctionID( functionID, customerID, functionDate, typeID, charges, aID);
//                
//            } else {
//                //                JOptionPane.showMessageDialog(this,"No Record  found");
//                lblMessage.setText("No record found");
//            }
//               
//        } 
//         catch (SQLException ex) {
//            Logger.getLogger(BillMDIApplication.class.getName()).log(Level.SEVERE, null, ex);
//            //            JOptionPane.showMessageDialog(this,ex.getMessage());
//            lblMessage.setText("Database error");
//        }
      //  updateFrame.setVisible(false);
      //  cancelFrame.setVisible(false);
     //   storeFrame.setVisible(false);
        JPanel desktopPane = this.getDesktopPane();     
       
       
     //   viewAllBills.update();
     //   desktopPane.add(viewAllBills);
//        internalFrame.setLocation(300,600);
      //  viewAllBills.setVisible(true);
    }//GEN-LAST:event_btnViewAllBillsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookFunctionDate;
    private javax.swing.JButton btnCancelFunctionDate;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdateDetails;
    private javax.swing.JButton btnViewAllBills;
    private javax.swing.JComboBox cmbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JTable tblCalendar;
    // End of variables declaration//GEN-END:variables
}
