package com.company;

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
/*
    public static int sumDigits(int n){
        while(n<=)

    }
*/

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
            for (int l = i; l>=0 ; l--)
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
//$$$$$$$**************$$$$$$$
//**$$$$$$************$$$$$$**
//****$$$$$**********$$$$$****
//******$$$$********$$$$******
//********$$$******$$$********
//**********$$****$$**********
//************$**$************
//$$$$$$$*************$$$$$$$
//**$$$$$$***********$$$$$$**
//****$$$$$*********$$$$$****
//******$$$$*******$$$$******
//********$$$*****$$$********
//**********$$***$$**********
//************$*$************

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

 */