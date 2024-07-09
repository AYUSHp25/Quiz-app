
package quizzapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





public class End extends JFrame implements ActionListener {
JLabel head,s;
JButton exit;

End(String naam,int score){
    getContentPane().setBackground(Color.white);
        setLayout(null);
    
     head = new JLabel("THANKS,  " + naam + "  FOR ATTEMPTING THIS QUIZ.");
        head.setBounds(250, 70, 900, 30);
        head.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
        head.setForeground(new Color(50,175,250));
        add(head);
        
         s = new JLabel("YOUR SCORE:  " + score);
        s.setBounds(430, 180, 700, 50);
        s.setFont(new Font("Viner Hand ITC",Font.BOLD, 40));
        s.setForeground(new Color(50,175,250));
        add(s);
        
        exit = new JButton("EXIT");
        exit.setBounds(500, 315, 200, 50);
        exit.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
        exit.setBackground(new Color(50,175,250));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
         add(exit);
         
       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/score.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(120, 60, 900, 800);
        add(image);
       
         
    setSize(1200,700);
    setLocation(180,50);
    setVisible(true);
}
public void actionPerformed(ActionEvent ae){
    if (ae.getSource() == exit){
                setVisible(false);
        }
}








public static void main(String[] args){
    new End("USER",0);
}    
}
