class TwoDArray {

    public static void main(String args[]) {

        int twoD[][];

        twoD = new int[4][5];

        int i, j;
        int k = 0;

        // Filling the array
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        // Displaying the array
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();   // Move to next line after each row
        }
    }
}