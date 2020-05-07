
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;



class Main extends Bet implements ActionListener {
    JFrame f = new JFrame();
    JFrame f1,f2;
    JLabel l1, l2,l41;
    JLabel[] l3=new JLabel[6];  JLabel[] ama=new JLabel[6];
    JLabel[] l4=new JLabel[6];  JLabel[] amb=new JLabel[6];
    JLabel[] l5=new JLabel[6];
    JLabel[] l6=new JLabel[6];
    JLabel[] l7=new JLabel[6];
    JLabel[] l8=new JLabel[6];

    JTextField t1, t2;

    JTextField[] t3=new JTextField[6]; JTextField[] t4=new JTextField[6]; JTextField[] t5=new JTextField[6];

    JButton b1, b2,b3,b4,b5;

    JComboBox[] cb=new JComboBox[6];
    JComboBox[] cb1=new JComboBox[6];


    int amt[]= new int[6] ; int bt1[]= new int[6] ; int bet1[]= new int[6] ; int am2[]= new int[6] ; int am3[]= new int[6] ;

    int user=0;
    int no ,col;  int amount;
    public static void main(String[] args) {
        Main m = new Main();
        m.doit1();

    }



    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            user = Integer.parseInt(s1);


            if (user > 0 && user < 7) {
                for(int i= 0;i<user;i++)
                    amt[i] = Integer.parseInt(s2);
                amount = amt[0];


                JOptionPane.showMessageDialog(f, " USERS :\t" + user + "\nStarting Amount:\t" + amt[0] );
                doit();
                f1= new JFrame();
                f1.setLayout(null);
                f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f1.setSize(1600, 700);
                f1.setVisible(true);
                for(int i =0;i<user;i++)
                    call(no,col,i);

                runn(user);


                f.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(f,"INVLAID","Alert",JOptionPane.WARNING_MESSAGE);
            }


        }






    }


    public void doit1()
    {


        l1 = new JLabel("Number of users");
        l41= new JLabel("(1-6)");
        l2 = new JLabel("Starting Amount");

        t1 = new JTextField();
        t2 = new JTextField();


        l1.setBounds(50, 50, 200, 30);
        l41.setBounds(50, 65, 200, 30);
        l2.setBounds(50, 100, 200, 30);
        t1.setBounds(170, 50, 100, 30);
        t2.setBounds(170, 100, 100, 30);


        b1 = new JButton("OKAY");
        b1.setBounds(110, 170, 100, 30);

        f.add(l1);
        f.add(l41);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b1);


        b1.addActionListener(this);

        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setSize(400, 400);
        f.setVisible(true);

    }

    public void doit() {



        no = (int) (Math.random() * 38);

        col = 2;
        if (no >= 1 && no <= 10) {
            if (no % 2 == 1) {

                col = 1;
            } else

                col = 0;
        } else if (no >= 10 && no <= 18) {
            if (no % 2 == 0) {

                col = 1;
            } else

                col = 0;

        } else if (no >= 19 && no <= 28) {
            if (no % 2 == 1) {

                col = 1;
            } else

                col = 0;

        } else if (no >= 28 && no <= 36) {
            if (no % 2 == 0) {

                col = 1;
            } else

                col = 0;
        }




    }

    public void call(int no ,int col,int k) {

        int x1 = 0, y1 = 0;

        l3[k] = new JLabel("User  " + Integer.toString(k + 1));
        ama[k] = new JLabel("Amount in Hand");
        amb[k] = new JLabel(Integer.toString(amt[k]));
        l4[k] = new JLabel("Enter amount for Inside Bet");
        t3[k] = new JTextField();
        l8[k] = new JLabel("Bet");
        String ib[] = {"STRAIGHT BET (35:1)", "SPLIT BET(17:1)", "CORNER BET(8:1)", "STREET BET(11:1)", "DOUBLE STREET BET(5:1)", "5-NUMBER BET(5:1)"};
        cb[k] = new JComboBox(ib);
        l5[k] = new JLabel("Enter the Numbers");
        t4[k] = new JTextField();
        l6[k] = new JLabel("Enter amount for Outside Bet");
        t5[k] = new JTextField();
        l7[k] = new JLabel("Bet");
        String ob[] = {"RED", "BLACK", "ODD", "EVEN", "1 to 18", "19 to 36", "1st 12", "2nd 12", "3rd 12", "Column-1", "Column-2", "Column-3"};
        cb1[k] = new JComboBox(ob);


        if (k == 0) {
            x1 = 0;
            y1 = 0;
        } else if (k == 1) {
            x1 = 1;
            y1 = 0;
        } else if (k == 2) {
            x1 = 2;
            y1 = 0;
        } else if (k == 3) {
            x1 = 0;
            y1 = 1;
        } else if (k == 4) {
            x1 = 1;
            y1 = 1;
        } else if (k == 5) {
            x1 = 2;
            y1 = 1;
        }


        l3[k].setBounds(170 + (500 * x1), 20 + (250 * y1), 100, 30);
        ama[k].setBounds(50 + (500 * x1), 50 + (250 * y1), 200, 30);
        amb[k].setBounds(250 + (500 * x1), 50 + (250 * y1), 100, 30);
        l4[k].setBounds(50 + (500 * x1), 80 + (250 * y1), 200, 30);
        t3[k].setBounds(250 + (500 * x1), 80 + (250 * y1), 100, 30);
        l8[k].setBounds(50 + (500 * x1), 110 + (250 * y1), 100, 30);
        cb[k].setBounds(250 + (500 * x1), 110 + (250 * y1), 200, 30);
        l5[k].setBounds(50 + (500 * x1), 140 + (250 * y1), 200, 30);
        t4[k].setBounds(250 + (500 * x1), 140 + (250 * y1), 100, 30);
        l6[k].setBounds(50 + (500 * x1), 170 + (250 * y1), 200, 30);
        t5[k].setBounds(250 + (500 * x1), 170 + (250 * y1), 150, 30);
        l7[k].setBounds(50 + (500 * x1), 200 + (250 * y1), 100, 30);
        cb1[k].setBounds(259 + (500 * x1), 200 + (250 * y1), 120, 30);


        f1.add(l3[k]);
        f1.add(l4[k]);
        f1.add(t3[k]);
        f1.add(l8[k]);
        f1.add(cb[k]);
        f1.add(l5[k]);
        f1.add(t4[k]);
        f1.add(l6[k]);
        f1.add(t5[k]);
        f1.add(l7[k]);
        f1.add(cb1[k]);
        f1.add(ama[k]);
        f1.add(amb[k]);
    }



    public void runn(int user)
    {

        b2 = new JButton("INSTRUCTIONS");
        b2.setBounds(100, 500, 200, 30);
        f1.add(b2);

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f3= new JFrame();
                JLabel l= new JLabel("\t\tINSTRUCTIONS");
                JTextArea t= new JTextArea("1.There can only be a maximum of 6 players.\n2.There are two kinds of bets:\tInside Bet and Outside Bet.\n3.INSIDE BET:\n  i)STRAIGHT: Place bet on any 1 number. Winning returns 35:1.\n ii)SPLIT: Place bet on any 2 adjacent numbers. Winning returns 17:1\n iii)CORNER: Place bet on any 4 numbers sharing the same corner. Winning returns 8:1\n  iv)STREET:Place bet on any 3 numbers in the same row. Winning returns 11:1.\n  v)DOUBLE STREET: Place bet on any 6 numbers in two adjacent rows. Winning returns 5:1\n  vi)5-NUMBER BET: Bets on the first five numbers, i.e, 0, 00, 1, 2, 3. Winning returns 6:1.\n4.OUTSIDE BET:\n  i)RED/BLACK: Bets on either one of the 2 colours. Winning returns 1:1.\n  ii)ODD/EVEN: Bets on either even or odd numbers. Winning returns 1:1.\n iii)1 to 18/19 to 36: Bets on either set of numbers. Winning returns 1:1\n iv)1st 12/ 2nd 12/ 3rd 12: Bets on any one of these 3 sets of numbers. Winning returns 2:1.\n  v)COLUMN: Cam bet on numbers either in the fist column, second column, or third column.\n  Winning returns 2:1.\n5.Players can choose to either quit or continue after each round.\n6.An equal starting amount will be distributed to each player.\nThe players have to split this amount wisely on either Inside/Outside Bets.\n7.Player with the highest amount in hand after all rounds are over is declared the winner.");
                l.setFont(new Font("INSTRUCTIONS", Font.BOLD,18));
                Font font= new Font("Comic Sans MS", Font.PLAIN, 15);
                t.setFont(font);
                f3.getContentPane().setBackground( Color.CYAN);
                l.setBounds(20, 10, 300, 30);
                t.setBounds(20, 50, 700, 500);
                t.setEditable(false);
                f3.setSize(800, 600);
                f3.setVisible(true);
                f3.setLayout(null);
                f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                f3.add(l);
                f3.add(t);

            }
        });

        b4 = new JButton("Roulette Board");
        b4.setBounds(700, 500, 200, 30);
        f1.add(b4);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Roul r = new Roul();
            }
        });

        b5 = new JButton("EXIT");
        b5.setBounds(500, 600, 100, 30);
        f1.add(b5);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        b3 = new JButton("BET");
        b3.setBounds(500, 500, 100, 30);
        f1.add(b3);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < user; i++) {
                    bt1[i] = Integer.parseInt(t3[i].getText());
                    bet1[i] = Integer.parseInt(t5[i].getText());


                }
                int c = 0;
                for (int i = 0; i < user; i++) {
                    if (bt1[i] > amt[i] || bet1[i] > (amt[i] - bt1[i])) {
                        JOptionPane.showMessageDialog(f, "INVLAID", "Alert", JOptionPane.WARNING_MESSAGE);
                        c++;
                    }
                }
                if(c==0) {
                    for (int i = 0; i < user; i++) {

                        int ch1 = cb[i].getSelectedIndex();
                        int ch2 = cb1[i].getSelectedIndex();

                        String[] nums = t4[i].getText().split(",");

                        amb[i].setText(Integer.toString(amt[i] - bet1[i] - bt1[i]));
                        switch (ch1) {
                            case 0:

                                am2[i] = straight(bt1[i], no, amt[i], Integer.parseInt(nums[0]));
                                break;
                            case 1:
                                am2[i] = split(bt1[i], no, amt[i], Integer.parseInt(nums[0]), Integer.parseInt(nums[1]));
                                break;
                            case 2:
                                am2[i] = corner(bt1[i], no, amt[i], Integer.parseInt(nums[0]), Integer.parseInt(nums[1]), Integer.parseInt(nums[2]), Integer.parseInt(nums[3]));
                                break;
                            case 3:
                                am2[i] = street(bt1[i], no, amt[i], Integer.parseInt(nums[0]), Integer.parseInt(nums[1]), Integer.parseInt(nums[2]));
                                break;
                            case 4:
                                int num6[] = {Integer.parseInt(nums[0]), Integer.parseInt(nums[1]), Integer.parseInt(nums[2]), Integer.parseInt(nums[3]), Integer.parseInt(nums[4]), Integer.parseInt(nums[5])};
                                am2[i] = doublex(bt1[i], no, amt[i], num6[0], num6[1], num6[2], num6[3], num6[4], num6[5]);
                                break;
                            case 5:
                                am2[i] = fiveno(bt1[i], no, amt[i]);
                                break;

                        }

                        switch (ch2) {
                            case 0:
                                am3[i] = red(col, bet1[i], am2[i]);
                                break;

                            case 1:
                                am3[i] = black(col, bet1[i], am2[i]);
                                break;

                            case 2:
                                am3[i] = odd(no, bet1[i], am2[i]);
                                break;

                            case 3:
                                am3[i] = even(no, bet1[i], am2[i]);
                                break;

                            case 4:
                                am3[i] = oneto(no, bet1[i], am2[i]);
                                break;

                            case 5:
                                am3[i] = nineto(no, bet1[i], am2[i]);
                                break;

                            case 6:
                                am3[i] = firsttwe(no, bet1[i], am2[i]);
                                break;

                            case 7:
                                am3[i] = secondtwe(no, bet1[i], am2[i]);
                                break;

                            case 8:
                                am3[i] = thirdtwe(no, bet1[i], am2[i]);
                                break;

                            case 9:
                                am3[i] = column1(no, bet1[i], am2[i]);
                                break;
                            case 10:
                                am3[i] = column2(no, bet1[i], am2[i]);
                                break;
                            case 11:
                                am3[i] = column3(no, bet1[i], am2[i]);
                                break;

                        }
                    }
                }
                if(c==0) {

                    f2= new JFrame();

                    DefaultTableModel model = new DefaultTableModel();
                    JTable table = new JTable(model);


                    model.addColumn("USER");
                    model.addColumn("Start Amt");
                    model.addColumn("In Hand Amt");
                    model.addColumn("Amt Won IB");
                    model.addColumn("Amt Won OB");
                    model.addColumn("Final Amt");


                    f2.add(new JScrollPane(table));
                    f2.setSize(700,200);
                    f2.setVisible(true);


                    for(int i =0;i<user;i++) {
                        if(l3[i].isVisible()==true) {
                            int sum = (amt[i] - bet1[i] - bt1[i]);
                            model.addRow(new Object[]{Integer.toString(i + 1), Integer.toString(amt[i]), Integer.toString(sum), Integer.toString(am2[i]), Integer.toString(am3[i]), Integer.toString(sum + am3[i] + am2[i])});


                        }
                    }
                    newie(user);






                }




            }
        })  ;





    }

    public void newie(int user)
    {

        JFrame f5= new JFrame();
        String cols = "NULL";
        if (col == 1)
            cols = "Red";
        else if (col == 0)
            cols = "Black";
        else
            cols = "NULL";
        JLabel l= new JLabel("\t\tNumber : "+Integer.toString(no)+"\t  Colour: "+cols);
        l.setFont(new Font("\t\tNumber : "+Integer.toString(no)+"\t  Colour: "+cols, Font.BOLD,15));
        l.setBounds(20, 30, 300, 60);

        f5.setSize(300, 200);
        f5.setVisible(true);
        f5.setLayout(null);
        f5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        f5.add(l);





        JButton bs = new JButton("CONTINUE") ;
        bs.setBounds(60, 100, 100, 30);
        f5.add(bs);

        bs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                doit();
                for(int i=0;i<user;i++) {


                    amb[i].setText(Integer.toString((amt[i] - bet1[i] - bt1[i] + am3[i] + am2[i])));
                    amt[i]=(amt[i] - bet1[i] - bt1[i] + am3[i] + am2[i]);
                    t3[i].setText(""); t4[i].setText("");   t5[i].setText("");


                }
                f2.setVisible(false);
                f5.setVisible(false);

            }

        }    );




    }






}
