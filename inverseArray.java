public class Main {
    public static void main(String[] args) {
        int[][] ar = {{5, 4, 7}, {1, 8, 3}, {9, 6, 2}};
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                ar[j][i] = ar[i][j];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
