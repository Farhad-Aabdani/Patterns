package Java_2K23;
/*   (1,1)
      *
(2,1) *   * (2,2)
(3,1) *   *   * (3,3)
(4,1) *   *   *   * (4,4)

*/
public class question3 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
