package com.JavaPattern;

public class PattrernAlphabet {
    public static void main(String[] args) {
        PattrernAlphabet obj=new PattrernAlphabet();
        obj.pattern1(6);
        obj.pattern2(6);
        obj.hollowPattern(6);
        obj.hollowPatternAlphabet(6);
        obj.starPattern(5);
        obj.numberPattern1(5);
        obj.numberPattern2(5);
        obj.star1(5);
        obj.star2(5);

    }
    char ch='A';
    void pattern1(int n){
        for (int row=1;row<n;row++){
            for (int col=1;col<n;col++){
                System.out.print(ch+" ");
                ch=(char) (ch+1);
            }
            System.out.println();
        }
        System.out.println();
    }

    void pattern2(int n){
        char ch1;
        for (int row=1;row<n;row++){
             ch1='A';
            for (int col=1;col<n;col++){
                System.out.print(ch1+" ");
                ch1=(char) (ch1+1);
            }
            System.out.println();
        }
    }
    void hollowPattern(int n){
        for(int row=1;row<n;row++){
            for (int col=1;col<n;col++){
                if(row==1 || col==1 ||row==n-1 || col==n-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    void hollowPatternAlphabet(int n){
        for(int row=1;row<n;row++){
            char ch2='A';
            for (int col=1;col<n;col++){
                if(row==1 || col==1 ||row==n-1 || col==n-1){
                    System.out.print(ch2+" ");
                }
                else {
                    System.out.print("  ");
                }
                ch2++;
            }
            System.out.println();
        }
    }

    void starPattern(int n){
        for(int row=1;row<n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    //Number Pattern
    void numberPattern1(int n){
        int m=1;
        for(int row=1;row<n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }

    }
    void numberPattern2(int n){
        int m;
        for(int row=1;row<n;row++){
            m=1;
            for(int col=1;col<=row;col++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }

    }

    void star1(int n){
        for (int row=5;row>1;row--){
            for(int col=1;col<row-1+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void star2(int n){
        for (int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
