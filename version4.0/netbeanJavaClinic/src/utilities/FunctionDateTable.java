/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;


//import billingdesktopapplication.StoreJInternalFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FunctionDateTable {
    private static JTable tblCalendar;
    public static DefaultTableModel mtblCalendar; //Table model	
    private static int realYear, realMonth, realDay, currentYear, currentMonth;
    private static Connection connection;
    private static PreparedStatement selectFunctionDatesStatement;
    private static HashSet<Integer> functionDates = new HashSet<Integer>();
    private static String selFunctionDate;

    public static HashSet<Integer> getFunctionDates() {
        return functionDates;
    }
   
    
    public static String getFunctionDate() {
        int row = FunctionDateTable.tblCalendar.getSelectedRow();
        int column = FunctionDateTable.tblCalendar.getSelectedColumn();

        if((row == -1) || (column == -1))
            return "";

        selFunctionDate="";
        Object cellValue = mtblCalendar.getValueAt(row, column);
        //                                                                            tblCalendar.changeSelection(row, column, true, false);

        if(cellValue == null)
        {                                                                                
            selFunctionDate="";
        }
        else
        {
            selFunctionDate += cellValue.toString() + "-" + (currentMonth+1) + "-" + currentYear;                                                                                
        }                                         
        return selFunctionDate;
    }   
    
    public static JTable getTblCalendar() {
       tblCalendar=new JTable();
        
        try {
            connection = DBConnection.get();
            String selectQuery = "select * from functiondetails where functiondate >=? and functiondate <=?";
            selectFunctionDatesStatement = connection.prepareStatement(selectQuery,
                                                                        ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            ex.printStackTrace();
//            Logger.getLogger(CalendarJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        mtblCalendar = new DefaultTableModel(){public boolean isCellEditable(int rowIndex, int mColIndex){return false;}};     
        tblCalendar.setModel(mtblCalendar);
        
//        ListSelectionListener listener = new ListSelectionListener()
//                                                                {
//                                                                     public void valueChanged(ListSelectionEvent e) {
//                                                                            
//                                                                                                            
//                                                                            
////                                                                            System.out.println("date: "+ selFunctionDate);
//                                                                                    
////
////                                                                            lblSelectedDate.setText(date);
//
//                                                                            if (e.getValueIsAdjusting()) {
//                                                                                // The mouse button has not yet been released
//                                                                                return;
//                                                                            }
//
//                                                                            if(false)
//                                                                                throw new UnsupportedOperationException("Not supported yet.");
//                                                                        }
//                                                                };
//
//        
//        
//        tblCalendar.getSelectionModel().addListSelectionListener(listener);
//        tblCalendar.getColumnModel().getSelectionModel()
//                .addListSelectionListener(listener);
        
        
         //Get real month/year
        GregorianCalendar cal = new GregorianCalendar(); //Create calendar
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
        realMonth = cal.get(GregorianCalendar.MONTH); //Get month
        realYear = cal.get(GregorianCalendar.YEAR); //Get year
        currentMonth = realMonth; //Match month and year
        currentYear = realYear;

        //Add headers
        String[] headers = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; //All headers
        for (int i=0; i<7; i++){
                mtblCalendar.addColumn(headers[i]);
        }

//            tblCalendar.getParent().setBackground(tblCalendar.getBackground()); //Set background

        //No resize/reorder
        tblCalendar.getTableHeader().setResizingAllowed(false);
        tblCalendar.getTableHeader().setReorderingAllowed(false);

        //Single cell selection
        tblCalendar.setColumnSelectionAllowed(true);
        tblCalendar.setRowSelectionAllowed(true);

        tblCalendar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Set row/column count
        tblCalendar.setRowHeight(30);
        mtblCalendar.setColumnCount(7);
        mtblCalendar.setRowCount(6);

        //Refresh calendar
        refreshCalendar (realMonth, realYear); //Refresh calendar        
    
        return tblCalendar;
    }
    
    
    
    private static void updateTblCalendarWithFunctionDates(int month, int year)
    {
                 
        functionDates.clear();
        
        try
        {
            SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy-MM-dd");
            String fromDate = year + "-" + (month+1) + "-" +1;
            String toDate = year + "-" + (month+1) + "-" + 31;
            
            System.out.println(fromDate + " till "+ toDate);
            
            
            //parse the string into Date object
            java.util.Date tempDate=null;
            try {
                tempDate = sdfSource.parse(fromDate);
                selectFunctionDatesStatement.setDate(1, new java.sql.Date(tempDate.getTime()));
                
                tempDate = sdfSource.parse(toDate);
                selectFunctionDatesStatement.setDate(2, new java.sql.Date(tempDate.getTime()));
            } 
            catch (ParseException ex) {
               // Logger.getLogger(StoreJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }     
          
            ResultSet result = selectFunctionDatesStatement.executeQuery();

            while(result.next())
            {
                String formattedDate = result.getDate("functiondate").toString();
                int day = Integer.parseInt(formattedDate.substring(formattedDate.length()-2));
                functionDates.add(day);
                System.out.println("day: "+ day);
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        
        System.out.println("functionDates: "+functionDates);
    }
    
    public static void refreshCalendar(int month, int year){
            updateTblCalendarWithFunctionDates(month,year);

            currentMonth = month;
            currentYear = year;

            //Variables
            String[] months =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            int nod, som; //Number Of Days, Start Of Month



            //Clear table
            for (int i=0; i<6; i++){
                    for (int j=0; j<7; j++){
                            mtblCalendar.setValueAt(null, i, j);
                    }
            }

                                    
            //Get first day of month and number of days
            GregorianCalendar cal = new GregorianCalendar(year, month, 1);
            nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
            som = cal.get(GregorianCalendar.DAY_OF_WEEK);



            //Draw calendar
            for (int i=1; i<=nod; i++){
                    int row = new Integer((i+som-2)/7);
                    int column  =  (i+som-2)%7;
                    mtblCalendar.setValueAt(i, row, column);
            }             

                            //Apply renderers
            tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer());
    }

    static class tblCalendarRenderer extends DefaultTableCellRenderer
    {
        public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column){

//                                                        System.out.println("inside getTableCellRendererComponent..."+ count++);
                super.getTableCellRendererComponent(table, value, selected, focused, row, column);
                /*
                if (column == 0 || column == 6){ //Week-end
//				setBackground(new Color(255, 220, 220));
                }
                else{ //Week
                        setBackground(new Color(255, 255, 255));

                }*/

                setForeground(Color.black);

                if (value != null){
//				if (Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear){ //Today
//                                                                            setBackground(new Color(220, 220, 255));
//                                                                             
//				}

                        if(functionDates.contains((Integer)value))
                        {
                            setForeground(Color.red);
                            setFont(new Font("Arial",Font.BOLD,24));
                        }
                }
                
                setBorder(null);			
                return this;  		
        }
    }
}
