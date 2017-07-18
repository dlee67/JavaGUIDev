/*

   Blank window

*/
import java.awt.*;
import javax.swing.*;

class FirstStep{

   public static void main(String args[]){

      JFrame frame = new JFrame("Title");
      
      //The GUI doesn't really close, the program is still running still
      //until the information that the program is closing.
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      
      frame.setSize(200, 200);
      
      frame.setVisible(true);
   
   }

}