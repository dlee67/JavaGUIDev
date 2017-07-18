import javax.swing.*;
import java.awt.*;

//I should put in labels too.
class MakeTextBox{

   public static void main(String args[]){
   
      JFrame frame = new JFrame("I am a title");
      frame.setSize(200, 200);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      //Also, if I don't have a layout of the frame, then the components in the pane
      //will be arranged undesirably.
      frame.setLayout(new FlowLayout());
      
      //If the line below is commented out, then the container is presented 
      //irregularaly.
      //frame.setVisible(true);
    
      //According to the articles I've read, the JPanel is a nice
      //way to wrap all the components together.
      //JPanel pane = new JPanel();
      
      //JTextField does not have a default operationg that makes everything look nice.
      //I need to specify the field length through the constructor.
      JTextField field = new JTextField(10);
      JLabel label = new JLabel("I am so cool");
      
      JPanel pane = new JPanel();
      pane.add(field);
      pane.add(label);
      
      
      //I can either add the components to the frame, 
      //frame.add(label);
      //frame.add(field);
      
      //or I can add the components inside the frame.
      frame.add(pane); 
      frame.setVisible(true);
      
   }

}