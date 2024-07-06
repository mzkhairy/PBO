package TugasPraktikum2;
public class TransposeToNormal {
    public static void transposetonormal(int[][] data) {
        int row = data.length;
        int column = data[0].length;

        System.out.println("Elements of normal matrix T are: ");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print(data[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
