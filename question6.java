package Java_2K23;
/*       (1,1)
         1                             1 print and 3 space =4
(2,1)    1    2 (2,2)                  1 ,2 print and 2 space =4
(3,1)    1    2    3(3,3)              1,2,3 prints and 1 space =4
(4,1)    1    2    3     4(4,4)
(5,1)    1    2    3     4    5(5,5)
*/
public class question6 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
