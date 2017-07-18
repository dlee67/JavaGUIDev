import java.awt.*;
import javax.swing.*;
import java.net.*;

class Act implements ActionListener{

   public void actionPerformed(ActionEvent e){
   
      JOptionPane.showMessageDialogue(null, "Lulz");   
   
   }

}

class ActionEventDemo{

   public static void main(String args[]){
   
      Act event = new Act();
   
      JFrame frame = new JFrame("Title");
   
      JButton button = new JButton("Act");
    
      button.addActionListener(event);
      
   }

}     
