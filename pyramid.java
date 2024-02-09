package Java_2K23;
        /*
              1    -> 4 spaces and 1
             2 2   -> 3 spaces and 2
            3 3 3     2 spaces and 3
           4 4 4 4    1 spaces and 4
          5 5 5 5 5   1 spaces and 5
        */
public class pyramid {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++) {
                System.out.print(" ");
            } //int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
