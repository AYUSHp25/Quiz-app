
package quizzapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
    JButton enter ,exit,about;
     JTextField tname;
    
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/13971420.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(10, -60, 900, 800);
        add(image);
        
        JLabel heading = new JLabel("Lets Start");
        heading.setBounds(930, 100, 400, 75);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 75));
        heading.setForeground(new Color(50,174,250));
        add(heading);
        
        JLabel name = new JLabel("Please enter your name");
        name.setBounds(950, 230, 400, 60);
        name.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
        name.setForeground(new Color(50,175,250));
        add(name);
        
         tname = new JTextField();
        tname.setBounds(950, 290, 350, 40);
        tname.setFont(new Font("Times New Roman",Font.PLAIN, 27));
        add(tname);
        
         enter = new JButton("ENTER");
        enter.setBounds(1100, 360, 200, 50);
         enter.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
         enter.setBackground(new Color(50,175,250));
         enter.setForeground(Color.WHITE);
         enter.addActionListener(this);
         add(enter);
         
         exit = new JButton("EXIT");
        exit.setBounds(1100, 520, 200, 50);
         exit.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
         exit.setBackground(new Color(50,175,250));
         exit.setForeground(Color.WHITE);
         exit.addActionListener(this);
         add(exit);
         
          about = new JButton("ABOUT US");
        about.setBounds(1100, 440, 200, 50);
         about.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
         about.setBackground(new Color(50,175,250));
         about.setForeground(Color.WHITE);
         about.addActionListener(this);
         add(about);
        
         
         
        setSize(1400,700);
        setLocation(85,10);
        setVisible(true);
        
    }
     
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == enter){
            String naam = tname.getText();
            setVisible(false);
            new Enter(naam);
            
            }else if (ae.getSource() == exit){
                setVisible(false);
        }else if(ae.getSource() == about){
            setVisible(false);
            new About();
        }
    }
public static void main(String[] args){
    new Login();
}    
}

