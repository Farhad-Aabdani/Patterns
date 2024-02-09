package Java_2K23;
/*
                  1             -> 4 space and 1   1-1+i = 1. 2-1+1=2
                2 1 2           ->3 space and 212(3)
              3 2 1 2 3         -> 2space and 32123(5)
           4 3 2 1 2 3 4        ->1 space and 43211234(7)_
         5 4 3 2 1 2 3 4 5       -> 0 space and 5432123456(9)


*/
public class pyramidAdv {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            // first part
            for(int j=1;j<=5-i;j++ ){ // 4.3.2.1.0
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            } // 2nd part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }}
