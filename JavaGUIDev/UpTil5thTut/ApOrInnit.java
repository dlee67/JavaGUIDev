import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ApOrInnit{

   JTextField field = new JTextField(15);

   JFrame frame = new JFrame("Apple!Or!Orange!");
   
   JFrame frameApple = new JFrame("apple");
   JFrame frameOrange = new JFrame("orange");
   ImageIcon apple = new ImageIcon("apple.jpg");
   ImageIcon orange = new ImageIcon("orange.jpg");
   JLabel appleLabel = new JLabel(apple);
   JLabel orangeLabel = new JLabel(orange);

   class ActOn implements ActionListener{

      public void actionPerformed(ActionEvent e){
      
            if(field.getText().equalsIgnoreCase("apple")){
            
               frameApple.setVisible(true);
            
            }else if(field.getText().equalsIgnoreCase("orange")){
            
               frameOrange.setVisible(true);
            
            }
                  
      }
   }

   public void startUp(){

   /*
      JFrame frame = new JFrame("Apple!Or!Orange!");
   
      JFrame frameApple = new JFrame("apple");
      JFrame frameOrange = new JFrame("orange");
      ImageIcon apple = new ImageIcon("apple.jpg");
      ImageIcon orange = new ImageIcon("orange.jpg");
      JLabel appleLabel = new JLabel(apple);
      JLabel orangeLabel = new JLabel(orange);
   */
   
      frame.setLayout(new FlowLayout());
      frame.setSize(1000, 1000);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
   
      frameOrange.setLayout(new FlowLayout());
      frameOrange.setSize(1000, 1000);
      frameOrange.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      frameOrange.add(orangeLabel);
   
      frameApple.setLayout(new FlowLayout());
      frameApple.setSize(1000, 1000);
      frameApple.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      frameApple.add(appleLabel);
   
      JButton button = new JButton("Consume");
      ActOn act = new ActOn();
      button.addActionListener(act);
   
      frame.add(field);   
      frame.add(button);
      frame.setVisible(true);

   }

}

/*
class ActOn implements ActionListener{

   public void actionPerformed(ActionEvent e){
   
         if(field.getText().equalsIgnoreCase("apple")){
         
            frameApple.setVisible(true);
         
         }else if(field.getText().equalsIgnoreCase("orange")){
         
            frameOrange.setVisible(true);
         
         }
   
   }

}
*/