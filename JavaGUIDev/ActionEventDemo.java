import java.awt.*;
import javax.swing.*;
import java.net.*;
//For a good 3-4 minutes, nothign was proceeding.
import java.awt.event.*;

class ActionEventDemo{

   public static void main(String args[]){
   
      Act event = new Act();
   
      JFrame frame = new JFrame("Title");
      JButton button = new JButton("Act");
      button.addActionListener(event);
      frame.setSize(500, 500);
      frame.add(button);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
   }

}     


class Act implements ActionListener{

      public void actionPerformed(ActionEvent e){
      
         System.out.println("Lulz activated");
         JOptionPane.showMessageDialog(null, "Lulz");   
      
      }

   }