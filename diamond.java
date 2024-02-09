package Java_2K23;
// daimond pattern

public class diamond {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            // first upper half
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } // second upper half
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } // first lower half
        for(int i=4;i>=1;i--){
            for(int j=1;j<=5-i;j++){ // space : 1.2.3.4
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } // second lower half
            for(int j=1;j<=i-1;j++) {//stars: 4-1 =3. 3-1=2.2-1=1.1-1=0-
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
// me getting better