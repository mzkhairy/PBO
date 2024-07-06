package TugasPraktikum2;

class division{
    public static int[][] divisions(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] divisions = new int[row][column];

        System.out.println("\ndivisions of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                divisions[r][c] = first[r][c] / second[r][c];

        Print2dArray.print2dArray(divisions);
        return divisions;
    }
}

