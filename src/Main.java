import java.util.Arrays;

public class Main {
    static void func(int[][] MatrisArray){
        int n = 1;
        for (int i = 0; i < MatrisArray.length; i++){
            for (int j = 0; j < MatrisArray[i].length; j++){
                MatrisArray[i][j] = n++;
                System.out.print(MatrisArray[i][j] + ", ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        int[][] MatrisArray = new int[4][8];
        func(MatrisArray);

        System.out.println("-------");
        int[][] Array = new int[4][8];
        String[][] myMatris = new String[3][3];
        myMatris[0][0] = "Şehirler";
        myMatris[0][1] = "İstanbul";
        myMatris[0][2] = "Ankara";
        myMatris[1][0] = "İstanbul";
        myMatris[1][1] = "0";
        myMatris[1][2] = "453";
        myMatris[2][0] = "Ankara";
        myMatris[2][1] = "453";
        myMatris[2][2] = "0";
        System.out.println(Arrays.toString(myMatris[2]));

        String[][] mySecondMatris = {
                {"Şehirler", "İstanbul", "Ankara"},
                {"İstanbul", "0", "453"},
                {"Ankara", "453", "0"}
        };

        System.out.println(mySecondMatris[0][2]);
    }
}