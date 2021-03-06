/*
 * Created by Konrad Gnat
 * Course Number: CIS263AA
 * Section Number: 36454
 * MEID: KON2155430
 * On: January 09, 2017 
 * Chapter: 16
 * Page: 906
 * Title: Java Programming: Level II 
 *
 * You Do It
 * Creating a Drawing
 * 
 * 
 * 
 */   
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*; 
import java.awt.Color; 
 
public class JDemoCreateGraphicsObject3 extends JFrame implements ActionListener {  
    // Data Fields 
    String movieQuote = new String("Here's looking at you, kid");
    JButton moveButton = new JButton("Move It");
    Font broadwayFont = new Font("Broadway", Font.ITALIC, 12);
    int x = 10, y = 50;
    final int GAP =20;
    final int SIZE = 400;
    final int LIMIT = SIZE - 50;
    
    public JDemoCreateGraphicsObject3() 
    {
        Container con = getContentPane();
        con.setBackground(Color.YELLOW);
        con.setLayout(new FlowLayout());
        con.add(moveButton);
        moveButton.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setSize(SIZE, SIZE);      
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Graphics pen = getGraphics();
        pen.setFont(broadwayFont);
        pen.setColor(Color.MAGENTA);
        if(y < LIMIT)
        {
            pen.drawString(movieQuote, x += GAP, y += GAP);
        }
        else 
        {
            moveButton.setEnabled(false);
            pen.setColor(Color.BLACK);
            pen.drawOval(50, 170, 80, 70);
            pen.drawLine(85, 240, 90 ,280);
            pen.drawLine(90, 280, 60, 380);
            pen.drawLine(90, 280, 110, 380);
        }
    }
    
    public static void main(String[] args)
    { 
         // Run Application
         JDemoCreateGraphicsObject3 frame = new JDemoCreateGraphicsObject3();
         frame.setVisible(true);
    } 
}
