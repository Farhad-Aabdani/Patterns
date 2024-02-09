package Java_2K23;
/*

(i,j)      (1,2) (1,3)(1,4)
(1,1) *    *       *     *   * (1,5)
(2,1) *    *       *   * (2,4)
(3,1) *    *       * (3,3)
(4,1) *    *(4,2)
(5,1) *

  */
public class question4 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
