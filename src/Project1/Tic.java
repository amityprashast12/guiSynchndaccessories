package Project1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
public class Tic extends Canvas implements ActionListener
{
JFrame jf;
JPanel jp;
JMenu m;
JMenuItem mi,mi1;
JDialog jd;
static int n=0,n2=0;
//static int b1=1,b2=2,b3=3,b4=4,b5=5,b6=6,b7=7,b8=8,b9=9;
//static int c1=1,c2=2,c3=3,c4=4,c5=5,c6=6,c7=7,c8=8,c9=9;

JButton j1,j2,j3,j4,j5,j6,j7,j8,j9,exit;
JButton j10;
JLabel l1;
Font f,f1;
Graphics g;
//Canvas c;
//Mc mc;
public static int b1=1,b2=2,b3=3,b4=4,b5=5,b6=6,b7=7,b8=8,b9=9,i;
public static int c1=1,c2=2,c3=3,c4=4,c5=5,c6=6,c7=7,c8=8,c9=9;
Border b;
//static int ////z[];
public Tic()
{
//int []z=new int[20];
/*for(int i=0;i<20;i++)
{
////z[i]=0;
}*/
i=0;
b1=1;
b2=2;
b3=3;
b4=4;
b5=5;
b6=6;
b7=7;
b8=8;
b9=9;
c1=1;
c2=2;
c3=3;
c4=4;
c5=5;
c6=6;
c7=7;
c8=8;
c9=9;
//super("Tic tac");
jf=new JFrame("TIC TAC TOE");
//Canvas c=new Canvas();
JMenu m=new JMenu("File");
JMenuBar mbar= new JMenuBar();
//mc= new Mc();
mi= new JMenuItem("new");
mi1=new JMenuItem("exit");
//g=getGraphics();
jp=new JPanel();
jp.setBorder(BorderFactory.createLineBorder(Color.gray,2,true));

j1=new JButton();
j2=new JButton();
j3=new JButton();
j4=new JButton();
j5=new JButton();
j6=new JButton();
j7=new JButton();
j8=new JButton();
j9=new JButton();
j1.setBorder(BorderFactory.createLineBorder(Color.black,3));
j2.setBorder(BorderFactory.createLineBorder(Color.black,3));
j3.setBorder(BorderFactory.createLineBorder(Color.black,3));
j4.setBorder(BorderFactory.createLineBorder(Color.black,3));
j5.setBorder(BorderFactory.createLineBorder(Color.black,3));
j6.setBorder(BorderFactory.createLineBorder(Color.black,3));
j7.setBorder(BorderFactory.createLineBorder(Color.black,3));
j8.setBorder(BorderFactory.createLineBorder(Color.black,3));
j9.setBorder(BorderFactory.createLineBorder(Color.black,3));
//jf.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED,Color.gray,color.black));
b= BorderFactory.createRaisedBevelBorder();
jp.setBorder(b);
jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
jf.setJMenuBar(mbar);
m.add(mi);
m.add(mi1);
mbar.add(m);
//add(c);
//add(jf);
//add(mc);
jf.add(jp);
jp.add(j1);
jp.add(j2);
jp.add(j3);
jp.add(j4);
jp.add(j5);
jp.add(j6);
jp.add(j7);
jp.add(j8);
jp.add(j9);
j1.addActionListener(this);
j2.addActionListener(this);
j3.addActionListener(this);
j4.addActionListener(this);
j5.addActionListener(this);
j6.addActionListener(this);
j7.addActionListener(this);
j8.addActionListener(this);
j9.addActionListener(this);
mi.addActionListener(this);
mi1.addActionListener(this);
f= new Font("Comic Sans MS",Font.BOLD,70);
j1.setFont(f);
j2.setFont(f);
j3.setFont(f);
j4.setFont(f);
j5.setFont(f);
j6.setFont(f);
j7.setFont(f);
j8.setFont(f);
j9.setFont(f);
jp.setLayout(new GridLayout(3,3));
Toolkit t= getToolkit();
Dimension ScreenSize=t.getScreenSize();
int width= ScreenSize.width/4+10;
int height= ScreenSize.height/4;
//setBounds(width/8,height/8,width,height);
jf.setSize(400,400);
jf.setLocation(width,height);
jf.setVisible(true);

}

public void dialog()
{
jd=new JDialog(jf,"WINNER");
l1=new JLabel("WINNER",l1.CENTER);
f1=new Font("Garmond",f1.BOLD,40);
l1.setFont(f1);
exit=new JButton("EXIT");
j10 =new JButton("NEW GAME");
jd.add(exit);
jd.add(j10);
jd.add(l1);
exit.addActionListener(this);
j10.addActionListener(this);
exit.setBounds(50,75,100,30);
j10.setBounds(155,75,100,30);
Toolkit tk = Toolkit.getDefaultToolkit();
Dimension screenSize = tk.getScreenSize();
int screenHeight = screenSize.height/4;
int screenWidth = screenSize.width/4+10;
//setSize(screenWidth / 2, screenHeight / 2);
jd.setLocation(screenWidth , screenHeight);
jd.setSize(300,150);
jd.setVisible(true);
jd.setLocationRelativeTo(jf);
jd.setLayout(null);
}
public void dialog2()
{
jd=new JDialog(jf,"DRAW");
l1=new JLabel("DRAW",l1.CENTER);
f1=new Font("Garmond",f1.BOLD,40);
l1.setFont(f1);
exit=new JButton("EXIT");
j10 =new JButton("NEW GAME");
jd.add(exit);
jd.add(j10);
jd.add(l1);
exit.addActionListener(this);
j10.addActionListener(this);
exit.setBounds(50,75,100,30);
j10.setBounds(155,75,100,30);
Toolkit tk = Toolkit.getDefaultToolkit();
Dimension screenSize = tk.getScreenSize();
int screenHeight = screenSize.height/4;
int screenWidth = screenSize.width/4+10;
//setSize(screenWidth / 2, screenHeight / 2);
jd.setLocation(screenWidth , screenHeight);
jd.setSize(300,150);
jd.setVisible(true);
jd.setLocationRelativeTo(jf);
jd.setLayout(null);
}

public void actionPerformed(ActionEvent e)
{
String msg = e.getActionCommand();
if(e.getSource()==mi)
{
new2();
}
if(msg.equals("exit"))
{
System.exit(0);
}
if(n==0)
{
//System.out.println("HIII");
if(e.getSource()==j1)
{
//System.out.println("HIII");
j1.setText("X");
//g=jf.getGraphics();
//g.drawLine(50,50,10,100);
n++;
c1=0;
//repaint();
////z[0]=1;

}
if(e.getSource()==j2)
{
j2.setText("X");
n++;
c2=0;
//repaint();
////z[1]=1;
}
if(e.getSource()==j3)
{
j3.setText("X");
c3=0;
n=1;
////z[2]=1;
//repaint();
}
if(e.getSource()==j4)
{

j4.setText("X");
c4=0;
n=1;
////z[3]=1;
}
if(e.getSource()==j5)
{
j5.setText("X");
c5=0;
////z[4]=1;
n=1;
}
if(e.getSource()==j6)
{c6=0;
j6.setText("X");
n=1;
////z[5]=1;
}
if(e.getSource()==j7)
{

j7.setText("X");
c7=0;
n=1;
////z[6]=1;
}
if(e.getSource()==j8)
{c8=0;
j8.setText("X");
n++;
////z[7]=1;
}
if(e.getSource()==j9)
{c9=0;
j9.setText("X");
n++;
////z[8]=1;
}
}
else
{
if(e.getSource()==j1)
{

b1=0;
j1.setText("O");
n=0;
////z[9]=1;
}
if(e.getSource()==j2)
{

j2.setText("O");
n=0;
b2=0;
////z[10]=1;
}
if(e.getSource()==j3)
{

b3=0;
j3.setText("O");
n=0;
////z[11]=1;
}
if(e.getSource()==j4)
{b4=0;
j4.setText("O");
n=0;
////z[12]=1;

}
if(e.getSource()==j5)
{b5=0;
j5.setText("O");
n=0;
////z[13]=1;
}
if(e.getSource()==j6)
{b6=0;

j6.setText("O");
n=0;
////z[14]=1;
}
if(e.getSource()==j7)
{b7=0;
j7.setText("O");
n=0;
////z[15]=1;
}
if(e.getSource()==j8)
{b8=0;
j8.setText("O");
////z[16]=1;
n=0;
}
if(e.getSource()==j9)
{b9=0;
j9.setText("O");
n=0;
////z[17]=1;
}
}
if(e.getSource()==exit)
{
//System.out.println("J");
System.exit(0);
}
if(e.getSource()==j10)
{
//System.out.println("hi");
new1();
}

check();
}
public void new1()
{
jd.dispose();
//jd.setVisible(false);
jf.setVisible(false);
new Tic();
}
public void new2()
{
jf.setVisible(false);
//jd.setVisible(false);
new Tic();
}
public void check()
{
if(i<9)
{
i++;
//System.out.println("HIII");
if(c1==c2)
{
if(c1==c3)
{
// jd=new JDialog(jf,"WINNER");
//jd.setVisible(true);
//dialog();
//System.exit(0);
//g.drawLine(50,0,300,50);
dialog();
}
}
if(c1==c4)
{
if(c1==c7)
{
dialog();
//System.exit(0);
}
}
if(c5==c2)
{
if(c5==c8)
{
dialog();
//System.exit(0);
}
}
if(c3==c6)
{
if(c6==c9)
{
dialog();
//System.exit(0);
}
}
if(c4==c5)
{
if(c5==c6)
{
dialog();
//System.exit(0);

}
}
if(c7==c8)
{
if(c8==c9)
{
dialog();
//System.exit(0);
}
}
if(c1==c5)
{
if(c1==c9)
{
dialog();
//System.exit(0);
}
}
if(c7==c3)
{
if(c7==c5)
{
dialog();
//System.exit(0);
}
}
if(b1==b2)
{
if(b1==b3)
{
dialog();
//System.exit(0);
}
}
if(b1==b4)
{
if(b1==b7)
{
dialog();
//System.exit(0);
}
}
if(b5==b2)
{
if(b5==b8)
{
dialog();
//System.exit(0);
}
}
if(b3==b6)
{
if(b6==b9)
{
dialog();
//System.exit(0);
}
}
if(b4==b5)
{
if(b5==b6)
{
dialog();
//System.exit(0);
}
}
if(b7==b8)
{
if(b8==b9)
{
dialog();
//System.exit(0);
}
}
if(b1==b5)
{
if(b1==b9)
{
dialog();
//System.exit(0);
}
}
if(b7==b3)
{
if(b7==b5)
{
dialog();
//System.exit(0);
}
}
else
{
/*if((////z[1]==////z[2])&&(////z[1]==////z[3])&&(////z[1]==////z[4])&&(////z[1]==////z[4])&&(////z[1]==////z[5])&&(////z[1]==////z[6])&&(////z[1]==////z[7])&&(////z[1]==////z[8])&&(////z[1]==////z[10])&&(////z[1]==////z[9])&&(////z[1]==////z[12])&&(////z[1]==////z[11])&&(////z[1]==////z[13])&&(////z[1]==////z[14])&&(////z[1]==////z[15])&&(////z[1]==////z[16])&&(////z[1]==////z[17]))
{
dialog2();
}*/
}
}
if(i==9)
{
dialog2();
}
}

public static void main(String... s)
{
new Tic();
}
}