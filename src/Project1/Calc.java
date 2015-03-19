package Project1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class Calc extends WindowAdapter implements ActionListener,KeyListener
{

JFrame f;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b10,b13,b12,b11,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29;
static int n1=0,n2=0;
static int n3=0,op=0,op1=0;
static double n=0.0,cv=0.0;
JPanel p1,p2,p3,p4,p5,p6;
String s1,s2,s3=" ",s5=" ";
Color cl;
JTextField t1,t2,t3;
Font f1,f2;
Calc()
{
f1=new Font("Lucida Sans Unicode",Font.PLAIN,25);
f2=new Font("Verdana",Font.BOLD,13);
cl=new Color(202,013,204);
p5=new JPanel();
p6=new JPanel();
p4=new JPanel();
p2=new JPanel();
p1=new JPanel();
p3=new JPanel();
f=new JFrame("calculator");
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
b6=new JButton("6");
b7=new JButton("7");
b8=new JButton("8");
b9=new JButton("9");
b0=new JButton("0");
b10=new JButton("+");
b11=new JButton("-");
b12=new JButton("*");
b13=new JButton(" / ");
b14=new JButton(" = ");
b15=new JButton("clc");
b16=new JButton("PI");
b17=new JButton("tan");
b18=new JButton("cos");
b19=new JButton("sin");
b20=new JButton("sqrt");
b21=new JButton("x^2");
b22=new JButton("x^3");
b23=new JButton("log");
b24=new JButton("ln");
b25=new JButton("�");
b26=new JButton("cbrt");
b27=new JButton("x^y");
b28=new JButton("1/x");
b1.setFont(f2);
b2.setFont(f2);
b3.setFont(f2);
b4.setFont(f2);
b5.setFont(f2);
b6.setFont(f2);
b7.setFont(f2);
b8.setFont(f2);
b9.setFont(f2);
b10.setFont(f2);
b11.setFont(f2);
b12.setFont(f2);
b13.setFont(f2);
b14.setFont(f2);
b15.setFont(f2);
b16.setFont(f2);
b17.setFont(f2);
b18.setFont(f2);
b19.setFont(f2);
b20.setFont(f2);
b21.setFont(f2);
b22.setFont(f2);
b23.setFont(f2);
b24.setFont(f2);
b25.setFont(f2);
b26.setFont(f2);
b27.setFont(f2);
b28.setFont(f2);
b0.setFont(f2);

f.setBackground(cl);
//p6.setOpaque(false);
f.setDefaultLookAndFeelDecorated(true);
//f.setOpacity(0.4f);
  p6.setBackground(new Color(0,0,125));
f.add(p6);
//b28.setBackground(cl);
p4.setBackground(cl);
p1.setBackground(cl);
p5.setBackground(cl);
p4.setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.black));
t1=new JTextField();
t2=new JTextField(" ");
t1.setFont(f1);
t2.setFont(f1);
//t3=new JTextField();
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
b12.addActionListener(this);
b11.addActionListener(this);
b13.addActionListener(this);
b10.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);
b23.addActionListener(this);
b24.addActionListener(this);
b25.addActionListener(this);
b26.addActionListener(this);
b27.addActionListener(this);
b28.addActionListener(this);
t1.addKeyListener(this);
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
p1.add(b8);
p1.add(b9);
p1.add(b15);
p1.add(b0);
p1.add(b16);
p4.add(b10);
p4.add(b11);
p4.add(b12);
p4.add(b13);
p4.add(b14);
p5.add(b17);
p5.add(b18);
p5.add(b19);
p5.add(b20);
p5.add(b21);
p5.add(b22);
p5.add(b23);
p5.add(b24);
p5.add(b25);
p5.add(b26);
p5.add(b27);
p5.add(b28);
p3.add(t2);
p2.add(t1);

p1.setBounds(215,140,200,200);
p2.setBounds(10,85,510,50);
p3.setBounds(10,30,510,50);
p4.setBounds(420,140,100,200);
p5.setBounds(10,140,200,200);
p6.add(p1);
p6.add(p2);
p6.add(p3);
p6.add(p4);
p6.add(p5);
//t1.setText("h");
p3.setLayout(new GridLayout());
p2.setLayout(new GridLayout());
p1.setLayout(new GridLayout(4,3,3,3));
p4.setLayout(new GridLayout(5,1,2,2));
p5.setLayout(new GridLayout(4,3,3,3));
f.setLayout(null);
p6.setLayout(null);
//f.setJavaLookandFeel();
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//windowClosing(this);

    /*f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
        {
                System.exit(0);
             }
        });*/

f.pack();
p6.setBounds(0,0,550,400);
f.setSize(550,400);
f.setLocation(308,170);
//f.setResizable(false);
f.setVisible(true);
}


/*public void windowClosing(WindowEvent e)
{
System.exit(0);
}*/
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b0)
{
s3=t1.getText();
s3+="0";
t1.setText(s3);
}
if(e.getSource()==b16)
{
s3=t1.getText();
s3+="3.14";
t1.setText(s3);
}
if(e.getSource()==b1)
{
s3=t1.getText();
s3+="1";
t1.setText(s3);
}
if(e.getSource()==b2)
{
s3=t1.getText();
s3+="2";
t1.setText(s3);
}
if(e.getSource()==b3)
{
s3=t1.getText();
s3+="3";
t1.setText(s3);
}
if(e.getSource()==b4)
{
s3=t1.getText();
s3+="4";
t1.setText(s3);
}
if(e.getSource()==b5)
{
s3=t1.getText();
s3+="5";
t1.setText(s3);
}
if(e.getSource()==b6)
{
s3=t1.getText();
s3+="6";
t1.setText(s3);
}
if(e.getSource()==b7)
{
s3=t1.getText();
s3+="7";
t1.setText(s3);
}
if(e.getSource()==b8)
{
s3=t1.getText();
s3+="8";
t1.setText(s3);
}
if(e.getSource()==b9)
{
s3=t1.getText();
s3+="9";
t1.setText(s3);
}


if(e.getSource()==b10)
{

if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{

 cv=n+cv;
t1.setText(String.valueOf(cv));

}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{
}
t2.setText(" ");

}
op=1;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);
t2.setText(String.valueOf(n));
cv=n;
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);

cv=cv+n;
t2.setText(String.valueOf(cv));
t1.setText(null);
}
}

if(e.getSource()==b11)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");}
op=2;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);
t2.setText(String.valueOf(n));
cv=n;
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=cv-n;
t2.setText(String.valueOf(cv));
t1.setText(null);
}
}
if(e.getSource()==b12)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");

}
op=3;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);
t2.setText(String.valueOf(n));
cv=n;
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=cv*n;
t2.setText(String.valueOf(cv));
t1.setText(null);
}
}

if(e.getSource()==b13)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=4;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);
t2.setText(String.valueOf(n));
cv=n;
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=cv/n;
t2.setText(String.valueOf(cv));
t1.setText(null);
}
}
if(e.getSource()==b17)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=0;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);
n=Math.toDegrees(n);
cv=Math.tan(n);
t1.setText(String.valueOf(cv));

}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
n=Math.toDegrees(n);
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
//t1.setText(null);
}
}
if(e.getSource()==b18)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=0;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);
n=Math.toDegrees(n);
cv=Math.cos(n);
t1.setText(String.valueOf(cv));

}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
n=Math.toDegrees(n);
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
//t1.setText(null);
}
}
if(e.getSource()==b19)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=0;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);
n=Math.toDegrees(n);
cv=Math.sin(n);
t1.setText(String.valueOf(cv));
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
n=Math.toDegrees(n);
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
//t1.setText(null);
}
}
if(e.getSource()==b20)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=0;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);

cv=Math.sqrt(n);
t1.setText(String.valueOf(cv));
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=Math.sqrt(cv);
t2.setText(String.valueOf(cv));
t1.setText(null);
}
}
if(e.getSource()==b21)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
/*else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}*/
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=0;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);

cv=Math.pow(n,2);
t1.setText(String.valueOf(cv));
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
//t1.setText(null);
}
}
if(e.getSource()==b22)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=0;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);

cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=Math.pow(cv,3);
t1.setText(String.valueOf(cv));
//t1.setText(null);
}
}
if(e.getSource()==b23)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=0;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);

cv=Math.log10(n);
t1.setText(String.valueOf(cv));
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
//t1.setText(null);
}
}
if(e.getSource()==b24)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=0;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);

cv=Math.log(n);
t1.setText(String.valueOf(cv));
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
//t1.setText(null);
}
}
if(e.getSource()==b26)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=0;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);

cv=Math.cbrt(n);
t1.setText(String.valueOf(cv));
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=Math.cbrt(n);
t1.setText(String.valueOf(cv));
//t1.setText(null);
}
}
if(e.getSource()==b27)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=14;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);

//cv=Math.pow(n,3);
t2.setText(String.valueOf(n));
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=Math.pow(cv,n);
t2.setText(String.valueOf(cv));
t1.setText(null);
}
}
if(e.getSource()==b28)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=0;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);

cv=1.0/n;
t1.setText(String.valueOf(cv));
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=1/cv;
t1.setText(String.valueOf(cv));
//t1.setText(null);
}
}
if(e.getSource()==b25)
{
if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
}
op=0;
if(t2.getText().equals(s5))
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
//t1.setText(null);

}
}
if(e.getSource()==b14)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else if(op==4)
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
else if(op==5)
{
cv=Math.tan(cv);
t1.setText(String.valueOf(cv));
}
else if(op==6)
{
cv=Math.cos(cv);
t1.setText(String.valueOf(cv));
}
else if(op==7)
{
cv=Math.sin(cv);
t1.setText(String.valueOf(cv));
}
else if(op==8)
{
cv=Math.sqrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==9)
{
cv=Math.pow(cv,2);
t1.setText(String.valueOf(cv));
}
else if(op==10)
{
cv=Math.pow(n,3);
t1.setText(String.valueOf(cv));
}
else if(op==11)
{
cv=Math.log10(cv);
t1.setText(String.valueOf(cv));
}
else if(op==12)
{
cv=Math.log(cv);
t1.setText(String.valueOf(cv));
}
else if(op==13)
{
cv=Math.cbrt(cv);
t1.setText(String.valueOf(cv));
}
else if(op==14)
{
cv=Math.pow(cv,n);
t1.setText(String.valueOf(cv));
}
else if(op==15)
{
cv=(double)(1.0/cv);
t1.setText(String.valueOf(cv));
}
else if(op==16)
{
cv=cv*-1.0;
t1.setText(String.valueOf(cv));
}
else
{}
t2.setText(" ");
n=0.0;
cv=0.0;
op=0;
}
if(e.getSource()==b15)
{
t1.setText("");
t2.setText("");
cv=0;
n=0;
op=0;
//f.setVisible(false);
//new Calc();
}
}















public void keyTyped(KeyEvent e)
{
}
public void keyReleased(KeyEvent e)
{
}
public void keyPressed(KeyEvent e)
{
if(e.getKeyCode()==61)
{
t2.setText(String.valueOf(cv));
String s10=t1.getText();
int u=s10.length();
t1.setText(s10.substring(0,(u-1)));
                if(String.valueOf(KeyStroke.getKeyStrokeForEvent(e)).equals("shift pressed EQUALS"))
{
                       if(op!=0)
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
t2.setText(" ");
}
op=1;
if(t2.getText().equals(s5))
{
s1=t1.getText();
 n=Double.parseDouble(s1);
t1.setText(null);
t2.setText(String.valueOf(n));
cv=n;
}
else
{
s1=t1.getText();
n=Double.parseDouble(s1);
cv=cv+n;
t2.setText(String.valueOf(cv));
t1.setText(null);
}
}
else
{
s2=t1.getText();
 n=Double.parseDouble(s2);
if(op==1)
{
 cv=n+cv;
t1.setText(String.valueOf(cv));
}
else if(op==2)
{
cv=cv-n;
t1.setText(String.valueOf(cv));
}
else if(op==3)
{
cv=cv*n;
t1.setText(String.valueOf(cv));
}
else
{
cv=cv/n;
t1.setText(String.valueOf(cv));
}
t2.setText(" ");


          }

      }
}

public static void main(String... s)
{

try {     
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

    } 
    catch (Exception e) {
       System.out.println(e);
  }  
new Calc();
}
}