package TugasPraktikum3;

public class PopOddEven {
    int[] popoddeven(int[] arr) {
        System.out.println("Odd numbers in array");
        int i;
        int temp;
        for (i = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        System.out.println("\nEven numbers in array");
        for (i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        return arr;
    }
}
