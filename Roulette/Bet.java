
import java.util.Scanner;

public class Bet
{



    static int straight(int bet,int no,int amt,int num)
    {

        amt = amt-bet;
        if(num==no)
            return  (35*bet);
        else
            return  0;

    }

    static int split(int bet, int no,int amt,int num1,int num2)
    {
        amt = amt-bet;

        if(num1==no || num2==no)
            return(17*bet);
        else
            return 0;

    }
    static int corner(int bet, int no,int amt,int num1,int num2,int num3,int num4)
    {
        amt = amt-bet;

        if(num1==no || num2==no || num3==no || num4==no)
            return (bet*8);
        else
            return 0;

    }
    static int street(int bet, int no,int amt,int num1,int num2,int num3)
    {
        amt = amt-bet;

        if(num1==no || num2==no || num3==no)
            return (bet*11);
        else
            return 0;

    }
    static int doublex(int bet, int no,int amt,int num1,int num2,int num3,int num4,int num5,int num6)
    {

        if(num1==no || num2==no || num3==no || num4==no || num5==no || num6==no)
            return (bet*5);
        else
            return 0;

    }
    static int fiveno(int bet,int no,int amt)
    {       amt = amt-bet;
        if(no==1 || no==2 || no==3 || no==0 || no==37)
            return (bet*5);
        else
            return 0;

    }
    static int red(int col, int bet,int amt)
    {
        Scanner sc= new Scanner(System.in);
        amt= amt - bet;

        if(col==1)
            return bet;
        else
            return 0;


    }

    static int black(int col, int bet,int amt)
    {
        Scanner sc= new Scanner(System.in);
        amt= amt - bet;


        if(col==0)
            return bet;
        else
            return 0;


    }

    static int odd(int no, int bet,int amt)
    {
        Scanner sc= new Scanner(System.in);
        amt= amt - bet;

        if((no%2)!=0)
            return bet;
        else {
            return 0;
        }


    }

    static int even(int no, int bet,int amt)
    {
        Scanner sc= new Scanner(System.in);
        amt= amt - bet;

        if((no%2)==0)
            return bet;
        else
            return 0;


    }

    static int oneto(int no, int bet,int amt)
    {
        Scanner sc= new Scanner(System.in);
        amt= amt - bet;

        if(no>=1 && no<=18)
            return bet;
        else
            return 0;


    }

    static int nineto(int no, int bet,int amt)
    {
        Scanner sc= new Scanner(System.in);
        amt= amt - bet;

        if(no>=19 && no<=36)
            return bet;
        else
            return 0;


    }

    static int firsttwe(int no, int bet,int amt)
    {
        Scanner sc= new Scanner(System.in);
        amt= amt - bet;

        if(no>=1 && no<=12)
            return (bet*2);
        else
            return 0;


    }

    static int secondtwe(int no,int bet,int amt)
    {
        Scanner sc= new Scanner(System.in);
        amt= amt - bet;

        if(no>=13 && no<=24)
            return (bet*2);
        else
            return 0;


    }

    static int thirdtwe(int no, int bet,int amt)
    {
        Scanner sc= new Scanner(System.in);
        amt= amt - bet;

        if(no>=25 && no<=36)
            return (bet*2);
        else
            return 0;


    }

    static int column1(int no, int bet,int amt) {
        amt = amt - bet;
        int c = 0;


        for (int i = 1; i <= 34; i += 3) {
            if (no == i) {
                c++;
                break;
            }
        }
        if (c == 0)
            return 0;
        else
            return (bet * 2);
    }
    static int column2 (int no, int bet,int amt) {
        amt = amt - bet;
        int c = 0;


        for(int i=2; i<=35; i+=3)
        {
            if(no==i)
            {
                c++;
                break;
            }
        }
        if (c == 0)
            return 0;
        else
            return (bet * 2);
    }
    static int column3(int no, int bet,int amt) {
        amt = amt - bet;
        int c = 0;


        for(int i=3; i<=36; i+=3)
        {
            if(no==i)
            {
                c++;
                break;
            }
        }
        if (c == 0)
            return 0;
        else
            return (bet * 2);
    }






    }
