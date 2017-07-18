import java.awt.*;
import javax.swing.*;
import java.net.*;

class MemeDisplayer{

   public static void main(String args[])throws Exception{
   
      JFrame frame = new JFrame("Look title");
      frame.setSize(1000, 1000);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);      
      
      URL unicorn = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/The_Lady_and_the_unicorn_Desire.jpg/1200px-The_Lady_and_the_unicorn_Desire.jpg");
      
      //ImageIcon meme = new ImageIcon("DankMeme.png");
      ImageIcon meme = new ImageIcon(unicorn);
      JLabel label = new JLabel(meme);
      
      frame.add(label);
      
      frame.setVisible(true);
   
   }

}