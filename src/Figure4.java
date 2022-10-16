
public class Figure4 {
    public static void main(String[] args) {

        for (int row = 1; row <= 3; row++){
            for (int col = 1; col <= 18; col++) {
                System.out.print("V");
            }
            System.out.println(" ");
        }
        for (int row = 1; row <= 6; row++){
            for (int col = 1; col <= 18; col++) {
                if(col == 8 || col == 9 || col == 10){
                    System.out.print("V");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
