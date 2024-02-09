package Java_2K23;
/*
                   *     *      *        *     *  -> 4 space 5 stars
               *     *      *         *      *    -> 3 space 5 stars
            *     *       *         *       *      > 2 space 5 stars
         *     *       *         *         *`      > 1 space 5 stars
      *     *       *         *          *         > 0 space 5 stars
                                                    space =
*/
public class Question11 {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++) {
            for(int j=1;j<=5-i;j++){ // 4 . 3 .2. 1.0
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}