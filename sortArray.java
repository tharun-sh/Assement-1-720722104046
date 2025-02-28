public class Main {
    public static void main(String[] args) {
        int a[][] = {{5, 4, 7},{1, 8, 3},{9, 6, 2}};
        int n = a.length;
        int temp[] = new int[n * n];
        int i,j, k = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                temp[k++] = a[i][j];
            }
        }
        for (i = 0; i < k - 1; i++) {
            for (j = i + 1; j < k; j++) {
                if (temp[i] > temp[j]) {
                    int t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }}
        k = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = temp[k++];
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }}
}
