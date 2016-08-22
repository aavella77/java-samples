import java.applet.Applet; // Includes standard Applet classes
import java.awt.*; // Standard Graphics Routines 

public class Wow extends Applet {
  // Applets use paint instead of main
  public void paint (Graphics page) {
    page.drawString("Wow, this is an Applet!", 5, 10);
  } // method paint
} // class Wow