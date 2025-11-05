import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class MarvellousLogin implements ActionListener
{
    JFrame fobj;
    JButton bobj1, bobj2, bobj3,bobj4;
    JTextField tobj, tobj2;
    JLabel Num1label, Num2label,Resultlabel;

    public MarvellousLogin(String name, int width,int height)
    {
        fobj = new JFrame(name);

        Num1label = new JLabel("Number 1");
        Num1label.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50,150,30);

        Num2label = new JLabel("Number 2");
        Num2label.setBounds(50,100,100,30);

        tobj2 = new JTextField();
        tobj2.setBounds(150,100,150,30);

        bobj1= new JButton("+");
        bobj1.setBounds(40,150,50,20);

        bobj2 = new JButton("-");
        bobj2.setBounds(110,150,50,20);

        bobj3 = new JButton("*");
        bobj3.setBounds(180,150,50,20);

        bobj4 = new JButton("/");
        bobj4.setBounds(250,150,50,20);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(150,200,250,30);

        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(tobj);
        fobj.add(tobj2);
        fobj.add(Num1label);
        fobj.add(Num2label);
        fobj.add(Resultlabel);

        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width,height);
     
        fobj.getContentPane().setBackground(Color.YELLOW);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent aobj)
    {
        String Text1 = tobj.getText();
        String Text2 = tobj2.getText();

        int num1 = Integer.parseInt(Text1);
        int num2 = Integer.parseInt(Text2);
        int result = 0;

        if(aobj.getSource() == bobj1)
        {
            result = num1 + num2;
        }
        else if(aobj.getSource()== bobj2)
        {
            result = num1 - num2;
        }
        else if(aobj.getSource()== bobj3)
        {
            result = num1 * num2;
        }
        else if(aobj.getSource()== bobj4)
        {
            if(num2 != 0)
            result = num1 / num2;

            else
            {
                Resultlabel.setText("Error: Cannot divide by zero!");
                return;
            }
        }
        Resultlabel.setText("Result: " + result);
    }

}

class Calc
{
    public static void main(String A[])
    {
        MarvellousLogin mobj  = new MarvellousLogin("Calculator",400,300);
    }
    
}