package Java_2K23;

/*

 (1,1)                 * (1,4)
 (2,1)            *    * (2,4)
 (3,1)       *    *    * (3,4)
 (4,1)  *    *    *    * (4,4)
*/
public class question5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) { // 4-i = 4-1= 3; 3 space print. 2 row 4-i = 4-2 =2; 2 space print
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // 3 space print and one * as i =1 . 2nd row 2 space print and i=2; 2  star prints
            }
            System.out.println();
        }
    }
}