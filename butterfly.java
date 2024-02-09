package Java_2K23;
/*
    *                                      *         -> space 6 2 stars
    *     *                           *    *         -> space 4 4 stars
    *     *     *                *    *    *         -> space 2 6 stars
    *     *     *    *     *     *    *    *         -> space 0 8 stars     space formula = 2*(n-i)=2*(4-1)=6
    *     *     *    *     *     *    *    *         -> space 0 8 stars
    *     *     *                *    *    *         -> space 2 6 stars
    *     *                           *    *         -> space 4 4 stars
    *                                      *         -> space 6 2 stars

*/
public class butterfly {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}