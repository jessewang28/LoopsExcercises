package com.company;

//Jesse Wang
//3B Computer Science

public class Main {
    public static int addOdds(int n){
        int sum = 0;
        for (int i=1; i<=n; i+=2){
            sum = sum + i;
        }
        return sum;}

    public static int howManyYears(double startpop, double endpop){
        int i = 0;
        while (startpop<endpop) {
            startpop = 1.0113 * startpop;
            i++;
        }
        return i;
    }

    public static int sumDigits(int n) {
        int total = 0;
        while (n>0){
            total = total + n%10;
            n/=10;
        }
        return total;
    }

    public static void sillyNumbers() {
        for (int a=1; a<=3; a++) {
            for (int i = 0; i <= 9; i++) {
                for (int j = 1; j <= 3; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public static void sillyNumbers2() {
        for (int a=1; a<=5; a++) {
            for (int i=9; i>=1; i--){
                for (int j=i; j>0; j--){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public static void dollarsAndStars() {
        int n = 7;
        int m = 0;
        for (int i = 12; i >= 0; i=i-2){
            for (int k = 2*m; k >0 ; k--)
            {System.out.print("*");}
            for (int j=n; j>0;j--){
                System.out.print("$");
            }
            for (int l = 2*n; l>0; l--)
            {System.out.print("*");}
            for (int j=n; j>0;j--){
                System.out.print("$");
            }
            for (int k = 2*m; k >0 ; k--)
            {System.out.print("*");}
            n--;
            m++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
	int a = addOdds(6);         //addOdds Test
	System.out.println(a);
	int b = addOdds(8);
	System.out.println(b);
	int c = addOdds(16);
	System.out.println(c);

    int d = howManyYears(111.2, 120);           //howManyYears Test
    System.out.println(d);
    int e = howManyYears(111.2, 150);
        System.out.println(e);

    int f = sumDigits(15);          //sumDigits
        System.out.println(f);
    int g = sumDigits(652);
        System.out.println(g);
    int h = sumDigits(1038);
        System.out.println(h);

    sillyNumbers();
    sillyNumbers2();
    dollarsAndStars();
    }
}

/* Results:
9           //addOdds
16
64

7           //howManyYears
27

6       //sumDigits
13
12

000111222333444555666777888999      //sillyNumbers
000111222333444555666777888999
000111222333444555666777888999
999999999888888887777777666666555554444333221       //sillyNumbers2
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221

//$$$$$$$**************$$$$$$$      //dollarsAndStars
//**$$$$$$************$$$$$$**
//****$$$$$**********$$$$$****
//******$$$$********$$$$******
//********$$$******$$$********
//**********$$****$$**********
//************$**$************

 */