public class Main {
    public static void main(String[] args) {
        int[][] ar = {{3, 4, 7}, {1, 5, 8}, {2, 6, 9}};
        int[][] temp = new int[3][3];
        int max = 0, maxi = 0, maxj = 0;
        int max2 = 0;
        int max3 = 0;
        for(int i = 0; i<ar.length; i++)
            for(int j = 0; j<ar[0].length; j++)
                if(ar[i][j] > max) {
                    max = ar[i][j];
                    maxi = i;
                    maxj = j;
                }
        ar[maxi][maxj] = 0;
        for(int i = 0; i<ar.length; i++)
            for(int j = 0; j<ar[0].length; j++)
                if(ar[i][j] > max2) {
                    max2 = ar[i][j];
                    maxi = i;
                    maxj = j;
                }
        ar[maxi][maxj] = 0;
        for(int i = 0; i<ar.length; i++)
            for(int j = 0; j<ar[0].length; j++)
                if(ar[i][j] > max3) {
                    max3 = ar[i][j];
                }
        System.out.println(max3+" is the 3rd largest in an array.");
    }
    }
