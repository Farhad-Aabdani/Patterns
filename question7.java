package Java_2K23;

/*
(1,1) 1   2    3   4   5  (1,5)
(2,1) 1   2    3   4      (2,4)
(3,1) 1   2    3          (3,3)
(4,1) 1   2               (4,2)
(5,1) 1                   (5,1)
*/

public class question7 {
    public static void main(String[] args){
        for(int i=0;i<5;i++){ // for that must i =1
            for(int j=1;j<=5-i;j++){ // or j<=5-i+1; so j<=5-1+1 = 5
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }


}
