/*
 * NetbeanJavaClinicView.java
 */

package netbeanjavaclinic;

import dumps.CustValuObj;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * The application's main frame.
 */
public class NetbeanJavaClinicView extends FrameView implements ActionListener{

    public NetbeanJavaClinicView(SingleFrameApplication app) {
        super(app);
       
        initComponents();
        
      jButton1.setVisible(false);
        
         //ImageIcon imc=new ImageIcon("/splash.png");
        //jButton1.setIcon(imc);
          rg=new RegiFrame();
         
          cvo=new CustValuObj();
         
        // status bar initialization - message timeout, idle icon and busy animation, etc
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusMessageLabel.setText("LOADING");
                //System.out.println("");
            }
        });
        jMenuItem3.addActionListener(this);
        jMenuItem1.addActionListener(this);
        jMenuItem2.addActionListener(this);
        jButton1.addActionListener(this);
        messageTimer.setRepeats(false);
        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate");
        for (int i = 0; i < busyIcons.length; i++) {
            busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
        }
        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
                statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
            }
        });
        idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
        statusAnimationLabel.setIcon(idleIcon);
        progressBar.setVisible(false);

        // connecting action tasks to status bar via TaskMonitor
        TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
        taskMonitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                String propertyName = evt.getPropertyName();
                if ("started".equals(propertyName)) {
                    if (!busyIconTimer.isRunning()) {
                        statusAnimationLabel.setIcon(busyIcons[0]);
                        busyIconIndex = 0;
                        busyIconTimer.start();
                    }
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(true);
                } else if ("done".equals(propertyName)) {
                    busyIconTimer.stop();
                    statusAnimationLabel.setIcon(idleIcon);
                    progressBar.setVisible(false);
                    progressBar.setValue(0);
                } else if ("message".equals(propertyName)) {
                    String text = (String)(evt.getNewValue());
                    statusMessageLabel.setText((text == null) ? "" : text);
                    messageTimer.restart();
                } else if ("progress".equals(propertyName)) {
                    int value = (Integer)(evt.getNewValue());
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(false);
                    progressBar.setValue(value);
                }
            }
        });
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = NetbeanJavaClinicApp.getApplication().getMainFrame();
            aboutBox = new NetbeanJavaClinicAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        NetbeanJavaClinicApp.getApplication().show(aboutBox);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        java.util.Date ud=new java.util.Date();
            
            java.sql.Date sd=new  java.sql.Date(ud.getTime());
        System.out.println(sd);
        
            
       if( ae.getActionCommand().equals("FollowUpEntry"))
       {
           counter=1;
            search=new NewJFrame1(counter);
           
          
           search.setVisible(true);
           
       }
         if( ae.getActionCommand().equals("PrintOut"))
       {
           
           counter=2;
            search=new NewJFrame1(counter);
           
          
           search.setVisible(true);
            System.out.println("Printting....");
          //  search=new NewJFrame1();
           
          
         //  search.setVisible(true);
           
       }
       
       if( ae.getActionCommand().equals("NewPatientEntry"))
       {
        rg.setVisible(true);
       }
       if( ae.getActionCommand().equals("Exit"))
       {
           System.out.println("Exiting....");
           if(rg !=null)
               rg.dispose();
           if(search !=null)
           {
               rg.dispose();
               System.out.println("disposed");
           }
        System.exit(0);
       }
        if( ae.getActionCommand().equals("PrintOut"))
       {
          
       // System.exit(0);
       }
       
       
       
      //  if( ae.getActionCommand().equals("exitMenuItem"))
      // {
      //     System.out.println("exiting");
      // System.exit(0);
      // }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(netbeanjavaclinic.NetbeanJavaClinicApp.class).getContext().getResourceMap(NetbeanJavaClinicView.class);
        mainPanel.setBackground(resourceMap.getColor("statusPanel.background")); // NOI18N
        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setPreferredSize(new java.awt.Dimension(1500, 900));

        jButton1.setName("jButton1"); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(193, 193, 193))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        menuBar.setBackground(resourceMap.getColor("menuBar.background")); // NOI18N
        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setBackground(resourceMap.getColor("fileMenu.background")); // NOI18N
        fileMenu.setForeground(resourceMap.getColor("fileMenu.foreground")); // NOI18N
        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        jMenuItem1.setBackground(resourceMap.getColor("jMenuItem1.background")); // NOI18N
        jMenuItem1.setForeground(resourceMap.getColor("jMenuItem1.foreground")); // NOI18N
        jMenuItem1.setText(resourceMap.getString("jMenuItem1.text")); // NOI18N
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        fileMenu.add(jMenuItem1);

        menuBar.add(fileMenu);

        jMenu3.setBackground(resourceMap.getColor("fileMenu.background")); // NOI18N
        jMenu3.setForeground(resourceMap.getColor("fileMenu.foreground")); // NOI18N
        jMenu3.setText(resourceMap.getString("jMenu3.text")); // NOI18N
        jMenu3.setName("jMenu3"); // NOI18N

        jMenuItem3.setBackground(resourceMap.getColor("fileMenu.background")); // NOI18N
        jMenuItem3.setForeground(resourceMap.getColor("jMenuItem3.foreground")); // NOI18N
        jMenuItem3.setText(resourceMap.getString("jMenuItem3.text")); // NOI18N
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        jMenu3.add(jMenuItem3);

        jMenuItem2.setBackground(resourceMap.getColor("jMenuItem2.background")); // NOI18N
        jMenuItem2.setForeground(resourceMap.getColor("jMenuItem2.foreground")); // NOI18N
        jMenuItem2.setText(resourceMap.getString("jMenuItem2.text")); // NOI18N
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenu3.add(jMenuItem2);

        menuBar.add(jMenu3);

        helpMenu.setBackground(resourceMap.getColor("fileMenu.background")); // NOI18N
        helpMenu.setForeground(resourceMap.getColor("fileMenu.foreground")); // NOI18N
        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(netbeanjavaclinic.NetbeanJavaClinicApp.class).getContext().getActionMap(NetbeanJavaClinicView.class, this);
        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setBackground(resourceMap.getColor("aboutMenuItem.background")); // NOI18N
        aboutMenuItem.setForeground(resourceMap.getColor("aboutMenuItem.foreground")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        jMenu6.setBackground(resourceMap.getColor("jMenu6.background")); // NOI18N
        jMenu6.setForeground(resourceMap.getColor("jMenu6.foreground")); // NOI18N
        jMenu6.setText(resourceMap.getString("jMenu6.text")); // NOI18N
        jMenu6.setName("jMenu6"); // NOI18N

        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setBackground(resourceMap.getColor("exitMenuItem.background")); // NOI18N
        exitMenuItem.setForeground(resourceMap.getColor("exitMenuItem.foreground")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        jMenu6.add(exitMenuItem);

        menuBar.add(jMenu6);

        statusPanel.setBackground(resourceMap.getColor("statusPanel.background")); // NOI18N
        statusPanel.setName("statusPanel"); // NOI18N

        statusPanelSeparator.setName("statusPanelSeparator"); // NOI18N

        statusMessageLabel.setName("statusMessageLabel"); // NOI18N

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statusAnimationLabel.setName("statusAnimationLabel"); // NOI18N

        progressBar.setName("progressBar"); // NOI18N

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusAnimationLabel)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(statusPanelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusMessageLabel)
                    .addComponent(statusAnimationLabel)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setText(resourceMap.getString("jMenu1.text")); // NOI18N
        jMenu1.setName("jMenu1"); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText(resourceMap.getString("jMenu2.text")); // NOI18N
        jMenu2.setName("jMenu2"); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenuBar2.setName("jMenuBar2"); // NOI18N

        jMenu4.setText(resourceMap.getString("jMenu4.text")); // NOI18N
        jMenu4.setName("jMenu4"); // NOI18N
        jMenuBar2.add(jMenu4);

        jMenu5.setText(resourceMap.getString("jMenu5.text")); // NOI18N
        jMenu5.setName("jMenu5"); // NOI18N
        jMenuBar2.add(jMenu5);

        setComponent(mainPanel);
        setMenuBar(menuBar);
        setStatusBar(statusPanel);
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    // End of variables declaration//GEN-END:variables

    private final Timer messageTimer;
    private final Timer busyIconTimer;
    private final Icon idleIcon;
    private final Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;
    private RegiFrame rg;
    private JDialog aboutBox;
    private CustValuObj cvo;
    private NewJFrame1 search; 
     int counter=0;
}
