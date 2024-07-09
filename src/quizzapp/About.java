
package quizzapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    JButton back;
    About(){
         getContentPane().setBackground(Color.white);
        setLayout(null);
        
         JLabel about = new JLabel("About us");
        about.setBounds(120, 40, 600, 100);
        about.setFont(new Font("Viner Hand ITC",Font.BOLD, 70));
        about.setForeground(new Color(50,175,250));
        add(about);
        
        back = new JButton("BACK");
        back.setBounds(155, 500, 170, 47);
         back.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
         back.setBackground(new Color(50,175,250));
         back.setForeground(Color.WHITE);
         back.addActionListener(this);
         add(back);
         
         JLabel aboutt = new JLabel("RULE:");
        aboutt.setBounds(120, 150, 600, 300);
        aboutt.setFont(new Font("Times New Roman",Font.BOLD, 20));
        aboutt.setForeground(Color.BLACK);
        aboutt.setText(
            "<html>"+
              "1) Contact me at: 9324235469"+"<br><br>"+
              "2) Email: ayushpimparkar@gmail.com" + "<br><br>"+
              "3) Lindkedin: https://www.linkedin.com/in/ayush-pimparkar-81204b2b4/"+"<br><br>"+
              "4) Github: https://github.com/settings/profile"+"<br><br>"+
               "<html>");
        add(aboutt);
        
        
        
        
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/aboutus.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(350, -150, 1000, 1000);
        add(image);
        
        
        setLocation(170,60);
          setSize(1200,700);
          setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
           new Login();
        } 
    }
    
    
    public static void main(String[] args){
        new About();
    }
    
}
