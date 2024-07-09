
package quizzapp;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ques extends JFrame implements ActionListener {
    String q[][] = new String[15][5];
    String a[][] = new String[15][2];
    String ua[][]=new String[15][1];
    JButton next,submit,power;
    JLabel quno,state;
    JRadioButton o1,o2,o3,o4;
    ButtonGroup groupo;
    
    public static int timer = 13;
    public static int a_given = 0;
    public static int count = 0;
    public static int score =0;
    String naam;
    Ques(String naam){
        this.naam = naam;
         getContentPane().setBackground(Color.white);
        setLayout(null);
        
        quno = new JLabel();
        quno.setBounds(120, 330, 50, 30);
        quno.setFont(new Font("Tahoma",Font.PLAIN, 26));
        add(quno);
         
        state = new JLabel();
        state.setBounds(170, 330, 1100, 30);
        state.setFont(new Font("Tahoma",Font.PLAIN, 26));
        add(state);
        
        
         // Question 1
q[0][0] = "Which of the below is valid way to instantiate an array in java?";
q[0][1] = "int myArray [] = {1, 3, 5};";
q[0][2] = "int myArray [] [] = {1,2,3,4};";
q[0][3] = "int [] myArray = (5, 4, 3);";
q[0][4] = "int [] myArray = {“1”, “2”, “3”};";
a[0][1] = "int myArray [] = {1, 3, 5};";

// Question 2
q[1][0] = "Which of these is a reserved word in Java?";
q[1][1] = "native";
q[1][2] = "method";
q[1][3] = "subclass";
q[1][4] = "reference";
a[1][1] = "native";

// Question 3
q[2][0] = "What is the size of an int variable in Java?";
q[2][1] = "32 bits";
q[2][2] = "8 bits";
q[2][3] = "16 bits";
q[2][4] = "64 bits";
a[2][1] = "32 bits";

// Question 4
q[3][0] = "Which of these data types is used to create a variable that should store text?";
q[3][1] = "String";
q[3][2] = "myString";
q[3][3] = "Txt";
q[3][4] = "string";
a[3][1] = "String";

// Question 5
q[4][0] = "Which method can be used to find the length of a string in Java?";
q[4][1] = "length()";
q[4][2] = "getSize()";
q[4][3] = "getLength()";
q[4][4] = "size()";
a[4][1] = "length()";

// Question 6
q[5][0] = "Which keyword is used to create an instance of a class in Java?";
q[5][1] = "new";
q[5][2] = "this";
q[5][3] = "class";
q[5][4] = "instance";
a[5][1] = "new";

// Question 7
q[6][0] = "Which of these operators is used to allocate memory to array variables in Java?";
q[6][1] = "new";
q[6][2] = "malloc";
q[6][3] = "calloc";
q[6][4] = "alloc";
a[6][1] = "new";

// Question 8
q[7][0] = "Which method is used to perform a cleanup operation before the object is garbage collected?";
q[7][1] = "finalize()";
q[7][2] = "finally()";
q[7][3] = "final()";
q[7][4] = "finalizeObject()";
a[7][1] = "finalize()";

// Question 9
q[8][0] = "Which of these is not a Java feature?";
q[8][1] = "Use of pointers";
q[8][2] = "Dynamic";
q[8][3] = "Architecture Neutral";
q[8][4] = "Object-oriented";
a[8][1] = "Use of pointers";

// Question 10
q[9][0] = "Which of the following is a valid declaration of a char?";
q[9][1] = "char ch = 'a';";
q[9][2] = "char ch = 'ab';";
q[9][3] = "char ch = \"a\";";
q[9][4] = "char ch = a;";
a[9][1] = "char ch = 'a';";

// Question 11
q[10][0] = "Which of the following is not a keyword in Java?";
q[10][1] = "Boolean";
q[10][2] = "static";
q[10][3] = "void";
q[10][4] = "private";
a[10][1] = "Boolean";

// Question 12
q[11][0] = "What is the return type of the hashCode() method in the Object class?";
q[11][1] = "int";
q[11][2] = "Object";
q[11][3] = "long";
q[11][4] = "void";
a[11][1] = "int";

// Question 13
q[12][0] = "What is the default value of a local variable in Java?";
q[12][1] = "No default value";
q[12][2] = "null";
q[12][3] = "0";
q[12][4] = "Depends on the data type";
a[12][1] = "No default value";

// Question 14
q[13][0] = "Which keyword is used for accessing the features of a package?";
q[13][1] = "import";
q[13][2] = "package";
q[13][3] = "extends";
q[13][4] = "export";
a[13][1] = "import";

// Question 15
q[14][0] = "Which of these cannot be used for a variable name in Java?";
q[14][1] = "keyword";
q[14][2] = "identifier";
q[14][3] = "identifier & keyword";
q[14][4] = "none of the mentioned";
a[14][1] = "keyword";
         
         o1 = new JRadioButton();
         o1.setBounds(130, 420, 400, 30);
         o1.setBackground(Color.WHITE);
         o1.setFont(new Font("Tahoma",Font.PLAIN, 26));
         add(o1);
         
         o2 = new JRadioButton();
         o2.setBounds(560, 420, 400, 30);
         o2.setBackground(Color.WHITE);
         o2.setFont(new Font("Tahoma",Font.PLAIN, 26));
         add(o2);
         
         o3 = new JRadioButton();
         o3.setBounds(130, 510, 400, 30);
         o3.setBackground(Color.WHITE);
         o3.setFont(new Font("Tahoma",Font.PLAIN, 26));
         add(o3);
         
         o4 = new JRadioButton();
         o4.setBounds(560, 510, 400, 30);
         o4.setBackground(Color.WHITE);
         o4.setFont(new Font("Tahoma",Font.PLAIN, 26));
         add(o4);
         
         
         groupo = new ButtonGroup();
         groupo.add(o1);
         groupo.add(o2);
         groupo.add(o3);
         groupo.add(o4);
         
         
         
         next = new JButton("NEXT");
        next.setBounds(1050, 630, 200, 50);
        next.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
        next.setBackground(new Color(50,175,250));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
         
        submit = new JButton("SUBMIT");
        submit.setBounds(550, 630, 200, 50);
        submit.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
        submit.setBackground(new Color(50,175,250));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        submit.addActionListener(this);
         add(submit);
         
        power = new JButton("POWER UP");
        power.setBounds(1050, 380, 250, 50);
        power.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
        power.setBackground(new Color(50,175,250));
        power.setForeground(Color.WHITE);
        power.addActionListener(this);
        add(power);
        
        
           start(count);
         
         
         
         
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(200, -350, 1000, 1000);
        add(image);
         
        setLocation(75,30);
        setSize(1400,750);
        setVisible(true);
    }
    
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == next){
           repaint();
           o1.setEnabled(true);
             o2.setEnabled(true);
             o3.setEnabled(true);
             o4.setEnabled(true);
           a_given =1;
           if(groupo.getSelection() == null){
                 ua[count][0] = "";
             }else {
                 ua[count][0] = groupo.getSelection().getActionCommand();
             }
           if(count ==13){
               next.setEnabled(false);
               submit.setEnabled(true);
           }
           
           count++;
           start(count);
       }else if(ae.getSource() == power){
           if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10 || count == 12 ||count ==13){
               o1.setEnabled(false);
               o3.setEnabled(false);
           }else{
               o2.setEnabled(false);
               o4.setEnabled(false);
           }
           power.setEnabled(false);
       } else if(ae.getSource() ==submit){
           a_given =1;
            if(groupo.getSelection() == null){
                 ua[count][0] = "";
             }else {
                 ua[count][0] = groupo.getSelection().getActionCommand();
             }
                
                for(int i = 0;i<ua.length;++i){
                    if(ua[i][0].equals(a[i][1])){
                        score +=10;
                    }else{
                        score +=0;
                    }
                }
                setVisible(false);
             new End(naam,score);
       }
   }
    
    
    
    public void paint(Graphics g){
        super.paint(g);
        String time ="TIME LEFT:  " + timer + "  SECONDS";
        g.setColor(new Color(50,175,250));
        g.setFont(new Font("Viner Hand ITC",Font.BOLD, 25));
     
         if(timer>0){
             g.drawString(time, 100, 330);
         }else{
             g.drawString("!!!!!STOP!!!!!", 100, 330);
         }
         timer--;
         
         try{
             Thread.sleep(1000);
             repaint();
         }catch (Exception e){
             e.printStackTrace();
         }
         
         if(a_given == 1){
             a_given = 0;
             timer = 13;
         }else if (timer <0){
             timer = 13;
             o1.setEnabled(true);
             o2.setEnabled(true);
             o3.setEnabled(true);
             o4.setEnabled(true);
             
             if(count == 13){
                 next.setEnabled(false);
                 submit.setEnabled(true);
             }
             
             if(count == 14){
                if(groupo.getSelection() == null){
                 ua[count][0] = "";
             }else {
                 ua[count][0] = groupo.getSelection().getActionCommand();
             }
                
                for(int i = 0;i<ua.length;++i){
                    if(ua[i][0].equals(a[i][1])){
                        score +=10;
                    }
                }
                setVisible(false);
                 new End(naam,score);
             }else{
                 
             
             
             if(groupo.getSelection() == null){
                 ua[count][0] = "";
             }else {
                 ua[count][0] = groupo.getSelection().getActionCommand();
             }
             count++;
             start(count);}
         }
    }
    
    public void start(int count){
        quno.setText("" + (count + 1) + ".");
        state.setText(q[count][0]);
        o1.setText(q[count][1]);
        o2.setText(q[count][2]);
        o3.setText(q[count][3]);
        o4.setText(q[count][4]);
        o1.setActionCommand(q[count][1]);
        o2.setActionCommand(q[count][2]);
        o3.setActionCommand(q[count][3]);
        o4.setActionCommand(q[count][4]);
        groupo.clearSelection();
    }
    
    
    
    public static void main(String[] args){
        new Ques("user");
    }
}
