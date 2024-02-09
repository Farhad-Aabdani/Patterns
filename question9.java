package Java_2K23;
/*
              (1,1)           1
              (2,1)           0   1  (2,2)
              (3,1)           1   0   1 (3,3)
              (4,1)           0   1    0    1 (4,4)
              (5,1)           1   0    1     0    1 (5,5)
              let sum of i+j
              so 1+1 = 2 and in even number, number is 1
              e.g:
              (3,1) = 4 and is 1
              as (2,1) = 3 and is odd number 0 ;
              so when sum of i and j(i+j) we will print "1" otherwise "0";

 */

public class question9 {
    public static void main(String[] args){
        int num;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                //System.out.print(" "+num);
                num=i+j; //
                if(num%2==0){ // 1+1 =2
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
