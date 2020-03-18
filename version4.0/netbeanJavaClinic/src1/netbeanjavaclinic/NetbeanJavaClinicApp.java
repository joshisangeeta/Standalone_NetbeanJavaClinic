/*
 * NetbeanJavaClinicApp.java
 */

package netbeanjavaclinic;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class NetbeanJavaClinicApp extends SingleFrameApplication {

     // public  NetbeanJavaClinicView nbjc;
    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        
     //   nbjc=new NetbeanJavaClinicView(this);
      //  show(nbjc);
       show(new NetbeanJavaClinicView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of NetbeanJavaClinicApp
     */
    public static NetbeanJavaClinicApp getApplication() {
        return Application.getInstance(NetbeanJavaClinicApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(NetbeanJavaClinicApp.class, args);
    }
    
    public void finalize()
    {
        try {
           // super.finalize();
            System.out.println("hii ");
        } catch (Throwable ex) {
            Logger.getLogger(NetbeanJavaClinicApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
