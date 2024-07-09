package quizzapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

        

public class Enter extends JFrame implements ActionListener {
    String naam;
    JButton start , back;

   
      Enter(String naam){
          this.naam = naam;
          getContentPane().setBackground(Color.WHITE);
          setLayout(null);
          
          
          
        JLabel head = new JLabel("WELCOME,  " + naam +"  ready to play?");
        head.setBounds(270, 30, 800, 100);
        head.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
        head.setForeground(new Color(50,175,250));
        add(head);
        
         JLabel rule = new JLabel("RULES:");
        rule.setBounds(250, 120, 600, 100);
        rule.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
        rule.setForeground(new Color(50,175,250));
        add(rule);
        
        JLabel rules = new JLabel("RULE:");
        rules.setBounds(250, 200, 600, 300);
        rules.setFont(new Font("Viner Hand ITC",Font.BOLD, 20));
        rules.setForeground(new Color(50,175,250));
        rules.setText(
            "<html>"+
              "1) Must attempt all questions."+"<br><br>"+
              "2) Do not use maal practices during quiz." + "<br><br>"+
              "3) You can only use power up one time in the quiz."+"<br><br>"+
              "4) Do not leave quiz in between."+"<br><br>"+
               "<html>");
        add(rules);
       
         
        start = new JButton("START");
        start.setBounds(700, 520, 200, 50);
         start.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
         start.setBackground(new Color(50,175,250));
         start.setForeground(Color.WHITE);
         start.addActionListener(this);
        add(start);
         
        back = new JButton("BACK");
        back.setBounds(300, 520, 200, 50);
        back.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
        back.setBackground(new Color(50,175,250));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
         add(back);
          
         
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/q.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(510, -110, 900, 800);
        add(image);
        
        
         
        
        
          setLocation(170,60);
          setSize(1200,700);
          setVisible(true);
      }
      
      public void actionPerformed(ActionEvent ae){
         if (ae.getSource() == back){
                setVisible(false);
                new Login();
        }else if(ae.getSource() == start){
            new Ques(naam);
            setVisible(false);
           
        } 
      }
       
     
    public static void main(String[] args){
       new Enter("PLAYER");
    }
    
}
