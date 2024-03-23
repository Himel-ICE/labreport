import javax.swing.*;
import java.awt.*;

public class Image extends JFrame 
{ 
	 private ImageIcon image1; 
	 private JLabel label1; 
	 private ImageIcon image2; 
	 private JLabel label2;
	 private ImageIcon image3; 
	 private JLabel label3;
	  
	 Image()
	 {
		 
		 setLayout(new FlowLayout()); 
		 image1 = new ImageIcon(getClass().getResource("ICE_logo.jpg")); 
		 label1 = new JLabel(image1); 
		 add(label1); 
	   
		 image2 = new ImageIcon(getClass().getResource("Pust_logo.png")); 
		 label2 = new JLabel(image2); 
		 add(label2);
		 
		 image3 = new ImageIcon(getClass().getResource("ICE_logo.jpg")); 
		 label3 = new JLabel(image3); 
		 add(label3);
	   
	 } 
	  
	 public static void main(String args[]) 
	 { 
		 Image gui = new Image(); 
		 gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 gui.setVisible(true); 
		 gui.pack(); 
		 gui.setTitle("Image Program"); 
	 } 
	 
}