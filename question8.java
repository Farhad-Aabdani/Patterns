package Java_2K23;
/*
(1,1)        1                                                           1  and 4 spaces
(2,1)        2      3                       (2,2)                        2  and 3 space
(3,1)        4      5      6                (3,3)                        3  and 2 space
(4,1)        7      8      9     10         (4,4)                        ( 4 and 1 space
(5,1)        11     12     13    14      15 (5,5)                        (5
*/
public class question8 {
    public static void main(String [] args){
        int num=0;
        for (int i=1;i<=5;i++ ){
            for(int j=1;j<=i;j++ ){// j=1 ; j<=1 2nd row i=2 ; j=1. j<=2;
                num= num+1; // 1 , 1+1 = 2 . 2+1 = 3
                System.out.print(" "+ num);
            }
            System.out.println();
        }
    }
}
