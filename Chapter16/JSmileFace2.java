
/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 10, 2017 
 * Chapter: 16
 * Page: 939
 * Exercise 7b
 * Title: Java Programming: Level II 
 *
 * Description:
 * a. Write an application that extends JFrame and that displays a yellow 
 * smiling face on the screen. save file as JSmileFace.java
 * b. Add a button to the JSmileface program so the smile changes to a frown 
 * when the user clicks the JButton. Save the program as JSmileFace2.java
 * 
 * 
 */   
import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;
import java.awt.Color;


public class JSmileFace2 extends JFrame implements ActionListener
{  
    JButton button = new JButton("Click me");
    int count = 0;
    
    public JSmileFace2() 
    {
        super("Smiley Face Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
    }
        
    public void paint(Graphics pen) 
    {
        super.paint(pen);
        pen.setColor(Color.YELLOW);
        pen.fillOval(50,50,200, 200);
        pen.setColor(Color.BLACK);
        pen.drawOval(50, 50, 200, 200);
        pen.fillOval(115, 115, 12, 12);
        pen.fillOval(165, 115, 12, 12);
        pen.drawArc(90, 100, 120, 120, 0, -180);
    } 
    
    public void actionPerformed(ActionEvent e) 
    {
        if (count % 2 == 0) {
            Graphics pen = getGraphics();
            pen.setColor(Color.YELLOW);
            pen.fillOval(50,50,200, 200);
            pen.setColor(Color.BLACK);
            pen.drawOval(50, 50, 200, 200);
            pen.fillOval(115, 115, 12, 12);
            pen.fillOval(165, 115, 12, 12);
            pen.drawArc(90, 150, 120, 120, 180, -180);
            count++;
        } else {
            Graphics pen = getGraphics();
            pen.setColor(Color.YELLOW);
            pen.fillOval(50,50,200, 200);
            pen.setColor(Color.BLACK);
            pen.drawOval(50, 50, 200, 200);
            pen.fillOval(115, 115, 12, 12);
            pen.fillOval(165, 115, 12, 12);
            pen.drawArc(90, 100, 120, 120, 0, -180);
            count++;
        }
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JSmileFace2 jnc= new JSmileFace2();
         jnc.setSize(400, 400);
         jnc.setVisible(true);
    } 
}
