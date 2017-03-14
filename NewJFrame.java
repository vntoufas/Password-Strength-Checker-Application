import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import javax.swing.*;

public class NewJFrame extends JFrame{
  
    private JLabel label1;
    private JLabel label2;
    private JTextField text1;
    private JButton check_pass_button;
    private JLabel status;//
    private JLabel status2;
    private JLabel status3;
    private JLabel status4;
    
    public NewJFrame(){
    super("Password strength checker");
    setSize(400,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    label1=new JLabel("Νέο συνθηματικό : ");
    label1.setBounds(30,30,140,30);
    check_pass_button=new JButton ("Έλεγχος συνθηματικού ");
    check_pass_button.setBounds(50,130,190,40);
    text1=new JTextField(20);
    text1.setBounds(150,30,110,30);
    status=new JLabel("");
    status2=new JLabel("");
    status3=new JLabel("");
    status4=new JLabel("");
    status.setBounds(20,60,350,30);
    status2.setBounds(20,75,350,30);
    status3.setBounds(20,90,350,30);
    status4.setBounds(20,105,350,30);
    Container pane =getContentPane();
    check_password check=new check_password();
    check_pass_button.addActionListener(check);
    pane.setLayout(null);
    pane.add(label1);
    pane.add(text1);
    pane.add(check_pass_button);
    pane.add(status);
    pane.add(status2);
    pane.add(status3);
    pane.add(status4);
    setVisible(true);  
    repaint();  
    
   
    }//κλεινει το new frame  
   private class check_password implements ActionListener{
   //private String ex1;
    public void actionPerformed(ActionEvent event){
    Object source=event.getSource();
    if (source==check_pass_button)
        {String password=text1.getText();
        status.setText("");
        status2.setText("");
        status3.setText("");
        status4.setText("");
        //System.out.println("you just pressed the button "+text1.getText());
        int len = text1.getText().length();
        try{CheckForNumbers(password);}
        catch(NoNumberException e){status.setText(e.toString());}       
        try{CheckForAlpha(password);}
        catch(NoAlphaException d){status2.setText(d.toString());}
        try{CheckForLength(password);}
        catch(LengthException f){status3.setText(f.toString());}
        try{CheckForSpecials(password);}
        catch(SpecialsException g){status4.setText(g.toString());}
        }
   }
}
   public static void CheckForNumbers(String password) throws NoNumberException{
   int NumFlag=0;
       for (int j=0;j<password.length();j++)
   {if (Character.isDigit(password.charAt(j)))
       NumFlag++;}
   if (NumFlag==0){throw new NoNumberException();}
   }
   
  public static void CheckForAlpha(String password) throws NoAlphaException{
   int AlphaFlag=0;
       for (int j=0;j<password.length();j++)
   {if (Character.isLetter(password.charAt(j)))
       AlphaFlag++;}
   if (AlphaFlag==0){throw new NoAlphaException();}
   }
  
  public static void CheckForLength(String password) throws LengthException{
   int LengthFlag=0;
       
   if (password.length()<8){throw new LengthException();}
  }
   public static void CheckForSpecials(String password) throws SpecialsException{
   int SpecialsFlag=0;
   char ch1='!';
   char ch2='@';
   char ch3='#';
   for (int j=0;j<password.length();j++)
   {if (((password.charAt(j))==ch1)||((password.charAt(j))==ch2)||((password.charAt(j))==ch3))
       SpecialsFlag++;}
   if (SpecialsFlag==0){throw new SpecialsException();}
  }
   
}//κλείνει την class 
 