

import java.awt.*;
import javax.swing.*;
class Roul extends JFrame
{
    JButton b0, b37, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34;
    JButton b35, b36, first12, second12, third12, oneto18, nineto36, even, odd, red, black, firstcol, secondcol, thirdcol;
    JLabel l1;
    Roul()
    {
        b0= new JButton("0");
        b1= new JButton("1");
        b2= new JButton("2");
        b3= new JButton("3");
        b4= new JButton("4");
        b5= new JButton("5");
        b6= new JButton("6");
        b7= new JButton("7");
        b8= new JButton("8");
        b9= new JButton("9");
        b10= new JButton("10");
        b11= new JButton("11");
        b12= new JButton("12");
        b13= new JButton("13");
        b14= new JButton("14");
        b15= new JButton("15");
        b16= new JButton("16");
        b17= new JButton("17");
        b18= new JButton("18");
        b19= new JButton("19");
        b20= new JButton("20");
        b21= new JButton("21");
        b22= new JButton("22");
        b23= new JButton("23");
        b24= new JButton("24");
        b25= new JButton("25");
        b26= new JButton("26");
        b27= new JButton("27");
        b28= new JButton("28");
        b29= new JButton("29");
        b30= new JButton("30");
        b31= new JButton("31");
        b32= new JButton("32");
        b33= new JButton("33");
        b34= new JButton("34");
        b35= new JButton("35");
        b36= new JButton("36");
        b37= new JButton("00");
        first12= new JButton("1st 12");
        second12= new JButton("2nd 12");
        third12= new JButton("3rd 12");
        oneto18= new JButton("1 to 18");
        nineto36= new JButton("19 to 36");
        even= new JButton("Even");
        odd= new JButton("Odd");
        red= new JButton("Red");
        black= new JButton("Black");
        firstcol= new JButton("2 to 1");
        secondcol= new JButton("2 to 1");
        thirdcol= new JButton("2 to 1");
        l1= new JLabel("ROULETTE BOARD");


        b0.setBounds(200, 200, 150, 30);
        b37.setBounds(350, 200, 150, 30);
        b1.setBounds(200, 230, 100, 30);
        b2.setBounds(300, 230, 100, 30);
        b3.setBounds(400, 230, 100, 30);
        b4.setBounds(200, 260, 100, 30);
        b5.setBounds(300, 260, 100, 30);
        b6.setBounds(400, 260, 100, 30);
        b7.setBounds(200, 290, 100, 30);
        b8.setBounds(300, 290, 100, 30);
        b9.setBounds(400, 290, 100, 30);
        b10.setBounds(200, 320, 100, 30);
        b11.setBounds(300, 320, 100, 30);
        b12.setBounds(400, 320, 100, 30);
        b13.setBounds(200, 350, 100, 30);
        b14.setBounds(300, 350, 100, 30);
        b15.setBounds(400, 350, 100, 30);
        b16.setBounds(200, 380, 100, 30);
        b17.setBounds(300, 380, 100, 30);
        b18.setBounds(400, 380, 100, 30);
        b19.setBounds(200, 410, 100, 30);
        b20.setBounds(300, 410, 100, 30);
        b21.setBounds(400, 410, 100, 30);
        b22.setBounds(200, 440, 100, 30);
        b23.setBounds(300, 440, 100, 30);
        b24.setBounds(400, 440, 100, 30);
        b25.setBounds(200, 470, 100, 30);
        b26.setBounds(300, 470, 100, 30);
        b27.setBounds(400, 470, 100, 30);
        b28.setBounds(200, 500, 100, 30);
        b29.setBounds(300, 500, 100, 30);
        b30.setBounds(400, 500, 100, 30);
        b31.setBounds(200, 530, 100, 30);
        b32.setBounds(300, 530, 100, 30);
        b33.setBounds(400, 530, 100, 30);
        b34.setBounds(200, 560, 100, 30);
        b35.setBounds(300, 560, 100, 30);
        b36.setBounds(400, 560, 100, 30);
        first12.setBounds(100, 230, 100, 120);
        second12.setBounds(100, 350, 100, 120);
        third12.setBounds(100, 470, 100, 120);
        oneto18.setBounds(0, 230, 100, 60);
        even.setBounds(0, 290, 100, 60);
        red.setBounds(0, 350, 100, 60);
        black.setBounds(0, 410, 100, 60);
        odd.setBounds(0, 470, 100, 60);
        nineto36.setBounds(0, 530, 100, 60);
        firstcol.setBounds(200, 590, 100, 30);
        secondcol.setBounds(300, 590, 100, 30);
        thirdcol.setBounds(400, 590, 100, 30);
        l1.setBounds(100, 100, 200, 150);



        b1.setBackground(Color.RED);
        b3.setBackground(Color.red);
        b5.setBackground(Color.red);
        b7.setBackground(Color.red);
        b9.setBackground(Color.red);
        b12.setBackground(Color.red);
        b14.setBackground(Color.red);
        b16.setBackground(Color.red);
        b18.setBackground(Color.red);
        b19.setBackground(Color.red);
        b21.setBackground(Color.red);
        b23.setBackground(Color.red);
        b25.setBackground(Color.red);
        b27.setBackground(Color.red);
        b30.setBackground(Color.red);
        b32.setBackground(Color.red);
        b34.setBackground(Color.red);
        b36.setBackground(Color.red);
        red.setBackground(Color.red);

       /*
       b0.setForeground(Color.white);
        b37.setForeground(Color.white);
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);
        b5.setForeground(Color.white);
        b6.setForeground(Color.white);
        b7.setForeground(Color.white);
        b8.setForeground(Color.white);
        b9.setForeground(Color.white);
        b10.setForeground(Color.white);
        b11.setForeground(Color.white);
        b12.setForeground(Color.white);
        b13.setForeground(Color.white);
        b14.setForeground(Color.white);
        b15.setForeground(Color.white);
        b16.setForeground(Color.white);
        b17.setForeground(Color.white);
        b18.setForeground(Color.white);
        b19.setForeground(Color.white);
        b20.setForeground(Color.white);
        b21.setForeground(Color.white);
        b22.setForeground(Color.white);
        b23.setForeground(Color.white);
        b24.setForeground(Color.white);
        b25.setForeground(Color.white);
        b26.setForeground(Color.white);
        b27.setForeground(Color.white);
        b28.setForeground(Color.white);
        b29.setForeground(Color.white);
        b30.setForeground(Color.white);
        b31.setForeground(Color.white);
        b32.setForeground(Color.white);
        b33.setForeground(Color.white);
        b34.setForeground(Color.white);
        b35.setForeground(Color.white);
        b36.setForeground(Color.white);
        first12.setForeground(Color.white);
        second12.setForeground(Color.white);
        third12.setForeground(Color.white);
        oneto18.setForeground(Color.white);
        nineto36.setForeground(Color.white);
        even.setForeground(Color.white);
        odd.setForeground(Color.white);
        red.setForeground(Color.white);
        black.setForeground(Color.white);
        firstcol.setForeground(Color.white);
        secondcol.setForeground(Color.white);
        thirdcol.setForeground(Color.white);
        */


        b2.setBackground(Color.black);
        b4.setBackground(Color.black);
        b6.setBackground(Color.black);
        b8.setBackground(Color.black);
        b10.setBackground(Color.black);
        b11.setBackground(Color.black);
        b13.setBackground(Color.black);
        b15.setBackground(Color.black);
        b17.setBackground(Color.black);
        b20.setBackground(Color.black);
        b22.setBackground(Color.black);
        b24.setBackground(Color.black);
        b26.setBackground(Color.black);
        b28.setBackground(Color.black);
        b29.setBackground(Color.black);
        b31.setBackground(Color.black);
        b33.setBackground(Color.black);
        b35.setBackground(Color.black);
        black.setBackground(Color.black);

        b0.setBackground(Color.green);
        b37.setBackground(Color.green);
        odd.setBackground(Color.green);
        even.setBackground(Color.green);
        firstcol.setBackground(Color.green);
        secondcol.setBackground(Color.green);
        thirdcol.setBackground(Color.green);
        oneto18.setBackground(Color.green);
        nineto36.setBackground(Color.green);
        first12.setBackground(Color.green);
        second12.setBackground(Color.green);
        third12.setBackground(Color.green);

        add(b0);
        add(b37);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(b17);
        add(b18);
        add(b19);
        add(b20);
        add(b21);
        add(b22);
        add(b23);
        add(b24);
        add(b25);
        add(b26);
        add(b27);
        add(b28);
        add(b29);
        add(b30);
        add(b31);
        add(b32);
        add(b33);
        add(b34);
        add(b35);
        add(b36);
        add(first12);
        add(second12);
        add(third12);
        add(oneto18);
        add(even);
        add(red);
        add(black);
        add(odd);
        add(nineto36);
        add(firstcol);
        add(secondcol);
        add(thirdcol);
        add(l1);

        setSize(500, 700);
        setLayout(null);
        setVisible(true);


    }




}

