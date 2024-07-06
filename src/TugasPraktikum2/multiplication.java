package TugasPraktikum2;

class multiplication{
    public static int[][] multiplications(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] multiplications = new int[row][column];

        System.out.println("\nmultiplications of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                multiplications[r][c] = first[r][c] * second[r][c];

        Print2dArray.print2dArray(multiplications);
        return multiplications;
    }
}
