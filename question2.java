package Java_2K23;
/*      (1,1) (1,2) (1,3)(1,4)(1,5)
        *    *     *      *     *
  (2,1) *                       *(2,5)
  (3,1) *                       *(3,5)
        *    *      *     *     *
       (4,1)(4,2)  (4,3) (4,4) (4,5)
        * so, star wahin print hongy jahan i=1 ho ya i=4 ho ya j=1 ho ya j=5
*/
public class question2 {
    public static void main(String[] args){
        for(int i =1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
